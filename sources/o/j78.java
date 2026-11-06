package o;

/* JADX INFO: loaded from: classes2.dex */
public final class j78 extends hs5 {
    public static final j78 c = new j78(k78.a);

    @Override // o.s0
    public final int h(Object obj) {
        return ((h78) obj).m.length;
    }

    @Override // o.kv0, o.s0
    public final void j(k01 k01Var, int i, Object obj) {
        i78 i78Var = (i78) obj;
        i78Var.getClass();
        short sY = k01Var.s(this.b, i).y();
        i78Var.b(i78Var.d() + 1);
        short[] sArr = i78Var.a;
        int i2 = i78Var.b;
        i78Var.b = i2 + 1;
        sArr[i2] = sY;
    }

    @Override // o.s0
    public final Object k(Object obj) {
        short[] sArr = ((h78) obj).m;
        i78 i78Var = new i78();
        i78Var.a = sArr;
        i78Var.b = sArr.length;
        i78Var.b(10);
        return i78Var;
    }

    @Override // o.hs5
    public final Object n() {
        return new h78(new short[0]);
    }

    @Override // o.hs5
    public final void o(bb7 bb7Var, Object obj, int i) {
        short[] sArr = ((h78) obj).m;
        bb7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bb7Var.i(this.b, i2).p(sArr[i2]);
        }
    }
}
