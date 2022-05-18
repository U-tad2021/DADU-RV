package com.amarinag.dadurv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amarinag.dadurv.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dogId = intent.extras?.getString("dogId")

        val dog: Dog? = dogs.firstOrNull { it.id == dogId }

        binding.tvName.text = dog?.name
        binding.tvDescription.text = dog?.description
        binding.tvAge.text = dog?.age.toString()

    }
}