package com.example.rnechita.codelabs.ux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import com.example.rnechita.codelabs.R
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        label_spinner.onItemSelectedListener = this
        val adapter = ArrayAdapter.createFromResource(this,
            R.array.labels_array,
            android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        label_spinner.adapter = adapter
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
       val spinnerLabel = parent?.getItemAtPosition(position)?.toString()?:""
        displayToast(spinnerLabel)

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.id) {
                R.id.sameday -> if (checked) displayToast(getString(R.string.sameday_message))
                R.id.nextday -> if (checked) displayToast(getString(R.string.next_day_message))
                R.id.pickup -> if (checked) displayToast(getString(R.string.pick_up_message))
            }
        }
    }

    private fun displayToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
