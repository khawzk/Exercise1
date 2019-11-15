package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            val car = car.text.toString()
            val dp = downpay.text.toString()
            val loan = loan.text.toString()
            val inter = interest.text.toString()
            val amount1: Double = car.toDouble()-dp.toDouble()
            loanamount.text = "RM%.2f".format(amount1)
            val amount2: Double = loan.toDouble()*inter.toDouble()*car.toDouble()
            interestTotalAmount.text = "RM%.2f".format(amount2)
            val amount3: Double = (car.toDouble()+inter.toDouble())/loan.toDouble()/12
            repaymentamount.text = "RM%.2f".format(amount3)


        }
    }

}