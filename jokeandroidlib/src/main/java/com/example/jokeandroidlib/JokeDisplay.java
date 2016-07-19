package com.example.jokeandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplay extends AppCompatActivity {
public static String JOKE_KEY = "joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke = getIntent().getStringExtra(JOKE_KEY);
        TextView jokeTextView = (TextView)findViewById(R.id.joke_textview);
        if(joke != null && joke.length() != 0){
            jokeTextView.setText(joke);
        }
    }
}
