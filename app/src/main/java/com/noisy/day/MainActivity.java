package com.noisy.day;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.push.Push;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "25aee59d-81b9-4e37-834b-b2dd6d5d2910",
                Analytics.class, Crashes.class, Push.class);
    }

    public void crash(View view) {
        throw new NullPointerException();
    }

    // example
    public void noise(View view) {
        startActivity(new Intent(this, NoiseActivity.class));
    }
}
