package o;

/* JADX INFO: loaded from: classes.dex */
public final class ns8 implements Runnable {
    public final ot8 m;
    public final lt8 n;

    public ns8(ot8 ot8Var, lt8 lt8Var) {
        this.m = ot8Var;
        this.n = lt8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.m.m != this) {
            return;
        }
        lt8 lt8Var = this.n;
        if (vs8.s.z(this.m, this, ot8.g(lt8Var))) {
            ot8.i(this.m);
        }
    }
}
