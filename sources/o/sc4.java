package o;

/* JADX INFO: loaded from: classes.dex */
public class sc4 extends oe8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cm1 f2007o = new cm1((byte) 2);
    public final n77 n = new n77(0);

    @Override // o.oe8
    public final void U0() {
        n77 n77Var = this.n;
        int i = n77Var.f1550o;
        if (i > 0) {
            n77Var.d(0).getClass();
            io.sentry.h2.f();
            return;
        }
        Object[] objArr = n77Var.n;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        n77Var.f1550o = 0;
    }
}
