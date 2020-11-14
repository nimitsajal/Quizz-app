package com.example.quizzz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        option_1.setOnClickListener(this)
        option_2.setOnClickListener(this)
        option_3.setOnClickListener(this)
        option_4.setOnClickListener(this)

        btnSubmit.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion(){
        val question: Question? = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btnSubmit.text = "FINISH"
        }
        else{
            btnSubmit.text = "SUBMIT"
        }

        //Progress Bar
        progressBar.progress = mCurrentPosition

        //Progress text (beside progress bar)
        tvProgressText.text = "$mCurrentPosition / ${progressBar.max}"

        //Question text
        tvQuestion.text = question!!.question

        //Flag image
        ivFlag.setImageResource(question.image)

        //Options
        option_1.text = question.optionOne
        option_2.text = question.optionTwo
        option_3.text = question.optionThree
        option_4.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, option_1)
        options.add(1, option_2)
        options.add(2, option_3)
        options.add(3, option_4)

        for(option in options){
            option.setTextColor(Color.parseColor("#59405c"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionsView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#322f3d"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                option_1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                option_2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                option_3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                option_4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_1 -> {
                selectedOptionsView(option_1, 1)
            }
            R.id.option_2 -> {
                selectedOptionsView(option_2, 2)
            }
            R.id.option_3 -> {
                selectedOptionsView(option_3, 3)
            }
            R.id.option_4 -> {
                selectedOptionsView(option_4, 4)
            }
            R.id.btnSubmit -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        (mCurrentPosition <= mQuestionsList!!.size) -> {
                        setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else{
                    val question = mQuestionsList?.get(mCurrentPosition-1)
                    if(question!!.optionCorrect != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.incorrect_option_border_bg)
                    }
                    else{
                        mCorrectAnswers++
                    }
                    answerView(question.optionCorrect, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        btnSubmit.text = "FINISH"
                    }
                    else{
                        btnSubmit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }
}