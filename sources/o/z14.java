package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class z14 implements up {
    public final yc4 m;
    public final rn3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2662o;
    public final h50 p;

    public z14(yc4 yc4Var, rn3 rn3Var, boolean z) {
        yc4Var.getClass();
        rn3Var.getClass();
        this.m = yc4Var;
        this.n = rn3Var;
        this.f2662o = z;
        this.p = ((io3) yc4Var.m).a.c(new t(this, (byte) 19));
    }

    @Override // o.up
    public final boolean isEmpty() {
        return this.n.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        rn3 rn3Var = this.n;
        fx fxVarG0 = lv0.g0(rn3Var.getAnnotations());
        h50 h50Var = this.p;
        h50Var.getClass();
        h18 h18Var = new h18(fxVarG0, h50Var);
        sy4 sy4Var = qn3.a;
        return new el2(new fl2(bq6.g0(cx.A0(new zp6[]{h18Var, new fx(qn3.a(s87.m, rn3Var, this.m), (byte) 5)})), false, new fk6((byte) 12)));
    }

    @Override // o.up
    public final boolean o0(ht2 ht2Var) {
        return kh.u(this, ht2Var);
    }

    @Override // o.up
    public final hp u(ht2 ht2Var) {
        hp hpVar;
        ht2Var.getClass();
        rn3 rn3Var = this.n;
        q76 q76VarA = rn3Var.a(ht2Var);
        if (q76VarA != null && (hpVar = (hp) this.p.invoke(q76VarA)) != null) {
            return hpVar;
        }
        sy4 sy4Var = qn3.a;
        return qn3.a(ht2Var, rn3Var, this.m);
    }
}
