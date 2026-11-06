package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.p4;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p4 {
    public final /* synthetic */ CoordinatorLayout m;
    public final /* synthetic */ AppBarLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f39o;
    public final /* synthetic */ int p;
    public final /* synthetic */ AppBarLayout.BaseBehavior q;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.q = baseBehavior;
        this.m = coordinatorLayout;
        this.n = appBarLayout;
        this.f39o = view;
        this.p = i;
    }

    @Override // o.p4
    public final boolean c(View view) {
        this.q.y(this.m, this.n, this.f39o, this.p, new int[]{0, 0});
        return true;
    }
}
