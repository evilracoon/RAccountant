package com.evilracoon.raccountant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class add_activity extends AppCompatActivity {

    TextView valTime = (TextView)findViewById(R.id.valAddTime);
    EditText valAmount = (EditText) findViewById(R.id.valAddAmount);
    EditText valDescr = (EditText) findViewById(R.id.valAddDescr);
    RadioGroup radioGroupAdd = (RadioGroup) findViewById(R.id.radioGroupAdd);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);
    }
}
