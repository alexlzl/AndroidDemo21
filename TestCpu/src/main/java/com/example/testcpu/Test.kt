package com.example.testcpu

import android.os.Bundle
import android.os.Debug
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @ describe
 *
 * @author lzl
 *
 * @ time 2019/1/9 10:17
 *
 *
 */
class Test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.setOnClickListener{
            prepare()
        }

    }

    private fun prepare() {
        prepareFirst()
        prepareSecond()
        prepareThird()
    }

    private fun prepareFirst() {
        Thread.sleep(2000)
    }

    private fun prepareSecond() {
        Thread.sleep(2000)
    }

    private fun prepareThird() {
        Thread.sleep(4000)
    }

    override fun onDestroy() {
        super.onDestroy()
        Debug.stopMethodTracing()
    }


}