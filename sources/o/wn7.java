package o;

/* JADX INFO: loaded from: classes.dex */
public final class wn7 implements eo {
    public final ec8 m;
    public final yn1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2432o;
    public Object p;
    public qo q;
    public qo r;
    public final qo s;
    public long t;
    public qo u;

    public wn7(jo joVar, yn1 yn1Var, Object obj, Object obj2, qo qoVar) {
        this.m = joVar.a(yn1Var);
        this.n = yn1Var;
        this.f2432o = obj2;
        this.p = obj;
        this.q = (qo) yn1Var.b().invoke(obj);
        this.r = (qo) yn1Var.b().invoke(obj2);
        this.s = qoVar != null ? mo8.j(qoVar) : ((qo) yn1Var.b().invoke(obj)).c();
        this.t = -1L;
    }

    @Override // o.eo
    public final boolean a() {
        return this.m.a();
    }

    @Override // o.eo
    public final long b() {
        long j = this.t;
        if (j >= 0) {
            return j;
        }
        long jB = this.m.b(this.q, this.r, this.s);
        this.t = jB;
        return jB;
    }

    @Override // o.eo
    public final yn1 c() {
        return this.n;
    }

    @Override // o.eo
    public final qo d(long j) {
        if (!e(j)) {
            return this.m.h(j, this.q, this.r, this.s);
        }
        qo qoVar = this.u;
        if (qoVar != null) {
            return qoVar;
        }
        qo qoVarW = this.m.w(this.q, this.r, this.s);
        this.u = qoVarW;
        return qoVarW;
    }

    @Override // o.eo
    public final Object g(long j) {
        if (e(j)) {
            return this.f2432o;
        }
        qo qoVarU = this.m.u(j, this.q, this.r, this.s);
        int iB = qoVarU.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(qoVarU.a(i))) {
                wp5.b("AnimationVector cannot contain a NaN. " + qoVarU + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.n.a().invoke(qoVarU);
    }

    @Override // o.eo
    public final Object h() {
        return this.f2432o;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.p + " -> " + this.f2432o + ",initial velocity: " + this.s + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.m;
    }
}
