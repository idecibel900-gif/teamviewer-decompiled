package com.teamviewer.remotecontrollib.gui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.teamviewer.teamviewer.market.mobile.R;
import o.cy3;
import o.dd3;
import o.l07;
import o.vx3;

/* JADX INFO: loaded from: classes.dex */
public final class M2MSpecialKeyboard extends cy3 {
    public M2MSpecialKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setPreviewEnabled(false);
        setKeyboard(new vx3(context, R.xml.m2m_keyboard));
    }

    public final void setKeyboardListeners(dd3 dd3Var) {
        l07 l07Var = new l07((byte) 11, false);
        l07Var.n = dd3Var;
        setOnKeyboardActionListener(l07Var);
    }
}
