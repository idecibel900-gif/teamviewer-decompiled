package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yy0 implements hw2, iw2, jw2, kw2, lw2, mw2, nw2, ow2, uv2, vv2, xv2, yv2, zv2, aw2, bw2, cw2, dw2, ew2, fw2 {
    public final int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public pw2 f2654o;
    public j56 p;
    public ArrayList q;

    public yy0(int i, boolean z, pw2 pw2Var) {
        this.m = i;
        this.n = z;
        this.f2654o = pw2Var;
    }

    public final Object c(int i, ux2 ux2Var) {
        ux2Var.Y(this.m);
        m(ux2Var);
        int iT = i | (ux2Var.f(this) ? au8.t(2, 0) : au8.t(1, 0));
        pw2 pw2Var = this.f2654o;
        e8.i(2, pw2Var);
        Object objInvoke = ((hw2) pw2Var).invoke(ux2Var, Integer.valueOf(iT));
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xy0(2, this, yy0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 0);
        }
        return objInvoke;
    }

    @Override // o.iw2
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return l(obj, (ux2) obj2, ((Number) obj3).intValue());
    }

    public final Object e(Object obj, Integer num, j74 j74Var, Boolean bool, Object obj2, ux2 ux2Var, int i) {
        ux2Var.Y(this.m);
        m(ux2Var);
        int iT = ux2Var.f(this) ? au8.t(2, 5) : au8.t(1, 5);
        pw2 pw2Var = this.f2654o;
        e8.i(7, pw2Var);
        Object objH = ((mw2) pw2Var).h(obj, num, j74Var, bool, obj2, ux2Var, Integer.valueOf(i | iT));
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new nx(this, obj, num, j74Var, bool, obj2, i);
        }
        return objH;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, ux2 ux2Var, int i) {
        ux2Var.Y(this.m);
        m(ux2Var);
        int iT = ux2Var.f(this) ? au8.t(2, 6) : au8.t(1, 6);
        pw2 pw2Var = this.f2654o;
        e8.i(8, pw2Var);
        Object objQ = ((nw2) pw2Var).q(obj, obj2, obj3, obj4, obj5, obj6, ux2Var, Integer.valueOf(i | iT));
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta((Object) this, obj, obj2, obj3, obj4, obj5, obj6, i, (byte) 1);
        }
        return objQ;
    }

    public final Object g(Object obj, Object obj2, Object obj3, ux2 ux2Var, int i) {
        ux2Var.Y(this.m);
        m(ux2Var);
        int iT = ux2Var.f(this) ? au8.t(2, 3) : au8.t(1, 3);
        pw2 pw2Var = this.f2654o;
        e8.i(5, pw2Var);
        Object objN = ((kw2) pw2Var).n(obj, obj2, obj3, ux2Var, Integer.valueOf(iT | i));
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) this, obj, obj2, obj3, i, (byte) 6);
        }
        return objN;
    }

    @Override // o.mw2
    public final /* bridge */ /* synthetic */ Object h(Object obj, Integer num, j74 j74Var, Boolean bool, Object obj2, Object obj3, Integer num2) {
        return e(obj, num, j74Var, bool, obj2, (ux2) obj3, num2.intValue());
    }

    @Override // o.jw2
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (ux2) obj3, ((Number) obj4).intValue());
    }

    @Override // o.hw2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c(((Number) obj2).intValue(), (ux2) obj);
    }

    public final Object j(Object obj, Object obj2, ux2 ux2Var, int i) {
        ux2Var.Y(this.m);
        m(ux2Var);
        int iT = ux2Var.f(this) ? au8.t(2, 2) : au8.t(1, 2);
        pw2 pw2Var = this.f2654o;
        e8.i(4, pw2Var);
        Object objI = ((jw2) pw2Var).i(obj, obj2, ux2Var, Integer.valueOf(iT | i));
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci(this, obj, obj2, i);
        }
        return objI;
    }

    public final Object l(Object obj, ux2 ux2Var, int i) {
        ux2Var.Y(this.m);
        m(ux2Var);
        int iT = ux2Var.f(this) ? au8.t(2, 1) : au8.t(1, 1);
        pw2 pw2Var = this.f2654o;
        e8.i(3, pw2Var);
        Object objD = ((iw2) pw2Var).d(obj, ux2Var, Integer.valueOf(iT | i));
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 4, i, (Object) this, obj);
        }
        return objD;
    }

    public final void m(ux2 ux2Var) {
        j56 j56VarW;
        if (!this.n || (j56VarW = ux2Var.w()) == null) {
            return;
        }
        j56VarW.b |= 1;
        j56 j56Var = this.p;
        if (j56Var == null || !j56Var.a() || j56Var == j56VarW || im3.n(j56Var.c, j56VarW.c)) {
            this.p = j56VarW;
            return;
        }
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.q = arrayList2;
            arrayList2.add(j56VarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j56 j56Var2 = (j56) arrayList.get(i);
            if (j56Var2 == null || !j56Var2.a() || j56Var2 == j56VarW || im3.n(j56Var2.c, j56VarW.c)) {
                arrayList.set(i, j56VarW);
                return;
            }
        }
        arrayList.add(j56VarW);
    }

    @Override // o.kw2
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return g(obj, obj2, obj3, (ux2) obj4, ((Number) obj5).intValue());
    }

    @Override // o.nw2
    public final /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Integer num) {
        return f(obj, obj2, obj3, obj4, obj5, obj6, (ux2) obj7, num.intValue());
    }
}
