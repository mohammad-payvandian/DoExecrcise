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
        Log.d("mohammad","${week(5)}")
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

    fun week(a: Int): String {
        return if (a > 30) {
            "Invalid"
        } else {
            when (a % 7) {
                0 -> "Friday"
                1 -> "Saturday"
                2 -> "Sunday"
                3 -> "Monday"
                4 -> "Tuesday"
                5 -> "Wednesday"
                6 -> "Thursday"
                else -> "Unknown"
            }
        }
    }


}