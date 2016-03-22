package com.legolas.androidlearning;
//为按钮绑定事件使用View.OnClickListener、dialog绑定时间使用DialogInterface.OnClickListener方法
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by legolas on 2016/3/22.
 */
public class ButtonTest2 extends AppCompatActivity implements OnClickListener {
    private TextView showbtns;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button clear;
    private Button wr;
    private Button org;
    private Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_test2);
        context = this;
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        clear = (Button)findViewById(R.id.clear);
        wr = (Button)findViewById(R.id.color_wr);
        org = (Button)findViewById(R.id.color_org);
        showbtns = (TextView)findViewById(R.id.showbtns);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        clear.setOnClickListener(this);
        wr.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                * Context 上下文环境
                * compat 兼容性
                * */
                showbtns.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.white_red_bg));
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case(R.id.bt1):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("1");}
                else {showbtns.setText(showbtns.getText()+"1");}
                break;
            case(R.id.bt2):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("2");}
                else {showbtns.setText(showbtns.getText()+"2");}
                break;
            case(R.id.bt3):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("3");}
                else {showbtns.setText(showbtns.getText()+"3");}
                break;
            case(R.id.bt4):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("4");}
                else {showbtns.setText(showbtns.getText()+"4");}
                break;
            case(R.id.bt5):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("5");}
                else {showbtns.setText(showbtns.getText()+"5");}
                break;
            case(R.id.bt6):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("6");}
                else {showbtns.setText(showbtns.getText()+"6");}
                break;
            case(R.id.bt7):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("7");}
                else {showbtns.setText(showbtns.getText()+"7");}
                break;
            case(R.id.bt8):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("8");}
                else {showbtns.setText(showbtns.getText()+"8");}
                break;
            case(R.id.bt9):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("9");}
                else {showbtns.setText(showbtns.getText()+"9");}
                break;
            case(R.id.clear):
                if(showbtns.getText().equals("0"))
                { showbtns.setText("0");}
                else if(showbtns.getText().length()!=1){
                    showbtns.setText(showbtns.getText().subSequence(0,showbtns.getText().length()-1));}
                 else  showbtns.setText("0");
                break;
        }
    }
}
