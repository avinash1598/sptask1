package com.example.avinash.task1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SuccessActivity extends AppCompatActivity {
    public TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        tv=(TextView)findViewById(R.id.textView6);
        Intent intent=getIntent();
        String name=intent.getStringExtra("Name");
        tv.setText("Thank you "+name+" for your response");

        TextView tv2=(TextView)findViewById(R.id.textView7);
        DateFormat t=new SimpleDateFormat("dd:MM:yyyy_HH:mm:ss");
        String tm=t.format(new Date());
        tv2.setText("Response date & time: "+tm);
    }
    public void back(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
