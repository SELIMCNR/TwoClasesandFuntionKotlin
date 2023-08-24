package com.cinar.myapplication


//primary constructor
class playerSimpson  (var name:String,var age :Int,var job:String,var wıdth:Int) {
/*
    //Property
    var name = ""
    var age = 0
    var job = ""
    var weight=0


    //Secondary Constructor
    //Constructor yapıcı kurucu  fonksiyon parametre işinde eklenir this bu clasdaki özellikleri işaret eder
    constructor(name:String,age:Int,job:String,weight:Int){
        println("Constructor exetucted")
        this.name = name
        this.age = age
        this.job = job
        this.weight = weight
    }
*/

    //Erişebilirlilik seviyeleri
    //public heryerde açık,internal modül içinde,protected dosya içerisinde .kt,private heryerden gizli

    fun setWidth(num:Int){
        if (num>100){
            wıdth = num
        }
    }
}