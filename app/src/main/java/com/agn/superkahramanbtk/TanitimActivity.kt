package com.agn.superkahramanbtk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agn.superkahramanbtk.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityTanitimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)
    }
}