package com.example.moshe.smackchat.controller

import android.graphics.Color
import com.example.moshe.smackchat.R
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : BaseActivity() {

    var userAvatar = "profileDefault"
    var userVolor = "[0.5, 0.5, 0.5 , 1]"

    override fun getContentView(): Int = R.layout.activity_create_user

    override fun init() {
        backgroundColorBtn.setOnClickListener {
            val ran = Random()
            val r = ran.nextInt(225)
            val g = ran.nextInt(225)
            val b = ran.nextInt(225)

            createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

            val savedR =    r.toDouble() / 255
            val savedG =    r.toDouble() / 255
            val savedB =    r.toDouble() / 255

            userVolor = "[$savedR, $savedG, $savedG, 1]"
        }

        createAvatarImageView.setOnClickListener {
            val ran = Random()
            val color = ran.nextInt(2)
            val avatar = ran.nextInt(28)

            userAvatar = if(color == 0) {
                "light$avatar"
            }else{
                "dark$avatar"
            }

            val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
            createAvatarImageView.setImageResource(resourceId)
        }

        createUserBtn.setOnClickListener {  }
    }


}
