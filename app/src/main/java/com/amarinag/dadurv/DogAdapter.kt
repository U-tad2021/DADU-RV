package com.amarinag.dadurv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.amarinag.dadurv.databinding.ItemDogBinding

class DogAdapter : ListAdapter<Dog, DogAdapter.DogViewHolder>(DogItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDogBinding.inflate(inflater, parent, false)
        return DogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dog = getItem(position)
        holder.binding.tvName.text = dog.name
        holder.binding.tvDescription.text = dog.description
        holder.binding.tvAge.text = dog.age.toString()
    }

    class DogViewHolder(val binding: ItemDogBinding) : RecyclerView.ViewHolder(binding.root)

}

class DogItemCallback : DiffUtil.ItemCallback<Dog>() {
    override fun areItemsTheSame(oldItem: Dog, newItem: Dog): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: Dog, newItem: Dog): Boolean = oldItem == newItem
}