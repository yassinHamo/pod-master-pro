
package com.podmaster.pro

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "POD Master Pro - Ready for AI Tasks"
            textSize = 20f
            setPadding(32, 32, 32, 32)
        }
        
        setContentView(textView)
    }
}

