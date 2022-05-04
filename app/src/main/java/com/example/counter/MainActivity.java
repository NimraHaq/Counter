package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//This is a counter application
public class MainActivity extends AppCompatActivity {

    int Count;  //count value is stored in this "Count" variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //loading the view
        Count =0;
    }

    public void increaseCount(View view)  //when "INCREASE" button is clicked, this function is called
    {
        Count++;
        TextView countValue = findViewById(R.id.count);  //getting the view
        countValue.setText( Integer.toString(Count)); //updating the count on UI

    }
    public void decreaseCount(View view)  //when "DECREASE" button is clicked, this function is called
    {
        Count--;
        TextView countValue2 = findViewById(R.id.count);
        countValue2.setText(Integer.toString(Count));  //Providing user the updated value of count

    }
}