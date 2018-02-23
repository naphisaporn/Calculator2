package com.naphisaporn_cal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output, output2;
    private Button add, minus, multiply, divide;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnEqual,btnC, btnFullstop;
    float input1, input2;
    boolean sumAdd, sumSub, sumMultiply, sumDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.tv1);
        output2 = findViewById(R.id.edtnum);
        add = (Button) findViewById(R.id.btnAdd);
        minus = (Button) findViewById(R.id.btnMinus);
        multiply = (Button) findViewById(R.id.btnMultiply);
        divide = (Button) findViewById(R.id.btnDivide);
        btnEqual = (Button)findViewById(R.id.btnEqual) ;
        btnFullstop = (Button)findViewById(R.id.btnFullstop) ;
        btnC = (Button) findViewById(R.id.btnC);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "1");
                output2.setText(output2.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "2");
                output2.setText(output2.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "3");
                output2.setText(output2.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "4");
                output2.setText(output2.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "5");
                output2.setText(output2.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "6");
                output2.setText(output2.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "7");
                output2.setText(output2.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "8");
                output2.setText(output2.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "9");
                output2.setText(output2.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + "0");
                output2.setText(output2.getText() + "0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "+");
                if (output == null)
                {
                    output.setText("");
                }
                else {
                    input1 = Float.parseFloat(output.getText() + "");
                    sumAdd = true;
                    output.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "-");
                input1 = Float.parseFloat(output.getText() + "");
                sumSub = true;
                output.setText(null);            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "x");
                input1 = Float.parseFloat(output.getText() + "");
                sumMultiply = true;
                output.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output2.setText(output2.getText() + "/");
                input1 = Float.parseFloat(output.getText() + "");
                sumDivide = true;
                output.setText(null);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input2 = Float.parseFloat(output.getText() + "");
                if (sumAdd == true)
                {
                    output.setText(input1 + input2 + "");
                    sumAdd = false;
                }
                if (sumSub == true)
                {
                    output.setText(input1 - input2 + "");
                    sumSub = false;
                }
                if (sumMultiply == true)
                {
                    output.setText(input1 * input2 + "");
                    sumMultiply = false;
                }
                if (sumDivide == true)
                {
                    output.setText(input1 / input2 + "");
                    sumDivide = false;
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");
                output2.setText("");
            }
        });
        btnFullstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText()+".");
                output2.setText(output2.getText() + ".");
            }
        });
    }

}
