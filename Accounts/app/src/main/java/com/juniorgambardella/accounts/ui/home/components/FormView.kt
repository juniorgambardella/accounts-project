package com.juniorgambardella.accounts.ui.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.juniorgambardella.accounts.model.Account


@Composable
fun FormView(onSave: (Account) -> Unit) {
  var nameField by remember { mutableStateOf("") }
  var emailField by remember { mutableStateOf("") }

  Text(
    text = "Name",
    modifier = Modifier.padding(bottom = 8.dp),
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold
  )
  TextField(
    value = nameField,
    onValueChange = { nameField = it },
    modifier = Modifier
      .padding(bottom = 8.dp)
      .fillMaxWidth()
  )

  Text(
    text = "Email",
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold
  )
  TextField(
    value = emailField,
    onValueChange = { emailField = it },
    modifier = Modifier
      .fillMaxWidth()
  )

  Box(
    modifier = Modifier
      .fillMaxWidth()
      .padding(vertical = 16.dp),
    contentAlignment = Alignment.Center
  ) {
    Button(
      onClick = {
        onSave(Account(nameField, emailField))
      }) {
      Text(text = "SAVE")
    }

  }
}