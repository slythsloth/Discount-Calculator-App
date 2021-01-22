package th.ac.su.ict.discountcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val oriPrice = findViewById<EditText>(R.id.oriPrice)
        val percent = findViewById<EditText>(R.id.percent)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)
        val btnCal = findViewById<Button>(R.id.btnCal)
        val price = findViewById<TextView>(R.id.price)



        btnCal.setOnClickListener() {
            var ori: Double = oriPrice.text.toString().toDouble()
            var percent: Int = percent.text.toString().toInt()
            if (checkbox.isChecked) {
                var discount = ori * percent / 100;
                var total = ori - discount;
                var tax = total * 7 / 100;
                var totalTax = total + tax;
                price.text = totalTax.toString()
            } else {
                var discount = ori * percent / 100;
                var total = ori - discount;
                price.text = total.toString()
            }
        }


    }
}

