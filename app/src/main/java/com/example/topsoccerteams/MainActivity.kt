package com.example.topsoccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {

    //Teams from http://footballdatabase.com/ranking/south-africa/1
    //retrieved on 08/04/2026

    val teams = arrayOf<String>("Memelodi Sundowns FC", "Orlando Pirates",
        "Bidvest Wits", "Stellenbosch FC", "Sekhukhune United FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //creating a variable to hold TextView Text
        val teamsTxt= findViewById<TextView>(R.id.TeamDisplay)

        //Reassigned position 0
        teams [0] = "Memelodi Sundowns FC"

        //putting array in textview
        teamsTxt.text = Arrays.toString(teams)

        //assigning array content to a variable
        var teamsDisplay = ""
        var count = 0

        while (count < teams.count()) {
            teamsDisplay += "${teams [count]}\n"
            count ++

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}