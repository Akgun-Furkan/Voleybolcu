package com.agn.superkahramanbtk

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //veri hazırlığı
        var voleybolcuIsimleri=ArrayList<String>()
        voleybolcuIsimleri.add("zehra Güneş")
        voleybolcuIsimleri.add("Saliha Şahin")
        voleybolcuIsimleri.add("Arina Fedoretseva")
        voleybolcuIsimleri.add("Anastasia")
        voleybolcuIsimleri.add("Hilal Kocakara")

    //görselleri nesneleştirmek için bitmap
        //verimsiz tanımlama
        val zehraBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.zehra)
        val salihaBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.saliha)
        val arinaBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.arina)
        val anastasiaBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.anastasia)
        val hilalBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.hilal)

        var vlybGrs=ArrayList<Bitmap>()
        vlybGrs.add(zehraBitmap)
        vlybGrs.add(salihaBitmap)
        vlybGrs.add(arinaBitmap)
        vlybGrs.add(anastasiaBitmap)
        vlybGrs.add(hilalBitmap)

        val adapter=RecyclerAdapter(voleybolcuIsimleri)
    }
}