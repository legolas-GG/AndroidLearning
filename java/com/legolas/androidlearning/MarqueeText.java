package com.legolas.androidlearning;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by legolas on 2016/3/17.
 */
public class MarqueeText extends TextView {
    public MarqueeText(Context context) {
        super(context);
    }

    public MarqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean isFocused(){
        return true;
    }
}
