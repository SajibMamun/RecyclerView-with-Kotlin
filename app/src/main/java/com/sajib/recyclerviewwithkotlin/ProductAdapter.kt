package com.sajib.recyclerviewwithkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.sajib.recyclerviewwithkotlin.databinding.ProductitemviewBinding

class ProductAdapter :ListAdapter<ProductDataclass,ProductViewHolder> (comparator){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
       val binding=ProductitemviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return  ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
      getItem(position).let {
          holder.binding.itemnameid.text=it.productname
          holder.binding.itempricetvid.text=it.productprice
          holder.binding.itemdescriptiontvid.text=it.productDetails


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