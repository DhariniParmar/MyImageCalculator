package com.example.cvct121.myimagecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
 private Button calculateButton = null;
 private ImageButton btnImageClear = null;
 private ImageView imageViewPicture = null;
 private TextView textViewResult = null;
 private TextView editTextLeftOp = null;
 private TextView editTextRightOp = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculateButton = (Button)findViewById(R.id.calculateButton);
        btnImageClear =  (ImageButton)findViewById(R.id.btnImageClear);
        imageViewPicture = (ImageView)findViewById(R.id.imageViewIPicture);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        editTextLeftOp = (EditText)findViewById(R.id.editTextLeftOp);
        editTextRightOp = (EditText)findViewById(R.id.editTextRightOp);


    }

    public void clickedCalculate(View view)
    {
        String leftOpString =  editTextLeftOp.getText().toString();
        double leftOpDouble = 0.0;
        if(!leftOpString.isEmpty())
        {
            leftOpDouble = Double.parseDouble(leftOpString);
        }


        String rightOpString =  editTextRightOp.getText().toString();
        double rightOpDouble = 0.0;
        if (!rightOpString.isEmpty())
        {
             rightOpDouble = Double.parseDouble(rightOpString);
        }


        double sumResultDouble = leftOpDouble + rightOpDouble;
        String strResult = "" + sumResultDouble;

        textViewResult.setText(strResult);


        //show rewarding images bopth oparands exits
        //otherwise show UGLY PUNISH image
        if(!leftOpString.isEmpty() && !rightOpString.isEmpty())
        {
            imageViewPicture.setImageResource(R.drawable.golf);
            System.out.println("HERE HERE HERE");

        }
        else
        {
            imageViewPicture.setImageResource(R.drawable.ball);
            System.out.println("THERE THERE THERE");
        }
    }

    public void clickedClear(View view)
    {
         textViewResult.setText("");
    }
}
