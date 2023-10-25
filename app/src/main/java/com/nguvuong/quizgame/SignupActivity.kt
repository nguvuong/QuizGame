package com.nguvuong.quizgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nguvuong.quizgame.databinding.ActivityLoginBinding
import com.nguvuong.quizgame.databinding.ActivitySignupBinding


class SignupActivity : AppCompatActivity() {

    lateinit var signupBinding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signupBinding = ActivitySignupBinding.inflate(layoutInflater)
        val view = signupBinding.root
        setContentView(view)

        signupBinding.buttonSignup.setOnClickListener {

        }
    }
}