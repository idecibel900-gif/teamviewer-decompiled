package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h17 implements p01, Iterable, su3 {
    public int n;
    public int p;
    public int q;
    public boolean s;
    public int t;
    public HashMap v;
    public kw4 w;
    public int[] m = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f942o = new Object[0];
    public final Object r = new Object();
    public ArrayList u = new ArrayList();

    public final int a(px2 px2Var) {
        if (this.s) {
            i01.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!px2Var.a()) {
            up5.a("Anchor refers to a group that was removed");
        }
        return px2Var.a;
    }

    public final void b() {
        this.v = new HashMap();
    }

    public final g17 c() {
        if (this.s) {
            hk0.l("Cannot read while a writer is pending");
            return null;
        }
        this.q++;
        return new g17(this);
    }

    public final k17 d() {
        if (this.s) {
            i01.a("Cannot start a writer when another writer is pending");
        }
        if (this.q > 0) {
            i01.a("Cannot start a writer when a reader is pending");
        }
        this.s = true;
        this.t++;
        return new k17(this);
    }

    public final boolean f(px2 px2Var) {
        int iC;
        return px2Var.a() && (iC = j17.c(this.u, px2Var.a, this.n)) >= 0 && im3.n(this.u.get(iC), px2Var);
    }

    public final wx2 g(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.v;
        if (map != null) {
            if (this.s) {
                i01.a("use active SlotWriter to crate an anchor for location instead");
            }
            px2 px2Var = (i < 0 || i >= (i2 = this.n) || (iC = j17.c((arrayList = this.u), i, i2)) < 0) ? null : (px2) arrayList.get(iC);
            if (px2Var != null) {
                return (wx2) map.get(px2Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n33(this, 0, this.n);
    }
}
