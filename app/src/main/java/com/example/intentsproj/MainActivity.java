package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum,subtract,multiplication,division;
    EditText no1,no2;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = findViewById(R.id.add);
        subtract = findViewById(R.id.sub);
        multiplication = findViewById(R.id.mul);
        division = findViewById(R.id.div);
        no1 = findViewById(R.id.edtNum01);
        no2 = findViewById(R.id.edtNum02);
        answer = findViewById(R.id.tvAnswer);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double number1 = Double.parseDouble(no1.getText().toString());
                Double number2 = Double.parseDouble(no2.getText().toString());
                Double result = number1 + number2;
                answer.setText(String.valueOf(no1.getText() + " + " + no2.getText() + " = " + result ));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double number1 = Double.parseDouble(no1.getText().toString());
                Double number2 = Double.parseDouble(no2.getText().toString());
                Double result = number1 - number2;
                answer.setText(String.valueOf(no1.getText() + " - " + no2.getText() + " = " + result ));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double number1 = Double.parseDouble(no1.getText().toString());
                Double number2 = Double.parseDouble(no2.getText().toString());
                Double result = number1 * number2;
                answer.setText(String.valueOf(no1.getText() + " * " + no2.getText() + " = " + result ));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double number1 = Double.parseDouble(no1.getText().toString());
                Double number2 = Double.parseDouble(no2.getText().toString());
                Double result = number1 / number2;
                answer.setText(String.valueOf(no1.getText() + " / " + no2.getText() + " = " + result ));
            }
        });
    }
}
