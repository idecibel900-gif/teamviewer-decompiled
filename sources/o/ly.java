package o;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ly implements Iterable, Cloneable {
    public int m = 0;
    public String[] n = new String[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f1417o = new Object[3];

    public static String c(Object obj) {
        return obj instanceof String ? (String) obj : "";
    }

    public static boolean n(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final void a(Object obj, String str) {
        b(this.m + 1);
        String[] strArr = this.n;
        int i = this.m;
        strArr[i] = str;
        this.f1417o[i] = obj;
        this.m = i + 1;
    }

    public final void b(int i) {
        db8.f0(i >= this.m);
        String[] strArr = this.n;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.m * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.n = (String[]) Arrays.copyOf(strArr, i);
        this.f1417o = Arrays.copyOf(this.f1417o, i);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ly clone() {
        try {
            ly lyVar = (ly) super.clone();
            lyVar.m = this.m;
            lyVar.n = (String[]) Arrays.copyOf(this.n, this.m);
            lyVar.f1417o = Arrays.copyOf(this.f1417o, this.m);
            int iL = l("/jsoup.userdata");
            if (iL != -1) {
                lyVar.f1417o[iL] = new HashMap((Map) this.f1417o[iL]);
            }
            int iL2 = l("/jsoup.spans");
            if (iL2 != -1) {
                lyVar.f1417o[iL2] = ((s06) this.f1417o[iL2]).a();
            }
            return lyVar;
        } catch (CloneNotSupportedException e) {
            gk0.r(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ly.class == obj.getClass()) {
            ly lyVar = (ly) obj;
            if (this.m == lyVar.m) {
                for (int i = 0; i < this.m; i++) {
                    int iL = lyVar.l(this.n[i]);
                    if (iL != -1 && Objects.equals(this.f1417o[i], lyVar.f1417o[iL])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int g(ig5 ig5Var) {
        int i = 0;
        if (this.m == 0) {
            return 0;
        }
        boolean z = ig5Var.b;
        int i2 = 0;
        while (i < this.m) {
            String str = this.n[i];
            i++;
            int i3 = i;
            while (i3 < this.m) {
                String str2 = this.n[i3];
                if (z ? str.equals(str2) : str.equalsIgnoreCase(str2)) {
                    i2++;
                    p(i3);
                    i3--;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String h(String str) {
        int iL = l(str);
        return iL == -1 ? "" : c(this.f1417o[iL]);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1417o) + (((this.m * 31) + Arrays.hashCode(this.n)) * 31);
    }

    public final String i(String str) {
        int iM = m(str);
        return iM == -1 ? "" : c(this.f1417o[iM]);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ky(this);
    }

    public final void k(lq1 lq1Var, h32 h32Var) {
        int i = this.m;
        int i2 = h32Var.p;
        HashSet hashSet = null;
        for (int i3 = 0; i3 < i; i3++) {
            String str = this.n[i3];
            if (!n(str)) {
                String strA = jy.a(i2, str);
                if (!strA.equals(str)) {
                    if (hashSet == null) {
                        hashSet = new HashSet(this.m);
                        for (int i4 = 0; i4 < this.m; i4++) {
                            String strF = this.n[i4];
                            if (!n(strF)) {
                                if (i2 != 2) {
                                    strF = us1.F(strF);
                                }
                                hashSet.add(strF);
                            }
                        }
                    }
                    while (true) {
                        if (hashSet.add(i2 == 2 ? strA : us1.F(strA))) {
                            break;
                        }
                        StringBuilder sbB = lb7.b();
                        sbB.append('_');
                        sbB.append(strA);
                        strA = lb7.k(sbB);
                    }
                }
                jy.b(strA, (String) this.f1417o[i3], lq1Var.j(' '), h32Var);
            }
        }
    }

    public final int l(String str) {
        db8.o0(str);
        for (int i = 0; i < this.m; i++) {
            if (str.equals(this.n[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int m(String str) {
        db8.o0(str);
        for (int i = 0; i < this.m; i++) {
            if (str.equalsIgnoreCase(this.n[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void o(String str, String str2) {
        db8.o0(str);
        int iL = l(str);
        if (iL != -1) {
            this.f1417o[iL] = str2;
        } else {
            a(str2, str);
        }
    }

    public final void p(int i) {
        if (i >= this.m) {
            throw new fb8("Must be false");
        }
        s06 s06VarR = r();
        if (s06VarR != null && !n(this.n[i])) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (!n(this.n[i3])) {
                    i2++;
                }
            }
            if (i2 >= 0) {
                int[] iArr = s06VarR.f;
                int i4 = i2 * 4;
                if (i4 < iArr.length) {
                    int i5 = i4 + 4;
                    int length = iArr.length - i5;
                    if (length > 0) {
                        System.arraycopy(iArr, i5, iArr, i4, length);
                    }
                    Arrays.fill(iArr, iArr.length - 4, iArr.length, -1);
                }
            }
        }
        int i6 = (this.m - i) - 1;
        if (i6 > 0) {
            String[] strArr = this.n;
            int i7 = i + 1;
            System.arraycopy(strArr, i7, strArr, i, i6);
            Object[] objArr = this.f1417o;
            System.arraycopy(objArr, i7, objArr, i, i6);
        }
        int i8 = this.m - 1;
        this.m = i8;
        this.n[i8] = null;
        this.f1417o[i8] = null;
    }

    public final s06 r() {
        int iL = l("/jsoup.spans");
        if (iL == -1) {
            return null;
        }
        return (s06) this.f1417o[iL];
    }

    public final Map s() {
        int iL = l("/jsoup.userdata");
        if (iL != -1) {
            return (Map) this.f1417o[iL];
        }
        HashMap map = new HashMap();
        a(map, "/jsoup.userdata");
        return map;
    }

    public final int size() {
        if (this.m == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            if (!n(this.n[i2])) {
                i++;
            }
        }
        return i;
    }

    public final int t(String str) {
        db8.o0(str);
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            String str2 = this.n[i2];
            if (!n(str2)) {
                if (str.equals(str2)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sbB = lb7.b();
        k(lq1.S(sbB), new h32());
        return lb7.k(sbB);
    }
}
