package com.zconte.numbersshape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkTriangularNumber(View view) {
        EditText inputText = findViewById(R.id.triangularNumberInput);
        int number = Integer.parseInt(inputText.getText().toString());

        if (isTriangularNumber(number)) {
            Toast.makeText(this, number + " is a Triangular number!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, number + " is NOT a Triangular number.", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isTriangularNumber(int number) {
        int squareNumber = 8 * (number) + 1;
        return isSquareNumber(squareNumber);
    }

    public boolean isSquareNumber(int number) {
        double squareNumber = Math.sqrt(number);

        return squareNumber == (int) squareNumber;
    }
}