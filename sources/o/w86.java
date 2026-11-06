package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w86 {
    public static final x86 a;

    static {
        x86 x86Var = null;
        try {
            x86Var = (x86) y86.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (x86Var == null) {
            x86Var = new x86();
        }
        a = x86Var;
    }
}
