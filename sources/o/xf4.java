package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xf4 extends hs5 {
    public static final xf4 c = new xf4(kg4.a);

    @Override // o.s0
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        vf4 vf4Var = (vf4) obj;
        vf4Var.getClass();
        long jK = k01Var.k(this.b, i);
        vf4Var.b(vf4Var.d() + 1);
        long[] jArr = vf4Var.a;
        int i2 = vf4Var.b;
        vf4Var.b = i2 + 1;
        jArr[i2] = jK;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        vf4 vf4Var = new vf4();
        vf4Var.a = jArr;
        vf4Var.b = jArr.length;
        vf4Var.b(10);
        return vf4Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new long[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        bb7Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.k(j);
        }
    }
}
