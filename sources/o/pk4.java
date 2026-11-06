package o;

/* JADX INFO: loaded from: classes.dex */
public final class pk4 implements bp5 {
    public final xc0 m;
    public dl3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j04 f1741o;
    public dl3 p;
    public vk3 q;

    public pk4(xc0 xc0Var) {
        this.m = xc0Var;
    }

    @Override // o.bp5
    public final long f(long j, long j2, zk3 zk3Var, j04 j04Var) {
        vk3 vk3Var = this.q;
        if (vk3Var != null) {
            dl3 dl3Var = this.n;
            if ((dl3Var == null ? false : dl3.b(dl3Var.a, j)) && this.f1741o == j04Var) {
                dl3 dl3Var2 = this.p;
                if (dl3Var2 != null ? dl3.b(dl3Var2.a, j2) : false) {
                    return vk3Var.a;
                }
            }
        }
        long jF = this.m.f(j, j2, zk3Var, j04Var);
        this.n = new dl3(j);
        this.f1741o = j04Var;
        this.p = new dl3(j2);
        this.q = new vk3(jF);
        return jF;
    }
}
