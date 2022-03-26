package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    Button btn1,btn2;
    TextView tv1,tv2;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        btn1=(Button) this.findViewById(R.id.button8);
        btn2=(Button) this.findViewById(R.id.button9);
        tv1=(TextView) this.findViewById(R.id.textView11);
        tv2=(TextView) this.findViewById(R.id.textView13);


        Intent intent=getIntent();
        n1=intent.getIntExtra("Correct",0);
        tv1.setText("Correct:"+n1);

        n2=intent.getIntExtra("InCorrect",0);
        tv2.setText("InCorrect:"+n2);
    }

    public void onclick(View view)
    {
        Intent intent=new Intent(MainActivity8.this,MainActivity7.class);
        startActivity(intent);
    }

    public void click(View view)
    {
        Intent intent=new Intent(MainActivity8.this,MainActivity2.class);
        startActivity(intent);



    }
}