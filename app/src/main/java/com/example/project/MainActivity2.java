package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
      Button btn1,btn2,btn3,btn4;
      ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        im=(ImageView)this.findViewById(R.id.imageView3);
        btn1=(Button) this.findViewById(R.id.button);
        btn2=(Button) this.findViewById(R.id.button2);
        btn3=(Button) this.findViewById(R.id.button3);
        btn4=(Button) this.findViewById(R.id.button4);

    }

    public void button(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
        startActivity(intent);
    }


    public void button4(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://developer.android.com/studio"));
        startActivity(intent);
    }
}