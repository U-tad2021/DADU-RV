package com.amarinag.dadurv

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amarinag.dadurv.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dogId = intent.getExtras()?.getString("dogId")

        if (dogId == null) {
            finish()
            return
        }
        val dog: Dog? = dogs.firstOrNull { it.id == dogId }

        if (dog == null) {
            Toast.makeText(this, "no dog found", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        populateDog(dog)
    }

    private fun populateDog(dog: Dog) {
        binding.tvName.text = dog.name
        binding.tvDescription.text = dog.description
        binding.tvAge.text = dog.age.toString()

    }
}