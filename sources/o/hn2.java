package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hn2 extends hs5 {
    public static final hn2 c = new hn2(kn2.a);

    @Override // o.s0
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        fn2 fn2Var = (fn2) obj;
        fn2Var.getClass();
        float fQ = k01Var.q(this.b, i);
        fn2Var.b(fn2Var.d() + 1);
        float[] fArr = fn2Var.a;
        int i2 = fn2Var.b;
        fn2Var.b = i2 + 1;
        fArr[i2] = fQ;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        fn2 fn2Var = new fn2();
        fn2Var.a = fArr;
        fn2Var.b = fArr.length;
        fn2Var.b(10);
        return fn2Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new float[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        bb7Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.g(f);
        }
    }
}
