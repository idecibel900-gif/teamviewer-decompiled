package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nh2 {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(p87.t, a("java.util.ArrayList", "java.util.LinkedList"));
        b(p87.u, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(p87.v, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ht2 ht2Var = new ht2("java.util.function.Function");
        ht2 ht2VarE = ht2Var.e();
        sy4 sy4VarF = ht2Var.f();
        sy4VarF.getClass();
        b(new js0(ht2VarE, sy4VarF), a("java.util.function.UnaryOperator"));
        ht2 ht2Var2 = new ht2("java.util.function.BiFunction");
        ht2 ht2VarE2 = ht2Var2.e();
        sy4 sy4VarF2 = ht2Var2.f();
        sy4VarF2.getClass();
        b(new js0(ht2VarE2, sy4VarF2), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new vd5(((js0) entry.getKey()).a(), ((js0) entry.getValue()).a()));
        }
        b = xm4.U(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            ht2 ht2Var = new ht2(str);
            ht2 ht2VarE = ht2Var.e();
            sy4 sy4VarF = ht2Var.f();
            sy4VarF.getClass();
            arrayList.add(new js0(ht2VarE, sy4VarF));
        }
        return arrayList;
    }

    public static void b(js0 js0Var, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, js0Var);
        }
    }
}
