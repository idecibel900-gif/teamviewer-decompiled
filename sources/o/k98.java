package o;

/* JADX INFO: loaded from: classes.dex */
public final class k98 extends UnsupportedOperationException {
    public final bi2 m;

    public k98(bi2 bi2Var) {
        this.m = bi2Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.m));
    }
}
