package com.example.iras.calculator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pranavpandey.android.dynamic.toasts.DynamicToast;

public class MainActivity extends AppCompatActivity {

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    TextView result;
    Button ADDITION;
    Button DIVISION;
    Button SUTRACTION;
    Button MULTIPLICATION;
    Button equal;
    Button clear;
    Button decimal;
    TextView welcome;
    String number1="";
    String number2="";
    String rest;
    String action="";
   // DecimalFormat decimalFormat = new DecimalFormat("#.##########");
     MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero=(Button)findViewById(R.id.zero);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        equal=(Button)findViewById(R.id.equal);
        ADDITION=(Button)findViewById(R.id.addition);
        SUTRACTION=(Button)findViewById(R.id.subtraction);
        MULTIPLICATION=(Button)findViewById(R.id.multiplication);
        DIVISION=(Button)findViewById(R.id.division);
        clear=(Button)findViewById(R.id.clear);
        decimal=(Button)findViewById(R.id.decimal);
        result=(TextView)findViewById(R.id.result);
        welcome=(TextView)findViewById(R.id.welcome);
        mp = MediaPlayer.create(MainActivity.this, R.raw.effect_tick);
        final Typewriter tw = (Typewriter) findViewById(R.id.welcome);
        tw.setText("");
        tw.setCharacterDelay(200);
        tw.animateText("خوش آمدید به اولین برنامه من \n\n ماشین حساب");

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(number1!="") {
                    if (!number1.contains("."))
                        number1 = number1 + decimal.getText().toString();
                    result.setText(String.valueOf(number1));
                }
                if(number2!="") {
                    if (!number2.contains("."))
                        number2 = number2 + decimal.getText().toString();
                    result.setText(String.valueOf(number2));
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action==""){
                    number1 =number1+zero.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+zero.getText().toString();
                    result.setText(number2);
                }

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action==""){
                    number1 =number1+one.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+one.getText().toString();
                    result.setText(number2);
                }

          }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+two.getText().toString();
                    result.setText(number1);
                }else{
                    number2=number2+two.getText().toString();
                    result.setText(number2);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+three.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+three.getText().toString();
                    result.setText(number2);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+four.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+four.getText().toString();
                    result.setText(number2);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+five.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+five.getText().toString();
                    result.setText(number2);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+six.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+six.getText().toString();
                    result.setText(number2);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+seven.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+seven.getText().toString();
                    result.setText(number2);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+eight.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+eight.getText().toString();
                    result.setText(number2);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if(action=="") {
                    number1 =number1+nine.getText().toString();
                    result.setText(number1);
                }else{
                    number2 =number2+nine.getText().toString();
                    result.setText(number2);
                }
            }
        });
        ADDITION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if((number1!="" && number2!=""))
                    number1 = calulate(Float.parseFloat(number1),Float.parseFloat(number2), action);
                action = "ADDITION";
                result.setText(number1);
            }
        });
        SUTRACTION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if((number1!="" && number2!=""))
                    number1 = calulate(Float.parseFloat(number1),Float.parseFloat(number2), action);

                action = "SUTRACTION";
                result.setText(number1);
            }
        });
        MULTIPLICATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if((number1!="" && number2!=""))
                    number1 = calulate(Float.parseFloat(number1),Float.parseFloat( number2), action);
                action = "MULTIPLICATION";
                result.setText(number1);
            }
        });
        DIVISION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if((number1!="" && number2!=""))
                    number1 = calulate(Float.parseFloat(number1),Float.parseFloat(number2),action);
                action = "DIVISION";
                result.setText(number1);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                if((number1!="" && number2!=""))
                calulate(Float.parseFloat(number1),Float.parseFloat(number2),action);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                clear();
            }
        });

    }

    private  void clear(){
        number1="";
        number2="";
        result.setText("0");
        rest="";
        action="";
    }
    private String calulate(float num1,float num2 , String action){
        float rest2 = 0;
            if(action=="ADDITION")
                rest2 = num1 +num2;
            if(action=="SUTRACTION")
                rest2 = num1-num2;
            if(action=="MULTIPLICATION")
                rest2 =num1*num2;
            if(action=="DIVISION")
                if(num2!=0)
                    rest2 = num1 / num2;
                else {
                    DynamicToast.makeError(MainActivity.this, "عدد نمی تواند تقسیم بر صفر شود", Toast.LENGTH_SHORT).show();
                    clear();
                }
            result.setText(String.valueOf(rest2).replaceAll("[0]+$", "").replaceAll("(\\.)(?!.*?[1-9]+)", ""));
            number1=String.valueOf(rest2);
            number2="";
            rest=String.valueOf(rest2);
        return  rest;
    }

}
