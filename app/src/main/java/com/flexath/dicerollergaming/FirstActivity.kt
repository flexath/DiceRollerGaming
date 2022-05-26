package com.flexath.dicerollergaming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val playerDice1 = intent.getIntExtra("EXTRA_1",0)
        val playerDice2 = intent.getIntExtra("EXTRA_2",0)
        val playerDice3 = intent.getIntExtra("EXTRA_3",0)
        val playerDice4 = intent.getIntExtra("EXTRA_4",0)
        val playerOneDice = playerDice1 + playerDice2
        val playerTwoDice = playerDice3 + playerDice4
        if( playerOneDice > playerTwoDice) {
            val txtPlayer1 = "Player 1 won"
            txtResulting.text = txtPlayer1

        }
        if (playerOneDice == playerTwoDice) {
            val txtDraw = "Draw"
            txtResulting.text = txtDraw
        }
        if (playerOneDice < playerTwoDice) {
            val txtPlayer2 = "Player 2 won"
            txtResulting.text = txtPlayer2
        }
    }
}