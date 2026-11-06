package o;

/* JADX INFO: loaded from: classes.dex */
public final class j84 {
    public static l84 a(m84 m84Var) {
        m84Var.getClass();
        int iOrdinal = m84Var.ordinal();
        if (iOrdinal == 2) {
            return l84.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return l84.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return l84.ON_PAUSE;
    }
}
