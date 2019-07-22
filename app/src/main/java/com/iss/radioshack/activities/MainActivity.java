package com.iss.radioshack.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.iss.radioshack.R;
import com.iss.radioshack.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.container_main);
        if(mainFragment == null) {
            mainFragment = MainFragment.newInstance("test1", "test2");
            fragmentManager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }
}
