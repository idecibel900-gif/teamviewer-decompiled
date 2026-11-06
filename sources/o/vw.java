package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vw extends a07 implements Map {
    public pw p;
    public rw q;
    public tw r;

    @Override // java.util.Map
    public final Set entrySet() {
        pw pwVar = this.p;
        if (pwVar != null) {
            return pwVar;
        }
        pw pwVar2 = new pw(this, (byte) 0);
        this.p = pwVar2;
        return pwVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f278o;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f278o;
    }

    @Override // java.util.Map
    public final Set keySet() {
        rw rwVar = this.q;
        if (rwVar != null) {
            return rwVar;
        }
        rw rwVar2 = new rw(this);
        this.q = rwVar2;
        return rwVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f278o);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        tw twVar = this.r;
        if (twVar != null) {
            return twVar;
        }
        tw twVar2 = new tw(this);
        this.r = twVar2;
        return twVar2;
    }
}
