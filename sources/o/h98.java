package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h98 {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        g98[] g98VarArrValues = g98.values();
        ArrayList arrayList = new ArrayList(g98VarArrValues.length);
        for (g98 g98Var : g98VarArrValues) {
            arrayList.add(g98Var.n);
        }
        a = lv0.T0(arrayList);
        f98[] f98VarArrValues = f98.values();
        ArrayList arrayList2 = new ArrayList(f98VarArrValues.length);
        for (f98 f98Var : f98VarArrValues) {
            arrayList2.add(f98Var.m);
        }
        lv0.T0(arrayList2);
        b = new HashMap();
        c = new HashMap();
        xm4.T(new HashMap(xm4.Q(4)), new vd5[]{new vd5(f98.UBYTEARRAY, sy4.e("ubyteArrayOf")), new vd5(f98.USHORTARRAY, sy4.e("ushortArrayOf")), new vd5(f98.UINTARRAY, sy4.e("uintArrayOf")), new vd5(f98.ULONGARRAY, sy4.e("ulongArrayOf"))});
        g98[] g98VarArrValues2 = g98.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g98 g98Var2 : g98VarArrValues2) {
            linkedHashSet.add(g98Var2.f874o.f());
        }
        d = linkedHashSet;
        for (g98 g98Var3 : g98.values()) {
            HashMap map = b;
            js0 js0Var = g98Var3.f874o;
            js0 js0Var2 = g98Var3.m;
            map.put(js0Var, js0Var2);
            c.put(js0Var2, g98Var3.f874o);
        }
    }

    public static final boolean a(oz3 oz3Var) {
        ys0 ys0VarA;
        if (p58.m(oz3Var) || (ys0VarA = oz3Var.o0().a()) == null) {
            return false;
        }
        fi1 fi1VarI = ys0VarA.i();
        return (fi1VarI instanceof ad5) && im3.n(((bd5) ((ad5) fi1VarI)).q, t87.l) && a.contains(ys0VarA.getName());
    }
}
