package com.google.android.material.appbar;

import android.view.View;
import o.p4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p4 {
    public final /* synthetic */ AppBarLayout m;
    public final /* synthetic */ boolean n;

    public c(AppBarLayout appBarLayout, boolean z) {
        this.m = appBarLayout;
        this.n = z;
    }

    @Override // o.p4
    public final boolean c(View view) {
        this.m.setExpanded(this.n);
        return true;
    }
}
