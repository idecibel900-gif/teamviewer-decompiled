package com.teamviewer.remotecontrolviewlib.view.session;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.p2;
import o.b26;
import o.b7;
import o.im3;
import o.kd3;
import o.nw4;
import o.py5;
import o.q16;
import o.r16;
import o.x16;

/* JADX INFO: loaded from: classes.dex */
public final class RcSessionExtraToolbarView extends LinearLayout {
    public static final /* synthetic */ int n = 0;
    public b26 m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RcSessionExtraToolbarView(Context context) {
        this(context, null, 14);
        context.getClass();
    }

    public final void a(ViewGroup viewGroup, LayoutInflater layoutInflater, x16 x16Var, RCClientActivity rCClientActivity) {
        KeyEvent.Callback callbackInflate = layoutInflater.inflate(R.layout.view_rcsession_toolbar_extra_button, (ViewGroup) this, false);
        callbackInflate.getClass();
        ImageView imageView = ((kd3) callbackInflate).getImageView();
        b26 b26Var = this.m;
        if (b26Var == null) {
            im3.e0("toolbarViewModel");
            throw null;
        }
        nw4 nw4Var = b26Var.f2259o;
        byte b = 28;
        x16Var.b.observe(rCClientActivity, new b7(new q16(imageView, (byte) 3), b));
        byte b2 = 1;
        x16Var.d.observe(rCClientActivity, new b7(new r16(nw4Var, imageView, b2), b));
        x16Var.e.observe(rCClientActivity, new b7(new q16(imageView, (byte) 4), b));
        x16Var.f.observe(rCClientActivity, new b7(new py5(imageView, x16Var, b2), b));
        imageView.setOnClickListener(new p2(x16Var, (byte) 17));
        x16Var.c.observe(rCClientActivity, new b7(new q16(imageView, (byte) 5), b));
        if (x16Var.h) {
            imageView.setBackground(null);
        }
        viewGroup.addView(imageView);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RcSessionExtraToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    public RcSessionExtraToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
    }
}
