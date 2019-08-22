package com.example.rnechita.codelabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rnechita.codelabs.intents.IntentsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        btn_intents.setOnClickListener {
            val intent = Intent(this, IntentsActivity::class.java)
            startActivity(intent)
        }
    }
}
