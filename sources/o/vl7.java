package o;

/* JADX INFO: loaded from: classes.dex */
public enum vl7 {
    Online(j51.j(4284989249L), j51.j(4294967295L), new zk7((f62) b62.c.getValue())),
    Busy(j51.j(4291247932L), j51.j(4294967295L), null),
    Away(j51.j(4294741563L), j51.j(4294967295L), new zk7((f62) b62.d.getValue())),
    Offline(j51.j(4294967295L), j51.j(4283322198L), null);

    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final al7 f2327o;

    vl7(long j, long j2, zk7 zk7Var) {
        this.m = j;
        this.n = j2;
        this.f2327o = zk7Var;
    }
}
