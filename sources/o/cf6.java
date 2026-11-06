package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cf6 extends z04 {
    public static final cf6 c = new cf6("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf6(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                fa2 fa2Var = fa2.m;
                if (size == 0) {
                    return fo4Var.u(r61.k(j), r61.j(j), fa2Var, new le5((byte) 18));
                }
                if (size == 1) {
                    jl5 jl5VarC = ((zn4) list.get(0)).C(j);
                    return fo4Var.u(t61.g(jl5VarC.m, j), t61.f(jl5VarC.n, j), fa2Var, new v0(jl5VarC, (byte) 10));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    jl5 jl5VarC2 = ((zn4) list.get(i)).C(j);
                    iMax = Math.max(jl5VarC2.m, iMax);
                    iMax2 = Math.max(jl5VarC2.n, iMax2);
                    arrayList.add(jl5VarC2);
                }
                return fo4Var.u(t61.g(iMax, j), t61.f(iMax2, j), fa2Var, new di(arrayList, (byte) 2));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
