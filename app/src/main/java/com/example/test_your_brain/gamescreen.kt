package com.example.test_your_brain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class gamescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gamescreen)
    }

    fun nextOperation(){
        val randomOps = RandomOperations()
        val firstNumber = randomOps.firstNumber
        val secondNumber = randomOps.secondNumber
        val operator = randomOps.operator

        val operationTextView = findViewById<TextView>(R.id.operationTextView)
        operationTextView.text = "$firstNumber $operator $secondNumber = ?"
    }
}

class RandomOperations {
    var firstNumber: Int? = null
    var secondNumber: Int? = null
    var operator: String? = null

    init {
        // Create a list to store the generated operations
        val operations = mutableListOf<String>()

        // Generate random operations until the list has 20 unique items
        while (operations.size < 3) {
            // Generate random numbers and operator
            firstNumber = Random.nextInt(1, 20)
            secondNumber = Random.nextInt(1, 20)
            val operators = listOf("+", "-", "*")
            operator = operators.random()

            // Calculate the correct answer
            val correctAnswer = getCorrectAnswer()

            // Add the operation to the list if it's not already in there
            val operation = "$firstNumber $operator $secondNumber = $correctAnswer"
            if (!operations.contains(operation)) {
                operations.add(operation)
            }
        }
    }

    fun getCorrectAnswer(): Int {
        return when (operator) {
            "+" -> firstNumber!! + secondNumber!!
            "-" -> firstNumber!! - secondNumber!!
            "*" -> firstNumber!! * secondNumber!!
            else -> 0
        }
    }
}