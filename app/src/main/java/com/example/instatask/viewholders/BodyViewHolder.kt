package com.example.instatask.viewholders

import com.bumptech.glide.Glide
import com.example.instatask.base.BaseViewHolder
import com.example.instatask.databinding.ItemBodyBinding
import com.example.instatask.dto.BodyDTO

class BodyViewHolder(binding: ItemBodyBinding) : BaseViewHolder<BodyDTO>(binding) {
    private val _binding = binding
    override fun bindView(model: BodyDTO, position: Int) {

        Glide.with(_binding.root.context)
            .load(model.imagePath)
            .into(_binding.ivBody)
    }
}