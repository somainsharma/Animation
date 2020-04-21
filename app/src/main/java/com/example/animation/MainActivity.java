package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    TextView txtlater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       txt = findViewById(R.id.txtV);
       txtlater = findViewById(R.id.textView);
       //txtlater.animate().alpha(0.0f).setDuration(0);

       txt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              // Log.i("MyTag","Button is tapped now");

               txt.animate().alpha(0.0f).setDuration(2000);
               txtlater.animate().alpha(1.0f).setDuration(2000);

           }
       });

    }
}
