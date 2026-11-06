package o;

/* JADX INFO: loaded from: classes2.dex */
public final class x68 extends hs5 {
    public static final x68 c = new x68(y68.a);

    @Override // o.s0
    public final int h(Object obj) {
        return ((v68) obj).m.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        w68 w68Var = (w68) obj;
        w68Var.getClass();
        int iG = k01Var.s(this.b, i).g();
        w68Var.b(w68Var.d() + 1);
        int[] iArr = w68Var.a;
        int i2 = w68Var.b;
        w68Var.b = i2 + 1;
        iArr[i2] = iG;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        int[] iArr = ((v68) obj).m;
        w68 w68Var = new w68();
        w68Var.a = iArr;
        w68Var.b = iArr.length;
        w68Var.b(10);
        return w68Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new v68(new int[0]);
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        int[] iArr = ((v68) obj).m;
        bb7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bb7Var.i(this.b, i2).j(iArr[i2]);
        }
    }
}
