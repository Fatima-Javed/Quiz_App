package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    String[] mc, op1, op2, op3, sol;
    TextView tv1, tv2, tv3;
    RadioButton r1, r2, r3;
    ImageView im1, im2, im3;
    int index;
    int correct = 0;
    int incorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tv1 = (TextView) this.findViewById(R.id.textView);
        tv2 = (TextView) this.findViewById(R.id.textView5);
        tv3 = (TextView) this.findViewById(R.id.textView2);
        im1 = (ImageView) this.findViewById(R.id.imageView5);
        im3 = (ImageView) this.findViewById(R.id.imageView7);
        r1 = (RadioButton) this.findViewById(R.id.radioButton);
        r2 = (RadioButton) this.findViewById(R.id.radioButton2);
        r3 = (RadioButton) this.findViewById(R.id.radioButton3);
        mc = getResources().getStringArray(R.array.mcq);
        op1 = getResources().getStringArray(R.array.opt1);
        op2 = getResources().getStringArray(R.array.opt2);
        op3 = getResources().getStringArray(R.array.opt3);
        sol = getResources().getStringArray(R.array.solution);
        index = 0;
        tv3.setText(mc[index]);
        tv1.setText(String.valueOf(index + 1) + "/");
        tv2.setText(String.valueOf(mc.length));
        r1.setText(op1[index]);
        r2.setText(op2[index]);
        r3.setText(op3[index]);

    }

    public void onclick(View view) {
        switch (view.getId()) {
            case (R.id.imageView5):
            {
                if (index == 0)
                {
                    Toast.makeText(this, "Select option", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    tv3.setText(mc[index]);
                    tv1.setText(String.valueOf(index + 1) + "/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    break;
                }
            }

            case (R.id.imageView7):
            {
                if (index == mc.length - 1)
                {
                    if(r1.isChecked())
                    {
                        if(r1.getText().equals(sol[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }

                    else if(r2.isChecked())
                    {
                        if(r2.getText().equals(sol[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r3.isChecked())
                    {
                        if(r3.getText().equals(sol[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                   // else
                    //{
                       // Toast.makeText(this, "No question", Toast.LENGTH_SHORT).show();
                   // }
                    Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                    intent.putExtra("Correct", correct);
                    intent.putExtra("InCorrect", incorrect);
                    startActivity(intent);

                }
                else
                {
                if(r1.isChecked())
                {
                    if(r1.getText().equals(sol[index]))
                    {
                        correct++;
                    }
                    else
                    {
                        incorrect++;
                    }
                }

                else if(r2.isChecked())
                {
                    if(r2.getText().equals(sol[index]))
                    {
                        correct++;
                    }
                    else
                    {
                        incorrect++;
                    }
                }
                else if(r3.isChecked())
                {
                    if(r3.getText().equals(sol[index]))
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
                   // Toast.makeText(this, "No question", Toast.LENGTH_SHORT).show();
                }
                    index++;
                    tv3.setText(mc[index]);
                    tv1.setText(String.valueOf(index + 1) + "/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                }
            }

        }

    }
}
