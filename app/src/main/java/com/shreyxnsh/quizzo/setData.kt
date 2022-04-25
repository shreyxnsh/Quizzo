package com.shreyxnsh.quizzo

object setData {

    const val name: String = "name"
    const val score: String = "score"


    fun getQuestion(): ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            "What is the capital of India?",
            1,
            "Mumbai",
            "Delhi",
            "Kolkata",
            "Chennai",
            2
        )
        var q2 = QuestionData(
            "Who is the Indian cricket team captain?",
            2,
            "Rohit Sharma",
            "Virat Kohli",
            "MS Dhoni",
            "KL Rahul",
            1
        )
        var q3 = QuestionData(
            "Who is the President of India?",
            3,
            "Narendra Modi",
            "Soniya Gandhi",
            "Pappu",
            "Ramnath Kovind",
            4
        )
        var q4 = QuestionData(
            "Covid19 is originated from which country?",
            4,
            "India",
            "USA",
            "China",
            "Russia",
            3
        )
        var q5 = QuestionData(
            "In which year did India won their first world cup?",
            5,
            "1983",
            "1997",
            "2011",
            "2017",
            1
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }

}