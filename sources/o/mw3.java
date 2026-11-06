package o;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mw3 extends vt3 implements fw3 {
    public static final Object x = new Object();
    public final ou3 r;
    public final String s;
    public final String t;
    public final Object u;
    public final u14 v;
    public final u86 w;

    public mw3(ou3 ou3Var, String str, String str2, du5 du5Var, Object obj) {
        this.r = ou3Var;
        this.s = str;
        this.t = str2;
        this.u = obj;
        this.v = ds1.X(l54.m, new gw3(this, (byte) 0));
        this.w = et1.F(du5Var, new gw3(this, (byte) 1));
    }

    public final Member A() {
        if (!w().C()) {
            return null;
        }
        js0 js0Var = og6.a;
        zu1 zu1VarB = og6.b(w());
        if (zu1VarB instanceof ws3) {
            ws3 ws3Var = (ws3) zu1VarB;
            ty4 ty4Var = ws3Var.g;
            dt3 dt3Var = ws3Var.f;
            if ((dt3Var.n & 16) == 16) {
                bt3 bt3Var = dt3Var.s;
                int i = bt3Var.n;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.r.i(ty4Var.getString(bt3Var.f453o), ty4Var.getString(bt3Var.p));
            }
        }
        return (Field) this.v.getValue();
    }

    public final Object B() {
        return n67.i(this.u, w());
    }

    @Override // o.vt3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final bu5 w() {
        Object objA = this.w.a();
        objA.getClass();
        return (bu5) objA;
    }

    public abstract jw3 D();

    public final boolean equals(Object obj) {
        mw3 mw3VarC = pa8.c(obj);
        return mw3VarC != null && im3.n(this.r, mw3VarC.r) && im3.n(this.s, mw3VarC.s) && im3.n(this.t, mw3VarC.t) && im3.n(this.u, mw3VarC.u);
    }

    @Override // o.rt3
    public final String getName() {
        return this.s;
    }

    public final int hashCode() {
        return this.t.hashCode() + to7.e(this.r.hashCode() * 31, 31, this.s);
    }

    @Override // o.rt3
    public final boolean l() {
        return false;
    }

    @Override // o.vt3
    public final mj0 t() {
        return D().t();
    }

    public final String toString() {
        qo1 qo1Var = z86.a;
        return z86.c(w());
    }

    @Override // o.vt3
    public final ou3 u() {
        return this.r;
    }

    @Override // o.vt3
    public final mj0 v() {
        D().getClass();
        return null;
    }

    @Override // o.vt3
    public final boolean z() {
        return this.u != bj0.NO_RECEIVER;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mw3(ou3 ou3Var, du5 du5Var) {
        String strB = du5Var.getName().b();
        strB.getClass();
        this(ou3Var, strB, og6.b(du5Var).m(), du5Var, bj0.NO_RECEIVER);
    }
}
