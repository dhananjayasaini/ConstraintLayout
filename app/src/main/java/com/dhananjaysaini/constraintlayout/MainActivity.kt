package com.dhananjaysaini.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private val Any.textView1: Unit
    get() {}
private val Any.id: Any
    get() {return ""}
private val <T> Comparable<T>.R: Any
    get() {return ""}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setconstratint()
    }
    fun setconstratint(){
        val binding = ""
        binding.R.id.textView1

    }
}