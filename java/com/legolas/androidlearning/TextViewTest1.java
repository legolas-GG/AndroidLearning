package com.legolas.androidlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * Created by legolas on 2016/3/19.
 */
public class TextViewTest1 extends AppCompatActivity{
    private AutoCompleteTextView acTextView;
    private MultiAutoCompleteTextView multiacTextView;
    //初始化数据源：去匹配文本框输入的内容
    private String[] res = {"bejing1" , "beijing2" , "beijing3" , "shanghai1", "shanghai2"};
    @Override
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);
        setContentView(R.layout.textview_test1);

         /*1、初始化当前所需要的控件*/
        acTextView = (AutoCompleteTextView)findViewById(R.id.autoTextView);
        multiacTextView = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoTextView);
        //定义一个适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        //将adapter与当前AutoCompleteTextView绑定
        acTextView.setAdapter(adapter);
        multiacTextView.setAdapter(adapter);
        //设置以逗号为分隔符继续进行匹配
        multiacTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


    }
}
