package com.example.moshe.smackchat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUserActivity : BaseActivity() {
    override fun getContentView(): Int = R.layout.activity_create_user

    override fun init() {
        backgroundColorBtn.setOnClickListener {

        }

        createAvatarImageView.setOnClickListener {

        }

        createUserBtn.setOnClickListener {  }
    }


}
