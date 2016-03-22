package com.legolas.androidlearning;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
public class ImageTest1 extends AppCompatActivity {
    private Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将布局XML文件引入到activity当中
        setContentView(R.layout.image_test1);
        backBtn = (Button)findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
        //TODO Auto-generated method stub
                Intent intent =new Intent(ImageTest1.this,Start_Activity.class);
                ImageTest1.this.startActivity(intent);
            }
        });

    }//onCreate


}//ImageTest1

