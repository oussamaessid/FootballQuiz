package com.example.footballquiz

object setFoot {
    const val name:String="name"
    const val fscore:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Who did Egypt beat in the final of this year's Africa Cup of Nations?",

            "Algeria",
            "Ghana",
            "Nigeria",
            "Zambia",
            2
        )
        var question2 = QuestionData(
            2,
            "Mohamed 'Zizou' Zidan is one of a handful of Egyptian internationals to play in a foreign league. Who does he play for?",

            "Borussia Dortmund",
            "Eintracht Frankfurt",
            "FSV Mainz 05",
            "Werder Bremen",
            1
        )
        var question3 = QuestionData(
            3,
            "Lionel Messi holds the record for most goals in a calendar year but how many did he score?",

            "90",
            "91",
            "92",
            "93",
            2
        )
        var question4 = QuestionData(
            4,
            "Thierry Henry made his professional debut with which club?",

            "Arsenal",
            "Juventus ",
            "Monaco",
            "Barcelona",
            3
        )

        var question5 = QuestionData(
            5,
            "Which nation won the 1986 World Cup",

            "Brazil",
            "West Germany ",
            "France",
            "Argentina",
            4
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}