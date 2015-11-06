package com.maxtel.musichub.broadcast;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class example_broadcast extends Activity {
    String msg = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_broadcast);
        Log.d(msg, "The onCreate() event");
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Crea el menú
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    // Activities
    public void _activities(View view){
        Intent nextScreen = new Intent(getApplicationContext(), example_activity.class);
        startActivity(nextScreen);
        System.out.println("_activities");
    }

    public void _services(View view){
        Intent nextScreen = new Intent(getApplicationContext(), example_service.class);
        startActivity(nextScreen);
        System.out.println("_services");
    }
    public void _broadcast(View view){
        Intent nextScreen = new Intent(getApplicationContext(), example_broadcast.class);
        startActivity(nextScreen);
        System.out.println("_broadcast");
    }


    public void _content(View view){
        Intent nextScreen = new Intent(getApplicationContext(), example_content.class);
        startActivity(nextScreen);
        System.out.println("_content");
    }

    // broadcast a custom intent.
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.maxtel.musichub.broadcast.CUSTOM_INTENT");
        sendBroadcast(intent);
        System.out.println("holasss");
    }

    public void close(View view) {
        finish();
    }


}
