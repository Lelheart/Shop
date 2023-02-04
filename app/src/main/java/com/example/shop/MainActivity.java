package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new MainFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Computers:
                fragment = fragmentManager.findFragmentById(R.id.fragment_container);
                fragment = new ComputersFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                break;
            case R.id.Consoles:
                fragment = fragmentManager.findFragmentById(R.id.fragment_container);
                fragment = new ConsolesFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                break;
            case R.id.TV:
                fragment = fragmentManager.findFragmentById(R.id.fragment_container);
                fragment = new TVFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                break;
            case R.id.Phones:
                fragment = fragmentManager.findFragmentById(R.id.fragment_container);
                fragment = new PhonesFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                break;
            case R.id.back:
                fragment = fragmentManager.findFragmentById(R.id.fragment_container);
                fragment = new MainFragment();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                break;
        }
    }
}