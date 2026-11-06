package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class la4 extends AbstractSet {
    public final /* synthetic */ byte m;
    public final /* synthetic */ na4 n;

    public /* synthetic */ la4(na4 na4Var, byte b) {
        this.m = b;
        this.n = na4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.m;
        na4 na4Var = this.n;
        switch (b) {
            case 0:
                na4Var.clear();
                break;
            default:
                na4Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ma4 ma4VarA;
        Object obj2;
        Object value;
        byte b = this.m;
        na4 na4Var = this.n;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                ma4 ma4Var = null;
                if (key != null) {
                    try {
                        ma4VarA = na4Var.a(key, false);
                    } catch (ClassCastException unused) {
                        ma4VarA = null;
                    }
                    break;
                } else {
                    ma4VarA = null;
                }
                if (ma4VarA != null && ((obj2 = ma4VarA.t) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    ma4Var = ma4VarA;
                }
                return ma4Var != null;
            default:
                return na4Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.m;
        na4 na4Var = this.n;
        switch (b) {
            case 0:
                return new ka4(na4Var, (byte) 0);
            default:
                return new ka4(na4Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ma4 ma4VarA;
        Object obj2;
        Object value;
        byte b = this.m;
        ma4 ma4VarA2 = null;
        na4 na4Var = this.n;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        ma4VarA = na4Var.a(key, false);
                    } catch (ClassCastException unused) {
                        ma4VarA = null;
                    }
                    break;
                } else {
                    ma4VarA = null;
                }
                if (ma4VarA != null && ((obj2 = ma4VarA.t) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    ma4VarA2 = ma4VarA;
                }
                if (ma4VarA2 == null) {
                    return false;
                }
                na4Var.c(ma4VarA2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        ma4VarA2 = na4Var.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (ma4VarA2 != null) {
                    na4Var.c(ma4VarA2, true);
                }
                return ma4VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.m;
        na4 na4Var = this.n;
        switch (b) {
            case 0:
                break;
        }
        return na4Var.p;
    }
}
