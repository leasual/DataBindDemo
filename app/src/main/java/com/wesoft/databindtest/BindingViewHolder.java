package com.wesoft.databindtest;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by james.li on 2017/1/7.
 */

public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder{
    private T mDataBinding;
    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mDataBinding = binding;
    }



    public T getDataBinding(){
        return mDataBinding;
    }
}
