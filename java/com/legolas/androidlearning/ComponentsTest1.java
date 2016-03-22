package com.legolas.androidlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import static android.widget.CompoundButton.*;

/**
 * Created by legolas on 2016/3/21.
 */
public class ComponentsTest1 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private CheckBox habits_1;
    private CheckBox habits_2;
    private CheckBox habits_3;
    private TextView showView;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.components_test1);
        showView = (TextView)findViewById(R.id.showView);
        habits_1 = (CheckBox)findViewById(R.id.habits1);
        habits_2 = (CheckBox)findViewById(R.id.habits2);
        habits_3 = (CheckBox)findViewById(R.id.habits3);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);

        radioGroup.setOnCheckedChangeListener(this);

        //通过设置checkBox的监听事件来对checkbox是不是被选中
        habits_1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    String text = habits_1.getText().toString();
                   showView.setText("tag："+text);
                }
            }
        });

    }//onCreate

    //重写RadioGroup.OnCheckedChangeListener接口中的onCheckedChanged方法
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch(checkedId){
            case R.id.radio1:
                showView.setText("radio1男被选中");
                break;
            case R.id.radio2:
                showView.setText("radio2女被选中");
        }
    }

}

