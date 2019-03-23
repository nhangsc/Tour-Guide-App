package com.example.mytour;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {


    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) { return new EatFragment(); }
        else if (position == 1){ return new VisitFragment(); }
        else if (position == 2){ return new ShopFragment(); }
        else { return new StayFragment();
        }
    }
    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_eat);
        } else if (position == 1) {
            return mContext.getString(R.string.category_visit);
        } else if (position == 2) {
            return mContext.getString(R.string.category_shop);
        } else {
            return mContext.getString(R.string.category_stay);
        }


    }
}