package com.example.b_moversapplication.ui.theme.pages.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.b_moversapplication.ui.theme.B_MoversApplicationTheme


@Composable
fun homescreen(naController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome to B-Movers.Ltd")

        Button(onClick = { /*TODO*/ }) {
            Text(text = "about")
        }

        Button(onClick = {/*TODO*/}) {
            Text(text = "Registration")
        }
    }

}

@Preview
@Composable
fun homescreenpreview() {
    B_MoversApplicationTheme {
        homescreen(rememberNavController())
    }
}