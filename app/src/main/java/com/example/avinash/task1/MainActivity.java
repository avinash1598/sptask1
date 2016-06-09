package com.example.avinash.task1;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public String array[]={"CSE","ECE","EEE","MECH.","PROD.","CIVIL","ICE","META."};
    public EditText name,rollno;
    public CheckBox ch1,ch2,ch3,ch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.editText);
        rollno=(EditText)findViewById(R.id.editText2);
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        ch3=(CheckBox)findViewById(R.id.checkBox3);
        ch4=(CheckBox)findViewById(R.id.checkBox4);

       try{
           Spinner sn = (Spinner) findViewById(R.id.spinner);
           ArrayAdapter<String> dep = new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner, array);
           sn.setAdapter(dep);

          }catch(Exception e){
           Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
       }
    }
    public void submit(View v){
        String naam= name.getText().toString();
        int k=0;
        if(naam.matches(""))
        {Toast.makeText(getApplicationContext(),"NAME FIELD CAN'T BE LEFT EMPTY",Toast.LENGTH_SHORT).show();k=1;}

        if((rollno.getText().toString()).matches(""))
        {Toast.makeText(getApplicationContext(),"ROLLNO FIELD CAN'T BE LEFT EMPTY",Toast.LENGTH_SHORT).show();k=1;}

        if(!ch1.isChecked()&&!ch2.isChecked()&&!ch3.isChecked()&&!ch4.isChecked())
        {Toast.makeText(getApplicationContext(),"SELECT ATLEAST ONE PROFILE",Toast.LENGTH_SHORT).show();k=1;}

        if(k==0) {
            Intent intent=new Intent(getApplicationContext(),SuccessActivity.class);
            intent.putExtra("Name",naam);
            startActivity(intent);
            }

    }
}
