package fr.epita.android.tictactoe

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

        b00.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b00.text = str

        }

        b01.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b01.text = str

        }
        b02.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b02.text = str

        }
        b10.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b10.text = str

        }
        b11.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b11.text = str

        }
        b12.setOnClickListener()
        {

            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b12.text = str

        }
        b20.setOnClickListener()
        {

            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b20.text = str
        }
        b21.setOnClickListener()
        {
            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b21.text = str

        }
        b22.setOnClickListener()
        {

            if(turn == true)
            {
                str = "X"
                turn = false
            }
            else
            {
                turn = true
                str = "O"
            }

            b22.text = str

        }







    }





}
