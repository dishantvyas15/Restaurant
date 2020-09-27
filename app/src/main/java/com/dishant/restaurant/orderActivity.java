package com.dishant.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();                                        // Receiving intent through intent variable.
        String order = intent.getStringExtra(MainActivity.msg);             // Creating string from intent data and its respective key.
        TextView orderText = findViewById(R.id.orderText);                  // Finding textView for display.
        orderText.setText(order);                                           // Setting output.
        // For assigning a parent activity to this current activity, see line no. 12 of 'AndroidManifest.xml' in app\manifests\AndroidManifest.xml ('app' is at the top of the left vertical toolbar).
    }
}