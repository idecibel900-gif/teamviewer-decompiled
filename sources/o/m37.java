package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class m37 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1432o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m37(km kmVar, boolean z, e87 e87Var, Function0 function0, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = kmVar;
        this.f1432o = z;
        this.q = e87Var;
        this.r = function0;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                return new m37((km) this.p, this.f1432o, (e87) obj3, (Function0) obj2, hc1Var);
            default:
                return new m37((px4) obj3, this.f1432o, (mw4) obj2, hc1Var);
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
        return ((m37) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        boolean z = this.f1432o;
        ne1 ne1Var = ne1.m;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    km kmVar = (km) this.p;
                    float f = z ? 1.0f : 0.0f;
                    this.n = true;
                    if (km.a(kmVar, new Float(f), (e87) obj3, null, null, this, 12) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                ((Function0) obj2).a();
                return f88Var;
            default:
                px4 px4Var = (px4) obj3;
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    yr5 yr5Var = (yr5) px4Var.getValue();
                    if (yr5Var == null) {
                        return f88Var;
                    }
                    mw4 mw4Var = (mw4) obj2;
                    jl3 zr5Var = z ? new zr5(yr5Var) : new xr5(yr5Var);
                    if (mw4Var != null) {
                        this.p = px4Var;
                        this.n = true;
                        if (mw4Var.a(zr5Var, this) == ne1Var) {
                            return ne1Var;
                        }
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    px4Var = (px4) this.p;
                    ct1.a0(obj);
                }
                px4Var.setValue(null);
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m37(px4 px4Var, boolean z, mw4 mw4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = px4Var;
        this.f1432o = z;
        this.r = mw4Var;
    }
}
