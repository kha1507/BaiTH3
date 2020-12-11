package com.example.thecoffeehouse.bottomNavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.tablayout.ViewPagerAdapter_318;
import com.google.android.material.tabs.TabLayout;

public class Dathang_318 extends Fragment {

    private TabLayout mTabLayout_318;
    private ViewPager mViewPager_318;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_dathang, container, false);
        mTabLayout_318 = r.findViewById(R.id.tab_layout_318);
        mViewPager_318 = r.findViewById(R.id.view_pager_318);

        ViewPagerAdapter_318 viewPagerAdapter = new ViewPagerAdapter_318(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_318.setAdapter(viewPagerAdapter);
        mTabLayout_318.setupWithViewPager(mViewPager_318);
        return r;
    }

}