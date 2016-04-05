package com.au.market.ui.classify;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.au.market.R;
import com.au.market.ui.ActivityMain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weiguangyu on 4/2/16.
 */
public class ClassifyFragmentMain extends Fragment {

    private ActivityMain activity;


    public ClassifyFragmentMain() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.classify_fragment_main, container, false);
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