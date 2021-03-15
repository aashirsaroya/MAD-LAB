package com.example.groceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.ListViewId);
        listView.setClickable(true);
        String[] req = new String[]{
                "Bread",
                "Chicken",
                "Mutton",
                "Fish",
                "Cauliflower",
                "Potatoes",
                "Tomatoes",
                "Rice",
                "Wheat",
                "Cornflakes",
                "Chocolates",
                "Napkins",
                "Toiletries",
                "Milk & Dairy Products",
                "Bitter Gourd",
                "Carrots"

        };
        final List<String> req_list = new ArrayList<String>(Arrays.asList(req));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,req_list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), listView.getItemAtPosition(position).toString()+" is selected :)",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}