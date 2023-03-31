package com.example.instatask.dto

import com.example.instatask.base.IBaseModel
import com.example.instatask.base.IBaseModel.Companion.TITLE


data class TitleDTO (
    var imagePath:Int,
    var title : String
): IBaseModel {
    override val type = TITLE
}