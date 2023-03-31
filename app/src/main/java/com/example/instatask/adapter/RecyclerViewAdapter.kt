package com.example.instatask.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instatask.base.IBaseModel
import com.example.instatask.base.IBaseModel.Companion.LAST
import com.example.instatask.base.IBaseModel.Companion.TITLE
import com.example.instatask.base.IBaseModel.Companion.TYPE_BODY
import com.example.instatask.databinding.ItemBodyBinding
import com.example.instatask.databinding.ItemLastBinding
import com.example.instatask.databinding.ItemTitleBinding
import com.example.instatask.dto.BodyDTO
import com.example.instatask.dto.LastDTO
import com.example.instatask.dto.TitleDTO
import com.example.instatask.viewholders.BodyViewHolder
import com.example.instatask.viewholders.LastViewHolder
import com.example.instatask.viewholders.TitleViewHolder

class RecyclerViewAdapter (private var items :MutableList<IBaseModel>
):RecyclerView.Adapter<RecyclerView.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType){
            TYPE_BODY ->
                BodyViewHolder(
                    ItemBodyBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            TITLE->
                TitleViewHolder(
                    ItemTitleBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            LAST->
                LastViewHolder(
                    ItemLastBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            else-> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(items[position].type){
            TYPE_BODY->
                (holder as BodyViewHolder).bindView(
                    (items[position] as BodyDTO),
                    position
                )
            TITLE ->{
                (holder as TitleViewHolder).bindView(
                    (items[position] as TitleDTO),
                    position
                )
            }
            LAST->{
                (holder as LastViewHolder).bindView(
                    (items[position] as LastDTO),
                    position
                )
            }
        }

    }
    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }

}