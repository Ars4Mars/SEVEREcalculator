package com.revolve44.severecalc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    TextView check;

    int State = 1;
    int Operation;

    int arg1;
    int arg2;

    int result;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        check = findViewById(R.id.check);



    }

    public void onClickListener1(View view) {
        if (State == 2){
            check.append("1");
        }

        display.append("1");

    }

    public void onClickListener2(View view) {
        if (State == 2){
            check.append("2");
        }
        display.append("2");
    }

    public void onClickListener3(View view) {
        if (State == 2){
            check.append("3");
        }

        display.append("3");
    }

    public void onClickListener4(View view) {
        if (State == 2){
            check.append("4");
        }

        display.append("4");
    }

    public void onClickListener5(View view) {
        if (State == 2){
            check.append("5");
        }

        display.append("5");
    }

    public void onClickListener6(View view) {
        if (State == 2){
            check.append("6");
        }

        display.append("6");
    }

    public void onClickListener7(View view) {
        if (State == 2){
            check.append("7");
        }

        display.append("7");
    }


    public void onClickListener8(View view) {
        if (State == 2){
            check.append("8");
        }
        display.append("8");
    }

    public void onClickListener9(View view) {
        if (State == 2){
            check.append("9");
        }

        display.append("9");
    }

    public void onClickListener0(View view) {
        if (State == 2){
            check.append("0");
        }

        display.append("0");
    }

    ///*///*///*///

    public void onClickListenerReset(View view) {
        arg1 = 0;
        arg2 = 0;
        display.setText(null);
        check.setText(null);
        State = 1;
        //Operation = 3;
    }

    public void onClickListenerDivision(View view) {

        try {
            String argument1 = display.getText().toString();
            arg1 = Integer.parseInt(argument1);
            display.append("/");
            State = 2;
            Operation = 1;
        }catch (Exception e){

        }
    }

    public void onClickListenerPlus(View view) {

        try {
            String argument1 = display.getText().toString();
            arg1 = Integer.parseInt(argument1);
            display.append("+");
            State = 2;
            Operation = 3;
        }catch (Exception e) {

        }
    }

    public void onClickListenerMinus(View view) {

        try {
            arg1 = Integer.parseInt(display.getText().toString());
            display.append("-");
            State = 2;
            Operation = 4;
        }catch (Exception e){

        }
    }

    public void onClickListenerMulty(View view) {
        //String argument1 = display.getText().toString();

        try {
            arg1 = Integer.parseInt(display.getText().toString());
            display.append("x");
            State = 2;
            Operation = 2;

        }catch (Exception e){

        }
    }


    //////*//////*//////*////////

    public void onClickListenerEqual(View view) {
        try {
            String argument2 = check.getText().toString();
            arg2 = Integer.parseInt(argument2);
            display.setText(null);
            check.setText(null);

            MyResult();
        }catch (Exception e){
//            display.setText(null);
//            check.setText(null);
        }


        //State = 2;//now you may input first number
    }

    private void MyResult() {
        if (Operation == 1){
            if (arg2==0){
                display.setText("error n/0 bitch");
            }else{
                result = arg1 / arg2;
                display.setText(String.valueOf(result));
            }
        }
        if (Operation == 2){
            result = arg1 * arg2;
            display.setText(String.valueOf(result));
        }
        if (Operation == 3){
            result = arg1 + arg2;
            display.setText(String.valueOf(result));
            //arg1 = Integer.parseInt(String.valueOf(result));

        }
        if (Operation == 4){
            result = arg1 - arg2;
            display.setText(String.valueOf(result));
        }
    }
    public void onClickListenerCnange(View view) {
    }


}
