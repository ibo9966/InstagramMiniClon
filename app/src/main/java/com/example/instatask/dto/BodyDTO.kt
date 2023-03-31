package com.example.instatask.dto

import com.example.instatask.base.IBaseModel
import com.example.instatask.base.IBaseModel.Companion.TYPE_BODY

data class BodyDTO (
    var imagePath:Int
):IBaseModel{
    override val type=TYPE_BODY
}