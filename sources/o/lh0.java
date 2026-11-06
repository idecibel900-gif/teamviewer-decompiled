package o;

/* JADX INFO: loaded from: classes2.dex */
public final class lh0 extends hs5 {
    public static final lh0 c = new lh0(qh0.a);

    @Override // o.s0
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        jh0 jh0Var = (jh0) obj;
        jh0Var.getClass();
        byte bN = k01Var.n(this.b, i);
        jh0Var.b(jh0Var.d() + 1);
        byte[] bArr = jh0Var.a;
        int i2 = jh0Var.b;
        jh0Var.b = i2 + 1;
        bArr[i2] = bN;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        jh0 jh0Var = new jh0();
        jh0Var.a = bArr;
        jh0Var.b = bArr.length;
        jh0Var.b(10);
        return jh0Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new byte[0];
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        bb7Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.c(b);
        }
    }
}
