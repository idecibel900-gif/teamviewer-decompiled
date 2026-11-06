package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dn4 extends m1 {
    public final /* synthetic */ byte m = 1;
    public final Object n;

    public dn4(List list) {
        list.getClass();
        this.n = list;
    }

    @Override // o.r0
    public final int a() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((fn4) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                String strGroup = ((fn4) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(lv0.C0(i, this));
        }
    }

    @Override // o.m1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // o.m1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.m) {
            case 1:
                return new ld6(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // o.m1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // o.m1, java.util.List
    public ListIterator listIterator() {
        switch (this.m) {
            case 1:
                return new ld6(this, 0);
            default:
                return super.listIterator();
        }
    }

    public dn4(fn4 fn4Var) {
        this.n = fn4Var;
    }

    @Override // o.m1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.m) {
            case 1:
                return new ld6(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
