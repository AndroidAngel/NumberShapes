package com.teamandroidangel.iamangelauditor.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        class Number {

                int number;

                boolean isSquare(){


                    double squareRoot = Math.sqrt(number);

                    if (squareRoot == Math.floor(squareRoot)){
                        return true;
                    }else{
                        return false;
                    }
                }
                boolean isTriangular(){

                    int x = 1;
                    int triangularNumber = 1;

                    while (triangularNumber < number){
                        x++;

                        triangularNumber = triangularNumber +  x;

                    }
                    return triangularNumber == number;
                }
            }


    public void checkNumber (View view) {

        String message = "";

        EditText enterNumber = (EditText) findViewById(R.id.enterNumber);

        if (enterNumber.getText().toString().isEmpty()) {

            message = "Please enter a number";

        }else {


        Number myNumber = new Number();
        myNumber.number = Integer.parseInt(enterNumber.getText().toString());

        if (myNumber.isSquare()) {

            if (myNumber.isTriangular()) {

                message = myNumber.number + " is both triangular and square!";
            } else {

                message = myNumber.number + " is square, but not triangular.";
            }

        } else {

            if (myNumber.isTriangular()) {

                message = myNumber.number + " is triangular but not square.";
            } else {

                message = myNumber.number + " is neither square nor triangular.";
            }
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
