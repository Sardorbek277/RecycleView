package com.example.ranglar_jilosi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ranglar_jilosi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = ArrayList<User>()
    private var rangliAdapter=RangliAdapter(list)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadDate()
        rangliAdapter = RangliAdapter(list)
        binding.rv.adapter = rangliAdapter
    }

    fun loadDate() {
        list = ArrayList()
        list.add(User(Color.RED))
        list.add(User(Color.GREEN))
        list.add(User(Color.BLACK))
        list.add(User(Color.BLUE))
        list.add(User(Color.CYAN))
        list.add(User(Color.DKGRAY))
        list.add(User(Color.LTGRAY))
        list.add(User(Color.MAGENTA))
        list.add(User(Color.WHITE))
    }
}