package o;

/* JADX INFO: loaded from: classes.dex */
public final class qa2 implements AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qa2 f1815o;
    public static at5 p;
    public static final pa2 q;
    public final Object m;
    public volatile boolean n;

    static {
        qa2 qa2Var = new qa2();
        f1815o = qa2Var;
        ia2 ia2Var = new ia2(qa2Var);
        p = ia2Var;
        q = new pa2(-1L, -1L, "Empty Thread", ia2Var);
        lx0.a.incrementAndGet();
    }

    public qa2() {
        ra2 ra2Var = ra2.m;
        this.m = new Object();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ra2.m.close();
    }
}
