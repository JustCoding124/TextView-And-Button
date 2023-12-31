package com.example.myapplication;

import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView tView;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random random = new Random();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = findViewById(R.id.textView2);
        b1 = findViewById(R.id.b1);
    }
    public void CounterFunc(View view) {
        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        counter+=1;
        tView.setText(""+counter);
        tView.setTextSize(30+counter);
        tView.setTextColor(color);
    }
}