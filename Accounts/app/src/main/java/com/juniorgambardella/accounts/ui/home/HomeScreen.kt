package com.juniorgambardella.accounts.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.juniorgambardella.accounts.model.Account
import com.juniorgambardella.accounts.ui.home.components.AccountsView
import com.juniorgambardella.accounts.ui.home.components.FormView
import com.juniorgambardella.accounts.ui.theme.AccountsTheme


@Composable
fun HomeScreen() {
  val accounts = remember { mutableStateListOf<Account>() }

  Column(
    modifier = Modifier.padding(16.dp)
  ) {
    FormView{ account ->
      accounts.add(account)
    }
    Divider()
    AccountsView(accounts = accounts)
  }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
  AccountsTheme {
    HomeScreen()
  }
}