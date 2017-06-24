package com.technoboom.moneykeeper;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Main activity for the application
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
