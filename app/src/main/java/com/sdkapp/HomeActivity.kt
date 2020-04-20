package com.sdkapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.e.mylibrary.MyLibClass
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.String
import java.util.*
import kotlin.collections.ArrayList

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers: ArrayList<Int> = ArrayList()
        val r = Random()

        for (i in 0..14) {
            numbers.add(r.nextInt(7) + 1)
        }

        val mean: Double? = MyLibClass().arithmeticMean(numbers)?.toDouble()
        val median: Double = 0.0
        val mode: ArrayList<Int>? = null

        numbers.sort()

        val res = String.format(
            "Numbers:\n\n%s\nMean: %.1f\nMedian: %.1f\n",
            numbers, mean, median
        )


        textView.text = res
    }
}

