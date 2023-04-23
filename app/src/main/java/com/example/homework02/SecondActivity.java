package com.example.homework02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView3;
    private Ticket ticket;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView3 = findViewById(R.id.textView3);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            ticket = (Ticket) bundle.getSerializable("ticket1");

            textView3.setText("ID пользователя: " + ticket.getUser() + "\n" +
                    "Место и время отправления/прибытие поезда: " + ticket.getPlace() + "\n" +
                    "Стоимость билета: "+ ticket.getCost());
        }


    }
}