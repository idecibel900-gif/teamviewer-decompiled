package o;

/* JADX INFO: loaded from: classes2.dex */
public final class p68 extends hs5 {
    public static final p68 c = new p68(q68.a);

    @Override // o.s0
    public final int h(Object obj) {
        return ((n68) obj).m.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        o68 o68Var = (o68) obj;
        o68Var.getClass();
        byte bX = k01Var.s(this.b, i).x();
        o68Var.b(o68Var.d() + 1);
        byte[] bArr = o68Var.a;
        int i2 = o68Var.b;
        o68Var.b = i2 + 1;
        bArr[i2] = bX;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        byte[] bArr = ((n68) obj).m;
        o68 o68Var = new o68();
        o68Var.a = bArr;
        o68Var.b = bArr.length;
        o68Var.b(10);
        return o68Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new n68(new byte[0]);
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        byte[] bArr = ((n68) obj).m;
        bb7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bb7Var.i(this.b, i2).c(bArr[i2]);
        }
    }
}
