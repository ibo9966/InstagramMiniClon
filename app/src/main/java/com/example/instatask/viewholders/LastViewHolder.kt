package com.example.instatask.viewholders

import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.instatask.base.BaseViewHolder
import com.example.instatask.databinding.ItemLastBinding
import com.example.instatask.dto.LastDTO
import android.os.Handler
import android.os.Looper
import com.example.instatask.R

class LastViewHolder (binding: ItemLastBinding) : BaseViewHolder<LastDTO>(binding){
    private val _binding = binding
    override fun bindView(model: LastDTO, position: Int) {

        _binding.likeButton.setOnClickListener {
            Toast.makeText(_binding.root.context,"Fotoğrafı beğendiniz.",Toast.LENGTH_SHORT).show()
            // Kalp resmini göster
            _binding.likeButton.setImageResource(R.drawable.kalp)

            // 1 saniye sonra like.png resmini tekrar yükle
            Handler(Looper.getMainLooper()).postDelayed({
                _binding.likeButton.setImageResource(R.drawable.like)
            }, 1000)

        }
        _binding.commentButton.setOnClickListener {
            Toast.makeText(_binding.root.context,"Yorum yaptınız..",Toast.LENGTH_SHORT).show()
        }
        _binding.shareButton.setOnClickListener {
            Toast.makeText(_binding.root.context,"Fotoğrafı paylaştınız.",Toast.LENGTH_SHORT).show()
        }
        _binding.saveButton.setOnClickListener {
            Toast.makeText(_binding.root.context,"Fotoğrafı kayıt ettiniz.",Toast.LENGTH_SHORT).show()

        }

            /*Glide.with(_binding.root.context)
                .load(model.imageButton)
                .into(_binding.likeButton)

            Glide.with(_binding.root.context)
                .load(model.imageButton)
                .into(_binding.commentButton)

            Glide.with(_binding.root.context)
                .load(model.imageButton)
                .into(_binding.shareButton)

            Glide.with(_binding.root.context)
                .load(model.imageButton)
                .into(_binding.saveButton)*/
    }
}