package com.teamviewer.remotecontrollib.gui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;
import o.cy3;
import o.dd3;
import o.l07;
import o.vx3;

/* JADX INFO: loaded from: classes.dex */
public final class TVSpecialKeyboard extends cy3 {
    public final l07 P0;

    public TVSpecialKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setKeyboard(new vx3(getContext(), R.xml.keyboard));
        setPreviewEnabled(false);
        l07 l07Var = new l07((byte) 11, false);
        this.P0 = l07Var;
        setOnKeyboardActionListener(l07Var);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.special_keyboard_height);
        setMinimumHeight(dimensionPixelSize);
        getLayoutParams().height = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.special_keyboard_padding_horizontal);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.special_keyboard_padding_vertical);
        setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
    }

    @Override // o.cy3, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            paddingBottom = View.MeasureSpec.getSize(i2);
        } else {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getKeyboard().h;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), paddingBottom);
    }

    @Override // o.cy3, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setKeyboard(new vx3(getContext(), R.xml.keyboard));
    }

    public final void setTvKeyboard(dd3 dd3Var) {
        this.P0.n = dd3Var;
    }
}
