package o;

/* JADX INFO: loaded from: classes.dex */
public interface se8 {
    default oe8 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default oe8 b(Class cls, hw4 hw4Var) {
        return a(cls);
    }

    default oe8 c(wt3 wt3Var, hw4 hw4Var) {
        return b(et1.z(wt3Var), hw4Var);
    }
}
