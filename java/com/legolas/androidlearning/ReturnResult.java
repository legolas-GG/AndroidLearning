package com.legolas.androidlearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by legolas on 2016/3/19.
 */
public class ReturnResult extends AppCompatActivity{
    private Button returnResult;
    String content = "你好";
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.return_result);
        /*
        * 第二个页面什么时候回传数据
        * */
        returnResult = (Button)findViewById(R.id.returnResult);
        returnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("data", content);
                setResult(2, data);
                //结束（销毁）当前页面（自动回到上一个页面）
                finish();
            }
        }
        );
    }
}
