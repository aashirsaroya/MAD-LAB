package com.example.lab2question4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.media.AudioManager;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ToggleButton Tbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tbutton = (ToggleButton)findViewById(R.id.toggleButton);
        Tbutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    //Ringing
                    Toast toast = new Toast(getApplicationContext());
                    ImageView view = new ImageView(getApplicationContext());
                    view.setImageResource(R.drawable.ringing);
                    toast.setView(view);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    Toast t = Toast.makeText(getApplicationContext(),"Ringing",Toast.LENGTH_SHORT);
                    t.show();
                }
                else
                {
                    //Silent
                    Toast toast = new Toast(getApplicationContext());
                    ImageView view = new ImageView(getApplicationContext());
                    view.setImageResource(R.drawable.silent);
                    toast.setView(view);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    Toast t = Toast.makeText(getApplicationContext(),"Silent",Toast.LENGTH_SHORT);
                    t.show();
                    //Toast toast = Toast.makeText(getApplicationContext(),"Silent",Toast.LENGTH_SHORT);
                    //toast.show();
                }
            }
        });
        button = (Button)findViewById(R.id.button);
        AudioManager audioManager = (AudioManager) getBaseContext().getSystemService(getApplicationContext().AUDIO_SERVICE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(Tbutton.isChecked())
                 {
                     audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                 }
                else
                {
                    audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                }
            }
        });
    }
}