package com.example.moshe.smackchat.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

abstract class  BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
        init()

    }

    abstract fun getContentView() :Int

    abstract fun init()
}
