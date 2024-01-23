package com.example.ez04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview1: TextView = findViewById(R.id.textview1)

        val Cd: Button = findViewById(R.id.Cd)
        val del: Button = findViewById(R.id.del)
        val percent: Button = findViewById(R.id.percent)
        val divide: Button = findViewById(R.id.divide)

        val no7: Button = findViewById(R.id.no7)
        val no8: Button = findViewById(R.id.no8)
        val no9: Button = findViewById(R.id.no9)
        val multiply: Button = findViewById(R.id.multiply)

        val no4: Button = findViewById(R.id.no4)
        val no5: Button = findViewById(R.id.no5)
        val no6: Button = findViewById(R.id.no6)
        val minus: Button = findViewById(R.id.minus)

        val no1: Button = findViewById(R.id.no1)
        val no2: Button = findViewById(R.id.no2)
        val no3: Button = findViewById(R.id.no3)
        val plus: Button = findViewById(R.id.plus)

        val no0: Button = findViewById(R.id.no0)
        val dot: Button = findViewById(R.id.dot)
        val equal: Button = findViewById(R.id.equal)

        // สร้าง Global
        var currentNumber = "0"
        var number1 =""
        var number2 =""
        var otext =""
        var doot:Boolean = false

        // ณ จุดนี้ คือ การเขียนเพื่อกำหนด ปุ้มต่างๆว่ามีหน้าที่ทำอะไร

        Cd.setOnClickListener {
            currentNumber = "0"
            textview1.setText("0")
            doot = false
        }

        del.setOnClickListener {
            if (currentNumber.length >1){
                currentNumber = currentNumber.substring(0,currentNumber.length-1)
                textview1.setText(currentNumber)
            }else{
                textview1.setText("0")
                currentNumber =""
            }
        }

        no0.setOnClickListener {
            //currentNumber = Tans.text.toString()
            if (currentNumber == "0") {
                currentNumber = "0"
                textview1.setText("0")
            } else {
                currentNumber += "0"
                textview1.text = currentNumber
            }
        }
            no1.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "1"
                    textview1.setText("1")
                }else{
                    currentNumber += "1"
                    textview1.text = currentNumber
                }
            }
            no2.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "2"
                    textview1.setText("2")
                }else{
                    currentNumber += "2"
                    textview1.text = currentNumber
                }
            }

            no3.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "3"
                    textview1.setText("3")
                }else{
                    currentNumber += "3"
                    textview1.text = currentNumber
                }
            }

            no4.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "4"
                    textview1.setText("4")
                }else{
                    currentNumber += "4"
                    textview1.text = currentNumber
                }
            }

            no5.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "5"
                    textview1.setText("5")
                }else{
                    currentNumber += "5"
                    textview1.text = currentNumber
                }
            }

            no6.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "6"
                    textview1.setText("6")
                }else{
                    currentNumber += "6"
                    textview1.text = currentNumber
                }
            }

            no7.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "7"
                    textview1.setText("7")
                }else{
                    currentNumber += "7"
                    textview1.text = currentNumber
                }
            }

            no8.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "8"
                    textview1.setText("8")
                }else{
                    currentNumber += "8"
                    textview1.text = currentNumber
                }
            }

            no9.setOnClickListener {
                if(currentNumber == "0"){
                    currentNumber = "9"
                    textview1.setText("9")
                }else{
                    currentNumber += "9"
                    textview1.text = currentNumber
                }
            }

        dot.setOnClickListener {
            if (doot == false) {
                currentNumber += "."
                textview1.setText(currentNumber)
                doot = true
            }
        }

        //ตรงนี้คือการ กำหนดปุุ้มที่ต้องทำหน้าที่ เช่น การบวก และอื่นๆ
        plus.setOnClickListener {
            otext = "+"
            number1 = currentNumber
            currentNumber = ""
            textview1.text = "0"
            doot = false
        }

        minus.setOnClickListener {
            otext = "-"
            number1 = currentNumber
            currentNumber = ""
            textview1.text = "0"
            doot = false
        }

        multiply.setOnClickListener {
            otext = "*"
            number1 = currentNumber
            currentNumber = ""
            textview1.text = "0"
            doot = false
        }

        divide.setOnClickListener {
            otext = "/"
            number1 = currentNumber
            currentNumber = ""
            textview1.text = "0"
            doot = false
        }

        percent.setOnClickListener {
            otext = "%"
            number1 = currentNumber
            currentNumber = ""
            textview1.text = "0"
            doot = false
        }

        //การกดเท่ากับ
        equal.setOnClickListener {
            number2 = currentNumber
            var result = 0.0

            when (otext) {

                    "+" -> result = number1.toDouble() + number2.toDouble()
                    "-" -> result = number1.toDouble() - number2.toDouble()
                    "*" -> result = number1.toDouble() * number2.toDouble()
                    "/" -> result = number1.toDouble() / number2.toDouble()
                    "%" -> result = number1.toDouble() % number2.toDouble()
                }
                if(result.toString() == "Infinity" ) {
                    textview1.text = "Error: Division by zero"
                }else {
                    textview1.text = result.toString() // Display the result
                }


//นำค่า result มาทำการคำนวณเพิ่ม เนื่องจากตอนแรก มันเอา number 2 มา +กับ ค่าที่พิมพ์ล่าสุด เราจึงต้อง เก็บค่า result ให้เป็น number1 เพื่อที่จะนำมา + กับ number 2
            number1 = result.toString()
            currentNumber = result.toString()
        }
    }

}

