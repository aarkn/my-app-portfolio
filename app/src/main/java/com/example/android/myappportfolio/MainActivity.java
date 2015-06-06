package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

//Used ideas learned from Udacity's Android Beginner Course
//Used toasts code from http://developer.android.com/guide/topics/ui/notifiers/toasts.html
//Used color ID's from http://www.google.com/design/spec/style/color.html#color-color-palette
//Found layout_gravity from http://stackoverflow.com/questions/6308772/how-to-center-align-a-view

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Spotify App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();
    }

    public void scoreApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Score App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();
    }

    public void libraryApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();
    }

    public void buildItBiggerApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Build it Bigger App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();
    }

    public void xyzApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the XYZ App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();
    }

    public void capstoneApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.show();
    }

}
