package o;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class f54 extends AbstractList implements RandomAccess, i54 {
    public static final r88 n = new r88(new f54());
    public final ArrayList m;

    public f54(i54 i54Var) {
        this.m = new ArrayList(i54Var.size());
        addAll(i54Var);
    }

    @Override // o.i54
    public final zh0 J(int i) {
        zh0 pc4Var;
        ArrayList arrayList = this.m;
        Object obj = arrayList.get(i);
        if (obj instanceof zh0) {
            pc4Var = (zh0) obj;
        } else if (obj instanceof String) {
            try {
                pc4Var = new pc4(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                an4.n("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            pc4Var = new pc4(bArr2);
        }
        if (pc4Var != obj) {
            arrayList.set(i, pc4Var);
        }
        return pc4Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.m.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof i54) {
            collection = ((i54) collection).e();
        }
        boolean zAddAll = this.m.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // o.i54
    public final void c0(pc4 pc4Var) {
        this.m.add(pc4Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.m.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.i54
    public final List e() {
        return Collections.unmodifiableList(this.m);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.m;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zh0) {
            zh0 zh0Var = (zh0) obj;
            String strO = zh0Var.o();
            if (zh0Var.h()) {
                arrayList.set(i, strO);
            }
            return strO;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = tl3.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (x37.s(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            an4.n("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // o.i54
    public final r88 j() {
        return new r88(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.m.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof zh0) {
            return ((zh0) objRemove).o();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = tl3.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            an4.n("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.m.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof zh0) {
            return ((zh0) obj2).o();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = tl3.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            an4.n("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m.size();
    }

    public f54() {
        this.m = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.m.size(), collection);
    }
}
