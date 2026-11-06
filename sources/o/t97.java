package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class t97 implements s97 {
    public final yx m = new yx(0);

    public final boolean q(int i) {
        return (this.m.get() & i) != 0;
    }

    public final void u(int i) {
        yx yxVar;
        int i2;
        do {
            yxVar = this.m;
            i2 = yxVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!yxVar.compareAndSet(i2, i2 | i));
    }
}
