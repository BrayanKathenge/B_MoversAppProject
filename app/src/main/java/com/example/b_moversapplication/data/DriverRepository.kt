package com.example.b_moversapplication.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.b_moversapplication.models.Drivers


class DriverRepository(navController: NavController, var context: Context) {
    var authRepository: AuthRepository
    var progress: ProgressDialog
    var driver:ArrayList<Drivers>

    init {
        authRepository= AuthRepository(navController ,context)

        progress = ProgressDialog(context)
        progress.setTitle("loading")
        progress.setMessage("please wait ...")
        driver = mutableListOf<Drivers>() as ArrayList<Drivers>
    }
    fun SaveDriver(drivername: String, trucknumber: String, truckcategory: String, make:String,loaders:String) {
        var id = System.currentTimeMillis().toString()
        var driverData = Drivers(drivername, trucknumber, truckcategory,make,loaders,id)
        var productRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        progress.show()
        productRef.setValue(driverData).addOnCompleteListener {
            progress.dismiss()
            if () {
                Toast.makeText(context, "saved successfully", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Error Try Again", Toast.LENGTH_SHORT).show()
            }
        }

    }

}