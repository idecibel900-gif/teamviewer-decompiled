package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q07 extends g2 {
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1793o;
    public kx4 p;
    public kx4 q;
    public wp6 r;
    public final y46 s;
    public final ar t;

    public q07() {
        super((byte) 6);
        this.s = new y46(this, (byte) 18);
        gg4 gg4Var = new gg4(this, (byte) 16);
        v47.b(v47.a);
        synchronized (v47.c) {
            v47.h = lv0.B0(v47.h, gg4Var);
        }
        this.t = new ar(gg4Var, (byte) 24);
    }

    @Override // o.g2
    public final void j0(wp6 wp6Var) {
        this.f1793o = null;
        this.q = null;
    }

    @Override // o.g2
    public final void m0() {
        synchronized (this.m) {
            try {
                this.n = this.f1793o;
                if (this.q == null) {
                    this.p = null;
                } else {
                    kx4 kx4Var = this.p;
                    if (kx4Var == null) {
                        kx4 kx4Var2 = ui6.a;
                        kx4Var = new kx4();
                        this.p = kx4Var;
                    }
                    this.p = this.q;
                    this.q = kx4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.g2
    public final void o0() {
        this.t.n();
        this.f1793o = null;
        this.q = null;
        synchronized (this.m) {
            this.r = null;
            this.n = null;
            this.p = null;
        }
    }

    @Override // o.g2
    public final Function1 w0(wp6 wp6Var) {
        wp6 wp6Var2 = this.r;
        if (wp6Var2 != null && !wp6Var2.equals(wp6Var)) {
            up5.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.r = wp6Var;
        return this.s;
    }

    @Override // o.g2
    public final void x0(wm0 wm0Var) {
        this.r = null;
        this.f1793o = null;
        this.q = null;
        m0();
    }
}
