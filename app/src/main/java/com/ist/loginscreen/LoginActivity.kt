package com.ist.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.ist.loginscreen.components.LoginForm
import com.ist.loginscreen.ui.theme.LoginscreenTheme

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            LoginscreenTheme{
                LoginForm()
            }
        }
    }
}