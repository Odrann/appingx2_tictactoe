package fr.epita.android.tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_activity.*

class second_activity : AppCompatActivity() {

    var turn = true
    var gameOver = false
    var str = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activity)
        val originIntent = intent

        playerName.text = originIntent.getStringExtra("name")


        playerTurn1.isEnabled = false

        b00.setTextColor(Color.BLACK)
        b01.setTextColor(Color.BLACK)
        b02.setTextColor(Color.BLACK)
        b10.setTextColor(Color.BLACK)
        b11.setTextColor(Color.BLACK)   
        b12.setTextColor(Color.BLACK)
        b20.setTextColor(Color.BLACK)
        b21.setTextColor(Color.BLACK)
        b22.setTextColor(Color.BLACK)


        b00.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"
                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b00.text = str


        }

        b01.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"
                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b01.text = str

        }
        b02.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b02.text = str

        }
        b10.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b10.text = str

        }
        b11.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b11.text = str

        }
        b12.setOnClickListener()
        {

            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b12.text = str

        }
        b20.setOnClickListener()
        {

            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b20.text = str
        }
        b21.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b21.text = str

        }
        b22.setOnClickListener()
        {

            if(turn == true)
            {
                str = "X"
                turn = false

                playerTurn0.isEnabled = false
                playerTurn1.isEnabled = true
            }
            else
            {
                turn = true
                str = "O"

                playerTurn0.isEnabled = true
                playerTurn1.isEnabled = false
            }

            b22.text = str

        }







    }





}
