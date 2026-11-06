package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fs8 extends as8 {
    public final transient is8 p;
    public final transient Object[] q;
    public final transient int r;

    public fs8(is8 is8Var, Object[] objArr, int i) {
        this.p = is8Var;
        this.q = objArr;
        this.r = i;
    }

    @Override // o.lr8
    public final int a(Object[] objArr) {
        return d().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.p.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // o.as8
    public final yr8 i() {
        return new es8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r;
    }
}
