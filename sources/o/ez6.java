package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ez6 extends hs5 {
    public static final ez6 c = new ez6(fz6.a);

    @Override // o.s0
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        dz6 dz6Var = (dz6) obj;
        dz6Var.getClass();
        short sO = k01Var.o(this.b, i);
        dz6Var.b(dz6Var.d() + 1);
        short[] sArr = dz6Var.a;
        int i2 = dz6Var.b;
        dz6Var.b = i2 + 1;
        sArr[i2] = sO;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        dz6 dz6Var = new dz6();
        dz6Var.a = sArr;
        dz6Var.b = sArr.length;
        dz6Var.b(10);
        return dz6Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new short[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        bb7Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.p(s);
        }
    }
}
