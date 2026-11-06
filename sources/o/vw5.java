package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vw5 {
    public static final vw5 c = new vw5();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final df6 a = new df6((byte) 4);

    public final cj6 a(Class cls) {
        gg2 gg2Var;
        cj6 cj6VarW;
        Class cls2;
        ul3.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        cj6 cj6Var = (cj6) concurrentHashMap.get(cls);
        if (cj6Var != null) {
            return cj6Var;
        }
        Class cls3 = hj6.a;
        if (!py2.class.isAssignableFrom(cls) && (cls2 = hj6.a) != null && !cls2.isAssignableFrom(cls)) {
            hk0.g("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        w06 w06VarA = ((em4) this.a.n).a(cls);
        if ((w06VarA.d & 2) == 2) {
            if (py2.class.isAssignableFrom(cls)) {
                cj6VarW = new xq4(hj6.c, ig2.a, w06VarA.a);
            } else {
                j88 j88Var = hj6.b;
                gg2 gg2Var2 = ig2.b;
                if (gg2Var2 == null) {
                    hk0.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                cj6VarW = new xq4(j88Var, gg2Var2, w06VarA.a);
            }
        } else if (py2.class.isAssignableFrom(cls)) {
            cj6VarW = vq4.w(w06VarA, n35.b, ib4.b, hj6.c, ua5.B(w06VarA.a()) != 1 ? ig2.a : null, um4.b);
        } else {
            l35 l35Var = n35.a;
            hb4 hb4Var = ib4.a;
            j88 j88Var2 = hj6.b;
            if (ua5.B(w06VarA.a()) != 1) {
                gg2 gg2Var3 = ig2.b;
                if (gg2Var3 == null) {
                    hk0.l("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                gg2Var = gg2Var3;
            } else {
                gg2Var = null;
            }
            cj6VarW = vq4.w(w06VarA, l35Var, hb4Var, j88Var2, gg2Var, um4.a);
        }
        cj6 cj6Var2 = (cj6) concurrentHashMap.putIfAbsent(cls, cj6VarW);
        return cj6Var2 != null ? cj6Var2 : cj6VarW;
    }
}
