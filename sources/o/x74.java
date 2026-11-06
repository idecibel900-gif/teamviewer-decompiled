package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x74 implements jw2 {
    public final /* synthetic */ List m;
    public final /* synthetic */ r74 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f2487o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yy0 t;
    public final /* synthetic */ List u;

    public x74(List list, r74 r74Var, Function1 function1, Function1 function2, Function1 function3, Function1 function4, String str, yy0 yy0Var, List list2) {
        this.m = list;
        this.n = r74Var;
        this.f2487o = function1;
        this.p = function2;
        this.q = function3;
        this.r = function4;
        this.s = str;
        this.t = yy0Var;
        this.u = list2;
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
        if (ux2Var.N(i & 1, (i & 147) != 146)) {
            j74 j74Var = (j74) this.m.get(iIntValue);
            ux2Var.W(-1732126546);
            boolean zF = ux2Var.f(j74Var.a);
            r74 r74Var = this.n;
            boolean zD = zF | ux2Var.d(r74Var.ordinal()) | ux2Var.f(this.f2487o) | ux2Var.f(this.p) | ux2Var.f(this.q) | ux2Var.f(this.r);
            String str = this.s;
            boolean zF2 = zD | ux2Var.f(str);
            Object objK = ux2Var.K();
            if (zF2 || objK == e01.a) {
                objK = new w74(this.f2487o, j74Var, r74Var, this.r, this.s, this.p, this.q);
                ux2Var.g0(objK);
            }
            this.t.h(w14Var, Integer.valueOf(iIntValue), j74Var, Boolean.valueOf(r74Var == r74.m && im3.n(str, j74Var.a)), (Function0) objK, ux2Var, Integer.valueOf(i & 126));
            ux2Var.W(-1730933946);
            ux2Var.p(false);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
