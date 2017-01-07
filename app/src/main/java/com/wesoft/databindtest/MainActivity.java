package com.wesoft.databindtest;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.wesoft.databindtest.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecyclerView();
    }

    public void initRecyclerView(){
        mDataBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDataBinding.recyclerView.setAdapter(new UserAdapter(createTestData()));
    }

    public List<User> createTestData(){
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User("test" + i, "Alex" + i);
            userList.add(user);
        }
        return userList;
    }
}
