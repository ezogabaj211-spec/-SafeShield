package com.example.safeshield;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.util.Log;

public class ScreenFilterService extends AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.d("SafeShield", "Accessibility Event detected: " + event.getEventType());
    }

    @Override
    public void onInterrupt() {
        Log.d("SafeShield", "Service Interrupted");
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Log.d("SafeShield", "ScreenFilterService Connected Successfully");
    }
}
