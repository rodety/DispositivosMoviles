package com.maxtel.musichub.broadcast;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.view.View.OnClickListener;

public class example_activity extends Activity {
    String msg = "Android : ";

    /** Called when the activity is first created. */
    int count = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_activity);
        Log.d(msg, "The onCreate() event");

        //Example CheckBox
        final CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        checkbox.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox.isChecked()) {
                    checkbox.setText("I'm checked");
                } else {
                    checkbox.setText("I'm not checked");
                }
            }
        });

        //Example Button
        final Button button = (Button) findViewById(R.id.button);


        //Example ToggleButton
        final LinearLayout bg = (LinearLayout) findViewById(R.id.linearLayout);

        final ToggleButton mybutton = (ToggleButton) findViewById(R.id.toggleButton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mybutton.isChecked()) {
                    bg.setBackgroundColor(0xFFF3F3F3);
                } else {
                    bg.setBackgroundColor(0xFF000000);
                }
                button.setText("Got Pressed:" + ++count);
            }
        });


        //Example RatingBar

        int mCount = 0;

        final TextView tv = (TextView) findViewById(R.id.textView);
        final RatingBar bar = (RatingBar) findViewById(R.id.ratingBar);
        bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float
                    rating, boolean fromUser) {
                tv.setText("Rating:" + rating);
            }
        });


        //Example UIAutoComplet
        /*
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autocomplete_country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                this.findViewById("list_item");
                (this,R.layout.example_activity, COUNTRIES);
        textView.setAdapter(adapter);
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View
                    arg1, int arg2, long arg3) {
                Toast.makeText(getApplicationContext(), "The winner is:" + arg0.getAdapter().getItem(arg2),
                Toast.LENGTH_SHORT).show();
            }
        });
    */




    }

    static final String[] COUNTRIES = new String[]{"Afghanistan",
            "Albania", "Algeria", "American Samoa", "Andorra", "Angola",
            "Anguilla", "Antarctica"};

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

    public void _inicio(View view){
        System.out.println("_inicio");
        //finish();

    }
}