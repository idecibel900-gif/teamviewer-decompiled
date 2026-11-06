package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y77 {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final u77 g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set setH1 = cx.h1(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(mv0.Z(setH1, 10));
        Iterator it = setH1.iterator();
        while (it.hasNext()) {
            arrayList.add(n37.q("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", ts3.BOOLEAN.f2139o));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((u77) it2.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((u77) it3.next()).b.b());
        }
        ts3 ts3Var = ts3.BOOLEAN;
        String str = ts3Var.f2139o;
        String str2 = ts3Var.f2139o;
        u77 u77VarQ = n37.q("java/util/Collection", "contains", "Ljava/lang/Object;", str);
        x77 x77Var = x77.p;
        vd5 vd5Var = new vd5(u77VarQ, x77Var);
        vd5 vd5Var2 = new vd5(n37.q("java/util/Collection", "remove", "Ljava/lang/Object;", str2), x77Var);
        vd5 vd5Var3 = new vd5(n37.q("java/util/Map", "containsKey", "Ljava/lang/Object;", str2), x77Var);
        vd5 vd5Var4 = new vd5(n37.q("java/util/Map", "containsValue", "Ljava/lang/Object;", str2), x77Var);
        vd5 vd5Var5 = new vd5(n37.q("java/util/Map", "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), x77Var);
        vd5 vd5Var6 = new vd5(n37.q("java/util/Map", "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), x77.q);
        u77 u77VarQ2 = n37.q("java/util/Map", "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        x77 x77Var2 = x77.n;
        vd5 vd5Var7 = new vd5(u77VarQ2, x77Var2);
        vd5 vd5Var8 = new vd5(n37.q("java/util/Map", "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), x77Var2);
        ts3 ts3Var2 = ts3.INT;
        u77 u77VarQ3 = n37.q("java/util/List", "indexOf", "Ljava/lang/Object;", ts3Var2.f2139o);
        x77 x77Var3 = x77.f2488o;
        Map mapR = xm4.R(vd5Var, vd5Var2, vd5Var3, vd5Var4, vd5Var5, vd5Var6, vd5Var7, vd5Var8, new vd5(u77VarQ3, x77Var3), new vd5(n37.q("java/util/List", "lastIndexOf", "Ljava/lang/Object;", ts3Var2.f2139o), x77Var3));
        c = mapR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(xm4.Q(mapR.size()));
        for (Map.Entry entry : mapR.entrySet()) {
            linkedHashMap.put(((u77) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetA0 = fv6.a0(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(mv0.Z(linkedHashSetA0, 10));
        Iterator it4 = linkedHashSetA0.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((u77) it4.next()).b);
        }
        e = lv0.T0(arrayList5);
        ArrayList arrayList6 = new ArrayList(mv0.Z(linkedHashSetA0, 10));
        Iterator it5 = linkedHashSetA0.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((u77) it5.next()).e);
        }
        f = lv0.T0(arrayList6);
        ts3 ts3Var3 = ts3.INT;
        String str3 = ts3Var3.f2139o;
        String str4 = ts3Var3.f2139o;
        u77 u77VarQ4 = n37.q("java/util/List", "removeAt", str3, "Ljava/lang/Object;");
        g = u77VarQ4;
        Map mapR2 = xm4.R(new vd5(n37.q("java/lang/Number", "toByte", "", ts3.BYTE.f2139o), sy4.e("byteValue")), new vd5(n37.q("java/lang/Number", "toShort", "", ts3.SHORT.f2139o), sy4.e("shortValue")), new vd5(n37.q("java/lang/Number", "toInt", "", str4), sy4.e("intValue")), new vd5(n37.q("java/lang/Number", "toLong", "", ts3.LONG.f2139o), sy4.e("longValue")), new vd5(n37.q("java/lang/Number", "toFloat", "", ts3.FLOAT.f2139o), sy4.e("floatValue")), new vd5(n37.q("java/lang/Number", "toDouble", "", ts3.DOUBLE.f2139o), sy4.e("doubleValue")), new vd5(u77VarQ4, sy4.e("remove")), new vd5(n37.q("java/lang/CharSequence", "get", str4, ts3.CHAR.f2139o), sy4.e("charAt")));
        h = mapR2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(mapR2.size()));
        for (Map.Entry entry2 : mapR2.entrySet()) {
            linkedHashMap2.put(((u77) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            u77 u77Var = (u77) entry3.getKey();
            sy4 sy4Var = (sy4) entry3.getValue();
            String str5 = u77Var.a;
            String str6 = u77Var.c;
            String str7 = u77Var.d;
            sy4Var.getClass();
            linkedHashSet.add(str5 + '.' + (sy4Var + '(' + str6 + ')' + str7));
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((u77) it6.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<vd5> arrayList7 = new ArrayList(mv0.Z(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new vd5(((u77) entry4.getKey()).b, entry4.getValue()));
        }
        int iQ = xm4.Q(mv0.Z(arrayList7, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iQ);
        for (vd5 vd5Var9 : arrayList7) {
            linkedHashMap3.put((sy4) vd5Var9.n, (sy4) vd5Var9.m);
        }
        k = linkedHashMap3;
    }
}
