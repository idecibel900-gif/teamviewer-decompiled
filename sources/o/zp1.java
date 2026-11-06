package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zp1 {
    public static final /* synthetic */ fw3[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final sd4 d;
    public final sd4 e;
    public final h50 f;
    public final vd4 g;
    public final vd4 h;
    public final /* synthetic */ aq1 i;

    static {
        x86 x86Var = w86.a;
        j = new fw3[]{x86Var.g(new gu5(x86Var.b(zp1.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), x86Var.g(new gu5(x86Var.b(zp1.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public zp1(aq1 aq1Var, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.i = aq1Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            sy4 sy4VarC = et1.C((ty4) aq1Var.b.b, ((iv5) ((t1) obj)).r);
            Object arrayList = linkedHashMap.get(sy4VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(sy4VarC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = a(linkedHashMap);
        aq1 aq1Var2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            sy4 sy4VarC2 = et1.C((ty4) aq1Var2.b.b, ((qv5) ((t1) obj2)).r);
            Object arrayList2 = linkedHashMap2.get(sy4VarC2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(sy4VarC2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = a(linkedHashMap2);
        ((jk0) ((io.sentry.android.replay.screenshot.k) this.i.b.a).c).getClass();
        aq1 aq1Var3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            sy4 sy4VarC3 = et1.C((ty4) aq1Var3.b.b, ((cw5) ((t1) obj3)).q);
            Object arrayList3 = linkedHashMap3.get(sy4VarC3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(sy4VarC3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = a(linkedHashMap3);
        byte b = 0;
        this.d = ((xd4) ((io.sentry.android.replay.screenshot.k) this.i.b.a).a).b(new wp1(this, b));
        byte b2 = 1;
        this.e = ((xd4) ((io.sentry.android.replay.screenshot.k) this.i.b.a).a).b(new wp1(this, b2));
        this.f = ((xd4) ((io.sentry.android.replay.screenshot.k) this.i.b.a).a).c(new wp1(this, (byte) 2));
        aq1 aq1Var4 = this.i;
        xd4 xd4Var = (xd4) ((io.sentry.android.replay.screenshot.k) aq1Var4.b.a).a;
        xp1 xp1Var = new xp1(this, aq1Var4, b);
        xd4Var.getClass();
        this.g = new vd4(xd4Var, xp1Var);
        aq1 aq1Var5 = this.i;
        xd4 xd4Var2 = (xd4) ((io.sentry.android.replay.screenshot.k) aq1Var5.b.a).a;
        xp1 xp1Var2 = new xp1(this, aq1Var5, b2);
        xd4Var2.getClass();
        this.h = new vd4(xd4Var2, xp1Var2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<t1> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
            for (t1 t1Var : iterable) {
                int iC = t1Var.c();
                int iG = cv0.g(iC) + iC;
                if (iG > 4096) {
                    iG = 4096;
                }
                cv0 cv0VarR = cv0.r(byteArrayOutputStream, iG);
                cv0VarR.G(iC);
                t1Var.f(cv0VarR);
                cv0VarR.u();
                arrayList.add(f88.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
