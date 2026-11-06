package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDisplayNameProperty;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateManagerId;
import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailModel;
import com.teamviewer.apidefinitions.manageddevices.models.StateOperation;

/* JADX INFO: loaded from: classes.dex */
public final class yy1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hz1 f2655o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy1(hz1 hz1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2655o = hz1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        hz1 hz1Var = this.f2655o;
        switch (b) {
            case 0:
                return new yy1(hz1Var, hc1Var, (byte) 0);
            case 1:
                return new yy1(hz1Var, hc1Var, (byte) 1);
            case 2:
                return new yy1(hz1Var, hc1Var, (byte) 2);
            case 3:
                return new yy1(hz1Var, hc1Var, (byte) 3);
            case 4:
                return new yy1(hz1Var, hc1Var, (byte) 4);
            default:
                return new yy1(hz1Var, hc1Var, (byte) 5);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((yy1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objF;
        Object objH;
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        hz1 hz1Var = this.f2655o;
        byte b2 = 1;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                l97 l97Var = hz1Var.r;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    j35 j35VarA = j35.a((j35) l97Var.getValue(), null, false, false, true, 23);
                    l97Var.getClass();
                    l97Var.l(null, j35VarA);
                    hl4 hl4Var = hz1Var.n;
                    String str = ((j35) hz1Var.s.m.getValue()).a;
                    StateOperation stateOperation = StateOperation.Add;
                    GroupDetailModel groupDetailModel = new GroupDetailModel(new DeviceStateDisplayNameProperty(str, stateOperation), qf0.K(new DeviceStateManagerId(stateOperation, null, null, iz1.c, new Integer(hz1Var.q), null, null, 102, null)), null, null, null, null, null, 124, null);
                    this.n = true;
                    objB = ((xl4) hl4Var).b(groupDetailModel, this);
                    if (objB == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objB = ((tc6) obj).m;
                }
                if (!(objB instanceof sc6)) {
                    j35 j35Var = (j35) l97Var.getValue();
                    j35Var.getClass();
                    l97Var.l(null, j35.a(j35Var, null, false, false, false, 7));
                    hz1Var.W0(w17.a);
                }
                Throwable thA = tc6.a(objB);
                if (thA == null) {
                    return f88Var;
                }
                ye4.a("DeviceTabViewModel", "Failed to create group: " + thA.getMessage());
                j35 j35Var2 = (j35) l97Var.getValue();
                j35Var2.getClass();
                l97Var.l(null, j35.a(j35Var2, null, false, false, false, 7));
                hz1Var.W0(x17.a);
                return f88Var;
            case 1:
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
                fm fmVar = (fm) hz1Var.f1018o.n;
                zy1 zy1Var = new zy1(hz1Var, (byte) 0);
                this.n = true;
                return fmVar.b(zy1Var, this) == ne1Var ? ne1Var : f88Var;
            case 2:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                go2 go2VarK = ga0.k(new fm(hz1Var.F, (byte) 2));
                g6 g6Var = new g6((Object) hz1Var, hc1Var, (byte) 2);
                this.n = true;
                return zu1.p(go2VarK, g6Var, this) == ne1Var ? ne1Var : f88Var;
            case 3:
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
                fm fmVar2 = ((xl4) hz1Var.n).a;
                zy1 zy1Var2 = new zy1(hz1Var, b2);
                this.n = true;
                return fmVar2.b(zy1Var2, this) == ne1Var ? ne1Var : f88Var;
            case 4:
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    hl4 hl4Var2 = hz1Var.n;
                    this.n = true;
                    objF = ((xl4) hl4Var2).f(this);
                    if (objF == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objF = ((tc6) obj).m;
                }
                return new tc6(objF);
            default:
                l97 l97Var2 = hz1Var.E;
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    ll2 ll2Var = hz1Var.D;
                    this.n = true;
                    objH = ll2Var.h(this);
                    if (objH == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z6) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objH = obj;
                }
                if (!((Boolean) objH).booleanValue() || !((gl4) l97Var2.getValue()).c) {
                    return f88Var;
                }
                gl4 gl4VarB = gl4.b((gl4) l97Var2.getValue(), false, false, false, true, 7);
                l97Var2.getClass();
                l97Var2.l(null, gl4VarB);
                return f88Var;
        }
    }
}
