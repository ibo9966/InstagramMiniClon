package com.example.instatask.base

interface IBaseModel {

    val type: Int

    companion object{
        const val NONE=0
        const val TYPE_BODY=1
        const val TITLE=2
        const val LAST=3
    }
}