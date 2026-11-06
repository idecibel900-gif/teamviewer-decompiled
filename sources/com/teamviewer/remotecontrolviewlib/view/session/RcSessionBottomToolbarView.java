package com.teamviewer.remotecontrolviewlib.view.session;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.p2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o.b7;
import o.g95;
import o.gk0;
import o.im3;
import o.kd3;
import o.mc3;
import o.nc3;
import o.nw4;
import o.o16;
import o.p16;
import o.q16;
import o.r16;
import o.uz7;

/* JADX INFO: loaded from: classes.dex */
public final class RcSessionBottomToolbarView extends FrameLayout {
    public static final /* synthetic */ int s = 0;
    public FloatingActionButton m;
    public final LinkedHashMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public uz7 f71o;
    public LiveData p;
    public g95 q;
    public final nw4 r;

    public RcSessionBottomToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.n = new LinkedHashMap();
        this.r = new nw4();
    }

    public final void a(ViewGroup viewGroup, ArrayList arrayList, uz7 uz7Var, LayoutInflater layoutInflater, RCClientActivity rCClientActivity) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o16 o16Var = (o16) it.next();
            KeyEvent.Callback callbackInflate = layoutInflater.inflate(R.layout.view_rcsession_toolbar_bottom_button, (ViewGroup) this, false);
            callbackInflate.getClass();
            kd3 kd3Var = (kd3) callbackInflate;
            ImageView imageView = kd3Var.getImageView();
            nw4 nw4Var = uz7Var.f2259o;
            byte b = 26;
            o16Var.c.observe(rCClientActivity, new b7(new q16(imageView, (byte) 0), b));
            o16Var.d.observe(rCClientActivity, new b7(new r16(nw4Var, imageView, (byte) 0), b));
            o16Var.e.observe(rCClientActivity, new b7(new q16(imageView, (byte) 1), b));
            imageView.setOnClickListener(new p2(o16Var, (byte) 16));
            o16Var.b.observe(rCClientActivity, new b7(new q16(imageView, (byte) 2), b));
            LiveData liveData = this.p;
            if (liveData == null) {
                im3.e0("someKeyboardIsShowing");
                throw null;
            }
            liveData.observe(rCClientActivity, new b7(new p16(this, (byte) 2), b));
            viewGroup.addView(imageView);
            mc3 mc3Var = o16Var.f;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.rc_session_toolbar_icon_spacing);
                int iOrdinal = mc3Var.ordinal();
                if (iOrdinal == 0) {
                    ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(dimensionPixelSize);
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return;
                    }
                    ((LinearLayout.LayoutParams) layoutParams).setMarginStart(dimensionPixelSize);
                }
            }
            int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.rc_session_toolbar_icon_padding);
            imageView.setPaddingRelative(0, dimensionPixelSize2, 0, dimensionPixelSize2);
            this.n.put(Integer.valueOf(o16Var.a), kd3Var);
        }
    }

    public final void b() {
        uz7 uz7Var = this.f71o;
        if (uz7Var == null) {
            im3.e0("toolbarViewModel");
            throw null;
        }
        if (uz7Var.X0()) {
            return;
        }
        uz7 uz7Var2 = this.f71o;
        if (uz7Var2 == null) {
            im3.e0("toolbarViewModel");
            throw null;
        }
        uz7Var2.f2259o.setValue(Boolean.TRUE);
        g95 g95Var = this.q;
        if (g95Var != null) {
            ((nc3) g95Var.m).E();
        }
    }

    public final void c() {
        FloatingActionButton floatingActionButton = this.m;
        if (floatingActionButton == null) {
            im3.e0("toolbarFabView");
            throw null;
        }
        if (floatingActionButton.isShown()) {
            FloatingActionButton floatingActionButton2 = this.m;
            if (floatingActionButton2 == null) {
                im3.e0("toolbarFabView");
                throw null;
            }
            floatingActionButton2.f(true);
        }
        uz7 uz7Var = this.f71o;
        if (uz7Var == null) {
            im3.e0("toolbarViewModel");
            throw null;
        }
        if (uz7Var.X0()) {
            uz7 uz7Var2 = this.f71o;
            if (uz7Var2 != null) {
                uz7Var2.f2259o.setValue(Boolean.FALSE);
            } else {
                im3.e0("toolbarViewModel");
                throw null;
            }
        }
    }

    public final void d(boolean z) {
        if (z) {
            FloatingActionButton floatingActionButton = this.m;
            if (floatingActionButton == null) {
                im3.e0("toolbarFabView");
                throw null;
            }
            if (floatingActionButton.isShown()) {
                FloatingActionButton floatingActionButton2 = this.m;
                if (floatingActionButton2 == null) {
                    im3.e0("toolbarFabView");
                    throw null;
                }
                floatingActionButton2.f(true);
            }
            LiveData liveData = this.p;
            if (liveData == null) {
                im3.e0("someKeyboardIsShowing");
                throw null;
            }
            Object value = liveData.getValue();
            Boolean bool = Boolean.TRUE;
            if (im3.n(value, bool)) {
                return;
            }
            uz7 uz7Var = this.f71o;
            if (uz7Var == null) {
                im3.e0("toolbarViewModel");
                throw null;
            }
            if (im3.n(uz7Var.n.getValue(), bool)) {
                return;
            }
            uz7 uz7Var2 = this.f71o;
            if (uz7Var2 != null) {
                uz7Var2.n.setValue(bool);
                return;
            } else {
                im3.e0("toolbarViewModel");
                throw null;
            }
        }
        uz7 uz7Var3 = this.f71o;
        if (uz7Var3 == null) {
            im3.e0("toolbarViewModel");
            throw null;
        }
        Object value2 = uz7Var3.n.getValue();
        Boolean bool2 = Boolean.TRUE;
        if (im3.n(value2, bool2)) {
            uz7 uz7Var4 = this.f71o;
            if (uz7Var4 == null) {
                im3.e0("toolbarViewModel");
                throw null;
            }
            uz7Var4.n.setValue(Boolean.FALSE);
        }
        LiveData liveData2 = this.p;
        if (liveData2 == null) {
            im3.e0("someKeyboardIsShowing");
            throw null;
        }
        if (im3.n(liveData2.getValue(), bool2)) {
            return;
        }
        FloatingActionButton floatingActionButton3 = this.m;
        if (floatingActionButton3 == null) {
            im3.e0("toolbarFabView");
            throw null;
        }
        if (floatingActionButton3.isShown()) {
            return;
        }
        FloatingActionButton floatingActionButton4 = this.m;
        if (floatingActionButton4 != null) {
            floatingActionButton4.h(true);
        } else {
            im3.e0("toolbarFabView");
            throw null;
        }
    }

    public final nw4 getVisible() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.resolveSize(getSuggestedMinimumHeight(), i2), Integer.MIN_VALUE);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        setMeasuredDimension(i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RcSessionBottomToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RcSessionBottomToolbarView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
