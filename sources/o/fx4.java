package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fx4 extends gr5 {
    public final LinkedHashMap a;
    public final df6 b;

    public fx4(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new df6(z);
    }

    @Override // o.gr5
    public final Map a() {
        vd5 vd5Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iQ = xm4.Q(mv0.Z(setEntrySet, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                vd5Var = new vd5(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                vd5Var = new vd5(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(vd5Var.m, vd5Var.n);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.n).get()) {
            hk0.l("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(er5 er5Var, Object obj) {
        er5Var.getClass();
        d(er5Var, obj);
    }

    public final void d(er5 er5Var, Object obj) {
        er5Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(er5Var);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(lv0.T0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(er5Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(er5Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(er5Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zN;
        if (obj instanceof fx4) {
            LinkedHashMap linkedHashMap = ((fx4) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zN = im3.n(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zN = true;
                                } else {
                                    zN = false;
                                }
                            } else {
                                zN = false;
                            }
                            if (!zN) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return lv0.t0(this.a.entrySet(), ",\n", "{\n", "\n}", zm.D, 24);
    }

    public /* synthetic */ fx4(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
