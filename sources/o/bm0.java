package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bm0 implements d58 {
    public final d58 m;
    public final fi1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f439o;

    public bm0(d58 d58Var, fi1 fi1Var, int i) {
        this.m = d58Var;
        this.n = fi1Var;
        this.f439o = i;
    }

    @Override // o.d58
    public final ub8 B() {
        ub8 ub8VarB = this.m.B();
        ub8VarB.getClass();
        return ub8VarB;
    }

    @Override // o.d58
    public final xd4 P() {
        xd4 xd4VarP = this.m.P();
        xd4VarP.getClass();
        return xd4VarP;
    }

    @Override // o.d58
    public final boolean U() {
        return true;
    }

    @Override // o.ys0
    public final g07 W() {
        g07 g07VarW = this.m.W();
        g07VarW.getClass();
        return g07VarW;
    }

    @Override // o.ys0, o.fi1
    public final ys0 a() {
        return this.m.a();
    }

    @Override // o.hi1
    public final s67 c() {
        s67 s67VarC = this.m.c();
        s67VarC.getClass();
        return s67VarC;
    }

    @Override // o.so
    public final up getAnnotations() {
        return this.m.getAnnotations();
    }

    @Override // o.d58
    public final int getIndex() {
        return this.m.getIndex() + this.f439o;
    }

    @Override // o.fi1
    public final sy4 getName() {
        sy4 name = this.m.getName();
        name.getClass();
        return name;
    }

    @Override // o.d58
    public final List getUpperBounds() {
        List upperBounds = this.m.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // o.fi1
    public final fi1 i() {
        return this.n;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return this.m.o(ji1Var, obj);
    }

    @Override // o.ys0
    public final k48 q() {
        k48 k48VarQ = this.m.q();
        k48VarQ.getClass();
        return k48VarQ;
    }

    public final String toString() {
        return this.m + "[inner-copy]";
    }

    @Override // o.d58
    public final boolean w() {
        return this.m.w();
    }

    @Override // o.fi1
    public final fi1 a() {
        return this.m.a();
    }

    @Override // o.d58, o.ys0, o.fi1
    public final d58 a() {
        return this.m.a();
    }
}
