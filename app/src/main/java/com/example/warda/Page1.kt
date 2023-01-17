package com.example.warda

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        val intent = Intent(this,Page2::class.java)
        val romance = findViewById<Button>(R.id.romance)
        val thriller = findViewById<Button>(R.id.thriller)
        val horror = findViewById<Button>(R.id.horror)
        val info = findViewById<ImageView>(R.id.info)

        romance.setOnClickListener(){
            intent.putExtra("genre",0)
            startActivity(intent)
        }
        thriller.setOnClickListener(){
            intent.putExtra("genre",1)
            startActivity(intent)
        }
        horror.setOnClickListener(){
            intent.putExtra("genre",2)
            startActivity(intent)
        }
        info.setOnClickListener(){
            val myDialoug = Dialog(this)
            myDialoug.setContentView(R.layout.info)
            myDialoug.setCancelable(true)
            myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialoug.show()
        }
    }
}