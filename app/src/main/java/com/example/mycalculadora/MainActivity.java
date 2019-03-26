package com.example.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight,
        btnNine, btnPoint, btnEqual, btnPlus, btnMinus, btnMulti, btnDiv, btnClear;

    EditText etProceso1;
    String num1 , num2 ;
    double result = 0;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear = findViewById(R.id.btnClear);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven =  findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPoint = findViewById(R.id.btnPoint);
        btnEqual = findViewById(R.id.btnEqual);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus =  findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv =  findViewById(R.id.btnDiv);
        etProceso1 = findViewById(R.id.etProceso1);

        btnPlus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = String.valueOf(etProceso1.getText());
                operador = "+";
                etProceso1.setText("");
            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = String.valueOf(etProceso1.getText());
                operador = "-";
                etProceso1.setText("");
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = String.valueOf(etProceso1.getText());
                operador = "x";
                etProceso1.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = String.valueOf(etProceso1.getText());
                operador = "/";
                etProceso1.setText("");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "2");

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "3");

            }
        });

        btnFour.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "4");

            }
        });

        btnFive.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "5");

            }
        });

        btnSix.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "6");

            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "7");

            }
        });

        btnEight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "8");

            }
        });

        btnNine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + "9");

            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                etProceso1.setText(etProceso1.getText() + ".");
            }
        });



        btnClear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = "";
                num2 = "";
                etProceso1.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
           @Override

           public  void onClick(View v) {
               num2 = String.valueOf(etProceso1.getText());
               if(operador.equals("+")){
                   result = Double.parseDouble(num1) + Double.parseDouble(num2);
                   etProceso1.setText(String.valueOf(result));
               }

               if(operador.equals("-")){
                   result = Double.parseDouble(num1) - Double.parseDouble(num2);
                   etProceso1.setText(String.valueOf(result));
               }

               if(operador.equals("x")){
                   result = Double.parseDouble(num1) * Double.parseDouble(num2);
                   etProceso1.setText(String.valueOf(result));
               }

               if(operador.equals("/")) {
                   result = Double.parseDouble(num1) / Double.parseDouble(num2);
                   etProceso1.setText(String.valueOf(result));
               }


           }
        });
    }
}
