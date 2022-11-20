package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    Button btn_sumar,btn_restar,btn_multiplicar,btn_dividir;
    Button btn_resultado,btn_suprimir;
    Button btn_borrar;

    double  operando1, operando2, resultado;
    int operacion;

    TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultado);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_sumar = findViewById(R.id.btn_sumar);
        btn_restar = findViewById(R.id.btn_restar);
        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_dividir = findViewById(R.id.btn_dividir);
        btn_resultado = findViewById(R.id.btn_resultado);
        btn_suprimir = findViewById(R.id.btn_supr);
        btn_borrar = findViewById(R.id.btn_borrar);

    }
    public void operarCalculadora(View v){

        switch (v.getId()){

            case R.id.btn_0 :
                textViewResultado.setText(textViewResultado.getText() + "0");
                break;
            case R.id.btn_1 :
                textViewResultado.setText(textViewResultado.getText() + "1");
                break;
            case R.id.btn_2 :
                textViewResultado.setText(textViewResultado.getText() + "2");
                break;
            case R.id.btn_3 :
                textViewResultado.setText(textViewResultado.getText() + "3");
                break;
            case R.id.btn_4 :
                textViewResultado.setText(textViewResultado.getText() + "4");
                break;
            case R.id.btn_5 :
                textViewResultado.setText(textViewResultado.getText() + "5");
                break;
            case R.id.btn_6 :
                textViewResultado.setText(textViewResultado.getText() + "6");
                break;
            case R.id.btn_7 :
                textViewResultado.setText(textViewResultado.getText() + "7");
                break;
            case R.id.btn_8 :
                textViewResultado.setText(textViewResultado.getText() + "8");
                break;
            case R.id.btn_9 :
                textViewResultado.setText(textViewResultado.getText() + "9");
                break;

            case R.id.btn_sumar :
                if (textViewResultado.getText() != ""){
                    operacion = 1;
                    operando1 = Double.parseDouble(textViewResultado.getText().toString());
                    textViewResultado.setText(textViewResultado.getText() + "+");
                }
                break;

            case R.id.btn_restar:
                if (textViewResultado.getText() != ""){
                    operacion = 2;
                    operando1 = Double.parseDouble(textViewResultado.getText().toString());
                    textViewResultado.setText(textViewResultado.getText() + "-");
                }
                break;
            case R.id.btn_multiplicar:
                if (textViewResultado.getText() != ""){
                    operacion = 3;
                    operando1 = Double.parseDouble(textViewResultado.getText().toString());
                    textViewResultado.setText(textViewResultado.getText() + "x");
                }
                break;
            case R.id.btn_dividir:
                if (textViewResultado.getText() != ""){
                    operacion = 4;
                    operando1 = Double.parseDouble(textViewResultado.getText().toString());
                    textViewResultado.setText(textViewResultado.getText() + "/");
                }
                break;

            case R.id.btn_resultado :
                if (textViewResultado.getText() != ""){
                    operando2 = Double.parseDouble(String.valueOf(textViewResultado.getText().toString().split("")));
                    switch (operacion) {
                        case 1 :
                            resultado = operando1 + operando2;
                            break;
                        case 2 :
                            resultado = operando1 - operando2;
                            break;
                        case 3 :
                            resultado = operando1 * operando2;
                            break;
                        case 4 :
                            resultado = operando1 / operando2;
                            break;
                    }
                    textViewResultado.setText("" + resultado);

                }
                break;

            case R.id.btn_supr:
                if (textViewResultado.getText().length() != 0){
                    int num = textViewResultado.getText().length() -1;
                    textViewResultado.setText(textViewResultado.getText().subSequence(0,num));
                }
                break;
            case R.id.btn_borrar:
                textViewResultado.setText("");
                operando1 = 0;
                operando2 = 0;
                resultado = 0;
                break;

        }
    }

}