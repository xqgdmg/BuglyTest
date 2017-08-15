package com.example.qhsj.buglytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTestJavaCrash;
    private Button btnTestANRCrash;
    private Button btnTestNativeCrash;
    private Button btnNullPointEX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTestJavaCrash = (Button) findViewById(R.id.btnTestJavaCrash);
        btnTestANRCrash = (Button) findViewById(R.id.btnTestANRCrash);
        btnTestNativeCrash = (Button)findViewById(R.id.btnTestNativeCrash);
        btnNullPointEX = (Button)findViewById(R.id.btnNullPointEX);
        btnTestJavaCrash.setOnClickListener(this);
        btnTestANRCrash.setOnClickListener(this);
        btnTestNativeCrash.setOnClickListener(this);
        btnNullPointEX.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTestJavaCrash: // 点击测试Java Crash
                CrashReport.testJavaCrash();
                break;
            case R.id.btnTestANRCrash: // 点击测试ANR Crash
                CrashReport.testANRCrash();
                break;
            case R.id.btnTestNativeCrash: // 点击测试Native Crash
                CrashReport.testNativeCrash();
                break;
            case R.id.btnNullPointEX: // 点击测试空指针异常（登录网页后，报错信息和logcat一模一样）
                ArrayList<String> list = null;
                list.add("a");
                break;
        }
    }
}
