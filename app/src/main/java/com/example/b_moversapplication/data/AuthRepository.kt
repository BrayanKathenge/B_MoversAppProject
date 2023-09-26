package com.example.b_moversapplication.data

import android.app.ProgressDialog
import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth


class AuthRepository(var navController: NavHostController, var context: Context) {
    var mAuth: FirebaseAuth
    var progress: ProgressDialog


    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("loading")
        progress.setMessage("please wait ...")
    }


}

