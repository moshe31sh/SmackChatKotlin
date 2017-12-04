package com.example.moshe.smackchat.controller

import android.content.Intent
import com.example.moshe.smackchat.R
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : BaseActivity() {



    override fun getContentView(): Int = R.layout.activity_login


    override fun init() {
        loginLoginBtn.setOnClickListener{

        }

        loginCreateUserBtn.setOnClickListener {
            startActivity(Intent(this, CreateUserActivity::class.java))
        }
    }
}
