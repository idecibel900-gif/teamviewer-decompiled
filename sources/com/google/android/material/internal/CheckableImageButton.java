package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import o.be8;
import o.dq0;
import o.z30;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] s = {R.attr.state_checked};
    public boolean p;
    public boolean q;
    public boolean r;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.imageButtonStyle);
        this.q = true;
        this.r = true;
        be8.m(this, new z30(this, (byte) 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.p;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.p ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), s) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof dq0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dq0 dq0Var = (dq0) parcelable;
        super.onRestoreInstanceState(dq0Var.m);
        setChecked(dq0Var.f644o);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        dq0 dq0Var = new dq0(super.onSaveInstanceState());
        dq0Var.f644o = this.p;
        return dq0Var;
    }

    public void setCheckable(boolean z) {
        if (this.q != z) {
            this.q = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.q || this.p == z) {
            return;
        }
        this.p = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.r = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.r) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.p);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
