package com.example.count_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    private Button countButton;
    private Button toastButton;
    private Button zeroButton;

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countButton = findViewById(R.id.counterButton);
        toastButton = findViewById(R.id.toastButton);
        zeroButton = findViewById(R.id.zeroButton);

        textView = findViewById(R.id.countValue);

    }

    private void buttonsColors(){
        if(count > 1){
            countButton.setBackgroundColor(Color.GREEN);
            zeroButton.setBackgroundColor(Color.MAGENTA);
        }else{
            countButton.setBackgroundColor(Color.BLUE);
            zeroButton.setBackgroundColor(Color.GRAY);
        }
    }

    public void counter(View view){
        count += 1;
        textView.setText(String.valueOf(count));
        buttonsColors();
    }

    public void toastButton(View view){
        Toast.makeText(this, String.valueOf(count), Toast.LENGTH_SHORT).show();
    }

    public void zeroButton(View view){
        count = 0;
        textView.setText(String.valueOf(count));
        buttonsColors();
    }
}
