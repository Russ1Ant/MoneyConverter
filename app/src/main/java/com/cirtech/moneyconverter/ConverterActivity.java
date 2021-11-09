package com.cirtech.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConverterActivity extends AppCompatActivity {

    EditText ed1, ed2, edt2;
    Button b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        ed1 = findViewById(R.id.txtAmount);
        edt2 = findViewById(R.id.txtAmount1);
        b1 = findViewById(R.id.btnConvert);
        b2 = findViewById(R.id.btnExit);
        ed2 = findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cents;

                if (ed1.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter an amount", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    Double amount = Double.parseDouble(ed1.getText().toString());
                    cents = amount * 100;
                    Toast.makeText(getApplicationContext(), cents.toString(), Toast.LENGTH_LONG).show();
                    ed2.setText(cents.toString() + " cents");
                    edt2.setText(cents.toString());
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}