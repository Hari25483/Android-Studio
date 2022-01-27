package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;
    private Button sub;
    private Button mul;
    private Button div;
    private Button counter;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText) findViewById(R.id.etNum2);
        add=(Button) findViewById(R.id.btn1);
        sub=(Button)findViewById(R.id.btn2);
        mul=(Button)findViewById(R.id.btn3);
        div=(Button)findViewById(R.id.btn4);
        counter=(Button)findViewById(R.id.btn5);
        result=(TextView) findViewById(R.id.answer);
        num1.setText(String.valueOf(0));
        num2.setText(String.valueOf(0));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("ANSWER=" + String.valueOf(sum));
              //  if(TextUtils.isEmpty(num1.getText().toString())) {
               //     num1.setError("Enter an input");
//            return;
              //  }
              //  if(TextUtils.isEmpty(num2.getText().toString())) {
                  //  num2.setError("Enter an input");
//            return;
               // }
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int subd = number1 - number2;
                result.setText("ANSWER=" + String.valueOf(subd));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int muld = number1 * number2;
                result.setText("ANSWER=" + String.valueOf(muld));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                try {
                    int divd = number1 / number2;
                    result.setText("ANSWER=" + String.valueOf(divd));

                }catch(Exception e){
                    result.setText("Invalid");
                }

            }
        });
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                result.setText("counter="+ String.valueOf(count));


            }
        });
    }
}