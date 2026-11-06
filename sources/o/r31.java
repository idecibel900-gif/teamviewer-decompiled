package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r31 extends og7 implements iw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1887o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r31(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = 3;
        switch (b) {
            case 0:
                r31 r31Var = new r31(i, (hc1) obj3, (byte) 0);
                r31Var.n = (List) obj;
                r31Var.f1887o = (List) obj2;
                return r31Var.invokeSuspend(f88Var);
            case 1:
                r31 r31Var2 = new r31(i, (hc1) obj3, (byte) 1);
                r31Var2.n = (List) obj;
                r31Var2.f1887o = (List) obj2;
                return r31Var2.invokeSuspend(f88Var);
            default:
                r31 r31Var3 = new r31(i, (hc1) obj3, (byte) 2);
                r31Var3.n = (ly6) obj;
                r31Var3.f1887o = (gr5) obj2;
                return r31Var3.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                List list = (List) this.n;
                List list2 = (List) this.f1887o;
                ct1.a0(obj);
                ArrayList arrayListA0 = lv0.A0(list, list2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListA0) {
                    if (hashSet.add(((l33) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                List list3 = (List) this.n;
                List list4 = (List) this.f1887o;
                ct1.a0(obj);
                ArrayList arrayListA1 = lv0.A0(list3, list4);
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayListA1) {
                    if (hashSet2.add(((l33) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            default:
                ct1.a0(obj);
                ly6 ly6Var = (ly6) this.n;
                gr5 gr5Var = (gr5) this.f1887o;
                Set setKeySet = gr5Var.a().keySet();
                ArrayList arrayList3 = new ArrayList(mv0.Z(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((er5) it.next()).a);
                }
                Map<String, ?> all = ly6Var.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = lv0.T0((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList3.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        fx4 fx4Var = new fx4(new LinkedHashMap(gr5Var.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                str.getClass();
                                fx4Var.d(new er5(str), value2);
                            } else if (value2 instanceof Float) {
                                str.getClass();
                                fx4Var.d(new er5(str), value2);
                            } else if (value2 instanceof Integer) {
                                str.getClass();
                                fx4Var.d(new er5(str), value2);
                            } else if (value2 instanceof Long) {
                                str.getClass();
                                fx4Var.d(new er5(str), value2);
                            } else if (value2 instanceof String) {
                                str.getClass();
                                fx4Var.d(new er5(str), value2);
                            } else if (value2 instanceof Set) {
                                str.getClass();
                                fx4Var.d(new er5(str), (Set) value2);
                            }
                        }
                        return new fx4(new LinkedHashMap(fx4Var.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = ly6Var.b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                break;
        }
    }
}
