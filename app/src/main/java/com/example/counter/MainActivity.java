package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Count;  //count value is stored in this "Count" variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Count =0;
    }

    public void increaseCount(View view)
    {
        Count++;
        TextView countValue = findViewById(R.id.count);
        countValue.setText( Integer.toString(Count));

    }
    public void decreaseCount(View view)
    {
        Count--;
        TextView countValue2 = findViewById(R.id.count);
        countValue2.setText(Integer.toString(Count));

    }
}