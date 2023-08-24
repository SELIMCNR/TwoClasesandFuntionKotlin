package com.cinar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //lateinit sonradan initilaize edilecek
    lateinit var myTextView: TextView

    lateinit var text: TextView

    lateinit var myButton: Button

    lateinit var nameText : EditText
    lateinit var ageText : EditText
    lateinit var jobText : EditText
    lateinit var wıdthText:EditText

    var name = ""
    var age =0
    var job = ""
    var wıdth = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.text)
        text = findViewById(R.id.text)

        myButton = findViewById(R.id.button)

        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)
        wıdthText = findViewById(R.id.wıdthText)

        // 1) code block kod blok , reusable yineleme 2) input giriş 3)output çıkış
        println("Hello kotlin")
        text.text = "Hello kotlin"
        test()

        //Input alma functionlar unit döndürür
        mySum(10, 15)
        mySum(40, 35)
        val sumResult = mySum(75, 85)
        println(sumResult)
        text.text = "${sumResult}"
        //Return geri döndüren fonksiyon aldığı değerleri döndürür
        myMultiply(20, 80)
        val result = myMultiply(50, 75)
        println(result)
        text.text = "${result}"

        //Görünüm işemleri
        görünüm(50, 45)
        //Lateinit görünüm
        lateinitGörünüm(75, 105)

        //Button onClik
        /*
        myButton.setOnClickListener {
            myTextView.text = "button clicked 2"
        }
*/

        //Class oluşturma ve değer verme
        /*
        val homer =playerSimpson()
        homer.name = "Homer Simpson"
        homer.age = 75
        homer.job = "Doctor"
        println(homer.name)
        text.text = "${homer.name}"
         */
        val homer = playerSimpson("Homer",50,"Doctor",100)
        homer.name = "Homer Simpson"
        println(homer.name)
        text.text = "${homer.name}"

        //Erişebilirlilik private public
        homer.setWidth(50)

        //Nullability tanımda String? dersen null olabilen bir değişkendir demek
        var myString : String? = null //Null olabilen bir string ve şuan null boş
        myString = "test"
        println(myString)
        text.text="${myString}"

        //Güvenli kodlama yöntemleri
        //1) !! kesin null değildir demek uygulama çokebilir
        var myAge : Int? = null
        myAge = 50
       // myAge!! // kesin null değil diyor
        println(myAge *10)
        text.text = "${myAge}"

        //2) safe call
        println(myAge?.minus(50))

        //3) ıf statement null
        if(myAge != null){
            println(myAge.minus(10))
        }
        else{
            println("myAge is null")
        }

        //4) elvis operator   eğer değer nulsa -10 yaz değilse gelen değeri yaz
        println(myAge?.minus(10) ?: -10)

        //5)let null değilse işlem yap nullsa birşey yapma
        myAge?.let {
            println(it *10) // null değil bu işlemi yap
        }
    }

    fun test() {
        println("Test function")
        text.text = "Hello kotlin"
    }

    //Input alma function
    fun mySum(a: Int, b: Int) {
        println(a + b)
        text.text = "${a + b}"
    }

    //Return geri döndüren fonksiyon aldığı değerleri döndürür
    fun myMultiply(x: Int, y: Int): Int {
        println(x * y)
        text.text = "${x * y}"
        var result = x * y
        return result
    }

    //Görünüm işlemleri
    fun görünüm(a: Int, b: Int): Int {
        val myTextView = findViewById<TextView>(R.id.text)
        val result = a * b
        myTextView.text = "${result}"

        return result  //return altına yazılır tüm kodlar
    }

    fun lateinitGörünüm(a: Int, b: Int):Int {
        var result = a + b
        myTextView.text = "${ result }"
        return  result
    }

    //Button clicked
   fun hesapla(view :View ){

       name = nameText.text.toString()
        age = ageText.text.toString().toInt()
        job = jobText.text.toString()
        wıdth = wıdthText.text.toString().toInt()

        if (age!=null && name!="" && job!="" && wıdth!=null)
        {
            val simpson = playerSimpson(name,age,job,wıdth)

            myTextView.text = "Name : ${simpson.name} : Age : ${simpson.age} Job:${simpson.job} wıdth:${simpson.wıdth}"

        }
        else {
            myTextView.text = "Enter your age"
        }

   }


}

