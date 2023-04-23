package com.example.homework02;

import static com.example.homework02.R.id.cost;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userEdText;
    private EditText placeEdText;
    private EditText costEdText;

    private Button button;

    private String user;
    private String place;
    private String cost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEdText =  findViewById(R.id.user);
        placeEdText = findViewById(R.id.place);
        costEdText = findViewById(R.id.cost);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user = userEdText.getText().toString();
                place = placeEdText.getText().toString();
                cost = costEdText.getText().toString();

                Ticket ticket = new Ticket(user,place,cost);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("ticket1", ticket);
                startActivity(intent);
            }
        });
    }
}