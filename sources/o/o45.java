package o;

/* JADX INFO: loaded from: classes.dex */
public class o45 {
    public final xx4 a = new xx4(new y35[16]);
    public final zw4 b = new zw4(10);

    public boolean a(mg4 mg4Var, i04 i04Var, io.sentry.android.core.n1 n1Var, boolean z) {
        xx4 xx4Var = this.a;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((y35) objArr[i2]).a(mg4Var, i04Var, n1Var, z) || z2;
        }
        return z2;
    }

    public void b(io.sentry.android.core.n1 n1Var) {
        xx4 xx4Var = this.a;
        int i = xx4Var.f2559o;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((y35) xx4Var.m[i]).d.n == 0) {
                xx4Var.k(i);
            }
        }
    }
}
