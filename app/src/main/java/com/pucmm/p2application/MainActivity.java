package com.pucmm.p2application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView backIcon = findViewById(R.id.left_icon);
        ImageView addIcon = findViewById(R.id.right_icon);


        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            setFragment (new ProductFragment());
            }
        });

    }

    private void setFragment(Fragment Fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentLayout, Fragment);
        fragmentTransaction.commit();
    }


}