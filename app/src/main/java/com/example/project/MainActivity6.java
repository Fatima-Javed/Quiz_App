package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    Button btn1,btn2;
    TextView tv1,tv2;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn1=(Button) this.findViewById(R.id.button5);
        btn2=(Button) this.findViewById(R.id.button7);
        tv1=(TextView) this.findViewById(R.id.textView6);
        tv2=(TextView) this.findViewById(R.id.textView12);

        Intent intent=getIntent();
        n1=intent.getIntExtra("Correct",0);
        tv1.setText("Correct:"+n1);

        n2=intent.getIntExtra("InCorrect",0);
        tv2.setText("InCorrect:"+n2);

    }

    public void onclick(View view) {
        Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
        startActivity(intent);
    }

    public void click(View view) {
        Intent intent=new Intent(MainActivity6.this,MainActivity2.class);
        startActivity(intent);
    }
}