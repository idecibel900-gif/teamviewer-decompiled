package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class ju6 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ su6 f1201o;
    public final /* synthetic */ SupportSession p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju6(boolean z, SupportSession supportSession, su6 su6Var, String str, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = z;
        this.p = supportSession;
        this.f1201o = su6Var;
        this.q = str;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new ju6(this.n, this.p, this.f1201o, this.q, hc1Var);
            default:
                return new ju6(this.f1201o, this.p, this.q, hc1Var);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((ju6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((ju6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        boolean z = false;
        String str = this.q;
        su6 su6Var = this.f1201o;
        SupportSession supportSession = this.p;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ct1.a0(obj);
                if (!this.n || supportSession == null) {
                    su6Var.e1();
                } else {
                    if (str != null) {
                        su6Var.D = str;
                    }
                    SupportSession supportSession2 = ((it6) su6Var.u.m.getValue()).a;
                    if (supportSession2 != null && supportSession2.getSessioncode() == supportSession.getSessioncode()) {
                        supportSession = supportSession2;
                    }
                    Integer num = su6Var.C;
                    int sessioncode = supportSession.getSessioncode();
                    if (num == null || num.intValue() != sessioncode) {
                        su6Var.C = Integer.valueOf(supportSession.getSessioncode());
                        su6Var.g1(supportSession, false, new jp6((byte) 18));
                    }
                }
                return f88Var;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                supportSession.getClass();
                if (str != null) {
                    su6Var.D = str;
                }
                SupportSession supportSession3 = ((it6) su6Var.u.m.getValue()).a;
                if (supportSession3 != null && supportSession3.getSessioncode() == supportSession.getSessioncode()) {
                    z = true;
                }
                su6Var.g1(supportSession, true, new bn1(su6Var, z));
                int sessioncode2 = supportSession.getSessioncode();
                this.n = true;
                Object objB = ((fm) su6Var.f2056o.n).b(new nw0(sessioncode2, su6Var, (byte) 2), this);
                ne1 ne1Var = ne1.m;
                if (objB != ne1Var) {
                    objB = f88Var;
                }
                return objB == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju6(su6 su6Var, SupportSession supportSession, String str, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1201o = su6Var;
        this.p = supportSession;
        this.q = str;
    }
}
