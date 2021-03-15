package com.example.layouts;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;


public class HelloGridView extends AppCompatActivity {
    int image[] = {
            R.drawable.doggy,
            R.drawable.doggy,
            R.drawable.doggy,
            R.drawable.doggy,
            R.drawable.doggy,
            R.drawable.doggy,
            R.drawable.doggy
    };
    GridView gridView;
    ArrayList<imageModel> arrayList;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview);
        arrayList = new ArrayList<>();
        for (int i = 0; i < image.length; i++) {
            imageModel imagemodel = new imageModel();
            imagemodel.setmThumbIds(image[i]);
            //add in array list
            arrayList.add(imagemodel);
        }

        imageAdapter adpter= new imageAdapter(getApplicationContext(), arrayList);
        gridView.setAdapter(adpter);
        //item click listner
        gridView.setOnItemClickListener((parent, view, position, id) -> {
        });
    }
}