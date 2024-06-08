package com.example.calculatorapp.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorapp.R

class CalculatorActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val btnZero = findViewById<Button>(R.id.btnZero)
        val btn01 = findViewById<Button>(R.id.btn01)
        val btn02 = findViewById<Button>(R.id.btn02)
        val btn03 = findViewById<Button>(R.id.btn03)
        val btn04 = findViewById<Button>(R.id.btn04)
        val btn05 = findViewById<Button>(R.id.btn05)
        val btn06 = findViewById<Button>(R.id.btn06)
        val btn07 = findViewById<Button>(R.id.btn07)
        val btn08 = findViewById<Button>(R.id.btn08)
        val btn09 = findViewById<Button>(R.id.btn09)
        val btnC = findViewById<Button>(R.id.btnC)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnPercent = findViewById<Button>(R.id.btnPercent)
        val btnPlusMinus = findViewById<Button>(R.id.btnPlusMinus)
        val btnDel = findViewById<Button>(R.id.btnDel)
        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val btnPoint = findViewById<Button>(R.id.btnPoint)
        val appInterface = AppInterface(this)

        btnZero.setOnClickListener {
            appInterface.btnZeroSetOnClickListener()
        }
        btn01.setOnClickListener {
            appInterface.btn01SetOnClickListener()
        }
        btn02.setOnClickListener {
            appInterface.btn02SetOnClickListener()
        }
        btn03.setOnClickListener {
            appInterface.btn03SetOnClickListener()
        }
        btn04.setOnClickListener {
            appInterface.btn04SetOnClickListener()
        }
        btn05.setOnClickListener {
            appInterface.btn05SetOnClickListener()
        }
        btn06.setOnClickListener {
            appInterface.btn06SetOnClickListener()
        }
        btn07.setOnClickListener {
            appInterface.btn07SetOnClickListener()
        }
        btn08.setOnClickListener {
            appInterface.btn08SetOnClickListener()
        }
        btn09.setOnClickListener {
            appInterface.btn09SetOnClickListener()
        }
        btnC.setOnClickListener {
            appInterface.btnCSetOnClickListener()
        }
        btnAdd.setOnClickListener {
            appInterface.btnAddSetOnClickerListener()
        }
        btnSubtract.setOnClickListener {
            appInterface.btnSubtractSetOnClickerListener()
        }
        btnMultiply.setOnClickListener {
            appInterface.btnMultiplySetOnClickerListener()
        }
        btnDivide.setOnClickListener {
            appInterface.btnDivideSetOnClickerListener()
        }
        btnPercent.setOnClickListener {
            appInterface.btnPercentSetOnClickerListener()
        }
        btnPlusMinus.setOnClickListener {
            appInterface.btnPlusMinusSetOnClickerListener()
        }
        btnDel.setOnClickListener {
            appInterface.btnDelSetOnClickerListener()
        }
        btnEqual.setOnClickListener {
            appInterface.btnEqualSetOnClickerListener()
        }
        btnPoint.setOnClickListener {
            appInterface.btnPointSetOnClickerListener()
        }




    }
}