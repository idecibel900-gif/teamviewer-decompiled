package o;

/* JADX INFO: loaded from: classes.dex */
public final class am3 {
    public final int a;
    public final int b;
    public final ep3 c;

    public am3(int i, int i2, ep3 ep3Var) {
        this.a = i;
        this.b = i2;
        this.c = ep3Var;
        if (i < 0) {
            ni3.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        ni3.a("size should be > 0");
    }
}
