package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    String [] ques,answer;
    ImageView im1,im2,im3;
    TextView tv1,tv2;
    TextView t1,t2;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        im1=(ImageView) this.findViewById(R.id.imageView);
        im2=(ImageView) this.findViewById(R.id.imageView2);
        im3=(ImageView) this.findViewById(R.id.imageView4);
        tv1=(TextView) this.findViewById(R.id.textView4);
        tv2=(TextView) this.findViewById(R.id.textView10);
        t1=(TextView) this.findViewById(R.id.textView8);
        t2=(TextView) this.findViewById(R.id.textView9);
        ques=getResources().getStringArray(R.array.simple_q);
        answer=getResources().getStringArray(R.array.simple_a);

        index=0;
        tv1.setText(String.valueOf(index+1)+"/");
        tv2.setText(" "+String.valueOf(ques.length));
        t1.setText(ques[index]);
        t2.setText("Press \"A\" Button for the Answer");

    }

    public void onclick(View view)
    {
        switch(view.getId())
        {
            case(R.id.imageView):
            {
                 if(index==0)
                 {
                     //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     index--;
                     t2.setText("Press \"A\" Button for the Answer");
                     t1.setText(ques[index]);
                     tv1.setText(String.valueOf(index+1)+"/");
                     break;
                 }

            }
            case(R.id.imageView2):
            {
                t2.setText(answer[index]);
                break;
            }
            case(R.id.imageView4):
            {
                if(index==ques.length-1)
                {
                    Toast.makeText(this, "No more Question", Toast.LENGTH_SHORT).show();
                }
                else {
                    index++;
                    t1.setText(ques[index]);
                    t2.setText("Press  \"A\" Button for the Answer");
                    tv1.setText(String.valueOf(index+1)+"/");
                    break;
                }
            }
        }
    }


}