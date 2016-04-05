package com.au.market.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by weiguangyu on 1/25/16.
 * 应用里所有字体用这个，这个可以过长滚动，以后扩展改字体
 */
public class MarketText extends TextView {

    private Context context;
    public MarketText(Context context) {
        super(context);
        this.context = context;
    }

    public MarketText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public MarketText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public boolean isFocused() {
        return true;
    }
    @Override
    public void setTypeface(Typeface tf, int style) {
        super.setTypeface(tf, style);
    }

//    public boolean dispatchTouchEvent(MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                this.setTextColor(context.getResources().getColor(R.color.list_item_album_text_select));
//                break;
//            case MotionEvent.ACTION_UP:
//
//                this.setTextColor(context.getResources().getColor(R.color.list_item_album_text_default));
//                break;
//        }
//        return true;
//    }
}
