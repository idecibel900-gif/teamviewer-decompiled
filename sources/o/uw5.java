package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uw5 {
    public static final uw5 c = new uw5();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final df6 a = new df6((byte) 3);

    public final bj6 a(Class cls) {
        bj6 bj6VarU;
        Class cls2;
        sl3.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        bj6 bj6Var = (bj6) concurrentHashMap.get(cls);
        if (bj6Var != null) {
            return bj6Var;
        }
        Class cls3 = gj6.a;
        if (!ny2.class.isAssignableFrom(cls) && (cls2 = gj6.a) != null && !cls2.isAssignableFrom(cls)) {
            hk0.g("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        v06 v06VarA = ((dm4) this.a.n).a(cls);
        if ((v06VarA.d & 2) == 2) {
            if (ny2.class.isAssignableFrom(cls)) {
                bj6VarU = new wq4(gj6.d, hg2.a, v06VarA.a);
            } else {
                i88 i88Var = gj6.b;
                fg2 fg2Var = hg2.b;
                if (fg2Var == null) {
                    hk0.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                bj6VarU = new wq4(i88Var, fg2Var, v06VarA.a);
            }
        } else if (ny2.class.isAssignableFrom(cls)) {
            bj6VarU = (v06VarA.d & 1) == 1 ? uq4.u(v06VarA, m35.b, gb4.b, gj6.d, hg2.a, tm4.b) : uq4.u(v06VarA, m35.b, gb4.b, gj6.d, null, tm4.b);
        } else if ((v06VarA.d & 1) == 1) {
            k35 k35Var = m35.a;
            eb4 eb4Var = gb4.a;
            i88 i88Var2 = gj6.b;
            fg2 fg2Var2 = hg2.b;
            if (fg2Var2 == null) {
                hk0.l("Protobuf runtime is not correctly loaded.");
                return null;
            }
            bj6VarU = uq4.u(v06VarA, k35Var, eb4Var, i88Var2, fg2Var2, tm4.a);
        } else {
            bj6VarU = uq4.u(v06VarA, m35.a, gb4.a, gj6.c, null, tm4.a);
        }
        bj6 bj6Var2 = (bj6) concurrentHashMap.putIfAbsent(cls, bj6VarU);
        return bj6Var2 != null ? bj6Var2 : bj6VarU;
    }
}
