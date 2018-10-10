package com.example.system.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.no1);
        num2=(EditText)findViewById(R.id.no2);
        add=(Button)findViewById(R.id.addno);
        mul=(Button)findViewById(R.id.mulno);
        div =(Button)findViewById(R.id.divno);
        sub=(Button)findViewById(R.id.subno);

        final Intent myIntent = new Intent(this, result.class);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1+number2;
                myIntent.putExtra("key", String.valueOf(sum));
                startActivity(myIntent);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int mul = number1*number2;
                myIntent.putExtra("key", String.valueOf(mul));
                startActivity(myIntent);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sub = number1-number2;
                myIntent.putExtra("key", String.valueOf(sub));
                startActivity(myIntent);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int div = number1/number2;
                myIntent.putExtra("key", String.valueOf(div));
                startActivity(myIntent);
            }
        });
    }
}
