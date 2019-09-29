package com.example.administrator.umdemo;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.umeng.analytics.MobclickAgent;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button bt_one;
    private Button bt_tow;
    private Button bt_three;
    private Button bt_four;

    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        bt_one = (Button) findViewById(R.id.bt_one);
        bt_tow = (Button) findViewById(R.id.bt_tow);
        bt_three = (Button) findViewById(R.id.bt_three);
        bt_four = (Button) findViewById(R.id.bt_four);
        bt_one.setOnClickListener(this);
        bt_tow.setOnClickListener(this);
        bt_three.setOnClickListener(this);
        bt_four.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_one:
                startActivity(new Intent(this,PageActivity.class));
                MobclickAgent.onEvent(this,"bt_one");//参数二为当前统计的事件ID
                break;
            case R.id.bt_tow:
                startActivity(new Intent(this,PageActivity.class));
                MobclickAgent.onEvent(this,"bt_tow");//参数二为当前统计的事件ID
                break;
            case R.id.bt_three:
                startActivity(new Intent(this,PageActivity.class));
                MobclickAgent.onEvent(this,"bt_three");//参数二为当前统计的事件ID
                break;
            case R.id.bt_four:
                startActivity(new Intent(this,PageActivity.class));
                MobclickAgent.onEvent(this,"bt_four");//参数二为当前统计的事件ID
                break;
        }
    }
}
