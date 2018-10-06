package com.example.kennyrep.tabexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by KENNYREP on 10/6/2018.
 */


    public	class	PagerAdapter	extends FragmentStatePagerAdapter {
        int	mNumOfTabs = 3;
        public	PagerAdapter(FragmentManager fm,	int	NumOfTabs)	{
            super(fm);
            this.mNumOfTabs	=	NumOfTabs;
        }

    @Override
    public	Fragment	getItem(int	position)	{
        switch	(position)	{
            case	0:
                return	new	TabFragment1();
            case	1:
                return	new	TabFragment2();
            case	2:
                return	new	TabFragment3();
            default:
                return	null;
        }
    }

    @Override
    public	int	getCount()	{
        return	mNumOfTabs;
    }
}

