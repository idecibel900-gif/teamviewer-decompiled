package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kr4 extends es4 implements v01, r04 {
    public LinkedHashMap A;

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        float f = ((w32) xk0.q(this, ml3.c)).m;
        if (f < 0.0f) {
            f = 0.0f;
        }
        jl5 jl5VarC = zn4Var.C(j);
        boolean z = this.z && !Float.isNaN(f) && w32.a(f, 0.0f) > 0;
        int iQ0 = !Float.isNaN(f) ? fo4Var.q0(f) : 0;
        int iMax = jl5VarC.m;
        if (z) {
            iMax = Math.max(iMax, iQ0);
        }
        int iMax2 = jl5VarC.n;
        if (z) {
            iMax2 = Math.max(iMax2, iQ0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.A;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.A = linkedHashMap;
            }
            id8 id8Var = ml3.b;
            int iRound = Math.round((iQ0 - jl5VarC.m) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(id8Var, Integer.valueOf(iRound));
            b63 b63Var = ml3.a;
            int iRound2 = Math.round((iQ0 - jl5VarC.n) / 2.0f);
            linkedHashMap.put(b63Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.A;
        if (map == null) {
            map = fa2.m;
        }
        return fo4Var.u(iMax, iMax2, map, new tj3(iMax, jl5VarC, iMax2));
    }
}
