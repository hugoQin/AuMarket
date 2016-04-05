package com.au.market.ui.recommend;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.au.market.R;
import com.au.market.ui.ActivityMain;

/**
 * Created by weiguangyu on 4/2/16.
 */
public class RecommendFragmentMain extends Fragment {

    private ActivityMain activity;


    public RecommendFragmentMain() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recommend_fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        activity = (ActivityMain) getActivity();
        initView();
        initData();
        initListener();
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();

    }
    private void initView() {

    }

    private void initData() {

    }

    private void initListener() {

    }



}