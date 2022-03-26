package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    TextView tv1, tv2, tv3;
    RadioButton rbt1, rbt2;
    ImageView im1, im2;
    String[] ques, sol;
    int index = 0;
    int correct = 0;
    int incorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        tv1 = (TextView) this.findViewById(R.id.textView20);
        tv2 = (TextView) this.findViewById(R.id.textView21);
        tv3 = (TextView) this.findViewById(R.id.textView24);
        im1 = (ImageView) this.findViewById(R.id.imageView15);
        im2 = (ImageView) this.findViewById(R.id.imageView16);
        rbt1 = (RadioButton) this.findViewById(R.id.radioButton4);
        rbt2 = (RadioButton) this.findViewById(R.id.radioButton5);
        ques = getResources().getStringArray(R.array.tr_false);
        sol = getResources().getStringArray(R.array.solutions);
        tv3.setText(ques[index]);
        tv1.setText(String.valueOf(index + 1) + "/");
        tv2.setText(String.valueOf(ques.length));
        rbt1.setText("True");
        rbt2.setText("False");

    }

    public void onclick(View view) {

        if (index == ques.length - 1)
        {
            Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
            intent.putExtra("Correct", correct);
            intent.putExtra("InCorrect", incorrect);
            startActivity(intent);
        }
        else
        {
            index++;
            tv3.setText(ques[index]);
            tv1.setText(String.valueOf(index + 1) + "/");
            rbt1.setText("True");
            rbt2.setText("False");

            if(rbt1.isChecked())
            {
                if(rbt1.getText().equals(sol[index]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }
            }

            else if(rbt2.isChecked())
            {
                if(rbt2.getText().equals(sol[index]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }
            }
            else
            {
                Toast.makeText(this, "Select option", Toast.LENGTH_SHORT).show();
            }
        }
    }








}

