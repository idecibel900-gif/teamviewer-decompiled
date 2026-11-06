package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public class i48 {
    public final boolean a;
    public final boolean b;
    public final xs0 c;
    public final tz3 d;
    public int e;
    public ArrayDeque f;
    public v17 g;

    public i48(boolean z, boolean z2, xs0 xs0Var, tz3 tz3Var, uz3 uz3Var) {
        this.a = z;
        this.b = z2;
        this.c = xs0Var;
        this.d = tz3Var;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f;
        arrayDeque.getClass();
        arrayDeque.clear();
        v17 v17Var = this.g;
        v17Var.getClass();
        v17Var.clear();
    }

    public boolean b(sz3 sz3Var, sz3 sz3Var2) {
        return true;
    }

    public final void c() {
        if (this.f == null) {
            this.f = new ArrayDeque(4);
        }
        if (this.g == null) {
            this.g = new v17();
        }
    }
}
