package com.example.lenovo.fragments;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Viewpageradapter viewpageradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_nav);
        TabLayout tabLayout=findViewById(R.id.tablayout);
        ViewPager viewPager=findViewById(R.id.viewpager);

        viewpageradapter= new Viewpageradapter(getSupportFragmentManager());



        //adds fragments here
        viewpageradapter.addFragment(new frag_home(), "home");
        viewpageradapter.addFragment(new frag_burn(), "burn");
        viewpageradapter.addFragment(new frag_byee(), "bye");
        viewPager.setAdapter(viewpageradapter);
        tabLayout.setupWithViewPager(viewPager);






















        /************************************************** bottom nav bar *******************************************************************/



        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navlistner);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistner=new BottomNavigationView.OnNavigationItemSelectedListener(){
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedfrag= null;
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    selectedfrag=new frag_home();
                    break;


                case R.id.nav_middle:
                    selectedfrag=new frag_burn();
                    break;


                case R.id.nav_right:
                    selectedfrag=new frag_byee();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,selectedfrag).commit();
                return true;
        }
    };
}
