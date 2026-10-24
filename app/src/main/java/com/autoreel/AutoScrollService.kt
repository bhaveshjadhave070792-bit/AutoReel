
package com.autoreel

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.graphics.Path
import android.os.Build
import android.view.GestureDescription

class AutoScrollService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Reel end detection will be added and tested separately.
        // Avoid scrolling automatically until detection is reliable.
    }

    override fun onInterrupt() {
    }

    fun scrollToNextReel() {
        val path = Path().apply {
            moveTo(
                resources.displayMetrics.widthPixels * 0.5f,
                resources.displayMetrics.heightPixels * 0.8f
            )
            lineTo(
                resources.displayMetrics.widthPixels * 0.5f,
                resources.displayMetrics.heightPixels * 0.2f
            )
        }

        val gesture = GestureDescription.Builder()
            .addStroke(
                GestureDescription.StrokeDescription(path, 0, 300)
            )
            .build()

        dispatchGesture(gesture, null, null)
    }
}
