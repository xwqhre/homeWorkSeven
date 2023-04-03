package com.example.lesson_three_seven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson_three_seven.adapter.FlowerAdapter
import com.example.lesson_three_seven.adapter.FlowerModel
import com.example.lesson_three_seven.databinding.ActivityMainBinding
import android.content.Intent
import com.example.lesson_three_seven.adapter.ActivityContainer
import android.content.Intent as AndroidContentIntent

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: FlowerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillRecycleView()
    }

    private fun fillRecycleView() {
        val arrayList: ArrayList <FlowerModel> = ArrayList()
        arrayList.add(FlowerModel ("Gortenzia",600))
        arrayList.add(FlowerModel ("Rose",200))
        arrayList.add(FlowerModel ("Fialki",600))
        arrayList.add(FlowerModel ("Piony",600))
        arrayList.add(FlowerModel ("Gepsoifily",600))
        arrayList.add(FlowerModel ("Orhidery",600))
        arrayList.add(FlowerModel ("Hrizantemy",600))
        arrayList.add(FlowerModel ("Tulpany",600))
        arrayList.add(FlowerModel ("Tulpany",600))
        arrayList.add(FlowerModel ("Tulpany",600))
        arrayList.add(FlowerModel ("Tulpany",600))
        arrayList.add(FlowerModel ("Tulpany",600))
        arrayList.add(FlowerModel ("Tulpany",600))

        adapter = FlowerAdapter(arrayList) {

            val intent = Intent(this,ActivityContainer::class.java)
            intent.putExtra("flower",it)
            startActivity(intent)
        }
        binding.recycleView.adapter = adapter

    }
}

