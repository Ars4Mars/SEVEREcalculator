package com.revolve44.severecalc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    TextView check;

    //Button button7;
    //Button button8 = findViewById(R.id.eight);
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

        //button7 = findViewById(R.id.seven);

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

    public void onClickListenerPlus(View view) {
        String argument1 = display.getText().toString();
        arg1 = Integer.parseInt(argument1);
        display.append("+");
        State = 2;
        Operation = 3;



    }

    public void onClickListenerMulty(View view) {
        String argument1 = display.getText().toString();
        arg1 = Integer.parseInt(argument1);
        display.append("x");
        State = 2;
        Operation = 2;
    }


    //////*//////*//////*////////

    public void onClickListenerEqual(View view) {
        String argument2 = check.getText().toString();
        arg2 = Integer.parseInt(argument2);
        display.setText(null);
        MyResult();
        State = 1;//now you may input first number
    }

    private void MyResult() {
        if (Operation == 1){
            result = arg1 / arg2;
            display.setText(String.valueOf(result));
        }
        if (Operation == 2){
            result = arg1 * arg2;
            display.setText(String.valueOf(result));
        }
        if (Operation == 3){
            result = arg1 + arg2;
            display.setText(String.valueOf(result));
        }
        if (Operation == 4){
            result = arg1 - arg2;
            display.setText(String.valueOf(result));
        }
    }


    public void onClickListener9(View view) {
    }

    public void onClickListener4(View view) {
    }

    public void onClickListener5(View view) {
    }

    public void onClickListener6(View view) {
    }




    public void onClickListener1(View view) {
    }

    public void onClickListener2(View view) {
    }

    public void onClickListener3(View view) {
    }
}
