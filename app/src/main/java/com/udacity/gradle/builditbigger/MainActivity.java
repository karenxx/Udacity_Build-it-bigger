package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.JokeTelling;
import com.example.jokeandroidlib.JokeDisplay;


//public class MainActivity extends ActionBarActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
////        new EndpointsAsyncTask().execute();
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    public void tellJoke(View view){
//        //Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
//        new EndpointsAsyncTask(new EndpointsAsyncTask.OnJokeRetrievedListener(){
//            @Override
//            public void onJokeRetrieved(String joke) {
//                Intent intent = new Intent(MainActivity.this, JokeDisplay.class);
//                joke = new JokeTelling().getRandomJoke();
//                intent.putExtra(JokeDisplay.JOKE_KEY, joke);
//                startActivity(intent);
//            }
//        }
//        ).execute();
//
////        Intent intent = new Intent(this, JokeDisplay.class);
////        JokeTelling jokeTelling = new JokeTelling();
////        String joke = jokeTelling.getRandomJoke();
////        intent.putExtra(JokeDisplay.JOKE_KEY, joke);
////        startActivity(intent);
//    }
//
//
//}
