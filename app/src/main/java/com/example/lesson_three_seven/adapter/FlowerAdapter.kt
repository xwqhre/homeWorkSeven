package com.example.lesson_three_seven.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_three_seven.databinding.ItemFlowerBinding

class FlowerAdapter
    (private val arrayListFlowers: ArrayList<FlowerModel>,
     val onFlowerClick: (FlowerModel) -> Unit)
 : RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        return FlowerViewHolder(ItemFlowerBinding.inflate
            (LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.onBind(arrayListFlowers[position])

    }

    override fun getItemCount(): Int {
        return arrayListFlowers.size
    }

    inner class FlowerViewHolder(private val binding:ItemFlowerBinding) : RecyclerView.ViewHolder(binding.root){

        fun onBind(flower: FlowerModel){
            binding.textView.text = "name:" + flower.name + ", price: " + flower.price.toString()

            itemView.setOnClickListener {
                onFlowerClick(flower)
            }
        }
    }
}



