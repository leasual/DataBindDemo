package com.wesoft.databindtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.wesoft.databindtest.databinding.ListItemUserBinding;

import java.util.List;

/**
 * Created by james.li on 2017/1/7.
 */

public class UserAdapter extends BaseAdapter {
    private Context mContext;
    public UserAdapter(List dataList) {
        super(dataList);
    }

    @Override
    public int getItemView() {
        return R.layout.list_item_user;
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(final BindingViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);
        ListItemUserBinding binding = (ListItemUserBinding)holder.getDataBinding();
        binding.userName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "click " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
