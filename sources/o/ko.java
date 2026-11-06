package o;

/* JADX INFO: loaded from: classes.dex */
public final class ko implements i97 {
    public final yn1 m;
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qo f1284o;
    public long p;
    public long q;
    public boolean r;

    public ko(yn1 yn1Var, Object obj, qo qoVar, long j, long j2, boolean z) {
        qo qoVarJ;
        this.m = yn1Var;
        this.n = h57.p(obj);
        if (qoVar != null) {
            qoVarJ = mo8.j(qoVar);
        } else {
            qoVarJ = (qo) yn1Var.b().invoke(obj);
            qoVarJ.d();
        }
        this.f1284o = qoVarJ;
        this.p = j;
        this.q = j2;
        this.r = z;
    }

    public final Object a() {
        return this.m.a().invoke(this.f1284o);
    }

    @Override // o.i97
    public final Object getValue() {
        return this.n.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.n.getValue() + ", velocity=" + a() + ", isRunning=" + this.r + ", lastFrameTimeNanos=" + this.p + ", finishedTimeNanos=" + this.q + ")";
    }

    public /* synthetic */ ko(yn1 yn1Var, Object obj, qo qoVar, int i) {
        this(yn1Var, obj, (i & 4) != 0 ? null : qoVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
