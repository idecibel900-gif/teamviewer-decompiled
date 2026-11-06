package com.teamviewer.remotecontrolviewlib.layout;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import io.sentry.android.core.d;
import o.ue0;
import o.wl7;

/* JADX INFO: loaded from: classes.dex */
public final class TVTabOutsideLinearLayout extends LinearLayout {
    public final Rect m;
    public wl7 n;

    public TVTabOutsideLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = new Rect();
    }

    public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int childCount = viewGroup.getChildCount();
        boolean zA = true;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof EditText) {
                    Rect rect = this.m;
                    ((EditText) childAt).getGlobalVisibleRect(rect);
                    if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        return false;
                    }
                } else if ((childAt instanceof ViewGroup) && !(zA = a((ViewGroup) childAt, motionEvent))) {
                    return zA;
                }
            }
        }
        return zA;
    }

    public final wl7 getOnClickOutsideEditTextsListener() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d dVar;
        SearchView searchView;
        motionEvent.getClass();
        if (motionEvent.getAction() == 0 && a(this, motionEvent)) {
            wl7 wl7Var = this.n;
            if (wl7Var == null || (dVar = ((ue0) wl7Var).m.s0) == null || (searchView = (SearchView) dVar.n) == null || !searchView.hasFocus()) {
                Object systemService = getContext().getApplicationContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                SearchView searchView2 = (SearchView) dVar.n;
                searchView2.getClass();
                searchView2.clearFocus();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnClickOutsideEditTextsListener(wl7 wl7Var) {
        this.n = wl7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TVTabOutsideLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TVTabOutsideLinearLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
