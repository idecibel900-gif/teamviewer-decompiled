package o;

/* JADX INFO: loaded from: classes2.dex */
public final class o32 extends hs5 {
    public static final o32 c = new o32(r32.a);

    @Override // o.s0
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        m32 m32Var = (m32) obj;
        m32Var.getClass();
        double dF = k01Var.f(this.b, i);
        m32Var.b(m32Var.d() + 1);
        double[] dArr = m32Var.a;
        int i2 = m32Var.b;
        m32Var.b = i2 + 1;
        dArr[i2] = dF;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        m32 m32Var = new m32();
        m32Var.a = dArr;
        m32Var.b = dArr.length;
        m32Var.b(10);
        return m32Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new double[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        bb7Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.e(d);
        }
    }
}
