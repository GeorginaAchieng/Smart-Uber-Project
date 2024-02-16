@file:OptIn(ExperimentalMaterial3Api::class)

package com.ist.loginscreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun LoginForm(){
    Surface {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            LoginField(
                value = "login",
                onChange = { },
                modifier = Modifier.fillMaxWidth()
            )
            PasswordField(
                value = "password",
                onChange = { },
                submit = { },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
@Composable
fun LoginField(
    value :String,
    onChange : (String)->Unit,
    modifier: Modifier = Modifier
){
    val leadingIcon = @Composable {
        Icon(
            Icons.Default.Person,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.primary
        )
    }
    TextField(value = value,
        onValueChange = onChange,
        modifier = modifier,
        leadingIcon = leadingIcon,
    )
}

@Composable
fun PasswordField(
    value: String,
    onChange: (String) -> Unit,
    submit: () -> Unit,
    modifier: Modifier = Modifier,
    label: String = "Password",
    placeholder: String = "Enter your Password"
) {
        val leadingIcon = @Composable {
            Icon(
                Icons.Default.Lock,
                contentDescription = "",
                tint = MaterialTheme.colorScheme.primary
            )
        }

        TextField(
        value = value,
        onValueChange = onChange,
        modifier = modifier,
        leadingIcon = leadingIcon,
        keyboardOptions = KeyboardOptions(
          keyboardType = KeyboardType.Password
            ),
        keyboardActions = KeyboardActions(
                onDone = { submit() }
            ),
        )
}