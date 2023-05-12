package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Boolean isMsd = true;
    public void change(View view){
        ImageView img2 = findViewById(R.id.imageView2);
        ImageView img4 = findViewById(R.id.imageView4);
        if(isMsd){
            img4.animate().alpha(0).setDuration(2000);
            img2.animate().alpha(1).setDuration(2000);
            isMsd = false;
        }
        else{
            img4.animate().alpha(1).setDuration(2000);
            img2.animate().alpha(0).setDuration(2000);
            isMsd = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}