package com.example.b_moversapplication.models

class Drivers {
    var drivername:String=""
    var trucknumber:String=""
    var truckcategory:String=""
    var make:String=""
    var loaders:String=""

    constructor(
        drivername: String,
        trucknumber: String,
        truckcategory: String,
        make: String,
        loaders: String,
        id: String
    ) {
        this.drivername = drivername
        this.trucknumber = trucknumber
        this.truckcategory = truckcategory
        this.make = make
        this.loaders = loaders
    }
}