package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public TextView wynik_1;
    public TextView wynik_2;
    public TextView wynik_3;
    public TextView wynik_4;
    public TextView wynik_5;
    public TextView los;
    public TextView wynikgryp;
    public TextView rzuty;
    public Button start;
    private Button reset;
    public int wynikgry;
    public int ilosc;
    public int wyniklos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wynik_1 = findViewById(R.id.Result1);
        wynik_2 = findViewById(R.id.Result2);
        wynik_3 = findViewById(R.id.Result3);
        wynik_4 = findViewById(R.id.Result4);
        wynik_5 = findViewById(R.id.Result5);
        los = findViewById(R.id.los);
        wynikgryp = findViewById(R.id.gameresult);
        rzuty = findViewById(R.id.numthrow);
        start = findViewById(R.id.start);
        reset = findViewById(R.id.reset);


        los.setText("Wynik tego losowania : " + wyniklos);
        wynikgryp.setText("Wynik gry: " + wynikgry);
        rzuty.setText("Liczba rzutÃ³w: " + ilosc);


        classes klasy = new classes(wynik_1, wynik_2, wynik_3, wynik_4, wynik_5, los, wynikgryp, rzuty, start, reset);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                klasy.rollDice();
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                klasy.resetgame();
            }
        });

    }
}