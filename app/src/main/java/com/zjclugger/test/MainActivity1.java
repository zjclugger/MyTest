package com.zjclugger.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashSet;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);
        //建议添加tag标签，发送消息的之后就可以指定tag标签来发送了
        Set<String> set = new HashSet<>();
        set.add("zjcPublic");//名字任意，可多添加几个,能区别就好了
        JPushInterface.setTags(this, set, null);//设置标签
    }
}