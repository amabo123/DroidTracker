package wick.droidtracker;

import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Settinng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settinng);
    }
    public void forget_password(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Forget_password.class);
        startActivity(intent);

    }
    public void Change_password(View v)
    {
        Intent intent = new Intent(getApplicationContext(), forgetpassword_change_manu.class);
        startActivity(intent);

    }

    public void logout(View v)
    {
        SharedPreferences preferences =getSharedPreferences("logged_users",0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
        Intent intent = new Intent(this, loginpage.class);
        startActivity(intent);
        finish();
    }
}
