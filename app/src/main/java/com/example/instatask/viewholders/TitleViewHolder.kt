package com.example.instatask.viewholders

import com.bumptech.glide.Glide
import com.example.instatask.base.BaseViewHolder
import com.example.instatask.databinding.ItemTitleBinding
import com.example.instatask.dto.TitleDTO



class TitleViewHolder (binding: ItemTitleBinding) : BaseViewHolder<TitleDTO>(binding){
    private val _binding = binding
    override fun bindView(model: TitleDTO, position: Int) {
        _binding.textViewTitle.text=model.title
        Glide.with(_binding.root.context)
            .load(model.imagePath)
            .into(_binding.imageViewkucuk)
    }
}