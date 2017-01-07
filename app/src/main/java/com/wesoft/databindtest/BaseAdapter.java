package com.wesoft.databindtest;

import java.util.List;

/**
 * Created by james.li on 2017/1/7.
 */

public abstract class BaseAdapter<T> extends BaseRecyclerViewAdapter {


    private List<T> mDataList;
    public BaseAdapter(List<T> dataList) {
        this.mDataList = dataList;
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        T item = mDataList.get(position);
        holder.getDataBinding().setVariable(com.wesoft.databindtest.BR.item, item);
        holder.getDataBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
