package com.example.b_moversapplication.data

import android.app.ProgressDialog
import android.content.Context
import androidx.navigation.NavController


class AuthRepository(var navController: NavController, var context: Context)  {
    var mAuth: Fire
    var progress: ProgressDialog


    init {
        mAuth = FirebaseAuth.getInstance()
        progress= ProgressDialog(context)
        progress.setTitle("loading")
        progress.setMessage("please wait ...")
    }



}