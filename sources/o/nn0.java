package o;

/* JADX INFO: loaded from: classes2.dex */
public final class nn0 extends hs5 {
    public static final nn0 c = new nn0(qn0.a);

    @Override // o.s0
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        ln0 ln0Var = (ln0) obj;
        ln0Var.getClass();
        char cM = k01Var.m(this.b, i);
        ln0Var.b(ln0Var.d() + 1);
        char[] cArr = ln0Var.a;
        int i2 = ln0Var.b;
        ln0Var.b = i2 + 1;
        cArr[i2] = cM;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ln0 ln0Var = new ln0();
        ln0Var.a = cArr;
        ln0Var.b = cArr.length;
        ln0Var.b(10);
        return ln0Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new char[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        bb7Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.d(c2);
        }
    }
}
