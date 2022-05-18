package com.amarinag.dadurv

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.amarinag.dadurv.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = DogAdapter { navigateToDetail(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvDogs.adapter = adapter
        binding.rvDogs.layoutManager = LinearLayoutManager(this)
        adapter.submitList(dogs)
    }

    private fun navigateToDetail(dog: Dog) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("dogId", dog.id)
        startActivity(intent)
    }
}