package com.example.warda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        val gen = intent.getIntExtra("genre",-1)
        val intent = Intent(this,Page3::class.java)
        var book1 = findViewById<Button>(R.id.book1)
        var book2 = findViewById<Button>(R.id.book2)
        var book3 = findViewById<Button>(R.id.book3)
        book1.setOnClickListener(){
            if (gen == 0){
                intent.putExtra("book",1)
                startActivity(intent)
            }
            else if (gen == 1){
                intent.putExtra("book",4)
                startActivity(intent)
            }
            else if (gen == 2){
                intent.putExtra("book",7)
                startActivity(intent)
            }
        }
        book2.setOnClickListener(){
            when (gen) {
                0 -> {
                    intent.putExtra("book",2)
                    startActivity(intent)
                }
                1 -> {
                    intent.putExtra("book",5)
                    startActivity(intent)
                }
                2 -> {
                    intent.putExtra("book",8)
                    startActivity(intent)
                }
            }
        }
        book3.setOnClickListener(){
            when (gen) {
                0 -> {
                    intent.putExtra("book",3)
                    startActivity(intent)
                }
                1 -> {
                    intent.putExtra("book",6)
                    startActivity(intent)
                }
                2 -> {
                    intent.putExtra("book",9)
                    startActivity(intent)
                }
            }
        }
    }
}