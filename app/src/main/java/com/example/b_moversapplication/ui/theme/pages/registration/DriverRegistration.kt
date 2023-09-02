package com.example.b_moversapplication.ui.theme.pages.registration

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.b_moversapplication.ui.theme.B_MoversApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterDriver() {
    Column(modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Driver Registration")

        var drivername by remember { mutableStateOf(TextFieldValue("")) }
        var trucknumber by remember { mutableStateOf(TextFieldValue("")) }
        var truckcategory by remember { mutableStateOf(TextFieldValue("")) }
        var make by remember { mutableStateOf(TextFieldValue("")) }
        var loaders by remember { mutableStateOf(TextFieldValue("")) }


        OutlinedTextField(value = drivername, onValueChange = {drivername =it},
            label = { Text(text = "Driver_name *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(value = trucknumber, onValueChange = {trucknumber =it},
            label = { Text(text = "Truck_Number *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(value = truckcategory, onValueChange = {truckcategory =it},
            label = { Text(text = "Truck_Category *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(value = make, onValueChange = {make =it},
            label = { Text(text = "make_eg.Isuzu *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(value = loaders, onValueChange = {loaders =it},
            label = { Text(text = "loaders *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Submit Registration")

        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Update Details")

        }

    }

}


@Preview
@Composable
fun RegistrationScreenpreview() {
    B_MoversApplicationTheme {
        RegisterDriver()
    }
}
