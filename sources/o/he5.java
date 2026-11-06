package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class he5 {
    public static final e87 l = new e87(0.8f, 380.0f, Float.valueOf(1.0f));
    public static final at4 m = new at4((byte) 26);
    public final Function1 a;
    public final bg5 b;
    public final bg5 c;
    public final bg5 d;
    public final yf5 e;
    public int f;
    public final bg5 g;
    public in1 h;
    public j04 i;
    public final iy4 j;
    public final g95 k;

    public he5(ie5 ie5Var, Function1 function1) {
        this.a = function1;
        this.b = h57.p(ie5Var);
        Boolean bool = Boolean.FALSE;
        this.c = h57.p(bool);
        this.d = h57.p(bool);
        this.e = new yf5(-1);
        this.f = -1;
        this.g = h57.p(ea2.m);
        long[] jArr = lg4.a;
        new vk1(this, (byte) 1);
        this.j = new iy4();
        this.k = new g95(this);
    }

    public final int a() {
        return b().c.z();
    }

    public final ie5 b() {
        return (ie5) this.b.getValue();
    }

    public final int c() {
        yf5 yf5Var = this.e;
        if (yf5Var.z() == -1 || b().a.z() == -1) {
            return -1;
        }
        return ct1.v(b().a.z(), 0, yf5Var.z());
    }

    public final boolean d() {
        return ((Boolean) this.c.getValue()).booleanValue() || ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void e(int i) {
        int iV = ct1.v(i, 0, this.e.z());
        if (iV == b().c.z()) {
            return;
        }
        b().c.A(iV);
        this.f = iV;
    }
}
