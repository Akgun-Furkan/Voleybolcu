package com.agn.superkahramanbtk

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.agn.superkahramanbtk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    public lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        //veri hazırlığı
        var voleybolcuIsimleri=ArrayList<String>()
        voleybolcuIsimleri.add("Zehra Güneş")
        voleybolcuIsimleri.add("Saliha Şahin")
        voleybolcuIsimleri.add("Arina Fedoretseva")
        voleybolcuIsimleri.add("Anastasia")
        voleybolcuIsimleri.add("Hilal Kocakara")

        //görselleri nesneleştirmek için bitmap
        /*//verimsiz tanımlama
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
        vlybGrs.add(hilalBitmap)*/
        //verimli tanımlama
        val zehraDrawableId=R.drawable.zehra
        val salihaDrawableId=R.drawable.saliha
        val arinaDrawableId=R.drawable.arina
        val anastasiaDrawableId=R.drawable.anastasia
        val hilalDrawableId=R.drawable.hilal

        var vlybGrsDrawable=ArrayList<Int>()
        vlybGrsDrawable.add(zehraDrawableId)
        vlybGrsDrawable.add(salihaDrawableId)
        vlybGrsDrawable.add(arinaDrawableId)
        vlybGrsDrawable.add(anastasiaDrawableId)
        vlybGrsDrawable.add(hilalDrawableId)
    //adapter
        val layoutManeger=LinearLayoutManager(this)
        binding.recyclerView.layoutManager=layoutManeger
        val adapter=RecyclerAdapter(voleybolcuIsimleri,vlybGrsDrawable)
        binding.recyclerView.adapter=adapter
    }
}