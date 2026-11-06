package o;

/* JADX INFO: loaded from: classes.dex */
public final class h08 implements bp5 {
    public final int m;
    public final long n;

    public h08(int i, long j) {
        this.m = i;
        this.n = j;
    }

    @Override // o.bp5
    public final long f(long j, long j2, zk3 zk3Var, j04 j04Var) {
        int i = (int) (j2 >> 32);
        int iF = ((zk3Var.f() - i) / 2) + zk3Var.a;
        long j3 = this.n;
        if (iF < 0) {
            int i2 = zk3Var.a;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            iF = i2 - (i3 >= 0 ? i3 : 0);
        } else if (iF + i > ((int) (j3 >> 32)) && (iF = zk3Var.c - i) < 0) {
            iF = 0;
        }
        int i4 = zk3Var.b - ((int) (j2 & 4294967295L));
        int i5 = this.m;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = zk3Var.d + i5;
        }
        return (((long) i6) & 4294967295L) | (((long) iF) << 32);
    }
}
