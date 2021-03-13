package com.nepplus.logintestui_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

         val inputId = idEdt.text.toString()
         val inputPassword = pwEdt.text.toString()

//         두 변수를 갖고 조건문 활용

        if(inputId == "admin" && inputPassword == "qwer") {
            Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
        }

        else{
            Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
        }

        }
    }
}