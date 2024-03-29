package com.agn.superkahramanbtk

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agn.superkahramanbtk.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityTanitimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tanitim)
        val intent=intent
        var secilenOyuncu=intent.getStringExtra("voleybolcu")
        binding.textView.text=secilenOyuncu

        /*val secilenVoleybolcu=SingletonClass.SecilenVoleybolcu
        val secilenGorsel=SingletonClass.gorsel
        binding.imageView.setImageBitmap(secilenGorsel)*/
        var secilenGorsel=intent.getIntExtra("voleybolGörsel",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenGorsel)
        binding.imageView.setImageBitmap(bitmap)

    }
}