package com.pankajkcodes.timeinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startTimeCounter(view: View) {
        val countTime: TextView = findViewById(R.id.countTime)

        object : CountDownTimer(50000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countTime.text = counter.toString()
                counter++
            }
            override fun onFinish() {
                countTime.text = "Finished"
            }
        }.start()
    }
}