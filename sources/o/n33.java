package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n33 implements Iterator, su3 {
    public final h17 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1536o;
    public final int p;

    public n33(h17 h17Var, int i, int i2) {
        this.m = h17Var;
        this.n = i2;
        this.f1536o = i;
        this.p = h17Var.t;
        if (h17Var.s) {
            j17.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1536o < this.n;
    }

    @Override // java.util.Iterator
    public final Object next() {
        h17 h17Var = this.m;
        int i = h17Var.t;
        int i2 = this.p;
        if (i != i2) {
            j17.e();
        }
        int i3 = this.f1536o;
        this.f1536o = h17Var.m[(i3 * 5) + 3] + i3;
        return new i17(h17Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
