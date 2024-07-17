package com.example.hritamscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText firstNum,secNum;
    TextView res;
    Button butAdd,butSub,butMul,butDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // This should be the name of your XML layout file
        firstNum=findViewById(R.id.firstNum);
        secNum=findViewById(R.id.secNum);

        res=findViewById(R.id.res);

        butAdd=findViewById(R.id.butAdd);
        butSub=findViewById(R.id.butSub);
        butMul=findViewById(R.id.budMul);
        butDiv=findViewById(R.id.budDiv);

        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal,secondVal;
                double ans;
                firstVal=Integer.parseInt(firstNum.getText().toString());
                secondVal=Integer.parseInt(secNum.getText().toString());
                ans=firstVal+secondVal;

                res.setText("Addition of "+firstVal+" and "+secondVal+" is "+ans);
            }
        });

        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal,secondVal;
                double ans;
                firstVal=Integer.parseInt(firstNum.getText().toString());
                secondVal=Integer.parseInt(secNum.getText().toString());
                ans=firstVal-secondVal;

                res.setText("Substraction of "+firstVal+" and "+secondVal+" is "+ans);
            }
        });

        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal,secondVal;
                double ans;
                firstVal=Integer.parseInt(firstNum.getText().toString());
                secondVal=Integer.parseInt(secNum.getText().toString());
                ans=firstVal*secondVal;

                res.setText("Multiplication of "+firstVal+" and "+secondVal+" is "+ans);
            }
        });

        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstVal,secondVal;
                double ans;
                firstVal=Integer.parseInt(firstNum.getText().toString());
                secondVal=Integer.parseInt(secNum.getText().toString());
                ans=firstVal/secondVal;

                res.setText("Division of "+firstVal+" and "+secondVal+" is "+ans);
            }
        });
    }
}
