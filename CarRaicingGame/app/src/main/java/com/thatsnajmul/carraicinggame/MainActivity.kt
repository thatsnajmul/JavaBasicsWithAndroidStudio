package com.thatsnajmul.carraicinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(),GameTask {
    lateinit var rootLaout :LinearLayout
    lateinit var startBtn :Button
    lateinit var againStartButton :Button
    lateinit var mGameView: GameView
    lateinit var score: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startBtn = findViewById(R.id.startBtn)
        againStartButton = findViewById(R.id.AgainStartBtn)
        rootLaout = findViewById(R.id.rootLayout)
        score = findViewById(R.id.score)
        mGameView = GameView(this, this)

        startBtn.setOnClickListener{
            mGameView.setBackgroundResource(R.drawable.roads)
            rootLaout.addView(mGameView)
            startBtn.visibility = View.GONE
            againStartButton.visibility = View.GONE
            score.visibility = View.GONE

        }
        againStartButton.setOnClickListener{
            mGameView.setBackgroundResource(R.drawable.roads)
            rootLaout.addView(mGameView)
            startBtn.visibility = View.GONE
            againStartButton.visibility = View.GONE
            score.visibility = View.GONE

        }

    }

    override fun closeGame(mScore: Int) {
        score.text = "Score : $mScore"
        rootLaout.removeView(mGameView)
        startBtn.visibility = View.GONE
        againStartButton.visibility = View.VISIBLE
        score.visibility = View.VISIBLE
    }

}