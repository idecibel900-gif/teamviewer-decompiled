package o;

/* JADX INFO: loaded from: classes.dex */
public final class m43 implements bp5 {
    public final he m;
    public final w65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1433o = 0;

    public m43(he heVar, w65 w65Var) {
        this.m = heVar;
        this.n = w65Var;
    }

    @Override // o.bp5
    public final long f(long j, long j2, zk3 zk3Var, j04 j04Var) {
        long jA = this.n.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f1433o;
        }
        this.f1433o = jA;
        return vk3.c(vk3.c(zk3Var.e(), us1.O(jA)), this.m.a(j2, 0L, j04Var));
    }
}
