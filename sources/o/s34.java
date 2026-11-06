package o;

/* JADX INFO: loaded from: classes.dex */
public final class s34 implements i97 {
    public final bg5 m;
    public int n;

    public s34(int i) {
        int i2 = (i / 30) * 30;
        this.m = new bg5(ct1.b0(Math.max(i2 - 100, 0), i2 + 130), yl7.X);
        this.n = i;
    }

    @Override // o.i97
    public final Object getValue() {
        return (yk3) this.m.getValue();
    }
}
