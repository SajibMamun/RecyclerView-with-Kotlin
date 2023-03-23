package com.sajib.recyclerviewwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sajib.recyclerviewwithkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter:ProductAdapter


    val productlist = listOf<ProductDataclass>(

        ProductDataclass(
            "Red Apple", "250", apple, R.drawable.apple
        ), ProductDataclass(
            "Mango", "200", mango, R.drawable.mango
        ), ProductDataclass(
            "Yellow Banana", "80", banana, R.drawable.banana
        ), ProductDataclass(
            "Black Berry", "1980", blackberry, R.drawable.blackberry
        ), ProductDataclass(
            "Green Grape", "290", grape, R.drawable.grape
        ), ProductDataclass(
            "Golden 8 Guava", "70", guava, R.drawable.guava
        ), ProductDataclass(
            "JackFruit", "350", jackfruit, R.drawable.jackfruit
        ), ProductDataclass(
            "Jamrul", "120", jamrul, R.drawable.jamrul
        ), ProductDataclass(
            "Kiwi", "850", Kiwi, R.drawable.kiwi
        ), ProductDataclass(
            "Red Lichi", "300", lichi, R.drawable.lichi
        ), ProductDataclass(
            "Orange", "200", orange, R.drawable.orange
        ), ProductDataclass(
            "Sofeda", "140", sofeda, R.drawable.sofeda
        ), ProductDataclass(
            "Persimon", "300", percimon, R.drawable.persimon
        )


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter=ProductAdapter(this)
        adapter.submitList(productlist)


        binding.recyclerviewdid.adapter=adapter

    }
}