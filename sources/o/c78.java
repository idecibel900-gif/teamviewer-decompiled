package o;

/* JADX INFO: loaded from: classes2.dex */
public final class c78 extends hs5 {
    public static final c78 c = new c78(d78.a);

    @Override // o.s0
    public final int h(Object obj) {
        return ((a78) obj).m.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        b78 b78Var = (b78) obj;
        b78Var.getClass();
        long jP = k01Var.s(this.b, i).p();
        b78Var.b(b78Var.d() + 1);
        long[] jArr = b78Var.a;
        int i2 = b78Var.b;
        b78Var.b = i2 + 1;
        jArr[i2] = jP;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        long[] jArr = ((a78) obj).m;
        b78 b78Var = new b78();
        b78Var.a = jArr;
        b78Var.b = jArr.length;
        b78Var.b(10);
        return b78Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new a78(new long[0]);
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        long[] jArr = ((a78) obj).m;
        bb7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bb7Var.i(this.b, i2).k(jArr[i2]);
        }
    }
}
