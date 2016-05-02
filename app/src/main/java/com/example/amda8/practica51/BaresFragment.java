package com.example.amda8.practica51;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaresFragment extends Fragment {

    private TabLayout tab_Layout;
    private ViewPager viewPager;

    public BaresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bares, container, false);
        tab_Layout = (TabLayout) view.findViewById(R.id.tab_Bares);
        viewPager = (ViewPager) view.findViewById(R.id.pagerBares);
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        tab_Layout.post(new Runnable() {

            @Override
            public void run() {
                tab_Layout.setupWithViewPager(viewPager);
            }
        });
        return view;
    }
    class MyAdapter extends FragmentPagerAdapter {


        public MyAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Carnaval();
                case 1:
                    return new Jalisco();
                case 2:
                    return new Labarra();
            }
            return null;
        }
        @Override
        public int getCount() {
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "JALISCO";
                case 1:
                    return "CARNAVAL";
                case 2:
                    return "LA BARRA";
            }
            return null;
        }
    }


}
