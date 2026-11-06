package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.jp4;
import o.jq4;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements jq4 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(0));
    }

    @Override // o.jq4
    public final void b(jp4 jp4Var) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }
}
