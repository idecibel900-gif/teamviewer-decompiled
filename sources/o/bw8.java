package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class bw8 implements Runnable {
    public final do7 m;

    public bw8() {
        this.m = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            do7 do7Var = this.m;
            if (do7Var != null) {
                do7Var.b(e);
            }
        }
    }

    public bw8(do7 do7Var) {
        this.m = do7Var;
    }
}
