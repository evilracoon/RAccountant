package com.evilracoon.raccountant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {

    ListView mainList;
    Button mainAdd;
    private static final String TAG = "EnotDebug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity created");

        //инициализация view эл-тов
        mainList = (ListView)findViewById(R.id.lstMain);
        mainAdd = (Button)findViewById(R.id.btnAdd);


        //оботчики событий
        mainAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //main button maintanence
                Log.d(TAG,"mainAdd onClickListener complite");
            }
        });
    }
}
