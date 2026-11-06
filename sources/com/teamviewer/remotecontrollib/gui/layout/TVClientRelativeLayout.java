package com.teamviewer.remotecontrollib.gui.layout;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import o.au2;
import o.bf1;
import o.h57;
import o.hk0;
import o.m26;
import o.oi7;
import o.pn5;
import o.ve8;
import o.vt1;
import o.w86;
import o.wt3;
import o.xt2;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class TVClientRelativeLayout extends RelativeLayout {
    public final oi7 m;

    public TVClientRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        Context baseContext = new ContextWrapper(context).getBaseContext();
        baseContext.getClass();
        xt2 xt2Var = (xt2) baseContext;
        m26 m26Var = new m26(au2Var, (byte) 2);
        ve8 g0 = xt2Var.getG0();
        bf1 bf1VarK = h57.k(xt2Var);
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(g0, m26Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(oi7.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            this.m = (oi7) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            hk0.g("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Context baseContext = new ContextWrapper(getContext()).getBaseContext();
        baseContext.getClass();
        Rect rect = new Rect();
        ((xt2) baseContext).getWindow().peekDecorView().getWindowVisibleDisplayFrame(rect);
        int i3 = rect.top;
        int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize = i3 + (identifier != 0 ? Resources.getSystem().getDimensionPixelSize(identifier) : 0);
        int height = getHeight();
        oi7 oi7Var = this.m;
        EventHub eventHub = oi7Var.n;
        if (height != 0 && size != 0 && height != size) {
            if (height > size + dimensionPixelSize) {
                EventHub.e(eventHub, EventType.EVENT_SOFT_KEYBOARD_SHOWN);
                ye4.a("TVClientRelativeLayout", "onMeasure(): softkeyboardShown triggered");
                oi7Var.f1657o = true;
            } else if (oi7Var.f1657o && height + dimensionPixelSize < size) {
                EventHub.e(eventHub, EventType.EVENT_SOFT_KEYBOARD_HIDDEN);
                ye4.a("TVClientRelativeLayout", "onMeasure(): softkeyboardHidden triggered");
                oi7Var.f1657o = false;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TVClientRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TVClientRelativeLayout(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
