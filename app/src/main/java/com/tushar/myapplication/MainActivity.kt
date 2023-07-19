package com.tushar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.tushar.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAlert.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("class performance")
                .setMessage(
                    "Click Yes to add 2 to the value \n" +
                            "Click No to subtract 2 from the value"
                )
                .setPositiveButton("Yes") { _, _ ->
                    number = number + 2
                    binding.tvZero.setText(number.toString())
                }
                .setNegativeButton("No") { _, _ ->
                    number = number - 2
                    binding.tvZero.setText(number.toString())
                }
                .setNeutralButton("Clear") { _, _ ->
                    number = 0
                    binding.tvZero.setText(number.toString())
                }
                .show()
        }
    }
}