package com.revolve44.severecalc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // You may get a wrong answer when you will calculating negative numbers

    TextView display;
    TextView check;
    TextView check2;

    int State = 1; // State = 1 we may input first number  /*/ State = 2 we may input second number
    int Operation; // type of operation 1 is minus , 2 is multiply
    boolean firstNegativeNumb;

    int arg1;
    int arg2;

    int result;

    String sum = "";

    String one = "1";
    String two = "2";
    String three = "3";
    String four = "4";
    String five = "5";
    String six = "6";
    String seven = "7";
    String eight = "8";
    String nine = "9";
    String ten = "0";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display); // we can declare textview only , IMHO, in this onCreate method
        check = findViewById(R.id.check);
        check2 = findViewById(R.id.check2);

    }

    public void onClickListener1(View view) {
        if (State == 2){ // if we input a second number
            check.append(sum);
            check2.append(""+arg2);
            sum = sum+one;

        }

        display.append("1");// if we input first number

    }

    public void onClickListener2(View view) {
        if (State == 2){
            check.append("2");
            sum = sum+two;
        }
        display.append("2");
    }

    public void onClickListener3(View view) {
        if (State == 2){
            check.append("3");
            sum = sum+three;
        }

        display.append("3");
    }

    public void onClickListener4(View view) {
        if (State == 2){
            check.append("4");
            sum = sum+four;
        }

        display.append("4");
    }

    public void onClickListener5(View view) {
        if (State == 2){
            check.append("5");
            sum = sum+five;
        }

        display.append("5");
    }

    public void onClickListener6(View view) {
        if (State == 2){
            check.append("6");
            sum = sum+six;
        }

        display.append("6");
    }

    public void onClickListener7(View view) {
        if (State == 2){
            check.append("7");
            sum = sum+seven;
        }

        display.append("7");
    }


    public void onClickListener8(View view) {
        if (State == 2){
            check.append("8");
            sum = sum+eight;
        }
        display.append("8");
    }

    public void onClickListener9(View view) {
        if (State == 2){
            check.append("9");
            sum = sum+nine;
        }

        display.append("9");
    }

    public void onClickListener0(View view) {
        if (State == 2){
            check.append("0");
            sum = sum+ten;
        }

        display.append("0");
    }

    ///*///*///*///

    public void onClickListenerReset(View view) {
        arg1 = 0;
        arg2 = 0;
        sum="0";
        display.setText(null); // clean display
        check.setText(null);
        State = 1; // now we can input new number again
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
            //String argument1 =
            arg1 = Integer.parseInt(display.getText().toString());
            display.append("+");
            State = 2;
            Operation = 3;
        }catch (Exception e) {

        }
    }

    public void onClickListenerMinus(View view) {

        try {

            //снова
            if (sum==""||sum=="0"){
                firstNegativeNumb = true;
                display.append("-");
                State = 2;
                arg1 = Integer.parseInt(display.getText().toString());
                //Operation = 4;
            }else{

            arg1 = Integer.parseInt(display.getText().toString());
            display.append("-");
            State = 2;
            Operation = 4;}

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
//            String argument2 = check.getText().toString();
//            arg2 = Integer.parseInt(argument2);
               arg2 = Integer.parseInt(sum);

              display.setText(null);
              check.setText(null);
              //sum = "0";

              MyResult();
        }catch (Exception e){
            display.setText("Error #Equal");
//            display.setText(null);
//            check.setText(null);
        }


        //State = 2;//now you may input first number
    }

    private void MyResult() {
        sum = "";
        if (firstNegativeNumb==true){
            arg1=-arg1;
            firstNegativeNumb=false;
        }
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
            //display.setText(String.valueOf(result));

            display.setText(""+result);
            //arg1 = Integer.parseInt(String.valueOf(result));

        }
        if (Operation == 4){
            result = arg1 - arg2;
            //display.setText(String.valueOf(result));
            display.setText(String.valueOf(result));
            //display.setText(result); here been error coz is Int in String Textview
        }
    }
    public void onClickListenerCnange(View view) {
    }


}
