package com.example.lesson_three_seven.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson_three_seven.DetailFragment
import com.example.lesson_three_seven.R

class ActivityContainer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val flowerModel : FlowerModel?
        = intent.getParcelableExtra("flower")

        val bundle = Bundle()
        bundle.putParcelable("flower", flowerModel)

        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle

        supportFragmentManager
            .beginTransaction().
        add(R.id.fragment_container, detailFragment).commit()
    }
}