
package com.autoreel

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(18, 18, 28))
        }

        val title = TextView(this).apply {
            text = "AutoReel"
            textSize = 32f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "\nInstagram Reels Auto Scroll\n\nFree plan: 20 Reels"
            textSize = 18f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val startButton = Button(this).apply {
            text = "Enable Auto Scroll"
            setOnClickListener {
                subtitle.text =
                    "Auto-scroll service setup is the next step."
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(startButton)
        setContentView(layout)
    }
}
