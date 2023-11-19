package fr.ubo.master.somme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1  ;
    EditText number2  ;
    TextView Result  ;
    Button addition;
    Button soustraction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editText1);
        number2 = findViewById(R.id.editText2);
        Result = findViewById(R.id.Result);
        addition=findViewById(R.id.addition);
        soustraction=findViewById(R.id.soustraction);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul(v);
            }
        });
        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul(v);
            }
        });

    }

    private void calcul(View v) {
        int buttonId = v.getId();

        String N1 = number1.getText().toString();
        String N2= number2.getText().toString();

        if (N1.isEmpty() || N2.isEmpty()) {
            Result.setText("Veuillez entrer deux nombres");
            return;
        }

        double num1 = Double.parseDouble(N1);
        double num2 = Double.parseDouble(N2);

        double result;
        String operator;

        if (buttonId == R.id.addition) {
            result = num1 + num2;
            operator = "Addition";
        } else if (buttonId == R.id.soustraction) {
            result = num1 - num2;
            operator = "Subtraction";
        } else {
            result = 0;
            operator = "Unknown";
        }

         Result.setText(operator + " Result: " + result);
    }










}