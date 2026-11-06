package o;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    public final Throwable a;

    static {
        new k2(new j2("Failure occurred while trying to finish a future."));
    }

    public k2(Throwable th) {
        this.a = (Throwable) p2.checkNotNull(th);
    }
}
