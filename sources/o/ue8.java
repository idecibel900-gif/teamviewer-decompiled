package o;

/* JADX INFO: loaded from: classes.dex */
public final class ue8 {
    public static final yi5 b = new yi5((byte) 17);
    public final pn5 a;

    public ue8(we8 we8Var, se8 se8Var) {
        we8Var.getClass();
        ve8 ve8VarO = we8Var.getG0();
        bf1 bf1VarK = h57.k(we8Var);
        ve8VarO.getClass();
        se8Var.getClass();
        bf1VarK.getClass();
        this.a = new pn5(ve8VarO, se8Var, bf1VarK);
    }

    public final oe8 a(Class cls) {
        wt3 wt3VarB = w86.a.b(cls);
        String strC = wt3VarB.c();
        if (strC != null) {
            return this.a.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
