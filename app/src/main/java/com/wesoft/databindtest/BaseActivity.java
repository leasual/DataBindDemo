package com.wesoft.databindtest;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by james.li on 2017/1/7.
 */

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    T mDataBinding;

    @LayoutRes
    public abstract int getContentView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDataBinding = DataBindingUtil.setContentView(this, getContentView());
    }
}
