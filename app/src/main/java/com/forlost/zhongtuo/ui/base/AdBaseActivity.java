package com.forlost.zhongtuo.ui.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;

import com.forlost.zhongtuo.activity.LoginActivity;
import com.forlost.zhongtuo.helper.ApplicationHelper;

/**
 * 需要登录状态验证的页面
 * Created by LQBO on 2017/6/26.
 * email 149296291@qq.com
 */
public class AdBaseActivity extends MyBaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!ApplicationHelper.getInstance().isLogined()){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
