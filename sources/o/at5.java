package o;

/* JADX INFO: loaded from: classes.dex */
public class at5 extends e17 {
    public final pw4 p;
    public volatile ju7 q;
    public volatile ju7 r;

    public at5(qa2 qa2Var, int i, String str) {
        super(qa2Var, lx0.a.incrementAndGet());
        int i2 = yf4.a;
        this.p = new pw4(6);
        new jx4();
    }

    public ju7 j(String str, long j, long j2) {
        ju7 ju7Var;
        synchronized (this.p) {
            try {
                pw4 pw4Var = this.p;
                Object objD = pw4Var.d(j);
                if (objD == null) {
                    ju7 ju7Var2 = new ju7(j, j2, str, this);
                    pw4Var.g(j, ju7Var2);
                    objD = ju7Var2;
                }
                ju7Var = (ju7) objD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ju7Var;
    }
}
