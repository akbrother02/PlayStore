package aasheesh.com.android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import aasheesh.com.android.fragment.BookFragment;
import aasheesh.com.android.fragment.GamesFragment;
import aasheesh.com.android.fragment.HomeFragment;
import aasheesh.com.android.fragment.MoviesFragment;
import aasheesh.com.android.fragment.MusicFragment;
import aasheesh.com.android.fragment.NewsStandFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeFragment tab1 = new HomeFragment();
                return tab1;
            case 1:
                GamesFragment tab2 = new GamesFragment();
                return tab2;
            case 2:
                MoviesFragment tab3 = new MoviesFragment();
                return tab3;
            case 3:
                BookFragment tab4 = new BookFragment();
                return tab4;
            case 4:
                MusicFragment tab5 = new MusicFragment();
                return tab5;
            case 5:
                NewsStandFragment tab6 = new NewsStandFragment();
                return tab6;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}