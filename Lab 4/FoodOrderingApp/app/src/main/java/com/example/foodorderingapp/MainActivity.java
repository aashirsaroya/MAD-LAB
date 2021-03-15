package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        CheckBox pizza,burger,pasta,btrchkn,kebab,cake,bisc,rice,bread;
        pizza = (CheckBox)findViewById(R.id.pizza);
        burger = (CheckBox)findViewById(R.id.burger);
        pasta = (CheckBox)findViewById(R.id.pasta);
        btrchkn = (CheckBox)findViewById(R.id.bckn);
        kebab = (CheckBox)findViewById(R.id.kebab);
        cake =  (CheckBox)findViewById(R.id.cake);
        bisc =  (CheckBox)findViewById(R.id.biscuit);
        rice =  (CheckBox)findViewById(R.id.rice);
        bread =  (CheckBox)findViewById(R.id.bread);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            int cost;
            String list = "";
            @Override
            public void onClick(View v) {
                if(pizza.isChecked())
                {
                    list += "Pizza - $10\n";
                    cost += 10;
                }
                if(burger.isChecked())
                {
                    list += "Burger - $8\n";
                    cost += 8;
                }
                if(pasta.isChecked())
                {
                    list += "Pasta - $12\n";
                    cost += 12;
                }
                if(btrchkn.isChecked())
                {
                    list += "Butter Chicken - $15\n";
                    cost += 15;
                }
                if(kebab.isChecked())
                {
                    list += "Kebab - $7\n";
                    cost += 7;
                }
                if(cake.isChecked())
                {
                    list += "Choco Lava Cake - $5\n";
                    cost += 5;
                }
                if(bisc.isChecked())
                {
                    list += "Biscuits - $8\n";
                    cost += 8;
                }
                if(rice.isChecked())
                {
                    list += "Fried Rice - $6\n";
                    cost += 6;
                }
                if(bread.isChecked())
                {
                    list += "Garlic Bread - $3\n";
                    cost += 3;
                }
                pizza.setEnabled(false);
                burger.setEnabled(false);
                pasta.setEnabled(false);
                btrchkn.setEnabled(false);
                kebab.setEnabled(false);
                cake.setEnabled(false);
                bisc.setEnabled(false);
                rice.setEnabled(false);
                bread.setEnabled(false);
                list = list + "Total Amount - " + cost;
                Toast.makeText(getApplicationContext(),list,Toast.LENGTH_LONG).show();
            }
        });

    }
}