package com.app.kuzhellist


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.kuzhellist.databinding.ActivityStartsBinding


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityStartsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityStartsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}