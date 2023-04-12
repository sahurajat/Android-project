package com.example.dateandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.dateandtimepicker.R.id;

public class MainActivity extends AppCompatActivity {
    private TextView textView,textview1;
    private Button button,button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call by findview by id for date picker
        textView=findViewById(R.id.showText);
        button=findViewById(R.id.button);
        //call by find view by id for time picker
        textview1=findViewById(id.showText1);
        button1=findViewById(id.button1);

        //call setoncilcklistener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openDatePicker(); // Open date picker dialog


            }
        });
       //
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openTimePicker(); //Open time picker dialog


            }
        });
    }

    //create  amethod of opendialog

    private void openDatePicker(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                //Showing the picked value in the textView
                textView.setText(String.valueOf(day)+ "."+String.valueOf(month+1)+ "."+String.valueOf(year));

            }
        }, 2023, 01, 20);

        datePickerDialog.show();
    }


    private void openTimePicker(){

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int minute) {


                //Showing the picked value in the textView
                textview1.setText(String.valueOf(hour)+ ":"+String.valueOf(minute));

            }
        }, 15, 30,false);

        timePickerDialog.show();
    }


}