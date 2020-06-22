package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText eText = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText ephone = (EditText) findViewById(R.id.editTextPhone);
        final EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        final EditText AGE = (EditText) findViewById(R.id.editTextNumber);
        RadioButton btn =(RadioButton) findViewById(R.id.radioButton);
        Button btt =(Button) findViewById(R.id.button);
        final Button but =(Button)findViewById(R.id.button2);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        final EditText item=(EditText)findViewById(R.id.editTextNumber2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = AGE.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                msg.show();
            }
        });
        btt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str1 =eText.getText().toString();
                String str2 =ephone.getText().toString();
                String str3 =email.getText().toString();
                Toast msg1 =Toast.makeText(getBaseContext(),str1,Toast.LENGTH_LONG);
                msg1.show();
                Toast msg2=Toast.makeText(getBaseContext(),str2,Toast.LENGTH_LONG);
                msg2.show();
                Toast msg3 =Toast.makeText(getBaseContext(),str3,Toast.LENGTH_LONG);
                msg3.show();
            }
        });
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str4=item.getText().toString();
                alertDialogBuilder.setMessage("Are you sure, You want"+str4);
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

    }





    }