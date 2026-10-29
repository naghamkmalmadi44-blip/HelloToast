
package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    private TextView mShowCount;
    private Button mButtonZero;
    private Button mButtonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        mButtonZero = findViewById(R.id.button_zero);
        mButtonCount = findViewById(R.id.button_count);

        mButtonZero.setBackgroundColor(Color.GRAY);
        mShowCount.setText("0");
    }

    public void showToast(View view) {
        Toast.makeText(
            this,
            "Hello Toast!",
            Toast.LENGTH_SHORT
        ).show();
    }

    public void showCount(View view) {
        mCount++;

        mShowCount.setText(String.valueOf(mCount));

        if (mCount % 2 == 1) {
            mButtonCount.setBackgroundColor(
                Color.parseColor("#4CAF50")
            );
        } else {
            mButtonCount.setBackgroundColor(
                Color.parseColor("#2196F3")
            );
        }

        mButtonZero.setBackgroundColor(
            Color.parseColor("#FFA500")
        );
    }

    public void showZero(View view) {
        mCount = 0;

        mShowCount.setText("0");

        mButtonZero.setBackgroundColor(Color.GRAY);
    }
}
