package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<View>(R.id.button)

        btn.setOnClickListener(){
            val inputValue1 = carPriceValue.text.toString().toDouble()
            val inputValue2 = downPaymentAmount.text.toString().toDouble()
            val inputValue3 =loadPeriod.text.toString().toDouble()
            val inputValue4 =interestRate.text.toString().toDouble()
            val carLoan:Double=inputValue1-inputValue2
            val interest:Double=carLoan*inputValue4/100*inputValue3
            val monthlyRepayment:Double=(carLoan+interest)/inputValue3/12

            carAmount.text="RM%.2f".format(carLoan)
            interestAmount.text="RM%.2f".format(interest)
            monthAmont.text="RM%.2f".format(monthlyRepayment)
        }
    }
}
