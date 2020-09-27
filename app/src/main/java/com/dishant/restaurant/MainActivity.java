package com.dishant.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String msg = "com.dishant.restaurant.order";                    // Creating a key to send message with, to other component (here, intent)of the app.

    public void placeOrder(View view) {
        Intent intent = new Intent(this, orderActivity.class);             // Creating an intent with context="this" and a destination.
        EditText item_1 = findViewById(R.id.item_1);                                    // Creating variables for editText fields.
        EditText item_2 = findViewById(R.id.item_2);
        EditText item_3 = findViewById(R.id.item_3);
        String order = item_1.getText().toString() + ", " + item_2.getText().toString() + " and " + item_3.getText().toString();
        intent.putExtra(msg, order);                                                    // Sending an entity (here, 'order' string) along with its key, to the intent.
        startActivity(intent);                                                          // Starting the activity linked with the intent.
        // For creating a new activity: Right click on 'app' at the top of left vertical toolbar: app(rightClick)\New\Activity\Empty Activity.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}