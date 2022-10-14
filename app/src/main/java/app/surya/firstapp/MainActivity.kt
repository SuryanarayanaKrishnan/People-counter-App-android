package app.surya.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickME = findViewById<Button>(R.id.mybtn)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var numberOfClicks = 0
        btnClickME.setOnClickListener {
            numberOfClicks += 1
            tvMyTextView.text = numberOfClicks.toString()
        }
    }
}