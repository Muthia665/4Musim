package com.example.user.a4musim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView = findViewById<TextView>(R.id.txtDetail)
        val imageView = findViewById<ImageView>(R.id.imgDetail)
        var textView2 = findViewById<TextView>(R.id.ketDetail)

        var txt = intent.getStringExtra("Text")
        var img = intent.getIntExtra("Image", 0)
        val ket = intent.getIntExtra("keterangan", 0)

        textView.text = txt
        Picasso.get().load(img).into(imageView)
        textView2.setText(ket)
    }
}
