package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class ou6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1679o;
    public byte p;
    public final /* synthetic */ SupportSession q;
    public final /* synthetic */ su6 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou6(SupportSession supportSession, su6 su6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = supportSession;
        this.r = su6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        su6 su6Var = this.r;
        SupportSession supportSession = this.q;
        switch (b) {
            case 0:
                return new ou6(supportSession, su6Var, hc1Var, (byte) 0);
            default:
                return new ou6(supportSession, su6Var, hc1Var, (byte) 1);
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
        return ((ou6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0085, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x011b, please report this as an issue */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        String name;
        Object objN;
        String str;
        Throwable thA;
        u27 u27Var;
        String name2;
        Object objY;
        String str2;
        Throwable thA2;
        y27 y27Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        su6 su6Var = this.r;
        SupportSession supportSession = this.q;
        switch (b) {
            case 0:
                byte b2 = this.p;
                if (b2 == 0) {
                    ct1.a0(obj);
                    name = supportSession.getName();
                    cj3 cj3Var = su6Var.r;
                    int sessioncode = supportSession.getSessioncode();
                    this.n = name;
                    this.p = (byte) 1;
                    objN = cj3Var.n(sessioncode, this);
                    if (objN != ne1Var) {
                    }
                    return ne1Var;
                }
                if (b2 == 1) {
                    String str3 = this.n;
                    ct1.a0(obj);
                    objN = ((tc6) obj).m;
                    name = str3;
                } else {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            ct1.a0(obj);
                            return f88Var;
                        }
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    objN = this.f1679o;
                    str = this.n;
                    ct1.a0(obj);
                }
                name = str;
                thA = tc6.a(objN);
                if (thA == null) {
                    return f88Var;
                }
                ye4.a("SessionScreenViewModel", "Failed to assign support session to me: " + thA.getMessage());
                u27Var = new u27(name);
                this.n = null;
                this.f1679o = objN;
                this.p = (byte) 3;
                if (su6Var.W0(u27Var, this) != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
                if (objN instanceof sc6) {
                    thA = tc6.a(objN);
                    if (thA == null) {
                        return f88Var;
                    }
                    ye4.a("SessionScreenViewModel", "Failed to assign support session to me: " + thA.getMessage());
                    u27Var = new u27(name);
                    this.n = null;
                    this.f1679o = objN;
                    this.p = (byte) 3;
                    if (su6Var.W0(u27Var, this) != ne1Var) {
                        return f88Var;
                    }
                } else {
                    su6Var.getClass();
                    su6Var.g1((SupportSession) objN, true, new jp6(su6Var, (byte) 19));
                    v27 v27Var = new v27(name);
                    this.n = name;
                    this.f1679o = objN;
                    this.p = (byte) 2;
                    if (su6Var.W0(v27Var, this) != ne1Var) {
                        str = name;
                        name = str;
                        thA = tc6.a(objN);
                        if (thA == null) {
                            return f88Var;
                        }
                        ye4.a("SessionScreenViewModel", "Failed to assign support session to me: " + thA.getMessage());
                        u27Var = new u27(name);
                        this.n = null;
                        this.f1679o = objN;
                        this.p = (byte) 3;
                        if (su6Var.W0(u27Var, this) != ne1Var) {
                            return f88Var;
                        }
                    }
                }
                return ne1Var;
            default:
                byte b3 = this.p;
                if (b3 == 0) {
                    ct1.a0(obj);
                    name2 = supportSession.getName();
                    cj3 cj3Var2 = su6Var.r;
                    int sessioncode2 = supportSession.getSessioncode();
                    this.n = name2;
                    this.p = (byte) 1;
                    objY = cj3Var2.Y(sessioncode2, this);
                    if (objY != ne1Var) {
                    }
                    return ne1Var;
                }
                if (b3 == 1) {
                    String str4 = this.n;
                    ct1.a0(obj);
                    objY = ((tc6) obj).m;
                    name2 = str4;
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            ct1.a0(obj);
                            return f88Var;
                        }
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    objY = this.f1679o;
                    str2 = this.n;
                    ct1.a0(obj);
                }
                name2 = str2;
                thA2 = tc6.a(objY);
                if (thA2 == null) {
                    return f88Var;
                }
                ye4.a("SessionScreenViewModel", "Failed to unassign support session: " + thA2.getMessage());
                y27Var = new y27(name2);
                this.n = null;
                this.f1679o = objY;
                this.p = (byte) 3;
                if (su6Var.W0(y27Var, this) != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
                if (objY instanceof sc6) {
                    thA2 = tc6.a(objY);
                    if (thA2 == null) {
                        return f88Var;
                    }
                    ye4.a("SessionScreenViewModel", "Failed to unassign support session: " + thA2.getMessage());
                    y27Var = new y27(name2);
                    this.n = null;
                    this.f1679o = objY;
                    this.p = (byte) 3;
                    if (su6Var.W0(y27Var, this) != ne1Var) {
                        return f88Var;
                    }
                } else {
                    su6Var.getClass();
                    su6Var.g1((SupportSession) objY, true, new jp6(su6Var, (byte) 19));
                    z27 z27Var = new z27(name2);
                    this.n = name2;
                    this.f1679o = objY;
                    this.p = (byte) 2;
                    if (su6Var.W0(z27Var, this) != ne1Var) {
                        str2 = name2;
                        name2 = str2;
                        thA2 = tc6.a(objY);
                        if (thA2 == null) {
                            return f88Var;
                        }
                        ye4.a("SessionScreenViewModel", "Failed to unassign support session: " + thA2.getMessage());
                        y27Var = new y27(name2);
                        this.n = null;
                        this.f1679o = objY;
                        this.p = (byte) 3;
                        if (su6Var.W0(y27Var, this) != ne1Var) {
                            return f88Var;
                        }
                    }
                }
                return ne1Var;
        }
    }
}
