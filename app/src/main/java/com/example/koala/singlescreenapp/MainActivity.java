package com.example.koala.singlescreenapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView brand = (TextView)findViewById(R.id.brand);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Philosopher-Bold.ttf");
        brand.setTypeface(custom_font);

        TextView mission = (TextView)findViewById(R.id.mission);
        Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-CondLight.ttf");
        mission.setTypeface(custom_font2);

        TextView address = (TextView)findViewById(R.id.address);
        Typeface custom_font3 = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-CondLight.ttf");
        address.setTypeface(custom_font3);

        TextView number = (TextView)findViewById(R.id.number);
        Typeface custom_font4 = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-CondLight.ttf");
        number.setTypeface(custom_font4);

        TextView mail = (TextView)findViewById(R.id.mail);
        Typeface custom_font5 = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-CondLight.ttf");
        mail.setTypeface(custom_font5);


        TextView map = (TextView) findViewById(R.id.map);
        TextView phone = (TextView) findViewById(R.id.phone);
        TextView email = (TextView) findViewById(R.id.email);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");

        map.setTypeface(font);
        phone.setTypeface(font);
        email.setTypeface(font);

        map.setText("\uf041");
        phone.setText("\uf095");
        email.setText("\uf003");


    }

}
