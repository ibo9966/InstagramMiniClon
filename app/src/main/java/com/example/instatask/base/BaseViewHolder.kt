package com.example.instatask.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder <T>(binding: ViewBinding): RecyclerView.ViewHolder(binding.root){

    var itemClickListener: ((item:IBaseModel , position:Int) -> Unit)? = null
    abstract fun bindView(model : T, position: Int)
}