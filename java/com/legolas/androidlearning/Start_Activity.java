package com.legolas.androidlearning;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;//按钮绑定事件记得导view.View.OnClickListener包
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by legolas on 2016/3/17.
 */
public class Start_Activity extends AppCompatActivity {
    private Button buttonType;
    private Button buttonType2;
    private Button textviewType;
    private Button imageType;
    private Button returnResult;
    private TextView textShow;
    private Context mContext;
    private Button components;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_view);
        mContext = this;
        buttonType = (Button)findViewById(R.id.buttontype);
        textviewType = (Button)findViewById(R.id.textviewtype);
        imageType = (Button)findViewById(R.id.imagetype);
        returnResult = (Button)findViewById(R.id.returnResult);
        textShow = (TextView)findViewById(R.id.textShow);
        components = (Button)findViewById(R.id.components);
        buttonType2 = (Button)findViewById(R.id.buttontype2);
        buttonType2.setOnClickListener(new OnClickListener(){
            @Override
        public void onClick(View v){
                Intent intent = new Intent(mContext,ButtonTest2.class);
                startActivity(intent);
            }
        });
        components.setOnClickListener(new OnClickListener() {
            @Override
            /*无返回值的页面跳转*/
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ComponentsTest1.class);
                startActivity(intent);
            }
        });
        buttonType.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ButtonTest1.class);
                startActivity(intent);
            }
        });
        textviewType.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, TextViewTest1.class);
                startActivity(intent);
            }
        });
        imageType.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ImageTest1.class);
                startActivity(intent);
            }
        });
        returnResult.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                /*第一个参数是Intent对象
                * 第二个参数是请求的一个标识
                * */
                Intent intent = new Intent(mContext,ReturnResult.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    /*
    * requestCode:请求的标识
    * resultCode:第二个页面返回的标识
    * data：第二个页面回传的数据
    * */
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==2){
         String content =  data.getStringExtra("data");
        textShow.setText(content);
        }
    }
}
