package com.i4bchile.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.i4bchile.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val filename="com.i4bchile.sharedpreferences"
        sharedPreferences=getSharedPreferences(filename, Context.MODE_PRIVATE)
        val texto=binding.numEntValor.text.toString()

        binding.guardar.setOnClickListener {
        //Guardamos la información en shared preferences
            Log.d("Guardando", "onCreate: $texto")
            sharedPreferences.edit().putString("Texto",texto).apply()
        }



    }
}