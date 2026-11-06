package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class im4 implements Map, Serializable, vu3 {
    public static final im4 z;
    public Object[] m;
    public Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f1078o;
    public int[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public jm4 v;
    public km4 w;
    public jm4 x;
    public boolean y;

    static {
        im4 im4Var = new im4(0);
        im4Var.y = true;
        z = im4Var;
    }

    public im4(int i) {
        if (i < 0) {
            hk0.g("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.m = objArr;
        this.n = null;
        this.f1078o = iArr;
        this.p = new int[iHighestOneBit];
        this.q = 2;
        this.r = 0;
        this.s = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.q * 2;
            int length = this.p.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.p;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.r;
                    Object[] objArr = this.m;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.r = i6;
                    objArr[i5] = obj;
                    this.f1078o[i5] = i;
                    iArr[i] = i6;
                    this.u++;
                    this.t++;
                    if (i3 > this.q) {
                        this.q = i3;
                    }
                    return i5;
                }
                if (im3.n(this.m[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.p.length * 2);
                    break;
                }
                i = i == 0 ? this.p.length - 1 : i - 1;
            }
        }
    }

    public final im4 b() {
        c();
        this.y = true;
        if (this.u > 0) {
            return this;
        }
        im4 im4Var = z;
        im4Var.getClass();
        return im4Var;
    }

    public final void c() {
        if (this.y) {
            gk0.u();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.r - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1078o;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.p[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        bt1.M(this.m, 0, this.r);
        Object[] objArr = this.n;
        if (objArr != null) {
            bt1.M(objArr, 0, this.r);
        }
        this.u = 0;
        this.r = 0;
        this.t++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z2) {
        int i;
        Object[] objArr = this.n;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.r;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f1078o;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.m;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.p[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        bt1.M(this.m, i3, i);
        if (objArr != null) {
            bt1.M(objArr, i3, this.r);
        }
        this.r = i3;
    }

    public final boolean e(Collection collection) {
        boolean zN;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zN = false;
                    } else {
                        Object[] objArr = this.n;
                        objArr.getClass();
                        zN = im3.n(objArr[iG], entry.getValue());
                    }
                    if (!zN) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        jm4 jm4Var = this.x;
        if (jm4Var != null) {
            return jm4Var;
        }
        jm4 jm4Var2 = new jm4(this, (byte) 0);
        this.x = jm4Var2;
        return jm4Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.u == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.m;
        int length = objArr.length;
        int i2 = this.r;
        int i3 = length - i2;
        int i4 = i2 - this.u;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.m = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.n;
            this.n = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f1078o = Arrays.copyOf(this.f1078o, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.p.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.q;
        while (true) {
            int i3 = this.p[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (im3.n(this.m[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.p.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.n;
        objArr.getClass();
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.r;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f1078o[i] >= 0) {
                Object[] objArr = this.n;
                objArr.getClass();
                if (im3.n(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        fm4 fm4Var = new fm4(this, (byte) 0);
        int i = 0;
        while (fm4Var.hasNext()) {
            int i2 = fm4Var.m;
            im4 im4Var = (im4) fm4Var.p;
            if (i2 >= im4Var.r) {
                yq4.p();
                return 0;
            }
            fm4Var.m = i2 + 1;
            fm4Var.n = i2;
            Object obj = im4Var.m[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = im4Var.n;
            objArr.getClass();
            Object obj2 = objArr[fm4Var.n];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fm4Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.s;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.u == 0;
    }

    public final void j(int i) {
        int[] iArr;
        this.t++;
        int i2 = 0;
        if (this.r > this.u) {
            d(false);
        }
        this.p = new int[i];
        this.s = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.r) {
            int i3 = i2 + 1;
            int i4 = i(this.m[i2]);
            int i5 = this.q;
            while (true) {
                iArr = this.p;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    hk0.l("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
            iArr[i4] = i3;
            this.f1078o[i2] = i4;
            i2 = i3;
        }
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.m;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.n;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f1078o[i];
        loop0: while (true) {
            int i5 = length;
            int i6 = 0;
            do {
                length = length == 0 ? this.p.length - 1 : length - 1;
                int[] iArr2 = this.p;
                i2 = iArr2[length];
                i6++;
                if (i6 > this.q) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.m[i3]) - length;
                    iArr = this.p;
                }
            } while ((i4 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.f1078o[i3] = i5;
        }
        this.f1078o[i] = -1;
        this.u--;
        this.t++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jm4 jm4Var = this.v;
        if (jm4Var != null) {
            return jm4Var;
        }
        jm4 jm4Var2 = new jm4(this, (byte) 1);
        this.v = jm4Var2;
        return jm4Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.n;
        if (objArr == null) {
            int length = this.m.length;
            if (length < 0) {
                hk0.g("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.n = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.n;
            if (objArr == null) {
                int length = this.m.length;
                if (length < 0) {
                    hk0.g("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.n = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!im3.n(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.n;
        objArr.getClass();
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.u * 3) + 2);
        sb.append("{");
        int i = 0;
        fm4 fm4Var = new fm4(this, (byte) 0);
        while (fm4Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = fm4Var.m;
            im4 im4Var = (im4) fm4Var.p;
            if (i2 >= im4Var.r) {
                yq4.p();
                return null;
            }
            fm4Var.m = i2 + 1;
            fm4Var.n = i2;
            Object obj = im4Var.m[i2];
            if (obj == im4Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = im4Var.n;
            objArr.getClass();
            Object obj2 = objArr[fm4Var.n];
            if (obj2 == im4Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fm4Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        km4 km4Var = this.w;
        if (km4Var != null) {
            return km4Var;
        }
        km4 km4Var2 = new km4(this, (byte) 0);
        this.w = km4Var2;
        return km4Var2;
    }

    public im4() {
        this(8);
    }
}
