package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class td2 {
    public int a() {
        return 5;
    }

    public abstract boolean b(o82 o82Var, o82 o82Var2);

    public boolean c(o82 o82Var, q54 q54Var) {
        return false;
    }

    public final boolean d(o82 o82Var, x35 x35Var) {
        if (x35Var instanceof o82) {
            return b(o82Var, (o82) x35Var);
        }
        if ((x35Var instanceof q54) && f()) {
            return c(o82Var, (q54) x35Var);
        }
        return false;
    }

    public void e() {
    }

    public boolean f() {
        return false;
    }
}
