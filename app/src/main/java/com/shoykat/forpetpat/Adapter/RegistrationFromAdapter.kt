package com.shoykat.forpetpat.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.shoykat.forpetpat.RegistrationData
import com.shoykat.forpetpat.databinding.RegistrationscrollBinding

class RegistrationFromAdapter():ListAdapter<RegistrationData,RegistrationFromAdapter.RegistrationFromViewholder>(RegistrationFromDifutil()) {
    class RegistrationFromViewholder(val binding:RegistrationscrollBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(registration: RegistrationData){
            binding.data=registration

        }
        }

    class RegistrationFromDifutil : DiffUtil.ItemCallback<RegistrationData>(){
        override fun areItemsTheSame(
            oldItem: RegistrationData,
            newItem: RegistrationData
        ): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(
            oldItem: RegistrationData,
            newItem: RegistrationData
        ): Boolean {
            return oldItem==newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegistrationFromViewholder {
        val binding=RegistrationscrollBinding.
        inflate(LayoutInflater.from(parent.context),parent,false)
        return RegistrationFromViewholder(binding)
    }

    override fun onBindViewHolder(holder: RegistrationFromViewholder, position: Int) {
        val x=getItem(position)
        holder.bind(x)
    }

}