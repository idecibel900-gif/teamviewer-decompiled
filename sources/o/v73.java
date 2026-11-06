package o;

/* JADX INFO: loaded from: classes2.dex */
public final class v73 implements v07 {
    public final gt2 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z73 f2281o;

    public v73(z73 z73Var) {
        this.f2281o = z73Var;
        this.m = new gt2(((u36) z73Var.c.n).m.i());
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) {
        if (this.n) {
            hk0.l("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        u36 u36Var = (u36) this.f2281o.c.n;
        if (u36Var.f2164o) {
            hk0.l("closed");
            return;
        }
        u36Var.n.W0(j);
        u36Var.e();
        u36Var.V("\r\n");
        u36Var.W(bf0Var, j);
        u36Var.V("\r\n");
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        ((u36) this.f2281o.c.n).V("0\r\n\r\n");
        ((u36) this.f2281o.c.n).flush();
        gt2 gt2Var = this.m;
        ov7 ov7Var = gt2Var.e;
        gt2Var.e = ov7.d;
        ov7Var.a();
        ov7Var.b();
        this.f2281o.d = (byte) 3;
    }

    @Override // o.v07, java.io.Flushable
    public final synchronized void flush() {
        if (this.n) {
            return;
        }
        ((u36) this.f2281o.c.n).flush();
    }

    @Override // o.v07
    public final ov7 i() {
        return this.m;
    }
}
