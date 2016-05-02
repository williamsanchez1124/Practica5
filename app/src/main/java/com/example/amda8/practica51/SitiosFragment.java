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
public class SitiosFragment extends Fragment {

    private TabLayout tab_Layout;
    private ViewPager viewPager;


    public SitiosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sitios, container, false);
        tab_Layout = (TabLayout) view.findViewById(R.id.tab_Sitios);
        viewPager = (ViewPager) view.findViewById(R.id.view_Sitios);
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
                    return new Muelle();
                case 1:
                    return new Puente();
                case 2:
                    return new Parque();
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
                    return "MUELLE";
                case 1:
                    return "PUENTE";
                case 2:
                    return "IGLESIA";
            }
            return null;
        }
    }

}
