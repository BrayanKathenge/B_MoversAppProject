package com.example.b_moversapplication.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.b_moversapplication.models.Drivers
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class ProductRepository(navController: NavHostController, var context: Context) {

    var progress: ProgressDialog
    var products: ArrayList<Drivers>


    init {

        progress = ProgressDialog(context)
        progress.setTitle("loading")
        progress.setMessage("please wait ...")
        products = mutableListOf<Drivers>() as ArrayList<Drivers>
    }




    fun viewProduct(): ArrayList<Drivers> {
        var ref = FirebaseDatabase.getInstance().getReference().child("Products")
        progress.show()
        ref.addValueEventListener(object :
            ValueEventListener {  override fun onDataChange(snapshot: DataSnapshot) {
            progress.dismiss()
            products.clear()
            for (snap in snapshot.children) {
                var driver = snap.getValue(Drivers::class.java)
                products.add(driver !!)
            }
        }

            override fun onCancelled(error: DatabaseError) {
                progress.dismiss()
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }



        })
        return products


    }


    fun deleteproduct(id: String) {
        var delRef = FirebaseDatabase.getInstance().getReference().child("Products/$id")
        progress.show()
        delRef.removeValue().addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "deleted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }}


    fun Uproduct(  drivername: String, trucknumber: String, truckcategory: String, make: String, loaders: String, id: String) {
        var UpdateRef = FirebaseDatabase.getInstance().getReference().child("Products/$id")
        var productData=Drivers(drivername,trucknumber, truckcategory, make, loaders, id)
        progress.show()
        UpdateRef.setValue(productData).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(context, "Update Successful", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun SaveProduct(drivername: String, trucknumber: String, truckcategory: String, make: String, loaders: String) {
        var id = System.currentTimeMillis().toString()
        var productData = Drivers(drivername, trucknumber, truckcategory, make, loaders, id)
        var productRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        progress.show()
        productRef.setValue(productData).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "saved successfully", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Error Try Again", Toast.LENGTH_SHORT).show()
            }
        }

    }

}




