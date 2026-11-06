package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ok3 extends hs5 {
    public static final ok3 c = new ok3(bl3.a);

    @Override // o.s0
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        mk3 mk3Var = (mk3) obj;
        mk3Var.getClass();
        int iW = k01Var.w(this.b, i);
        mk3Var.b(mk3Var.d() + 1);
        int[] iArr = mk3Var.a;
        int i2 = mk3Var.b;
        mk3Var.b = i2 + 1;
        iArr[i2] = iW;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        mk3 mk3Var = new mk3();
        mk3Var.a = iArr;
        mk3Var.b = iArr.length;
        mk3Var.b(10);
        return mk3Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new int[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        bb7Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.j(i3);
        }
    }
}
