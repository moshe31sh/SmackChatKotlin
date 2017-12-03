package com.example.moshe.smackchat

import android.content.Intent
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
