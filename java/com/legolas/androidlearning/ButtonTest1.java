package com.legolas.androidlearning;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by legolas on 2016/3/19.
 */
public class ButtonTest1 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private EditText editText;
    private ImageButton imgbtn1;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private ToggleButton togglebtn;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_test1);

        imgbtn1 = (ImageButton) findViewById(R.id.imagebtn1);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        editText = (EditText)findViewById(R.id.editText1);
        togglebtn = (ToggleButton)findViewById(R.id.togglebtn);
        imageView = (ImageView)findViewById(R.id.imageView);

        //给当前的ToggleButton设置监听器
        togglebtn.setOnCheckedChangeListener(this);

        /*监听事件通过第一种方式：匿名内部类*/
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText("btn1被单击了");
            }
        });

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("imagebtn1被单击了");
            }
        });

        //监听事件第二种方式：独立外部类(使用外部类可以让所有使用该类的事件执行同一个父类方法，
        // 避免了内部类形式，多次调用同一个方法产生的代码冗余)
        btn2.setOnClickListener(new MyOnclickListener() {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Toast.makeText(ButtonTest1.this, "btn2要执行的逻辑", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new MyOnclickListener() {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Toast.makeText(ButtonTest1.this, "btn3要执行的逻辑", Toast.LENGTH_LONG).show();
            }
        });
        //事件监听第三种方法：接口实现方式

    }/*onCreate*/

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        /*
        * 当ToggleButton被点击的时候，当前方法会被执行
        * buttonView代表被点击的控件本身
        * isChecked代表被点击的控件的状态
        * */
        imageView.setBackgroundColor(isChecked ?Color.rgb(0, 0, 0) :Color.rgb(255, 251, 240));

    }

}/*ButtonTest1*/

//独立监听类
class MyOnclickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        //让所有使用当前外部类的点击事件都作出同一个动作，改变button本身的透明度
        v.setAlpha(0.5f);
    }
}