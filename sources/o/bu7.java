package o;

/* JADX INFO: loaded from: classes.dex */
public enum bu7 {
    MAIN(new au7()),
    CACHEDTHREADPOOL(new yt7());

    public final zt7 m;

    bu7(zt7 zt7Var) {
        this.m = zt7Var;
    }

    public final void a(Runnable runnable) {
        this.m.submit(runnable);
    }
}
