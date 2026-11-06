package com.teamviewer.remotecontrolviewlib.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import o.im3;
import o.pc0;
import o.qz5;
import o.r47;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandablePanel extends ScrollView {
    public final TextView m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f68o;
    public final int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandablePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz5.a, 0, 0);
        this.f68o = typedArrayObtainStyledAttributes.getInt(1, 2);
        this.p = typedArrayObtainStyledAttributes.getInt(0, 100);
        String string = typedArrayObtainStyledAttributes.getString(2);
        string = string == null ? "" : string;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.expandable_panel_layout, (ViewGroup) this, false);
        addView(viewInflate);
        TextView textView = (TextView) r47.s(viewInflate, R.id.expandable_text);
        if (textView == null) {
            yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.expandable_text)));
            throw null;
        }
        this.m = textView;
        textView.setText(string);
        textView.post(new pc0(this, (byte) 8));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setText(String str) {
        str.getClass();
        TextView textView = this.m;
        if (textView == null) {
            im3.e0("expandableText");
            throw null;
        }
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setText(str);
        if (textView != null) {
            textView.post(new pc0(this, (byte) 8));
        } else {
            im3.e0("expandableText");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandablePanel(Context context) {
        this(context, null);
        context.getClass();
    }
}
