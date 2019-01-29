package com.monk.customview.frompps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * 2018-01-08 配合ScrollView使用的GridView，避免在ScrollView中GridView只出现一个item 的情况
 * @author MonkeyHank
 * @date 2017-09-20 14:06
 */
public class ScrollGridView extends GridView {

    public ScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //此处是代码的关键
        //MeasureSpec.AT_MOST的意思就是wrap_content
        //Integer.MAX_VALUE >> 2 是使用最大值的意思,也就表示的无边界模式
        //Integer.MAX_VALUE >> 2 此处表示是父布局能够给他提供的大小
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
