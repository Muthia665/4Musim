package com.example.user.a4musim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listMusim = listOf(
            Musim(nama = "Argentina", gambar = R.drawable.argentina, keterangan = R.string.argentina),
            Musim(nama = "Australia", gambar = R.drawable.australia, keterangan = R.string.australia),
            Musim(nama = "Brazil", gambar = R.drawable.brazil, keterangan = R.string.brazil),
            Musim(nama = "Cina", gambar = R.drawable.china, keterangan = R.string.china),
            Musim(nama = "Inggris", gambar = R.drawable.inggris, keterangan = R.string.inggris),
            Musim(nama = "Italia", gambar = R.drawable.italia, keterangan = R.string.italia),
            Musim(nama = "Jepang", gambar = R.drawable.jepang, keterangan = R.string.jepang),
            Musim(nama = "Jerman", gambar = R.drawable.jerman, keterangan = R.string.jerman),
            Musim(nama = "Korea", gambar = R.drawable.korea, keterangan = R.string.korea),
            Musim(nama = "Spanyol", gambar = R.drawable.spanyol, keterangan = R.string.spanyol)
        )

        val listadapter = MusimAdapter(listMusim)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listadapter
        }
    }
}
