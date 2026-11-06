package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s23 implements jw2 {
    public final /* synthetic */ List m;
    public final /* synthetic */ ns1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v23 f1975o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ me1 q;
    public final /* synthetic */ w44 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ u23 t;

    public s23(List list, ns1 ns1Var, v23 v23Var, boolean z, me1 me1Var, w44 w44Var, Function1 function1, u23 u23Var) {
        this.m = list;
        this.n = ns1Var;
        this.f1975o = v23Var;
        this.p = z;
        this.q = me1Var;
        this.r = w44Var;
        this.s = function1;
        this.t = u23Var;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        w14 w14Var = (w14) obj;
        int iIntValue = ((Number) obj2).intValue();
        ux2 ux2Var = (ux2) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (ux2Var.f(w14Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ux2Var.d(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (ux2Var.N(i & 1, (i & 147) != 146)) {
            ns1 ns1Var = (ns1) this.m.get(iIntValue);
            ux2Var.W(-1707206235);
            ns1 ns1Var2 = this.n;
            boolean z2 = ns1Var2 != null && ns1Var.a == ns1Var2.a;
            v23 v23Var = this.f1975o;
            String str = v23Var.f ? v23Var.e : "";
            boolean z3 = z2;
            boolean z4 = this.p;
            boolean zG = ux2Var.g(z4) | ux2Var.h(this.q);
            w44 w44Var = this.r;
            boolean zF = zG | ux2Var.f(w44Var);
            if ((((i & 112) ^ 48) <= 32 || !ux2Var.d(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean zF2 = zF | z | ux2Var.f(this.s) | ux2Var.h(ns1Var);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zF2 || objK == awVar) {
                objK = new ga1(this.p, this.q, this.s, ns1Var, w44Var, iIntValue, (byte) 1);
                ux2Var.g0(objK);
            }
            Function1 function1 = (Function1) objK;
            u23 u23Var = this.t;
            boolean zH = ux2Var.h(u23Var) | ux2Var.h(ns1Var);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == awVar) {
                objK2 = new e3((byte) 7, u23Var, ns1Var, false);
                ux2Var.g0(objK2);
            }
            t23.a(ns1Var, z3, z4, function1, (Function0) objK2, null, str, ux2Var, 0);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
