package com.lekanterragon.pythoncluboau.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewFragment;
import android.widget.ScrollView;
import android.widget.TextView;

import com.blunderer.materialdesignlibrary.fragments.ScrollViewFragment;
import com.blunderer.materialdesignlibrary.views.CardView;
import com.lekanterragon.pythoncluboau.R;

import im.delight.android.webview.AdvancedWebView;

/**
 * Created by lekanterragon on 12/29/16.
 */
public class MainWebFragment extends Fragment implements AdvancedWebView.Listener {
    private AdvancedWebView mWebView;

    public MainWebFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        mWebView = (AdvancedWebView) rootView.findViewById(R.id.webview);
        mWebView.setListener(getActivity(), this);
        mWebView.loadUrl("http://pythoncluboau.pythonanywhere.com/");

        // ...

        return rootView;
    }


    @SuppressLint("NewApi")
    @Override
    public void onResume() {
        super.onResume();
        mWebView.onResume();
        // ...
    }

    @SuppressLint("NewApi")
    @Override
    public void onPause() {
        mWebView.onPause();
        // ...
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mWebView.onDestroy();
        // ...
        super.onDestroy();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        mWebView.onActivityResult(requestCode, resultCode, intent);
        // ...
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) { }

    @Override
    public void onPageFinished(String url) { }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) { }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) { }

    @Override
    public void onExternalPageRequest(String url) { }
}

