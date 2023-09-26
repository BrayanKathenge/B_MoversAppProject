package com.example.b_moversapplication.ui.theme.pages.registration

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.b_moversapplication.data.ProductRepository
import com.example.b_moversapplication.navigation.ROUTE_UPDATE_DRIVER
import com.example.b_moversapplication.ui.theme.B_MoversApplicationTheme

@Composable
fun ViewdriversScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Available Drivers",
            color = Color.Yellow,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp


        )
        Spacer(modifier = Modifier.height(20.dp))

        var context = LocalContext.current
        var productRepository = ProductRepository(navController, context)
        var drivers = productRepository.viewProduct()
        LazyColumn() {
            items(drivers.count()) {
                var driverName = drivers.get(it).drivername
                var truckCtg = drivers.get(it).truckcategory
                var truckLoaders = drivers.get(it).loaders
                var truckMke = drivers.get(it).make
                var truckNo = drivers.get(it).trucknumber
                var id = drivers.get(it).id
                ProductItem(
                    drivername = driverName,
                    truckcategory = truckCtg,
                    loaders = truckLoaders,
                    make=truckMke,
                    trucknumber = truckNo,
                    id = id,
                    productRepository =productRepository ,
                    navController = navController

                )



            }


        }
    }
}

@Composable
fun ProductItem(drivername: String, trucknumber: String, truckcategory: String, make: String, loaders: String,
    id:String, productRepository: ProductRepository,navController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = drivername)
        Text(text = truckcategory)
        Text(text = trucknumber)
        Text(text = make)
        Text(text = loaders)
        Button(onClick = { productRepository.deleteproduct(id) }) {
            Text(text = "Delete")

        }
        Button(onClick = { navController.navigate(ROUTE_UPDATE_DRIVER) }) {
            Text(text = "Update")
        }
    }

}



@Preview
@Composable
fun ViewDriverPreview() {
    B_MoversApplicationTheme() {
        ViewdriversScreen(rememberNavController())
    }
}

