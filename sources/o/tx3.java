package o;

import android.R;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class tx3 {
    public static final int[] s = {R.attr.state_checkable, R.attr.state_checked};
    public static final int[] t = {R.attr.state_pressed, R.attr.state_checkable, R.attr.state_checked};
    public static final int[] u = {R.attr.state_checkable};
    public static final int[] v = {R.attr.state_pressed, R.attr.state_checkable};
    public static final int[] w = new int[0];
    public static final int[] x = {R.attr.state_pressed};
    public int[] a;
    public CharSequence b;
    public Drawable c;
    public Drawable d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public CharSequence m;
    public CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2151o;
    public final vx3 p;
    public int q;
    public boolean r;

    public tx3(ux3 ux3Var) {
        this.p = ux3Var.h;
        this.f = ux3Var.b;
        this.e = ux3Var.a;
        this.g = ux3Var.c;
        this.f2151o = ux3Var.f;
    }

    public final int a(int i, int i2) {
        int i3 = ((this.e / 2) + this.i) - i;
        int i4 = ((this.f / 2) + this.j) - i2;
        return (i4 * i4) + (i3 * i3);
    }
}
