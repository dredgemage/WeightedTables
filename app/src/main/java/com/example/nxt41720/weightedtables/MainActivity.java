package com.example.nxt41720.weightedtables;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.activity_main);

        if (fragment == null) {
            fragment = MainPanelFragment.newInstance();
            fm.beginTransaction()
                    .add(R.id.activity_main, fragment)
                    .commit();
        }

        int screenOrientation = getResources().getConfiguration().orientation;

        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePanel();
        }
    }

    private void hideSidePanel() {

        View sidePane = findViewById(R.id.side_panel);
        if(sidePane.getVisibility() == View.VISIBLE) {

            sidePane.setVisibility(View.GONE);

        }

    }

}
