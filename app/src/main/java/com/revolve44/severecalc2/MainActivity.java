package com.revolve44.severecalc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // You may get a wrong answer when you will calculating negative numbers

    TextView display;
    TextView check;
    TextView check2;

    int State = 1; // State = 1 we may input first number  /*/ State = 2 we may input second number
    int Operation; // type of operation 1 is minus , 2 is multiply
    boolean firstNegativeNumb;

    int arg1=0;
    int arg2=0;

    String result;

    String sum = "";

    String one = "1";
    int One = 1;
    String two = "2";
    int Two = 2;
    String three = "3";
    int Three = 3;
    String four = "4";
    int Four = 4;
    String five = "5";
    int Five = 5;

    String six = "6";
    int Six = 6;
    String seven = "7";
    int Seven = 7;
    String eight = "8";
    int Eight = 8;
    String nine = "9";
    int Nine = 9;
    String ten = "0";
    int Ten = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display); // we can declare textview only , IMHO, in this onCreate method
        check = findViewById(R.id.check);
        check2 = findViewById(R.id.check2);
    }


    public void onClickListener1(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (One));
        }else{
            //arg1 = arg1+One;
            arg1 = Integer.parseInt(Integer.toString(arg1) + (One));
        }
        display.append("1");
        //State =1;

    }

    public void onClickListener2(View view) {

        if (State == 2){
            //arg2 = arg2+Two;
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Two));//Error have been coz i careless
        }else {
            //arg1 = arg1+Two;
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Two));
        }
//        else{
//            arg1 = Integer.parseInt(Integer.toString(arg1) + (Two));
//            arg1 = -arg1;
//        }
        display.append("2");
        //State = 1;
    }
    public void onClickListener3(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Three));
        }else{
            //arg1 = arg1+One;
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Three));
        }
        display.append("3");
        //State =1;
    }
    public void onClickListener4(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Four));
        }else{
            //arg1 = arg1+One;
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Four));
        }
        display.append("4");
        //State =1;
    }
    public void onClickListener5(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Five));
        }else{
            //arg1 = arg1+One;
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Five));
        }
        display.append("5");
        //State =1;
    }
    public void onClickListener6(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Six));
        }else{
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Six));
        }
        display.append("6");
    }
    public void onClickListener7(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Seven));
        }else{
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Seven));
        }
        display.append("7");
    }
    public void onClickListener8(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Eight));
        }else{
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Eight));
        }
        display.append("8");
    }
    public void onClickListener9(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Nine));
        }else{
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Nine));
        }
        display.append("9");
    }
    public void onClickListener0(View view) {

        if (State == 2){
            arg2 = Integer.parseInt(Integer.toString(arg2) + (Ten));
        }else{
            arg1 = Integer.parseInt(Integer.toString(arg1) + (Ten));
        }
        display.append("0");
    }
    /////////
    public void onClickListenerMinus(View view) {
        if (arg1 == 0){

            firstNegativeNumb = true;

            display.append("-");
            //State=0;
        }else{
            display.append("-");
            State = 2;
            Operation = 4;
        }
    }
    public void onClickListenerPlus(View view) {

        display.append("+");
        State = 2;
        Operation = 3;

    }
    public void onClickListenerMulty(View view) {

        display.append("*");
        State = 2;
        Operation = 2;

    }
    public void onClickListenerDivision(View view) {

        display.append("/");
        State = 2;
        Operation = 1;

    }

    public void onClickListenerReset(View view) {
        arg1 = 0;
        arg2 = 0;
        sum="0";
        display.setText(null); // clean display
        //check.setText(null);
        State = 1; // now we can input new number again
        //Operation = 3;
        check.setText(""+arg1);
        check2.setText(""+arg2);

        firstNegativeNumb = false;
    }

    public void onClickListenerEqual(View view) {
        try{
            display.setText(null);
            check.setText(null);

            result = String.valueOf(arg1);


            //display.setText(result);
            //display.setText(null);
            Myresult();
        }catch (Exception e){
            display.setText("pizdez");

        }
    }



    private void Myresult(){
        //display.setText(arg1);
        check.setText(""+arg1);
        check2.setText(""+arg2);

        if (Operation == 1){
            if (arg2==0){
                display.setText("error n/0 bitch");
            }else{
                result = String.valueOf(arg1/arg2);

                //display.setText(result);
//                result = arg1 / arg2;
//                display.setText(String.valueOf(result));
            }
        }
        if (Operation == 2){
            result = String.valueOf(arg1*arg2);

            //display.setText(result);
        }
        if (Operation == 3){

            result = String.valueOf(arg1+arg2);

            //display.setText(result);


        }
        if (Operation == 4){
            if (firstNegativeNumb==true){
                result = String.valueOf(-arg1-arg2);

                //display.setText(result);
            }else{

                result = String.valueOf(arg1-arg2);


            }
            //result = arg1 - arg2;
            //display.setText(String.valueOf(result));
            //display.setText(String.valueOf(result));
            //display.setText(result); here been error coz is Int in String Textview
        }
        if (firstNegativeNumb==true){


        }

        display.setText(result);
        arg1 = Integer.parseInt(result);

        arg2 = 0;
        State = 2;
    }
}
