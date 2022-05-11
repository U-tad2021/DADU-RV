package com.amarinag.dadurv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DogAdapter : ListAdapter<Dog, DogAdapter.DogViewHolder>(DogItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_dog, parent, false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class DogViewHolder(view: View) : RecyclerView.ViewHolder(view)

}

class DogItemCallback : DiffUtil.ItemCallback<Dog>() {
    override fun areItemsTheSame(oldItem: Dog, newItem: Dog): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: Dog, newItem: Dog): Boolean = oldItem == newItem
}