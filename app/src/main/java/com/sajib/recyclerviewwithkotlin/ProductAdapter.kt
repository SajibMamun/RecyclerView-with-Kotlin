package com.sajib.recyclerviewwithkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.sajib.recyclerviewwithkotlin.databinding.ProductitemviewBinding

class ProductAdapter(var context:Context) :ListAdapter<ProductDataclass,ProductViewHolder> (comparator){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
       val binding=ProductitemviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return  ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
      getItem(position).let {
          holder.binding.itemnameid.text=it.productname
          holder.binding.itempricetvid.text=it.productprice
          holder.binding.itemdescriptiontvid.text=it.productDetails

          Glide.with(context).load(it.productImage).into(holder.binding.imageviewid)


        holder.binding.carviewid.setOnClickListener {_->
            val intent=Intent(context, DetailsActivity::class.java)

            intent.putExtra("name",it.productname)
            intent.putExtra("price",it.productprice)
            intent.putExtra("detail",it.productDetails)
            intent.putExtra("img",it.productImage)
            context.startActivity(intent)
        }
          holder.binding.addtocartbtnid.setOnClickListener {
              Toast.makeText(context,"Added To cart",Toast.LENGTH_SHORT).show()
          }

          holder.binding.favourbtnid.setOnClickListener(
              View.OnClickListener {
                  holder.binding.favourbtnid.setImageResource(R.drawable.love)
                  Toast.makeText(context,"Added To Favourite",Toast.LENGTH_SHORT).show()
              }
          )




      }
    }

    companion object{
        val comparator=object :DiffUtil.ItemCallback<ProductDataclass>()
        {
            override fun areItemsTheSame(
                oldItem: ProductDataclass,
                newItem: ProductDataclass
            ): Boolean {
            return oldItem.productname==newItem.productname
            }

            override fun areContentsTheSame(
                oldItem: ProductDataclass,
                newItem: ProductDataclass
            ): Boolean {
               return oldItem==newItem
            }

        }
    }
}