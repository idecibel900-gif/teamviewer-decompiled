package o;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class g54 extends e2 implements h54, RandomAccess {
    public final ArrayList n;

    static {
        new g54(10).m = false;
    }

    public g54(int i) {
        this(new ArrayList(i));
    }

    @Override // o.h54
    public final void Y(vh0 vh0Var) {
        a();
        this.n.add(vh0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.n.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // o.e2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof h54) {
            collection = ((h54) collection).e();
        }
        boolean zAddAll = this.n.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // o.e2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.h54
    public final List e() {
        return Collections.unmodifiableList(this.n);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.n;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof yh0)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, sl3.a);
            if (ha8.a.q(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        yh0 yh0Var = (yh0) obj;
        Charset charset = sl3.a;
        if (yh0Var.size() == 0) {
            str = "";
        } else {
            vh0 vh0Var = (vh0) yh0Var;
            str = new String(vh0Var.p, vh0Var.g(), vh0Var.size(), charset);
        }
        vh0 vh0Var2 = (vh0) yh0Var;
        int iG = vh0Var2.g();
        if (ha8.a.q(vh0Var2.p, iG, vh0Var2.size() + iG)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // o.h54
    public final h54 j() {
        return this.m ? new s88(this) : this;
    }

    @Override // o.h54
    public final Object k0(int i) {
        return this.n.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.n.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof yh0)) {
            return new String((byte[]) objRemove, sl3.a);
        }
        yh0 yh0Var = (yh0) objRemove;
        Charset charset = sl3.a;
        if (yh0Var.size() == 0) {
            return "";
        }
        vh0 vh0Var = (vh0) yh0Var;
        return new String(vh0Var.p, vh0Var.g(), vh0Var.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.n.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof yh0)) {
            return new String((byte[]) obj2, sl3.a);
        }
        yh0 yh0Var = (yh0) obj2;
        Charset charset = sl3.a;
        if (yh0Var.size() == 0) {
            return "";
        }
        vh0 vh0Var = (vh0) yh0Var;
        return new String(vh0Var.p, vh0Var.g(), vh0Var.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n.size();
    }

    @Override // o.ql3
    public final ql3 z(int i) {
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            yq4.f();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new g54(arrayList2);
    }

    public g54(ArrayList arrayList) {
        this.n = arrayList;
    }

    @Override // o.e2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.n.size(), collection);
    }
}
