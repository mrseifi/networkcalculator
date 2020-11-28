package com.mrsnote.networkcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

             // Get a reference to the AutoCompleteTextView in the layout
        val textView_cidr = findViewById(R.id.autoComplete_cidr) as AutoCompleteTextView
        // Get the string array
        val cidr: Array<out String> = resources.getStringArray(R.array.cidr_array)
        // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cidr).also { adapter ->
            textView_cidr.setAdapter(adapter)
        }

            // Get a reference to the AutoCompleteTextView in the layout
        val textView_subnet_mask = findViewById(R.id.autoComplete_subnet_mask) as AutoCompleteTextView
            // Get the string array
        val subnet_mask: Array<out String> = resources.getStringArray(R.array.subnet_mask_array)
            // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subnet_mask).also { adapter ->
            textView_subnet_mask.setAdapter(adapter)
                }


                }
            }






