package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lf extends og7 implements Function1 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1356o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(1, hc1Var);
        this.m = b;
        this.p = obj;
        this.f1356o = obj2;
        this.q = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                jw2 jw2Var = (jw2) obj2;
                return new lf((nf) obj3, this.f1356o, jw2Var, (hc1) obj, (byte) 0).invokeSuspend(f88Var);
            default:
                u18 u18Var = (u18) obj2;
                return new lf((rn6) obj3, this.f1356o, u18Var, (hc1) obj, (byte) 1).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        Object obj3 = this.f1356o;
        Object obj4 = this.p;
        ne1 ne1Var = ne1.m;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                nf nfVar = (nf) obj4;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    ((bg5) nfVar.f).setValue(obj3);
                    hf hfVar = new hf(nfVar, (byte) 2);
                    j0 j0Var = new j0((jw2) obj2, nfVar, hc1Var, (byte) 7);
                    this.n = true;
                    if (uf0.v(hfVar, j0Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                if (!((Boolean) ((Function1) nfVar.b).invoke(obj3)).booleanValue()) {
                    return f88Var;
                }
                ((mf) nfVar.k).a(nfVar.e().f(obj3), ((wf5) nfVar.j).z());
                ((bg5) nfVar.e).setValue(obj3);
                ((bg5) nfVar.d).setValue(obj3);
                return f88Var;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    nn6 nn6Var = new nn6((rn6) obj4, obj3, (u18) obj2, null);
                    this.n = true;
                    return hm3.j(nn6Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
