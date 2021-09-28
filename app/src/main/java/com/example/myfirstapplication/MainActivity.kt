package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        var dishes = listOf<String>("Hamburger","pizza","Mexican","American","Chinees")
            msg.text =  dishes.random();
        }

    fun addFood(view: View) {
        var dishes = listOf<String>("Hamburger","pizza","Mexican","American","Chinees")
        dishes.add("${textInputEditText.text}")
        msg.text = "${textInputEditText.text}"

    }
}

private fun <E> List<E>.add(e: E) {

}
