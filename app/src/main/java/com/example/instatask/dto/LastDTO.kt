package com.example.instatask.dto

import android.widget.ImageButton
import com.example.instatask.base.IBaseModel

data class LastDTO (
    var imageButton : Int?
):IBaseModel{
    override val type = IBaseModel.LAST
}