package com.example.rnechita.codelabs.ux

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.rnechita.codelabs.R

import kotlinx.android.synthetic.main.activity_droid.*

class DroidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_droid)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun displayToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun showDonutOrder(view: View) {
        displayToast(getString(R.string.donut_order_message))
    }

    fun showIceCreamOrder(view: View) {
        displayToast(getString(R.string.ice_cream_order_message))
    }

    fun showFroyoOrder(view: View) {
        displayToast(getString(R.string.froyo_order_message))
    }

}
