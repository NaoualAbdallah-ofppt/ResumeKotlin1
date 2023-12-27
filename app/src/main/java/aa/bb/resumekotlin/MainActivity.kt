package aa.bb.resumekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button

        val textView = findViewById(R.id.txt) as TextView
        textView.apply {
            visibility = View.VISIBLE
            text = "Hello world !"
            textSize = 19f
            maxLines = 3
        }

//ou

        // textView = findViewById(R.id.txt) as TextView
        /*     textView.visibility = View.VISIBLE
        textView.text = "Hello world !"
        textView.textSize = 19f
        textView.maxLines = 3
        */

        val btn = findViewById(R.id.btn) as Button
        btn.setOnClickListener {
            //          println("User has clicked on button !") }
        }


    }
}