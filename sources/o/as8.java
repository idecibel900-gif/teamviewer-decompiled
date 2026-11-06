package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class as8 extends lr8 implements Set {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f357o = 0;
    public transient yr8 n;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        hk0.g("collection too large");
        return 0;
    }

    public static as8 k(int i, Object... objArr) {
        if (i == 0) {
            return js8.v;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new ks8(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i2 = iH - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                yq4.l(fx3.e(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iV = g77.v(iHashCode);
            while (true) {
                int i6 = iV & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iV++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ks8(obj4);
        }
        if (h(i4) < iH / 2) {
            return k(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new js8(i3, i2, i4, objArr, objArr2);
    }

    @Override // o.lr8
    public yr8 d() {
        yr8 yr8Var = this.n;
        if (yr8Var != null) {
            return yr8Var;
        }
        yr8 yr8VarI = i();
        this.n = yr8VarI;
        return yr8VarI;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof as8) && (this instanceof js8) && (((as8) obj) instanceof js8) && ((js8) this).q != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public yr8 i() {
        Object[] array = toArray(lr8.m);
        nr8 nr8Var = yr8.n;
        return yr8.i(array.length, array);
    }
}
