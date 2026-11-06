package o;

import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ia1 implements jw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1046o;
    public final /* synthetic */ me1 p;
    public final /* synthetic */ w44 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Parcelable s;
    public final /* synthetic */ Object t;

    public ia1(List list, h71 h71Var, boolean z, me1 me1Var, w44 w44Var, Function1 function1, r81 r81Var) {
        this.n = list;
        this.s = h71Var;
        this.f1046o = z;
        this.p = me1Var;
        this.q = w44Var;
        this.r = function1;
        this.t = r81Var;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        h71 h71Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        Function1 function1 = this.r;
        w44 w44Var = this.q;
        me1 me1Var = this.p;
        boolean z = this.f1046o;
        Parcelable parcelable = this.s;
        List list = this.n;
        Object obj5 = this.t;
        aw awVar = e01.a;
        switch (b) {
            case 0:
                w14 w14Var = (w14) obj;
                int iIntValue = ((Number) obj2).intValue();
                ux2 ux2Var = (ux2) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (ux2Var.f(w14Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= ux2Var.d(iIntValue) ? 32 : 16;
                }
                if (!ux2Var.N(i & 1, (i & 147) != 146)) {
                    ux2Var.Q();
                } else {
                    h71 h71Var2 = (h71) list.get(iIntValue);
                    ux2Var.W(-721489859);
                    h71 h71Var3 = (h71) parcelable;
                    boolean z2 = h71Var3 != null && h71Var2.m == h71Var3.m && z;
                    boolean zF = ux2Var.f(function1) | ux2Var.f(w44Var) | ux2Var.h(me1Var) | ux2Var.g(z) | ((((i & 112) ^ 48) > 32 && ux2Var.d(iIntValue)) || (i & 48) == 32) | ux2Var.h(h71Var2);
                    Object objK = ux2Var.K();
                    if (zF || objK == awVar) {
                        objK = new ga1(this.f1046o, this.p, this.r, h71Var2, this.q, iIntValue, (byte) 0);
                        h71Var = h71Var2;
                        ux2Var.g0(objK);
                    } else {
                        h71Var = h71Var2;
                    }
                    uf0.c(0, (Function1) objK, h71Var, (r81) obj5, ux2Var, null, z2, this.f1046o);
                    ux2Var.p(false);
                }
                break;
            default:
                w14 w14Var2 = (w14) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ux2 ux2Var2 = (ux2) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                e43 e43Var = (e43) obj5;
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (ux2Var2.f(w14Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ux2Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    ux2Var2.Q();
                } else {
                    l33 l33Var = (l33) list.get(iIntValue3);
                    ux2Var2.W(-367323302);
                    boolean zN = im3.n(l33Var.a, (k33) parcelable);
                    boolean zF2 = ((((i2 & 112) ^ 48) > 32 && ux2Var2.d(iIntValue3)) || (i2 & 48) == 32) | ux2Var2.f(w44Var) | ux2Var2.h(me1Var) | ux2Var2.g(z) | ux2Var2.f(function1) | ux2Var2.h(l33Var);
                    Object objK2 = ux2Var2.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = new a43(this.f1046o, this.p, this.r, l33Var, this.q, iIntValue3);
                        ux2Var2.g0(objK2);
                    }
                    Function0 function0 = (Function0) objK2;
                    boolean zH = ux2Var2.h(e43Var) | ux2Var2.h(l33Var);
                    Object objK3 = ux2Var2.K();
                    if (zH || objK3 == awVar) {
                        objK3 = new b43(e43Var, l33Var, (byte) 0);
                        ux2Var2.g0(objK3);
                    }
                    Function0 function2 = (Function0) objK3;
                    boolean zH2 = ux2Var2.h(e43Var) | ux2Var2.h(l33Var);
                    Object objK4 = ux2Var2.K();
                    if (zH2 || objK4 == awVar) {
                        objK4 = new b43(e43Var, l33Var, (byte) 1);
                        ux2Var2.g0(objK4);
                    }
                    nv1.b(this.f1046o, l33Var, zN, function0, function2, (Function0) objK4, null, ux2Var2, 0);
                    ux2Var2.p(false);
                }
                break;
        }
        return f88Var;
    }

    public ia1(List list, boolean z, k33 k33Var, me1 me1Var, w44 w44Var, Function1 function1, e43 e43Var) {
        this.n = list;
        this.f1046o = z;
        this.s = k33Var;
        this.p = me1Var;
        this.q = w44Var;
        this.r = function1;
        this.t = e43Var;
    }
}
