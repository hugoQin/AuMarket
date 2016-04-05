package com.au.market.ui;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.au.market.R;
import com.au.market.base.FragmentActivityBase;
import com.au.market.ui.classify.ClassifyFragmentMain;
import com.au.market.ui.recommend.RecommendFragmentMain;
import com.au.market.ui.search.SearchActivityMain;
import com.au.market.ui.setting.SettingActivityMain;
import com.au.market.utils.L;
import com.au.market.utils.ScreenUtils;

public class ActivityMain extends FragmentActivityBase {


    private Button btnSetting;
    private Button btnSearch;
    private TextView tvRecommend;
    private TextView tvClassify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initListener();
        L.d("" + ScreenUtils.getScreenHeight(ActivityMain.this));
        L.d(""+ScreenUtils.getScreenWidth(ActivityMain.this));
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    protected void initView() {
        btnSearch = (Button) findViewById(R.id.btn_search);
        btnSetting = (Button) findViewById(R.id.btn_setting);
        tvRecommend = (TextView) findViewById(R.id.tv_recommend);
        tvClassify = (TextView) findViewById(R.id.tv_classify);
    }


    protected void initData() {

    }


    protected void initListener() {
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSearch();
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSetting();
            }
        });
        tvRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(getFragmentManager().beginTransaction(), new RecommendFragmentMain());
            }
        });
        tvClassify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(getFragmentManager().beginTransaction(), new ClassifyFragmentMain());
            }
        });

    }

    /**
     * go to search activity
     */
    private void startSearch() {
        appStartActivity(SearchActivityMain.class);
    }


    /**
     * go to setting activity
     */
    private void startSetting() {
        appStartActivity(SettingActivityMain.class);
    }

    /**
     * 切换fragment
     * @param fragmentTransaction
     * @param fragment
     */
    public static void changeFragment(FragmentTransaction fragmentTransaction, Fragment fragment) {
        fragmentTransaction.replace(R.id.fl_main_content, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
