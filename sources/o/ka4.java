package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ka4 implements Iterator {
    public ma4 m;
    public ma4 n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1246o;
    public final /* synthetic */ na4 p;
    public final /* synthetic */ byte q;

    public ka4(na4 na4Var, byte b) {
        this.q = b;
        this.p = na4Var;
        this.m = na4Var.f1558o.p;
        this.f1246o = na4Var.q;
    }

    public final ma4 a() {
        ma4 ma4Var = this.m;
        na4 na4Var = this.p;
        if (ma4Var == na4Var.f1558o) {
            yq4.p();
            return null;
        }
        if (na4Var.q != this.f1246o) {
            gk0.c();
            return null;
        }
        this.m = ma4Var.p;
        this.n = ma4Var;
        return ma4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m != this.p.f1558o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.q) {
            case 0:
                return a();
            default:
                return a().r;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        ma4 ma4Var = this.n;
        if (ma4Var == null) {
            throw new IllegalStateException();
        }
        na4 na4Var = this.p;
        na4Var.c(ma4Var, true);
        this.n = null;
        this.f1246o = na4Var.q;
    }
}
