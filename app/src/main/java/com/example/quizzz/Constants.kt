package com.example.quizzz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{

        //Final list of 10 random questions from temporary list
        val questionsList = ArrayList<Question>()

        //Temporary list of all 31 questions
        val tempQuestionsList = ArrayList<Question>()

        val sameQuestion = "What Country does this Flag belong to?"

        val questionSet_1 = Question(
            1,
            sameQuestion,
            R.drawable.albania,
            "Algeria",
            "Albania",
            "Armenia",
            "Angola",
            2
        )
        tempQuestionsList.add(questionSet_1)

        val questionSet_2 = Question(
            2,
            sameQuestion,
            R.drawable.algeria,
            "Afghanistan",
            "Iran",
            "Algeria",
            "Turkey",
            3
        )
        tempQuestionsList.add(questionSet_2)

        val questionSet_3 = Question(
            3,
            sameQuestion,
            R.drawable.australia,
            "USA",
            "New Zealand",
            "England",
            "Australia",
            4
        )
        tempQuestionsList.add(questionSet_3)

        val questionSet_4 = Question(
            4,
            sameQuestion,
            R.drawable.bahamas,
            "Barbados",
            "Dominican Republic",
            "Bahamas",
            "Jamaica",
            3
        )
        tempQuestionsList.add(questionSet_4)

        val questionSet_5 = Question(
            5,
            sameQuestion,
            R.drawable.bahrain,
            "Bahrain",
            "Morocco",
            "Bangladesh",
            "Portugal",
            1
        )
        tempQuestionsList.add(questionSet_5)

        val questionSet_6 = Question(
            6,
            sameQuestion,
            R.drawable.bangladesh,
            "Algeria",
            "Afghanistan",
            "Bangladesh",
            "Moscow",
            3
        )
        tempQuestionsList.add(questionSet_6)

        val questionSet_7 = Question(
            7,
            sameQuestion,
            R.drawable.brazil,
            "Brazil",
            "Maxico",
            "Columbia",
            "Spain",
            1
        )
        tempQuestionsList.add(questionSet_7)

        val questionSet_8 = Question(
            8,
            sameQuestion,
            R.drawable.canada,
            "Japan",
            "Germany",
            "Switzerland",
            "Canada",
            4
        )
        tempQuestionsList.add(questionSet_8)

        val questionSet_9 = Question(
            8,
            sameQuestion,
            R.drawable.egypt,
            "Chile",
            "Egypt",
            "Portugal",
            "Mexico",
            2
        )
        tempQuestionsList.add(questionSet_9)

        val questionSet_10 = Question(
            10,
            sameQuestion,
            R.drawable.ethiopia,
            "Egypt",
            "Brazil",
            "Ethiopia",
            "Spain",
            3
        )
        tempQuestionsList.add(questionSet_10)

        val questionSet_11 = Question(
            11,
            sameQuestion,
            R.drawable.india,
            "India",
            "Ireland",
            "Iceland",
            "Japan",
            1
        )
        tempQuestionsList.add(questionSet_11)

        val questionSet_12 = Question(
            12,
            sameQuestion,
            R.drawable.indonesia,
            "Japan",
            "Taiwan",
            "Indonesia",
            "China",
            3
        )
        tempQuestionsList.add(questionSet_12)

        val questionSet_13 = Question(
            13,
            sameQuestion,
            R.drawable.iran,
            "Afghanistan",
            "Iraq",
            "Iran",
            "Pakistan",
            3
        )
        tempQuestionsList.add(questionSet_13)

        val questionSet_14 = Question(
            14,
            sameQuestion,
            R.drawable.iraq,
            "Afghanistan",
            "Pakistan",
            "Iraq",
            "Iran",
            3
        )
        tempQuestionsList.add(questionSet_14)

        val questionSet_15 = Question(
            15,
            sameQuestion,
            R.drawable.japan,
            "China",
            "Japan",
            "Taiwan",
            "Thailand",
            2
        )
        tempQuestionsList.add(questionSet_15)

        val questionSet_16 = Question(
            16,
            sameQuestion,
            R.drawable.kenya,
            "Kenya",
            "Kuwait",
            "Libya",
            "Bangladesh",
            1
        )
        tempQuestionsList.add(questionSet_16)

        val questionSet_17 = Question(
            17,
            sameQuestion,
            R.drawable.kuwait,
            "Bangladesh",
            "Kuwait",
            "Kenya",
            "Egypt",
            2
        )
        tempQuestionsList.add(questionSet_17)

        val questionSet_18 = Question(
            18,
            sameQuestion,
            R.drawable.libya,
            "Afghanistan",
            "Libya",
            "Iraq",
            "Iran",
            2
        )
        tempQuestionsList.add(questionSet_18)

        val questionSet_19 = Question(
            19,
            sameQuestion,
            R.drawable.malta,
            "Algeria",
            "Barbados",
            "Malta",
            "Maldives",
            3
        )
        tempQuestionsList.add(questionSet_19)

        val questionSet_20 = Question(
            20,
            sameQuestion,
            R.drawable.nigeria,
            "Algeria",
            "Argentina",
            "Afghanistan",
            "Nigeria",
            4
        )
        tempQuestionsList.add(questionSet_20)

        val questionSet_21 = Question(
            21,
            sameQuestion,
            R.drawable.oman,
            "Oman",
            "Kuwait",
            "UAE",
            "Saudi Arabia",
            1
        )
        tempQuestionsList.add(questionSet_21)

        val questionSet_22 = Question(
            22,
            sameQuestion,
            R.drawable.pakistan,
            "Iran",
            "Afghanistan",
            "Pakistan",
            "Iraq",
            3
        )
        tempQuestionsList.add(questionSet_22)

        val questionSet_23 = Question(
            23,
            sameQuestion,
            R.drawable.papuanewguinea,
            "Portugal",
            "Maldives",
            "Papua New Guinea",
            "Angola",
            3
        )
        tempQuestionsList.add(questionSet_23)

        val questionSet_24 = Question(
            24,
            sameQuestion,
            R.drawable.portugal,
            "Argentina",
            "Brazil",
            "Spain",
            "Portugal",
            4
        )
        tempQuestionsList.add(questionSet_24)

        val questionSet_25 = Question(
            25,
            sameQuestion,
            R.drawable.qatar,
            "Qatar",
            "Oman",
            "Kuwait",
            "Yemen",
            1
        )
        tempQuestionsList.add(questionSet_25)

        val questionSet_26 = Question(
            26,
            sameQuestion,
            R.drawable.saudiarabia,
            "Oman",
            "Saudi Arabia",
            "Yemen",
            "UAE",
            2
        )
        tempQuestionsList.add(questionSet_26)

        val questionSet_27 = Question(
            27,
            sameQuestion,
            R.drawable.southafrica,
            "South Africa",
            "Malta",
            "Portugal",
            "Turkey",
            1
        )
        tempQuestionsList.add(questionSet_27)

        val questionSet_28 = Question(
            28,
            sameQuestion,
            R.drawable.turkey,
            "Egypt",
            "Turkey",
            "Armenia",
            "Ethiopia",
            2
        )
        tempQuestionsList.add(questionSet_28)

        val questionSet_29 = Question(
            29,
            sameQuestion,
            R.drawable.uae,
            "Oman",
            "UAE",
            "Saudi Arabia",
            "Qatar",
            2
        )
        tempQuestionsList.add(questionSet_29)

        val questionSet_30 = Question(
            30,
            sameQuestion,
            R.drawable.uk,
            "New Zealand",
            "Australia",
            "USA",
            "UK",
            4
        )
        tempQuestionsList.add(questionSet_30)

        val questionSet_31 = Question(
            31,
            sameQuestion,
            R.drawable.vietnam,
            "Vietnam",
            "Taiwan",
            "Japan",
            "Singapore",
            1
        )
        tempQuestionsList.add(questionSet_31)

        for(i in 1..10){
            val randomIndex = (1..tempQuestionsList.size).random()
            questionsList.add(tempQuestionsList.get(randomIndex))
            tempQuestionsList.removeAt(randomIndex)
        }

        return questionsList
    }
}