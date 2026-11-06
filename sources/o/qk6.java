package o;

/* JADX INFO: loaded from: classes.dex */
public final class qk6 implements u15 {
    public final yk6 m;
    public boolean n;

    public qk6(yk6 yk6Var, boolean z) {
        this.m = yk6Var;
        this.n = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.u15
    public final Object e(long j, long j2, hc1 hc1Var) throws Throwable {
        pk6 pk6Var;
        long jD;
        if (hc1Var instanceof pk6) {
            pk6Var = (pk6) hc1Var;
            int i = pk6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk6Var.p = i - Integer.MIN_VALUE;
            } else {
                pk6Var = new pk6(this, (jc1) hc1Var);
            }
        } else {
            pk6Var = new pk6(this, (jc1) hc1Var);
        }
        Object objA = pk6Var.n;
        int i2 = pk6Var.p;
        if (i2 == 0) {
            ct1.a0(objA);
            jD = 0;
            if (this.n) {
                yk6 yk6Var = this.m;
                if (!yk6Var.i) {
                    pk6Var.m = j2;
                    pk6Var.p = 1;
                    objA = yk6Var.a(j2, pk6Var);
                    ne1 ne1Var = ne1.m;
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                }
                jD = nc8.d(j2, jD);
            }
            return new nc8(jD);
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = pk6Var.m;
        ct1.a0(objA);
        jD = ((nc8) objA).a;
        jD = nc8.d(j2, jD);
        return new nc8(jD);
    }

    @Override // o.u15
    public final long p0(int i, long j, long j2) {
        if (!this.n) {
            return 0L;
        }
        yk6 yk6Var = this.m;
        if (yk6Var.a.a()) {
            return 0L;
        }
        return yk6Var.i(yk6Var.e(yk6Var.a.d(yk6Var.e(yk6Var.h(j2)))));
    }
}
