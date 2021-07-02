package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnRoller: Button = findViewById(R.id.btn_dice);

        btnRoller.setOnClickListener(){

            rollDice()
        }

        diceImage=findViewById(R.id.diceImage)

    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1  // Random class is used to generate random number

        val drawableResource = when (randomInt){

            1 ->   R.drawable.dice_1
            2 ->   R.drawable.dice_2
            3 ->   R.drawable.dice_3
            4 ->   R.drawable.dice_4
            5 ->   R.drawable.dice_5
            else ->   R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)


    }
}