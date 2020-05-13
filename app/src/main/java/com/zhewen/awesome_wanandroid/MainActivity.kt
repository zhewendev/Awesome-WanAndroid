package com.zhewen.awesome_wanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val str : String? = null
        if (str != null) {
            test(str)
        }
    }

    private fun test(str : String) {
        println("nihao")
    }
}
