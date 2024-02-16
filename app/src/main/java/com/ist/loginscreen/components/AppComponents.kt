@file:OptIn(ExperimentalMaterial3Api::class)

package com.ist.loginscreen.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ist.loginscreen.R
import com.ist.loginscreen.ui.theme.BgColor
import com.ist.loginscreen.ui.theme.Primary


@Composable
fun SimpleTextComponent(value:String){
    Text(text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 80.dp),
        style = TextStyle(
            fontSize =24.sp,
            fontWeight = FontWeight.Normal,
        ),
        textAlign = TextAlign.Center)

}




@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        textAlign = TextAlign.Center
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserFieldComponent(
    labelValue: String,
    icon: ImageVector,
    label:String

) {

    val textValue = remember {
        mutableStateOf("")
    }
Column {
    Text(text = label)
    TextField(
            modifier = Modifier
                .fillMaxWidth(),

            label = { Text(text = labelValue) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Primary,
                    focusedLabelColor = Primary,
                    cursorColor = Primary,
                    containerColor = BgColor
            ),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            singleLine = true,
            maxLines = 1,
            value = textValue.value,
//            leadingIcon = {
//                Icon(icon, contentDescription = "")
//            },
            onValueChange = {
                textValue.value = it
            },
    )

}


}
@Composable
fun PasswordTextFieldComponent(
    labelValue: String,

    label: String
    ) {

    val localFocusManager = LocalFocusManager.current
    val password = remember {
        mutableStateOf("")
    }

    remember {
        mutableStateOf(false)
    }
Column {
    Text(text = label)
    OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),

            label = { Text(text = labelValue) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Primary,
                    focusedLabelColor = Primary,
                    cursorColor = Primary,
                    containerColor = BgColor
            ),
            keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
            ),
            singleLine = true,
            keyboardActions = KeyboardActions {
                localFocusManager.clearFocus()
            },
            maxLines = 1,
            value = password.value,
            onValueChange = {
                password.value = it
            },
//            trailingIcon = {
//                Icon(icon, contentDescription = "")
//            },


            )
}

}

@Composable
fun ButtonComponent(value: String){
    Button(onClick = { /*TODO*/ }) {
        Text(text = value)

    }


}

@Composable
fun MyImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.logo)
    Box(modifier) {
        Image(
                painter = image,
                contentDescription = null
        )

    }
}
