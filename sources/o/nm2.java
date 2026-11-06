package o;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nm2 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1578o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final ArrayList n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        mm2 mm2Var = (mm2) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - mm2Var.m()) - i);
        this.b = Math.min(this.b, (view.getTop() - mm2Var.n()) - i2);
        this.c = Math.max(this.c, mm2Var.s() + view.getRight() + i3);
        this.d = Math.max(this.d, mm2Var.l() + view.getBottom() + i4);
    }
}
