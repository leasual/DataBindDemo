package com.wesoft.databindtest;

import android.databinding.DataBindingUtil;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by james.li on 2017/1/7.
 */

public abstract class  BaseRecyclerViewAdapter extends RecyclerView.Adapter<BindingViewHolder> {

    @LayoutRes
    public abstract int getItemView();

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new BindingViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), getItemView(), parent, false));
    }
}
