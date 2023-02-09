package com.alperyuceer.akyurtrehber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alperyuceer.akyurtrehber.databinding.ActivityDetailsBinding
import com.alperyuceer.akyurtrehber.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedDukkan= intent.getSerializableExtra("dukkan") as Dukkan
        binding.numaraText.text = selectedDukkan.dukkanTel.toString()
        binding.baslikText.text= "${selectedDukkan.dukkanIsmı} DÜKKANINI ARAMAK İÇİN TIKLAYINIZ"
        binding.adresDetailText.text= selectedDukkan.dukkanAdres



    }
}