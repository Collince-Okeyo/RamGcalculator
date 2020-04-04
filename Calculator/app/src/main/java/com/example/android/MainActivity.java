package com.example.android;

//package com.example.ramgcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int calculation;
    double num;
    double answer;

    TextView display,display2,ansDisplay;

    Button btAns,br2,btdot,btclr,btadd,bt1,bt2,bt3,btsub,bt4,bt5,bt6,btmult,bt7,bt8,bt9,btdiv,btmod,bt0,btEql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display = findViewById(R.id.viewDisplay);
        display2 = findViewById(R.id.view2Display);
        ansDisplay = findViewById(R.id.btnAnswerField);
        btAns = findViewById(R.id.btnANS);
        br2 = findViewById(R.id.btnClose);
        btdot = findViewById(R.id.btnDot);
        btclr = findViewById(R.id.btnCLR);
        btadd = findViewById(R.id.btnAdd);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        btsub = findViewById(R.id.btnMinus);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        btmult = findViewById(R.id.btnMultiply);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);
        btdiv = findViewById(R.id.btnDivide);
        btmod = findViewById(R.id.btnModulus);
        bt0 = findViewById(R.id.btn0);
        btEql = findViewById(R.id.btnEquals);

        btAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ansDisplay.setText(answer+"");
                display.setText(answer+"");

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });



        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+".");
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation = 1;
                num = Double.parseDouble(display.getText().toString());
                display.setText("");
                display2.setText("+"+num);
            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(display.getText().toString());
                calculation = 2;
                display.setText("");
                display2.setText(num+"-");
            }
        });

        btmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(display.getText().toString());
                calculation = 3;
                display.setText("");
                display2.setText(num+"X");
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(display.getText().toString());
                calculation = 4;
                display.setText("");
                display2.setText(num+"/");
            }
        });

        btmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(display.getText().toString());
                calculation = 5;
                display.setText("");
                display2.setText(num+"mod");
            }
        });

        btEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmaticOperations();
               // ansDisplay.setText(display.getText());
            }
        });

        btclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ansDisplay.setText("");
                display.setText("");
                display2.setText("");
            }
        });


    }

    public void arithmaticOperations(){
        switch (calculation){

            case 1:{
                answer = num + Double.parseDouble(display.getText().toString());
                ansDisplay.setText(Double.toString(answer));
                break;
            }

            case 2:{
                answer = num - Double.parseDouble(display.getText().toString());
                ansDisplay.setText(Double.toString(answer));
                break;
            }

            case 3:{
                answer = num * Double.parseDouble(display.getText().toString());
                ansDisplay.setText(Double.toString(answer));
                break;
            }

            case 4:{
                answer = num / Double.parseDouble(display.getText().toString());
                ansDisplay.setText(Double.toString(answer));
                break;
            }

            case 5:{
                answer = num % Double.parseDouble(display.getText().toString());
                ansDisplay.setText(Double.toString(answer));
                break;
            }
        }
    }
}




