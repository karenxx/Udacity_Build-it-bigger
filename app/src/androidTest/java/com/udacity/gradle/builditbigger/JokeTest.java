package com.udacity.gradle.builditbigger;

import android.os.CountDownTimer;
import android.test.AndroidTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class JokeTest extends AndroidTestCase {
    CountDownLatch signal;
    String mJoke;

    public void testJoke() {
        try {
            signal = new CountDownLatch(1);
            new EndpointsAsyncTask(new JokeListener()).execute();
            signal.await(10, TimeUnit.SECONDS);
            assertNotNull("joke is null", mJoke);
            assertFalse("joke is empty", mJoke.isEmpty());

        }catch (Exception e){
            fail();
        }
    }

    private class JokeListener implements EndpointsAsyncTask.OnJokeRetrievedListener {
        @Override
        public void onJokeRetrieved(String joke) {
            mJoke = joke;
            signal.countDown();
        }
    }
}