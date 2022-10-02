package wick.droidtracker;

import android.os.Bundle;

import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class contact_textview extends AppCompatActivity {

    private static contact_textview adapter;

    public static void setAdapter(contact_textview adapter) {
        contact_textview.adapter = adapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_textview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


}
