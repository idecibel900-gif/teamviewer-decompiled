package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class xm0 extends ym0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(xm0.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final wm0 p;
    public final boolean q;

    public /* synthetic */ xm0(wm0 wm0Var, boolean z) {
        this(wm0Var, z, ba2.m, -3, df0.m);
    }

    @Override // o.ym0, o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) throws Throwable {
        int i = this.n;
        ne1 ne1Var = ne1.m;
        if (i == -3) {
            boolean z = this.q;
            if (z && r.getAndSet(this, 1) == 1) {
                hk0.l("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objR = vt1.r(ho2Var, this.p, z, hc1Var);
            if (objR == ne1Var) {
                return objR;
            }
        } else {
            Object objB = super.b(ho2Var, hc1Var);
            if (objB == ne1Var) {
                return objB;
            }
        }
        return f88.a;
    }

    @Override // o.ym0
    public final String e() {
        return "channel=" + this.p;
    }

    @Override // o.ym0
    public final Object f(gt5 gt5Var, hc1 hc1Var) throws Throwable {
        Object objR = vt1.r(new yp6(gt5Var), this.p, this.q, hc1Var);
        return objR == ne1.m ? objR : f88.a;
    }

    @Override // o.ym0
    public final ym0 g(de1 de1Var, int i, df0 df0Var) {
        return new xm0(this.p, this.q, de1Var, i, df0Var);
    }

    @Override // o.ym0
    public final go2 h() {
        return new xm0(this.p, this.q);
    }

    @Override // o.ym0
    public final wm0 i(me1 me1Var) {
        if (!this.q || r.getAndSet(this, 1) != 1) {
            return this.n == -3 ? this.p : super.i(me1Var);
        }
        hk0.l("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public xm0(wm0 wm0Var, boolean z, de1 de1Var, int i, df0 df0Var) {
        super(de1Var, i, df0Var);
        this.p = wm0Var;
        this.q = z;
    }
}
