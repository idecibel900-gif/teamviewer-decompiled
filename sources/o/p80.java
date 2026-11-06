package o;

/* JADX INFO: loaded from: classes2.dex */
public final class p80 extends hs5 {
    public static final p80 c = new p80(q80.a);

    @Override // o.s0
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        n80 n80Var = (n80) obj;
        n80Var.getClass();
        boolean zA = k01Var.A(this.b, i);
        n80Var.b(n80Var.d() + 1);
        boolean[] zArr = n80Var.a;
        int i2 = n80Var.b;
        n80Var.b = i2 + 1;
        zArr[i2] = zA;
    }
}
