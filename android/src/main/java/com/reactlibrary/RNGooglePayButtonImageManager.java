package com.reactlibrary;

import android.view.LayoutInflater;
import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNGooglePayButtonImageManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "GooglePayButtonImageView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        return LayoutInflater.from(reactContext).inflate(
                R.layout.googlepay_button, null);
    }
}
