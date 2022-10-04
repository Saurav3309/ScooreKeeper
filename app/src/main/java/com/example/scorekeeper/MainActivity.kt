package com.example.scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    var mScore1: Int = 0
    var mScore2: Int = 0
    var score1: TextView? = null
    var score2: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        score1 = findViewById(R.id.score1)
        score2 = findViewById(R.id.score2)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.night_mode -> {
                Toast.makeText(this,"Dark Mode Enabled",Toast.LENGTH_SHORT).show()
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                recreate()

            }
            R.id.day_mode->{
                Toast.makeText(this,"Day Mode Enabled",Toast.LENGTH_SHORT).show()
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                recreate()

            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun decreaseScore(view: View) {
        when (view.id) {
            R.id.decreaseTeam1 -> {
                mScore1--
                score1?.setText(mScore1.toString())

            }
            R.id.decreaseTeam2 -> {
                mScore2--
                score2?.setText(mScore2.toString())

            }
        }
    }

    fun increaseScore(view: View) {
        when (view.id) {
            R.id.increaseTeam1 -> {
                mScore1++
                score1?.setText(mScore1.toString())

            }
            R.id.increaseTeam2 -> {
                mScore2++
                score2?.setText(mScore2.toString())

            }
        }
    }
}



//https://developer.android.com/codelabs/android-training-drawables-styles-and-themes#0  

