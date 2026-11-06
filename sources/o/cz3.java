package o;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cz3 extends w1 {
    public final List m;
    public final Object[] n;

    public cz3(List list, Object[] objArr) {
        list.getClass();
        this.m = list;
        this.n = objArr;
    }

    @Override // o.w1
    public final Set a() {
        List list = this.m;
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            arrayList.add(new AbstractMap.SimpleEntry((pv3) obj, this.n[i]));
            i = i2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : arrayList) {
            if (((AbstractMap.SimpleEntry) obj2).getValue() != di1.s) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj instanceof pv3) && this.n[((pv3) obj).n] != di1.s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if ((obj instanceof pv3) && (obj2 = this.n[((pv3) obj).n]) != di1.s) {
            return obj2;
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof pv3) ? obj2 : super.getOrDefault((pv3) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        ((pv3) obj).getClass();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof pv3) {
            return super.remove((pv3) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof pv3) {
            return super.remove((pv3) obj, obj2);
        }
        return false;
    }
}
