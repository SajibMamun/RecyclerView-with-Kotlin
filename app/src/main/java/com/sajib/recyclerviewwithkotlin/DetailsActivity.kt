package com.sajib.recyclerviewwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sajib.recyclerviewwithkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var name:String;
    lateinit var price:String;
    lateinit var description:String;
        var img:Int = 0;

    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent1=intent
        name=intent1.getStringExtra("name").toString()
        price=intent1.getStringExtra("price").toString()
        description=intent1.getStringExtra("detail").toString()
        img=intent1.getIntExtra("img",0)


        binding.productnameid.text= name
        binding.productpriceid.text=price +"$"
        binding.productdescripid.text=description
        binding.productimageid.setImageResource(img)



        binding.orderbtnid.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext,"Order Done", Toast.LENGTH_SHORT).show()
        })
    }
}