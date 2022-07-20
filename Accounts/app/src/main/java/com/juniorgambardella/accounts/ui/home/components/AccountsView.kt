package com.juniorgambardella.accounts.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.juniorgambardella.accounts.model.Account
import com.juniorgambardella.accounts.ui.theme.AccountsTheme

@Composable
fun AccountsView(accounts: List<Account>) {
  LazyColumn {
    items(accounts) {
      AccountView(it)
    }
  }
}

@Composable
private fun AccountView(account: Account) {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(horizontal = 16.dp, vertical = 8.dp),
    shape = RoundedCornerShape(8.dp),
    elevation = 4.dp
  ) {
    Column(
      modifier = Modifier.padding(16.dp)
    ) {
      Text(
        text = account.name,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold
      )
      Text(
        text = account.email,
        fontSize = 18.sp,
        color = Color.DarkGray
      )
    }
  }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AccountsScreenPreview() {
  AccountsTheme {
    AccountsView(
      listOf(
        Account(
          name = "Esdras",
          email = "mdad@dmamd"
        ),
        Account(
          name = "Junior",
          email = "mddada@dmamd"
        )
      )
    )
  }
}