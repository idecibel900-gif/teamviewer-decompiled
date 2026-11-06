package o;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class lv3 extends ou3 {
    public final Class n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u14 f1410o = ds1.X(l54.m, new gv3(this, 0));

    public lv3(Class cls) {
        this.n = cls;
    }

    @Override // o.vr0
    public final Class a() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lv3) {
            return this.n.equals(((lv3) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // o.ou3
    public final Collection n() {
        return ea2.m;
    }

    @Override // o.ou3
    public final Collection q(sy4 sy4Var) {
        u86 u86Var = ((jv3) this.f1410o.getValue()).d;
        fw3 fw3Var = jv3.g[1];
        Object objA = u86Var.a();
        objA.getClass();
        return ((zo4) objA).a(sy4Var, t35.n);
    }

    @Override // o.ou3
    public final bu5 r(int i) {
        g38 g38Var = (g38) ((jv3) this.f1410o.getValue()).f.getValue();
        if (g38Var == null) {
            return null;
        }
        qs3 qs3Var = (qs3) g38Var.m;
        mv5 mv5Var = (mv5) g38Var.n;
        ps3 ps3Var = (ps3) g38Var.f855o;
        my2 my2Var = jt3.n;
        my2Var.getClass();
        qv5 qv5Var = (qv5) it1.D(mv5Var, my2Var, i);
        if (qv5Var == null) {
            return null;
        }
        gw5 gw5Var = mv5Var.s;
        gw5Var.getClass();
        return (bu5) pa8.f(this.n, qv5Var, qs3Var, new d22(gw5Var), ps3Var, kv3.n);
    }

    @Override // o.ou3
    public final Class t() {
        Class cls = (Class) ((jv3) this.f1410o.getValue()).e.getValue();
        return cls == null ? this.n : cls;
    }

    public final String toString() {
        return "file class " + p76.a(this.n).a();
    }

    @Override // o.ou3
    public final Collection u(sy4 sy4Var) {
        u86 u86Var = ((jv3) this.f1410o.getValue()).d;
        fw3 fw3Var = jv3.g[1];
        Object objA = u86Var.a();
        objA.getClass();
        return ((zo4) objA).d(sy4Var, t35.n);
    }
}
