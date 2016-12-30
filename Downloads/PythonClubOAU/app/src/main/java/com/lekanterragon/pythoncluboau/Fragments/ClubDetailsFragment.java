package com.lekanterragon.pythoncluboau.Fragments;

import android.webkit.WebView;

import com.blunderer.materialdesignlibrary.fragments.ViewPagerFragment;
import com.blunderer.materialdesignlibrary.fragments.ViewPagerWithTabsFragment;
import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.lekanterragon.pythoncluboau.R;
import com.lekanterragon.pythoncluboau.WhatWeDoFragment;

/**
 * Created by lekanterragon on 12/29/16.
 */
public class ClubDetailsFragment extends ViewPagerWithTabsFragment {
    @Override
    protected boolean expandTabs() {
        return true;
    }

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(getActivity())
                .addPage(R.string.meet_the_club,
                        new MainWebFragment());
    }
    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }
}
