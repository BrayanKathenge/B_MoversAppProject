package com.example.b_moversapplication.ui.theme.pages.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.b_moversapplication.navigation.ROUTE_ADD_DRIVER

import com.example.b_moversapplication.navigation.ROUTE_VIEW_DRIVER

import com.example.b_moversapplication.ui.theme.B_MoversApplicationTheme


@Composable
fun homescreenpage(naController: NavHostController) {
    Text(text = "B_MOVERS COMPANY LTD",
        color = Color.Yellow,
        fontFamily = FontFamily.Cursive,
        fontSize = 30.sp,
    )

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Button(onClick = { /*TODO*/ }) {
            Text(text = "about",
            fontFamily = FontFamily.Monospace)
        }

        Button(onClick = {naController.navigate(ROUTE_ADD_DRIVER)}) {
            Text(text = "Add Driver",
                fontFamily = FontFamily.Monospace)
        }
        Button(onClick = {naController.navigate(ROUTE_VIEW_DRIVER)}) {

            Text(text = "View Drivers",
                fontFamily = FontFamily.Monospace)
        }
    }

}

@Preview
@Composable
fun homescreenpreview() {
    B_MoversApplicationTheme {
        homescreenpage(rememberNavController())
    }
}