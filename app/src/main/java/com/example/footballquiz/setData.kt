package com.example.footballquiz

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Which club has recorded the most defeats in Premier League history?",

            "Aston Villa",
            "Everton",
            "Newcastle",
            "West Ham",
            2
        )
        var question2 = QuestionData(
            2,
            "Which club holds the record for the longest run of matches without receiving a red card?",

            "Burnley",
            "Ipswich",
            "Liverpool",
            "Barnsley",
            1
        )
        var question3 = QuestionData(
            3,
            "Peter Schmeichel was the first goalkeeper to score in the Premier League. Which club was he playing for at the time?",

            "Manchester United",
            "Aston Villa",
            "Manchester City",
            "Leicester City",
            2
        )
        var question4 = QuestionData(
            4,
            "Which is the only club to have conceded 100 goals in a season?",

            "Derby County",
            "Sunderland",
            "Swindon Town",
            "Blackpool",
            3
        )

        var question5 = QuestionData(
            5,
            "Who were the last team to field an all-English starting XI in a Premier League match?",

            "West Brom",
            "Chelsea",
            "Birmingham City",
            "Aston Villa",
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