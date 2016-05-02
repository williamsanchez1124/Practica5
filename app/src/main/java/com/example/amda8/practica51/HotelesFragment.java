package com.example.amda8.practica51;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelesFragment extends Fragment {

    private TabLayout tab_Layout;
    private ViewPager viewPager;

    public HotelesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hoteles, container, false);
        tab_Layout = (TabLayout) view.findViewById(R.id.tab_Hoteles);
        viewPager = (ViewPager) view.findViewById(R.id.view_Hoteles);
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
                    return new Dospalmas();
                case 1:
                    return new Malecon();
                case 2:
                    return new Central_hotel();
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
                    return "DOS PALMAS";
                case 1:
                    return "MALECON";
                case 2:
                    return "HOTEL CENTRAL";
            }
            return null;
        }
    }

}


