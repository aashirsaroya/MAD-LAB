package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button lv;
    private Button gridV;
    private Button TabV;
    private Button TableL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (Button)findViewById(R.id.button);
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListView();
            }
        });
        gridV = (Button) findViewById(R.id.button2);
        gridV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGridView();
            }
        });
        TabV = (Button) findViewById(R.id.button3);
        TabV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTabLayout();
            }
        });
        TableL = (Button) findViewById(R.id.button4);
        TableL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTableLayout();
            }
        });
    }
    public void openTableLayout()
    {
        Intent bruh = new Intent(this,HelloTableLayout.class);
        startActivity(bruh);
    }
    public void openTabLayout()
    {
        Intent i = new Intent(this,HelloTabLayout.class);
        startActivity(i);
    }
    public void openGridView()
    {
        Intent in = new Intent(this,HelloGridView.class);
        startActivity(in);
    }
    public void openListView()
    {
        Intent intent = new Intent(this,HelloListView.class);
        startActivity(intent);
    }

}