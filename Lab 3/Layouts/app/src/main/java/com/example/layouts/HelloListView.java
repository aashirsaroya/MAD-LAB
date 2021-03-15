package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_list_view);
        final ListView listView = (ListView) findViewById(R.id.ListViewId);
        String[] req = new String[]{
          "American Samoa",
          "El Salvador",
          "Saint Helena",
          "Saint Kitts and Nevis",
                "Saint Lucia",
                "Saint Pierre and Miqueton",
                "Saint Vincent and the Grenadines",
                "Samoa",
                "Saudi Arabia",
                "India",
                "Sri Lanka",
                "United States of America",
                "China",
                "Pakistan",
                "Bangladesh",
                "Japan",
                "Indonesia",
                "Israel",
                "Iran"
        };
        final List<String> req_list = new ArrayList<String>(Arrays.asList(req));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,req_list);
        listView.setAdapter(arrayAdapter);
    }
}