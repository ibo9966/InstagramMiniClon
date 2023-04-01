package com.example.instatask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instatask.adapter.RecyclerViewAdapter
import com.example.instatask.base.IBaseModel
import com.example.instatask.databinding.ActivityMainBinding
import com.example.instatask.dto.BodyDTO
import com.example.instatask.dto.LastDTO
import com.example.instatask.dto.TitleDTO

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerViewAdapter
    private val instaList= mutableListOf<IBaseModel>()
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        PhotoList()

        val layoutManager = LinearLayoutManager(this)
        binding.rv.layoutManager=layoutManager
        adapter= RecyclerViewAdapter(instaList)
        binding.rv.adapter = adapter
    }

    private fun PhotoList(){
        with(instaList){
            add(TitleDTO(R.drawable.ibo,"İbrahim Kayatepe"))
            add(BodyDTO(R.drawable.ibo))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.duygu,"Duygu Seçkin"))
            add(BodyDTO(R.drawable.duygu))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.fiko,"Furkan Yılmaz"))
            add(BodyDTO(R.drawable.fiko))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.sena,"Sena Kayatepe"))
            add(BodyDTO(R.drawable.sena))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.nil,"Nil Seçkin"))
            add(BodyDTO(R.drawable.nil))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.yusuf,"Yusuf Çil"))
            add(BodyDTO(R.drawable.yusuf))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.emre,"Emre Sarigül"))
            add(BodyDTO(R.drawable.emre))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.civanleyla6,"Leyla Atman"))
            add(BodyDTO(R.drawable.civanleyla6))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.kerem1,"Kerem Yılmaz"))
            add(BodyDTO(R.drawable.kerem1))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.ibo,"İbrahim Kayatepe"))
            add(BodyDTO(R.drawable.sena1))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.nil,"Nil Seçkin"))
            add(BodyDTO(R.drawable.nil1))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.fiko,"Furkan Yılmaz"))
            add(BodyDTO(R.drawable.fikoilayda1))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.fiko,"Furkan Yılmaz"))
            add(BodyDTO(R.drawable.fikoilayda2))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.emre,"Emre Sarııgül"))
            add(BodyDTO(R.drawable.emreceyda3))
            add(LastDTO(null))

            add(TitleDTO(R.drawable.emre,"Emre Sarııgül"))
            add(BodyDTO(R.drawable.emreceyda2))
            add(LastDTO(null))
        }

    }
}

