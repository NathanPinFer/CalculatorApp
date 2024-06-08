package com.example.calculatorapp.calculator

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.calculatorapp.R

class AppInterface(private val context: Context) {

    private var num1: Float? = null
    private var num2: Float? = null
    private var operator: String? = null
    private var result: Float = 0f
    private var frozenResult: Boolean = false


    fun btnZeroSetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (!textView.text.equals("0")) {
            val currentText = textView.text.toString()
            val newText = currentText + "0"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "0"
            frozenResult = false
        }
    }

    fun btn01SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "1"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "1"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "1"
            frozenResult = false
        }

    }

    fun btn02SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "2"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "2"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "2"
            frozenResult = false
        }
    }

    fun btn03SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "3"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "3"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "3"
            frozenResult = false
        }
    }

    fun btn04SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "4"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "4"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "4"
            frozenResult = false
        }
    }

    fun btn05SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "5"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "5"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "5"
            frozenResult = false
        }
    }

    fun btn06SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)

        if (textView.text.equals("0")) {
            textView.text = "6"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "6"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "6"
            frozenResult = false
        }
    }

    fun btn07SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "7"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "7"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "7"
            frozenResult = false
        }
    }

    fun btn08SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)

        if (textView.text.equals("0")) {
            textView.text = "8"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "8"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "8"
            frozenResult = false
        }
    }

    fun btn09SetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        if (textView.text.equals("0")) {
            textView.text = "9"
        } else {
            val currentText = textView.text.toString()
            val newText = currentText + "9"
            textView.text = newText
        }
        if(frozenResult) {
            textView.text = "9"
            frozenResult = false
        }
    }

    fun btnCSetOnClickListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preTextView = context.findViewById<TextView>(R.id.boxPreText)

        result = 0f
        num1 = null
        num2 = null
        operator = null
        textView.text = "0"
        preTextView.text = ""
    }

    @SuppressLint("SetTextI18n")
    fun btnAddSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preCardView =
            context.findViewById<CardView>(R.id.boxPreCardView)
        val preTextView = preCardView.findViewById<TextView>(R.id.boxPreText)
        operator = "+"

        preTextView.text = textView.text.toString() + " +"

        if(!frozenResult) {
            if (num1 == null) {
                num1 = textView.text.toString().toFloat()
            } else if (num2 == null) {
                num2 = textView.text.toString().toFloat()
                result = operation()
                num1 = result
                num2 = null
                operator = "+"
                textView.text = "$result"
                preTextView.text = "$result +"
            }
        }

        frozenResult = true


    }

    @SuppressLint("SetTextI18n")
    fun btnSubtractSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preCardView =
            context.findViewById<CardView>(R.id.boxPreCardView)
        val pretextView = preCardView.findViewById<TextView>(R.id.boxPreText)
        operator = "-"

        pretextView.text = textView.text.toString() + " -"

        if(!frozenResult) {
            if (num1 == null) {
                num1 = textView.text.toString().toFloat()
            } else if (num2 == null) {
                num2 = textView.text.toString().toFloat()
                result = operation()
                num1 = result
                num2 = null
                operator = "-"
                textView.text = "$result"
                pretextView.text = "$result -"
            }
        }

        frozenResult = true
    }

    @SuppressLint("SetTextI18n")
    fun btnMultiplySetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preCardView =
            context.findViewById<CardView>(R.id.boxPreCardView)
        val preTextView = preCardView.findViewById<TextView>(R.id.boxPreText)
        operator = "x"

        preTextView.text = textView.text.toString() + " x"

        if (!frozenResult) {
            if (num1 == null) {
                num1 = textView.text.toString().toFloat()
            } else if (num2 == null) {
                num2 = textView.text.toString().toFloat()
                result = operation()
                num1 = result
                num2 = null
                operator = "x"
                textView.text = "$result"
                preTextView.text = "$result x"
            }
        }
        frozenResult = true


    }

    @SuppressLint("SetTextI18n")
    fun btnDivideSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preCardView =
            context.findViewById<CardView>(R.id.boxPreCardView)
        val preTextView = preCardView.findViewById<TextView>(R.id.boxPreText)
        operator = "/"

        preTextView.text = textView.text.toString() + " /"

        if (!frozenResult){
            if (num1 == null) {
                num1 = textView.text.toString().toFloat()
            } else if (num2 == null) {
                num2 = textView.text.toString().toFloat()
                result = operation()
                num1 = result
                num2 = null
                operator = "/"
                textView.text = "$result"
                preTextView.text = "$result /"
            }
        }

        frozenResult = true


    }

    @SuppressLint("SetTextI18n")
    fun btnPercentSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preCardView =
            context.findViewById<CardView>(R.id.boxPreCardView)
        val preTextView = preCardView.findViewById<TextView>(R.id.boxPreText)
        operator = "%"

        preTextView.text = textView.text.toString() + " %"

        if(!frozenResult) {
            if (num1 == null) {
                num1 = textView.text.toString().toFloat()
            } else if (num2 == null) {
                num2 = textView.text.toString().toFloat()
                result = operation()
                num1 = result
                num2 = null
                operator = "%"
                textView.text = "$result"
                preTextView.text = "$result %"
            }
        }

        frozenResult = true


    }

    @SuppressLint("SetTextI18n")
    fun btnPlusMinusSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)

        if (textView.text.toString().toFloat() > 0) {
            textView.text = "-${textView.text}"
        } else {
            textView.text = "${textView.text}".substring(1)
        }
        frozenResult = true

    }

    fun btnDelSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)

        if (textView.text.length == 1) {
            textView.text = "0"
        } else {
            textView.text = textView.text.substring(0, textView.text.length - 1)
        }


    }

    @SuppressLint("SetTextI18n")
    fun btnEqualSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)
        val preCardView =
            context.findViewById<CardView>(R.id.boxPreCardView)
        val preTextView = preCardView.findViewById<TextView>(R.id.boxPreText)

        preTextView.text = textView.text.toString() + operator

        if (num2 == null) {
            num2 = textView.text.toString().toFloat()
            result = operation()
            num1 = result
            num2 = null
            preTextView.text = "$result" + operator
            textView.text = "$result"
            frozenResult = true
        }

    }

    @SuppressLint("SetTextI18n")
    fun btnPointSetOnClickerListener() {
        val cardView = (context as CalculatorActivity).findViewById<CardView>(R.id.boxCardView)
        val textView = cardView.findViewById<TextView>(R.id.boxText)

        if (!textView.text.contains(".")) {
            textView.text = "${textView.text}."
        }


    }


    private fun operation(): Float {
        return when (operator) {
            "+" -> num1!! + num2!!
            "-" -> num1!! - num2!!
            "x" -> num1!! * num2!!
            "/" -> num1!! / num2!!
            "%" -> num1!! * (num2!! / 100)
            else -> num1!!
        }
    }

}
