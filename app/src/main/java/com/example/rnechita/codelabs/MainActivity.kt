package com.example.rnechita.codelabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.rnechita.codelabs.intents.IntentsActivity
import com.example.rnechita.codelabs.ux.DroidActivity
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

        btn_droid_cafe.setOnClickListener {
            val intent = Intent(this, DroidActivity::class.java)
            startActivity(intent)
        }
    }


}
