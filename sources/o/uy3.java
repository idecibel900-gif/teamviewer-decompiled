package o;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class uy3 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ wy3 n;

    public /* synthetic */ uy3(wy3 wy3Var, byte b) {
        this.m = b;
        this.n = wy3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        wy3 wy3Var = this.n;
        switch (b) {
            case 0:
                return Arrays.asList(wy3Var.k().y(t87.l), wy3Var.k().y(t87.n), wy3Var.k().y(t87.f2091o), wy3Var.k().y(t87.m));
            default:
                EnumMap enumMap = new EnumMap(ps5.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (ps5 ps5Var : ps5.values()) {
                    String strB = ps5Var.m.b();
                    if (strB == null) {
                        wy3.a(47);
                        throw null;
                    }
                    g07 g07VarW = wy3Var.j(strB).W();
                    if (g07VarW == null) {
                        wy3.a(48);
                        throw null;
                    }
                    String strB2 = ps5Var.n.b();
                    if (strB2 == null) {
                        wy3.a(47);
                        throw null;
                    }
                    g07 g07VarW2 = wy3Var.j(strB2).W();
                    if (g07VarW2 == null) {
                        wy3.a(48);
                        throw null;
                    }
                    enumMap.put(ps5Var, g07VarW2);
                    map.put(g07VarW, g07VarW2);
                    map2.put(g07VarW2, g07VarW);
                }
                return new vy3(enumMap, map, map2);
        }
    }
}
