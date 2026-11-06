package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gn extends yz3 implements hw2 {
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u18 f907o;
    public final /* synthetic */ ci5 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ pn r;
    public final /* synthetic */ j57 s;
    public final /* synthetic */ yy0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(Object obj, u18 u18Var, ci5 ci5Var, Function1 function1, pn pnVar, j57 j57Var, yy0 yy0Var) {
        super(2);
        this.n = obj;
        this.f907o = u18Var;
        this.p = ci5Var;
        this.q = function1;
        this.r = pnVar;
        this.s = j57Var;
        this.t = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        tb1 tb1Var;
        hf2 hf2Var;
        ux2 ux2Var = (ux2) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            u18 u18Var = this.f907o;
            bg5 bg5Var = u18Var.e;
            bg5 bg5Var2 = u18Var.d;
            Object value = bg5Var.getValue();
            Object obj3 = this.n;
            boolean zG = ux2Var.g(im3.n(obj3, value));
            Object objK = ux2Var.K();
            Function1 function1 = this.q;
            ci5 ci5Var = this.p;
            aw awVar = e01.a;
            pn pnVar = this.r;
            if (zG || objK == awVar) {
                if (!im3.n(obj3, bg5Var.getValue()) || ci5Var == null) {
                    tb1Var = (im3.n(obj3, u18Var.f().b()) || im3.n(obj3, u18Var.f().d())) ? (tb1) function1.invoke(pnVar) : (tb1) function1.invoke(new ci5(pnVar, u18Var.f().b(), obj3));
                } else {
                    tb1Var = (tb1) function1.invoke(ci5Var);
                }
                objK = tb1Var;
                ux2Var.g0(objK);
            }
            tb1 tb1Var2 = (tb1) objK;
            boolean zG2 = ux2Var.g(im3.n(u18Var.f().d(), obj3)) | ux2Var.g(im3.n(obj3, bg5Var.getValue()));
            Object objK2 = ux2Var.K();
            if (zG2 || objK2 == awVar) {
                if (im3.n(u18Var.f().d(), obj3) || (im3.n(obj3, bg5Var.getValue()) && ci5Var != null)) {
                    hf2Var = hf2.b;
                } else {
                    hf2Var = (im3.n(obj3, u18Var.f().b()) || im3.n(obj3, u18Var.f().d())) ? ((tb1) function1.invoke(pnVar)).b : ((tb1) function1.invoke(new ci5(pnVar, obj3, u18Var.f().b()))).b;
                }
                objK2 = hf2Var;
                ux2Var.g0(objK2);
            }
            hf2 hf2Var2 = (hf2) objK2;
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = new ln(im3.n(obj3, bg5Var2.getValue()));
                ux2Var.g0(objK3);
            }
            ln lnVar = (ln) objK3;
            bc2 bc2Var = tb1Var2.a;
            go8 go8Var = new go8(tb1Var2.c.z(), obj3);
            lnVar.b.setValue(Boolean.valueOf(im3.n(obj3, bg5Var2.getValue())));
            if (im3.n(obj3, bg5Var.getValue()) && !im3.n(obj3, bg5Var2.getValue()) && !im3.n(obj3, u18Var.a.p0())) {
                z = true;
            }
            lnVar.c.setValue(Boolean.valueOf(z));
            fs4 fs4VarF = go8Var.f(lnVar);
            boolean zH = ux2Var.h(obj3);
            Object objK4 = ux2Var.K();
            if (zH || objK4 == awVar) {
                objK4 = new io.sentry.okhttp.b(obj3, (byte) 3);
                ux2Var.g0(objK4);
            }
            Function1 function2 = (Function1) objK4;
            boolean zF = ux2Var.f(hf2Var2);
            Object objK5 = ux2Var.K();
            if (zF || objK5 == awVar) {
                objK5 = new dn(hf2Var2);
                ux2Var.g0(objK5);
            }
            vn4.E(u18Var, function2, fs4VarF, bc2Var, hf2Var2, (hw2) objK5, au8.O(1831990167, new fn(obj3, this.s, pnVar, this.t), ux2Var), ux2Var, 100663296);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
