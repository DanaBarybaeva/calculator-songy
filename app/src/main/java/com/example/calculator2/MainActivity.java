package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    TextView san;
    Button buttonC,buttonchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonC = findViewById(R.id.buttonC);
        buttonchange = findViewById(R.id.buttonchange);

        san = findViewById(R.id.san);
        View.OnClickListener buttonSandar = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String sanaldingi = san.getText().toString();
                String result = "";
                String songy = ";";
                switch(v.getId()){

                    case R.id.button0:
                        result = "0";
                        break;

                    case R.id.button1:
                        result = "1";
                        break;

                    case R.id.button2:
                        result = "2";
                        break;

                    case R.id.button3:
                        result = "3";
                            break;

                    case R.id.button4:
                        result = "4";
                        break;

                    case R.id.button5:
                        result = "5";
                        break;

                    case R.id.button6:

                        result = "6";
                        break;
                    case R.id.button7:
                        result = "7";
                        break;

                    case R.id.button8:
                        result = "8";
                        break;

                    case R.id.button9:
                        result = "9";
                        break;

                }
                if(!sanaldingi.equals("0")) songy = sanaldingi+result;
                else songy = result;
                san.setText(songy);

            }


        };
        button0.setOnClickListener(buttonSandar);
        button1.setOnClickListener(buttonSandar);
        button2.setOnClickListener(buttonSandar);
        button3.setOnClickListener(buttonSandar);
        button4.setOnClickListener(buttonSandar);
        button5.setOnClickListener(buttonSandar);
        button6.setOnClickListener(buttonSandar);
        button7.setOnClickListener(buttonSandar);
        button8.setOnClickListener(buttonSandar);
        button9.setOnClickListener(buttonSandar);

        View.OnClickListener buttonoshiruPlusMinus = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.buttonC:
                        san.setText("0");
                        break;

                    case R.id.buttonchange:
                        String sanText = san.getText().toString();
                        int sann = Integer.parseInt(sanText);

                        if(sann > 0) san.setText("-"+ sanText);
                        else{
                            sann = sann * (-1);
                            san.setText("" + sann);
                        }


                        break;
                }
            }
        };
        buttonC.setOnClickListener(buttonoshiruPlusMinus);
        buttonchange.setOnClickListener(buttonoshiruPlusMinus);


    }
}