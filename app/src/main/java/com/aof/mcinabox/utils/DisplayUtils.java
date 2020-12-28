package com.aof.mcinabox.utils;

import android.content.res.Resources;

public class DisplayUtils {

    public static int getPxFromDp(float dpValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5f);
    }

    public static float getDpFromPx(float pxValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (pxValue/scale);
    }

    public static int getPxFromSp(float spValue){
        final float fontScale = Resources.getSystem().getDisplayMetrics().scaledDensity;
        return (int)(spValue * fontScale + 0.5f);
    }

    public static float getSpFromPx(float pxValue) {
        final float fontScale = Resources.getSystem().getDisplayMetrics().scaledDensity;
        return (pxValue/fontScale);
    }

    public static float getPercentageFromPx(float pxValue, boolean isWidth){
        return (pxValue*100/(isWidth ? Resources.getSystem().getDisplayMetrics().widthPixels : Resources.getSystem().getDisplayMetrics().heightPixels));
    }

    public static float getPxFromPercentage(float percentageValue, boolean isWidth){
        return (percentageValue*(isWidth ? Resources.getSystem().getDisplayMetrics().widthPixels : Resources.getSystem().getDisplayMetrics().heightPixels)/100);
    }


}
