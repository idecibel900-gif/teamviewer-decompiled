package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class j9 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1139o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(av avVar, hv hvVar, String str, xa xaVar, l8 l8Var, Function0 function0, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1139o = avVar;
        this.p = hvVar;
        this.q = str;
        this.r = xaVar;
        this.s = l8Var;
        this.n = function0;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                j9 j9Var = new j9((p9) obj5, this.n, (px4) obj4, (l33) obj3, (n9) obj2, hc1Var);
                j9Var.f1139o = obj;
                return j9Var;
            default:
                return new j9((av) this.f1139o, (hv) obj5, (String) obj4, (xa) obj3, (l8) obj2, this.n, hc1Var);
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
                ((j9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((j9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                me1 me1Var = (me1) this.f1139o;
                ct1.a0(obj);
                hc1 hc1Var = null;
                im3.R(me1Var, null, null, new j0(obj5, (Object) this.n, obj4, hc1Var, (byte) 1), 3);
                im3.R(me1Var, null, null, new i9((l33) obj3, (n9) obj2, hc1Var, (byte) 0), 3);
                break;
            default:
                ct1.a0(obj);
                ((av) this.f1139o).a((hv) obj5, (String) obj4, (xa) obj3, (l8) obj2, this.n);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(p9 p9Var, Function0 function0, px4 px4Var, l33 l33Var, n9 n9Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = p9Var;
        this.n = function0;
        this.q = px4Var;
        this.r = l33Var;
        this.s = n9Var;
    }
}
