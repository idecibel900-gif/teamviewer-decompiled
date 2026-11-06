package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dk5 extends x1 {
    public final /* synthetic */ byte m;
    public final bk5 n;

    public /* synthetic */ dk5(bk5 bk5Var, byte b) {
        this.m = b;
        this.n = bk5Var;
    }

    @Override // o.x1
    public final int a() {
        byte b = this.m;
        bk5 bk5Var = this.n;
        switch (b) {
            case 0:
                break;
        }
        return bk5Var.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.m;
        bk5 bk5Var = this.n;
        switch (b) {
            case 0:
                bk5Var.clear();
                break;
            default:
                bk5Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    bk5 bk5Var = this.n;
                    Object obj2 = bk5Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && bk5Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.n.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.m;
        bk5 bk5Var = this.n;
        switch (b) {
            case 0:
                return new ek5(bk5Var);
            default:
                t28[] t28VarArr = new t28[8];
                for (int i = 0; i < 8; i++) {
                    t28VarArr[i] = new u28((byte) 1);
                }
                return new fk5(bk5Var, t28VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.m) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.n.remove(entry.getKey(), entry.getValue());
            default:
                bk5 bk5Var = this.n;
                if (!bk5Var.containsKey(obj)) {
                    return false;
                }
                bk5Var.remove(obj);
                return true;
        }
    }
}
