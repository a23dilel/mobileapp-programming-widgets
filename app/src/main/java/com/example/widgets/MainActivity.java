package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // created a button
        Button button = findViewById(R.id.button);

        // listening if user click a button
        button.setOnClickListener( new View.OnClickListener() {
                    // when user pressed onclick
                    public void onClick(View v) {
                        // add text in textview
                        TextView textView = findViewById(R.id.TextViewAboutMe);
                        textView.setText(R.string.aboutMe);
                    }
        });
    }
}
