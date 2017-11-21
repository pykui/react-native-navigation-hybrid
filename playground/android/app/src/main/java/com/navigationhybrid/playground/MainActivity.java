package com.navigationhybrid.playground;

import android.os.Bundle;

import com.navigationhybrid.ReactAppCompatActivity;

public class MainActivity extends ReactAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
           /* Navigator navigator = new Navigator(UUID.randomUUID().toString(), UUID.randomUUID().toString(), getSupportFragmentManager(), R.id.content);
            NavigationFragment fragment = navigator.createFragment("NativeNavigation", navigator.sceneId, null, null);
            navigator.setRoot(fragment, false);*/

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content, new ReactFragment())
                    .commit();

        }

    }


}