package com.example.doexecrcise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val value = sum(10,5)
//        Log.d("mohammad","$value")
//        (--------------)
//        Rectangle(5,7)
//        (--------------)
//        val number = maxList(listOf(34,50,8700,90,200,150,58,2))
//        Log.d("mohammad","Max Number : $number")
//        (--------------)
//        Log.d("mohammad","${week(5)}")
//        (--------------)
//        val num = ave(listOf(11,17,15,4,18,20))
//        Log.d("mohammad","Average = $num")
//        (--------------)
//        val value = one(listOf(1,3,5,1,0,19,0))
//        Log.d("mohammad","The Number of one is $value")
//        (--------------)
//        val names = name(listOf("Mohammad","Ali","Hasan","Melika","Mahdi","Mohammad"))
//        Log.d("mohammad","$names")
//        (--------------)
//        val a = value(listOf(24,90,3,1,66))
//        Log.d("mohammad","$a")
//        (--------------)
        val listResult = newList(listOf(80,5,3,90,25,15))       //listResult(83,8,6,93,28,18)
        for (i in listResult){                                  //i = 83 , i = 8
            Log.d("mohammad","$i")           //listResult(83,8,,6,93,28,18)
        }

    }


//    fun sum(a:Int,b:Int):String {
//        return if (a % b == 0){
//            "Valid"
//        }else
//            "Invalid"
//    }
//    (--------------)

//    fun Rectangle(a:Int,b:Int){
//        for (i in 1..a){	    // a = 5 , i = 1 , i = 2 , i = 3 , i = 4 , i = 5
//            for (j in 1..b){	// b = 7 , j = 1
//                print("*")		// **********************************
//            }
//            println()
//        }
//    }
//    (--------------)

//    fun maxList(listNumber: List<Int>):Int {        // 98,60,35,100,200,1
//        var max = listNumber.first()        // max = 98
//        for (i in listNumber){              // i = 98   i = 60,35,100,200
//            if (i > max){
//                max = i                     // max = 100,200
//            }
//        }
//        return max
//    }
//    (--------------)

//    fun week(a: Int): String {
//        return if (a > 30) {
//            "Invalid"
//        } else {
//            when (a % 7) {
//                0 -> "Friday"
//                1 -> "Saturday"
//                2 -> "Sunday"
//                3 -> "Monday"
//                4 -> "Tuesday"
//                5 -> "Wednesday"
//                6 -> "Thursday"
//                else -> "Unknown"
//            }
//        }
//    }
//    (--------------)

//    fun ave(average: List<Int>):Int{
//        var a = 0
//        for (i in average){
//            a += i
//        }
//        return a / average.size
//    }
//    (--------------)

//    fun one(number: List<Int>):Int{
//        var a = 0
//        for (i in number){
//            if (i <= 1){
//                a += i
//            }
//        }
//        return a
//    }
//    (--------------)

//    fun name(nam: List<String>): Int {
//        var b = 0
//        for (i in nam){
//            if (i == "Mohammad"){
//                b ++
//            }
//        }
//        return b
//    }
//    (--------------)

//    fun value(number: List<Int>): List<Int> {
//        return number
//    }
//    (--------------)

    fun newList(value:List<Int>): List<Int> {           //(80,5)
        var b = 0                                       //b = 0
        val listPlus = mutableListOf<Int>()             //listPlus()
        for (i in value){                               //i = 80, i = 5
            b = i + 3                                   //b = 83, b = 8
            listPlus.add(b)                             //listPlus(83,8)
        }
        return listPlus
    }

}

