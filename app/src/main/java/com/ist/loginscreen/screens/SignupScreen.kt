package com.ist.loginscreen.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ist.loginscreen.components.ButtonComponent
import com.ist.loginscreen.components.HeadingTextComponent
import com.ist.loginscreen.components.MyImage
import com.ist.loginscreen.components.SimpleTextComponent
import com.ist.loginscreen.components.UserFieldComponent


@Composable
@Preview
fun SignupScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()){
            MyImage(message = "uber", from = "R.drawable.logo")
            SimpleTextComponent(value = "SmartUber")
            HeadingTextComponent(value = "Welcome back")
            UserFieldComponent(labelValue ="Firstname", icon = Icons.Default.Person, label = "First Name")
            UserFieldComponent(labelValue ="Lastname", icon = Icons.Default.Person, label = "Last Name")
            UserFieldComponent(labelValue ="Email", icon = Icons.Default.Email, label="Email")
            UserFieldComponent(labelValue ="Password", icon = Icons.Default.Lock, label="Password")
            ButtonComponent(value = "Signup")

                
            }

        }
    }
