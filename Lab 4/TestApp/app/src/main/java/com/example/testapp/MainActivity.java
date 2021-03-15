package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private ToggleButton Tbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                ImageView view = new ImageView(getApplicationContext());
                view.setImageResource(R.drawable.but);
                toast.setView(view);
                toast.show();
            }
        });
        Tbutton = (ToggleButton)findViewById(R.id.toggleButton);
        Tbutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast toast = new Toast(getApplicationContext());
                    ImageView view = new ImageView(getApplicationContext());
                    view.setImageResource(R.drawable.tbut);
                    toast.setView(view);
                    toast.show();
                }
            }
        });
    }
}