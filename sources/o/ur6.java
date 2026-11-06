package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class ur6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2245o;
    public final /* synthetic */ SupportSession p;
    public final /* synthetic */ xr6 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur6(SupportSession supportSession, xr6 xr6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = supportSession;
        this.q = xr6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        xr6 xr6Var = this.q;
        SupportSession supportSession = this.p;
        switch (b) {
            case 0:
                return new ur6(supportSession, xr6Var, hc1Var, (byte) 0);
            default:
                return new ur6(supportSession, xr6Var, hc1Var, (byte) 1);
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
                break;
        }
        return ((ur6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        Object obj3;
        String str2;
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        xr6 xr6Var = this.q;
        SupportSession supportSession = this.p;
        switch (b) {
            case 0:
                boolean z = this.f2245o;
                if (!z) {
                    ct1.a0(obj);
                    String name = supportSession.getName();
                    cj3 cj3Var = xr6Var.p;
                    int sessioncode = supportSession.getSessioncode();
                    this.n = name;
                    this.f2245o = true;
                    Object objN = cj3Var.n(sessioncode, this);
                    if (objN == ne1Var) {
                        return ne1Var;
                    }
                    obj2 = objN;
                    str = name;
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.n;
                    ct1.a0(obj);
                    obj2 = ((tc6) obj).m;
                }
                if (!(obj2 instanceof sc6)) {
                    xr6Var.W0(new v27(str));
                }
                Throwable thA = tc6.a(obj2);
                if (thA == null) {
                    return f88Var;
                }
                ye4.a("ServiceQueueViewModel", "Failed to assign support session to me: " + thA.getMessage());
                xr6Var.W0(new u27(str));
                return f88Var;
            default:
                boolean z2 = this.f2245o;
                if (!z2) {
                    ct1.a0(obj);
                    String name2 = supportSession.getName();
                    cj3 cj3Var2 = xr6Var.p;
                    int sessioncode2 = supportSession.getSessioncode();
                    this.n = name2;
                    this.f2245o = true;
                    Object objY = cj3Var2.Y(sessioncode2, this);
                    if (objY == ne1Var) {
                        return ne1Var;
                    }
                    obj3 = objY;
                    str2 = name2;
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = this.n;
                    ct1.a0(obj);
                    obj3 = ((tc6) obj).m;
                }
                if (!(obj3 instanceof sc6)) {
                    xr6Var.W0(new z27(str2));
                }
                Throwable thA2 = tc6.a(obj3);
                if (thA2 == null) {
                    return f88Var;
                }
                ye4.a("ServiceQueueViewModel", "Failed to unassign support session: " + thA2.getMessage());
                xr6Var.W0(new y27(str2));
                return f88Var;
        }
    }
}
