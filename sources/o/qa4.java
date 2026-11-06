package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qa4 implements do4 {
    public final /* synthetic */ byte a;
    public final pw2 b;

    public /* synthetic */ qa4(pw2 pw2Var, byte b) {
        this.a = b;
        this.b = pw2Var;
    }

    @Override // o.do4
    public final eo4 c(final fo4 fo4Var, List list, long j) {
        final jl5 jl5VarC;
        byte b = this.a;
        fa2 fa2Var = fa2.m;
        switch (b) {
            case 0:
                return fo4Var.u(r61.i(j), r61.h(j), fa2Var, new o43(list, this, (byte) 7));
            default:
                final jl5 jl5Var = null;
                if (((hw2) this.b) != null) {
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            gc4.b("Collection contains no element matching the predicate.");
                            hk0.b();
                            return null;
                        }
                        zn4 zn4Var = (zn4) list.get(i);
                        if (im3.n(hm3.p(zn4Var), "text")) {
                            jl5VarC = zn4Var.C(r61.b(j, 0, 0, 0, 0, 11));
                        } else {
                            i++;
                        }
                    }
                } else {
                    jl5VarC = null;
                }
                final int iMax = Math.max(jl5VarC != null ? jl5VarC.m : 0, 0);
                final int iMax2 = Math.max(fo4Var.q0(nm7.a), fo4Var.l0(nm7.e) + 0 + (jl5VarC != null ? jl5VarC.n : 0));
                final Integer numValueOf = jl5VarC != null ? Integer.valueOf(jl5VarC.W(le.a)) : null;
                final Integer numValueOf2 = jl5VarC != null ? Integer.valueOf(jl5VarC.W(le.b)) : null;
                return fo4Var.u(iMax, iMax2, fa2Var, new Function1() { // from class: o.mm7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        il5 il5Var = (il5) obj;
                        jl5 jl5Var2 = jl5VarC;
                        jl5 jl5Var3 = jl5Var;
                        int i2 = iMax2;
                        if (jl5Var2 != null && jl5Var3 != null) {
                            Integer num = numValueOf;
                            num.getClass();
                            int iIntValue = num.intValue();
                            Integer num2 = numValueOf2;
                            num2.getClass();
                            int iIntValue2 = num2.intValue();
                            float f = iIntValue == iIntValue2 ? nm7.c : nm7.d;
                            fo4 fo4Var2 = fo4Var;
                            int iQ0 = fo4Var2.q0(es5.b) + fo4Var2.q0(f);
                            int iL0 = (fo4Var2.l0(nm7.e) + jl5Var3.n) - iIntValue;
                            int i3 = jl5Var2.m;
                            int i4 = iMax;
                            int i5 = (i2 - iIntValue2) - iQ0;
                            il5.k(il5Var, jl5Var2, (i4 - i3) / 2, i5);
                            il5.k(il5Var, jl5Var3, (i4 - jl5Var3.m) / 2, i5 - iL0);
                        } else if (jl5Var2 != null) {
                            float f2 = nm7.a;
                            il5.k(il5Var, jl5Var2, 0, (i2 - jl5Var2.n) / 2);
                        } else if (jl5Var3 != null) {
                            float f3 = nm7.a;
                            il5.k(il5Var, jl5Var3, 0, (i2 - jl5Var3.n) / 2);
                        }
                        return f88.a;
                    }
                });
        }
    }
}
