package com.example.warda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Page3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        val book = intent.extras?.getInt("book",-1)
        val intent = Intent(this,Page1::class.java)
        val img = findViewById<ImageView>(R.id.bookImage)
        val bookHeading = findViewById<TextView>(R.id.bookHeading)
        val description = findViewById<TextView>(R.id.description)
        val rating = findViewById<TextView>(R.id.bookRating)
        val available = findViewById<TextView>(R.id.bookAvailablity)
        val backBtn = findViewById<ImageView>(R.id.back3)
        backBtn.setOnClickListener(){
            startActivity(intent)
        }
        when (book) {
            1 -> {
                bookHeading.text="Book 1"
                img.setImageResource(R.drawable.book1)
                description.text = getString(R.string.book1_ifo)
                rating.text = "4.2/5"
                available.text = "Amazon \nE-book"
            }
            2 -> {
                bookHeading.text="Book 2"
                img.setImageResource(R.drawable.book2)
                description.text = getString(R.string.book2_ifo)
                rating.text = "4.3/5"
                available.text = "Amazon \nKindle \nE-book"
            }
            3 -> {
                bookHeading.text="Book 3"
                img.setImageResource(R.drawable.book3)
                description.text = getString(R.string.book3_ifo)
                rating.text = "4/5"
                available.text = "Amazon \nKindle \nE-book"
            }
            4 -> {
                bookHeading.text="Book 4"
                img.setImageResource(R.drawable.book4)
                description.text = getString(R.string.book4_ifo)
                rating.text = "4.6/5"
                available.text = "Amazon\n" +
                        "Kindle"
            }
            5 -> {
                bookHeading.text="Book 5"
                img.setImageResource(R.drawable.book5)
                description.text = getString(R.string.book5_ifo)
                rating.text = "4.4/5"
                available.text = "Amazon\n"+"Kindle"
            }
            6 -> {
                bookHeading.text="Book 6"
                img.setImageResource(R.drawable.book6)
                description.text = getString(R.string.book6_ifo)
                rating.text = "4.2/5"
                available.text = "Amazon\n"+"Kindle\n"+"E-book"
            }
            7 -> {
                bookHeading.text="Book 7"
                img.setImageResource(R.drawable.book7)
                description.text = getString(R.string.book7_ifo)
                rating.text = "4.4/5"
                available.text = "Amazon\n"+"Kindle\n"+"E-book"
            }
            8 -> {
                bookHeading.text="Book 8"
                img.setImageResource(R.drawable.book8)
                description.text = getString(R.string.book8_ifo)
                rating.text = "4.4/5"
                available.text = "Amazon\n"+"Kindle\n"+"E-book"
            }
            9 -> {
                bookHeading.text="Book 9"
                img.setImageResource(R.drawable.book9)
                description.text = getString(R.string.book9_ifo)
                rating.text = "4.3/5"
                available.text = "Amazon\n"+"Kindle\n"+"E-book"
            }
        }
    }
}