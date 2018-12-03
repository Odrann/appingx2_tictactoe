package fr.epita.android.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import fr.epita.android.tictactoe.R.layout.activity_second_activity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitIntent = Intent(this, activity_second_activity::class.java)

        //val btn = findViewById<View>(R.id.btn1) as Button

        btn1.setOnClickListener{
            startActivity(explicitIntent)

        }



    }



}
