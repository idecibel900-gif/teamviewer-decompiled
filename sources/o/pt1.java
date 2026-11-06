package o;

import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.account.models.AccountProfile;
import com.teamviewer.apidefinitions.account.models.PreferencePropertyString;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pt1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ru1 f1774o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt1(boolean z, ru1 ru1Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 0;
        this.n = z;
        this.f1774o = ru1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ru1 ru1Var = this.f1774o;
        switch (b) {
            case 0:
                return new pt1(this.n, ru1Var, hc1Var);
            case 1:
                return new pt1(ru1Var, hc1Var, (byte) 1);
            case 2:
                return new pt1(ru1Var, hc1Var, (byte) 2);
            case 3:
                return new pt1(ru1Var, hc1Var, (byte) 3);
            case 4:
                return new pt1(ru1Var, hc1Var, (byte) 4);
            case 5:
                return new pt1(ru1Var, hc1Var, (byte) 5);
            default:
                return new pt1(ru1Var, hc1Var, (byte) 6);
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
                ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                return ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 2:
                return ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 3:
                return ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 4:
                return ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 5:
                return ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            default:
                return ((pt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object value;
        wt1 wt1Var;
        String str;
        String str2;
        Object objH;
        AccountProfile profile;
        PreferencePropertyString emailAddress;
        String value2;
        Object objE;
        byte b = this.m;
        byte b2 = 0;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        ru1 ru1Var = this.f1774o;
        byte b3 = 1;
        switch (b) {
            case 0:
                ct1.a0(obj);
                if (this.n) {
                    ns1 ns1VarY0 = ru1Var.Y0();
                    if (ns1VarY0 != null) {
                        if (ns1VarY0.l) {
                            ru1Var.h1();
                        }
                        du1 du1VarV0 = ru1.V0(ns1VarY0);
                        if (!im3.n(ru1Var.R, du1VarV0)) {
                            ru1Var.R = du1VarV0;
                            Iterable iterable = ns1VarY0.n;
                            if (iterable == null) {
                                iterable = ea2.m;
                            }
                            ru1Var.S = lv0.T0(iterable);
                            n87 n87Var = ru1Var.U;
                            if (n87Var != null) {
                                n87Var.j(null);
                            }
                            ru1Var.U = null;
                            l97 l97Var = ru1Var.z;
                            do {
                                value = l97Var.getValue();
                                wt1Var = (wt1) value;
                                str = ns1VarY0.b;
                                str2 = ns1VarY0.h;
                                if (str2 == null) {
                                    str2 = "";
                                }
                            } while (!l97Var.j(value, wt1.a(wt1Var, false, null, null, false, false, false, false, false, false, false, false, str, null, str2, ru1Var.S, false, la2.m, false, null, ns1VarY0.f1598o, false, true, true, 528383)));
                        }
                    }
                } else {
                    ru1Var.p1();
                }
                return f88Var;
            case 1:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    yx6 yx6Var = ru1Var.F;
                    this.n = true;
                    return yx6Var.c(f88Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        objH = ((tc6) obj).m;
                    } else {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ct1.a0(obj);
                jk0 jk0Var = ru1Var.q;
                this.n = true;
                objH = jk0Var.h(this);
                if (objH == ne1Var) {
                    return ne1Var;
                }
                if (objH instanceof sc6) {
                    objH = null;
                }
                Account account = (Account) objH;
                if (account != null && (profile = account.getProfile()) != null && (emailAddress = profile.getEmailAddress()) != null && (value2 = emailAddress.getValue()) != null && !ub7.b0(value2)) {
                    return value2;
                }
                return null;
            case 3:
                boolean z3 = this.n;
                try {
                    if (!z3) {
                        ct1.a0(obj);
                        g95 g95Var = ru1Var.t;
                        this.n = true;
                        objE = g95Var.E(this);
                        if (objE == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z3) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                        objE = ((tc6) obj).m;
                    }
                    if (!(objE instanceof sc6)) {
                        ru1Var.M = true;
                        ru1Var.t1((List) objE);
                    }
                    Throwable thA = tc6.a(objE);
                    if (thA != null) {
                        ye4.a("DeviceInfoScreenViewModel", "Failed to load policies: " + thA.getMessage());
                        break;
                    }
                    ru1Var.N = false;
                    return f88Var;
                } catch (Throwable th) {
                    ru1Var.N = false;
                    throw th;
                }
            case 4:
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar = (fm) ru1Var.s.n;
                lu1 lu1Var = new lu1(ru1Var, b2);
                this.n = true;
                return fmVar.b(lu1Var, this) == ne1Var ? ne1Var : f88Var;
            case 5:
                boolean z5 = this.n;
                if (z5) {
                    if (z5) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar2 = ((xl4) ru1Var.r).a;
                lu1 lu1Var2 = new lu1(ru1Var, b3);
                this.n = true;
                return fmVar2.b(lu1Var2, this) == ne1Var ? ne1Var : f88Var;
            default:
                boolean z6 = this.n;
                if (z6) {
                    if (z6) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar3 = (fm) ru1Var.t.m;
                lu1 lu1Var3 = new lu1(ru1Var, (byte) 2);
                this.n = true;
                return fmVar3.b(lu1Var3, this) == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt1(ru1 ru1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1774o = ru1Var;
    }
}
