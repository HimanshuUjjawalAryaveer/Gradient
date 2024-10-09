package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnRestart;
    TextView text;
    int flag = 0;
    int count = 0;
    boolean flag1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initalizeTheContent();

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reStart();
            }
        });

    }
    public void initalizeTheContent() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnRestart = findViewById(R.id.restart);
        text = findViewById(R.id.result);
    }

    public void click(View view){
        AppCompatButton currentView = (AppCompatButton)view;
        if(currentView.getText().equals("") && flag1) {
            count++;

            if(flag == 0) {
                currentView.setText("X");
                currentView.setBackgroundColor(getResources().getColor(R.color.yellow));
                flag = 1;
            } else {
                currentView.setText("0");
                currentView.setBackgroundColor(getResources().getColor(R.color.pink));
                flag = 0;
            }

            if (count > 4) {
                if (btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && !(btn1.getText().equals(""))) {
                    //1
                    text.setText(btn1.getText() + " is Winner");
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && !(btn4.getText().equals(""))) {
                    //2
                    text.setText(btn4.getText() + " is Winner");
                    btn4.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn6.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && !(btn7.getText().equals(""))) {
                    //3
                    text.setText(btn7.getText() + " is Winner");
                    btn7.setBackgroundColor(getResources().getColor(R.color.green));
                    btn8.setBackgroundColor(getResources().getColor(R.color.green));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && !(btn1.getText().equals(""))) {
                    //4
                    text.setText(btn1.getText() + " is Winner");
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    btn4.setBackgroundColor(getResources().getColor(R.color.green));
                    btn7.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && !(btn2.getText().equals(""))) {
                    //5
                    text.setText(btn2.getText() + " is Winner");
                    btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn8.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) && !(btn3.getText().equals(""))) {
                    //6
                    text.setText(btn3.getText() + " is Winner");
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    btn6.setBackgroundColor(getResources().getColor(R.color.green));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && !(btn1.getText().equals(""))) {
                    //7
                    text.setText(btn1.getText() + " is Winner");
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && !(btn3.getText().equals(""))) {
                    //8
                    text.setText(btn3.getText() + " is Winner");
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn7.setBackgroundColor(getResources().getColor(R.color.green));
                    flag1 = false;
                } else if (count >= 9) {
                    text.setText("Game is Drawn");
                }
            }
        }
    }
    public void reStart() {
        btn1.setText("");
        btn1.setBackgroundColor(getResources().getColor(R.color.grey));
        btn2.setText("");
        btn2.setBackgroundColor(getResources().getColor(R.color.grey));
        btn3.setText("");
        btn3.setBackgroundColor(getResources().getColor(R.color.grey));
        btn4.setText("");
        btn4.setBackgroundColor(getResources().getColor(R.color.grey));
        btn5.setText("");
        btn5.setBackgroundColor(getResources().getColor(R.color.grey));
        btn6.setText("");
        btn6.setBackgroundColor(getResources().getColor(R.color.grey));
        btn7.setText("");
        btn7.setBackgroundColor(getResources().getColor(R.color.grey));
        btn8.setText("");
        btn8.setBackgroundColor(getResources().getColor(R.color.grey));
        btn9.setText("");
        btn9.setBackgroundColor(getResources().getColor(R.color.grey));
        flag = 0;
        count = 0;
        text.setText("");
        flag1 = true;
    }
}