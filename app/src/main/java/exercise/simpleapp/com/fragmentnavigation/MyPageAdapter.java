package exercise.simpleapp.com.fragmentnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by tasev on 12/4/17.
 */

public class MyPageAdapter extends FragmentPagerAdapter {

    private static final ArrayList<String> titles = new ArrayList<>();
    private static final ArrayList<Fragment> fragments = new ArrayList<>();

    public void addFragment(Fragment fragment, String title) {
        titles.add(title);
        fragments.add(fragment);
    }

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}


