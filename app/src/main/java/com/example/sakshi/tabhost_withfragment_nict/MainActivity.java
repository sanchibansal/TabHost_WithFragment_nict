package com.example.sakshi.tabhost_withfragment_nict;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;   //declaring fragmenttabhost

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost=(FragmentTabHost)findViewById(android.R.id.tabhost); //associating tabhost
        //tab content is the id for the fragment space/layout
        //setting up the fragment manager which handles transition between fragments
        mTabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);
        //adding tabs having tag tab1 and indicator as audio with blank fragment as the layout
        mTabHost.addTab(mTabHost.newTabSpec("Tab1").setIndicator("Audio",null),BlankFragment.class,null);
        //adding tab having tag tab2 and indicator as video with blank fragment 2 as the layout
        mTabHost.addTab(mTabHost.newTabSpec("Tab2").setIndicator("Video",null),BlankFragment2.class,null);
       // mTabHost.addTab(mTabHost.newTabSpec("Tab3").setIndicator("Tab 3",null),BlankFragment3.class,null);

    }
}
