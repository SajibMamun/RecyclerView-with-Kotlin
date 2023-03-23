package com.sajib.recyclerviewwithkotlin

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ProductAdapter :ListAdapter<ProductDataclass,ProductViewHolder> (comparator){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        TODO("Not yet implemented")
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