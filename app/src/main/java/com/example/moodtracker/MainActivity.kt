package com.example.moodtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moodtracker.databinding.ActivityMainBinding
import com.example.moodtracker.databinding.FragmentSplashScreenBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
    }
}