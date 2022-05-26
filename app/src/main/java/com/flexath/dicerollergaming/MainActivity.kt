package com.flexath.dicerollergaming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<Int>()

        buttonPlayer1.setOnClickListener{
            val sides1 = rollingDice()
            randomForDice1(sides1)
            val sides2 = rollingDice()
            randomForDice2(sides2)
            list.add(0,sides1)
            list.add(1,sides2)
        }

        buttonPlayer2.setOnClickListener{
            val sides3 = rollingDice()
            randomForDice3(sides3)
            val sides4 = rollingDice()
            randomForDice4(sides4)
            list.add(2,sides3)
            list.add(3,sides4)
        }

        resultButton.setOnClickListener{
            Intent(this,FirstActivity::class.java).also {
                it.putExtra("EXTRA_1",list[0])
                it.putExtra("EXTRA_2",list[1])
                it.putExtra("EXTRA_3",list[2])
                it.putExtra("EXTRA_4",list[3])
                startActivity(it)
            }
        }
    }

    private fun randomForDice1(diceNumber:Int) {
        val imageResource = when(diceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        dice1.setImageResource(imageResource)
    }

    private fun randomForDice2(diceNumber:Int) {
        val imageResource = when(diceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        dice2.setImageResource(imageResource)
    }

    private fun randomForDice3(diceNumber:Int) {
        val imageResource = when(diceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        dice3.setImageResource(imageResource)
    }

    private fun randomForDice4(diceNumber:Int) {
        val imageResource = when(diceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        dice4.setImageResource(imageResource)
    }

    private fun rollingDice(): Int {
        val dice = Dice(6)
        //val view = Toast.makeText(this,"Dice is Rolled",Toast.LENGTH_SHORT).show()
        return dice.roll()
    }
}

class Dice(private val numberOfSides:Int) : AppCompatActivity() {
    fun roll():Int{
        return (1..numberOfSides).random()
    }
}
