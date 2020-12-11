package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.thecoffeehouse.bottomNavigation.Cuahang_318;
import com.example.thecoffeehouse.bottomNavigation.Dathang_318;
import com.example.thecoffeehouse.bottomNavigation.Dathang_318;
import com.example.thecoffeehouse.bottomNavigation.Taikhoan_318;
import com.example.thecoffeehouse.bottomNavigation.Tintuc_318;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_318 extends AppCompatActivity {

    private ActionBar toolbar_318;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_318);

        toolbar_318 = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation_318);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // load the store fragment by default
        loadFragment(new Tintuc_318());
    }

     private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.tintuc_318:
                    fragment = new Tintuc_318();
                    loadFragment(fragment);
                    return true;
                case R.id.dathang_318:
                    fragment = new Dathang_318();
                    loadFragment(fragment);
                    return true;
                case R.id.cuahang_318:
                    fragment = new Cuahang_318();
                    loadFragment(fragment);
                    return true;
                case R.id.taikhoan_318:
                    fragment = new Taikhoan_318();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frame_container_318, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
