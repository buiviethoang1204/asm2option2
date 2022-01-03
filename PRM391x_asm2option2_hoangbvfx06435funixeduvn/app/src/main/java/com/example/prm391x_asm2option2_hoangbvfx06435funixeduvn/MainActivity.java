package com.example.prm391x_asm2option2_hoangbvfx06435funixeduvn;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        DrawerLayout mDrawerLayout = findViewById(R.id.drawer);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.actionbar_open, R.string.actionbar_close);
//        mDrawerLayout.addDrawerListener(toggle);
//        toggle.syncState();

        initView();
        List<Animal> list = new ArrayList<>();
        list.add(new Animal(R.drawable.ic_eagle, R.drawable.bg_eagle, "Eagle", getString(R.string.text_eagle), false));
        list.add(new Animal(R.drawable.ic_eagle, R.drawable.bg_eagle, "Eagle", getString(R.string.text_eagle), false));

//        ViewPager viewPager2 = findViewById(R.id.view_pager);
//
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
//                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, list);
//        viewPager2.setAdapter(viewPagerAdapter);

    }

    private void initView() {
        FragmentMenu fragmentMenu = new FragmentMenu();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_activity, fragmentMenu, null).commit();
    }

    private void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_activity, fragment).commit();
    }

    public void gotoFragmentDetail(Animal animal) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        FragmentDetail fragmentDetail = new FragmentDetail();

        Bundle bundle = new Bundle();
        bundle.putSerializable("objectAnimal", animal);

        fragmentDetail.setArguments(bundle);

        fragmentTransaction.replace(R.id.main_activity, fragmentDetail).commit();
    }
    

}