package com.alperyuceer.akyurtrehber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.alperyuceer.akyurtrehber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var dukkanList: ArrayList<Dukkan>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        dukkanList = ArrayList<Dukkan>()

        val akyurtHali = Dukkan("Akyurt Halı Yıkama",123,"Akyurt/Ankara")
        val pursaklarHali = Dukkan("Pursaklar Halı Yıkama",456,"Pursaklar/Ankara")
        val cubukHali = Dukkan("Çubuk Halı Yıkama",789,"Çubuk/Ankara")
        val kalecikHali = Dukkan("Kalecik Halı Yıkama",132,"Kalecik/Ankara")
        val cankayaHali = Dukkan("Çankaya Halı Yıkama",141,"Çankaya/Ankara")
        val altindagHali = Dukkan("Altındağ Halı Yıkama",123214,"Altındağ/Ankara")
        val keciorenHali = Dukkan("Keçiören Halı Yıkama",1461,"Keçiören/Ankara")

        dukkanList.add(akyurtHali)
        dukkanList.add(pursaklarHali)
        dukkanList.add(cubukHali)
        dukkanList.add(kalecikHali)
        dukkanList.add(cankayaHali)
        dukkanList.add(altindagHali)
        dukkanList.add(keciorenHali)

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,dukkanList.map { dukkan -> dukkan.dukkanIsmı })
        binding.listview.adapter=adapter
        binding.listview.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("dukkan",dukkanList.get(i))
            startActivity(intent)
        }



    }
}