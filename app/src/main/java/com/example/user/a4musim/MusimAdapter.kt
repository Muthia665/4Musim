package com.example.user.a4musim

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.listitem.view.*

class MusimAdapter (private val musimList: List<Musim>) : RecyclerView.Adapter<MusimHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MusimHolder {
        return MusimHolder(LayoutInflater.from(p0.context).inflate(R.layout.listitem,p0,false))
    }

    override fun getItemCount(): Int {
        return musimList.size
    }

    override fun onBindViewHolder(p0: MusimHolder, p1: Int) {
        p0.bindHero(musimList[p1])
    }

}

class MusimHolder(view :View) : RecyclerView.ViewHolder(view){

    private val tvMusim = view.txtItem
    private val imgMusim = view.imgItem

    fun bindHero(musim: Musim) {
        tvMusim.text = musim.nama
        Picasso.get().load(musim.gambar).into(imgMusim)

        itemView.setOnClickListener {
            Toast.makeText(itemView.context, musim.nama, Toast.LENGTH_SHORT).show()

            val intent = Intent(itemView.context, Main2Activity::class.java)
            intent.putExtra("Text", musim.nama)
            intent.putExtra("Image", musim.gambar)
            intent.putExtra("keterangan", musim.keterangan)
            itemView.context.startActivity(intent)
        }
    }
}