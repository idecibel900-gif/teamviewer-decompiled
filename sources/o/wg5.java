package o;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class wg5 implements Comparable {
    public static final String n;
    public final ai0 m;

    static {
        String str = File.separator;
        str.getClass();
        n = str;
    }

    public wg5(ai0 ai0Var) {
        ai0Var.getClass();
        this.m = ai0Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iC = c.c(this);
        ai0 ai0Var = this.m;
        if (iC == -1) {
            iC = 0;
        } else if (iC < ai0Var.d() && ai0Var.i(iC) == 92) {
            iC++;
        }
        int iD = ai0Var.d();
        int i = iC;
        while (iC < iD) {
            if (ai0Var.i(iC) == 47 || ai0Var.i(iC) == 92) {
                arrayList.add(ai0Var.o(i, iC));
                i = iC + 1;
            }
            iC++;
        }
        if (i < ai0Var.d()) {
            arrayList.add(ai0Var.o(i, ai0Var.d()));
        }
        return arrayList;
    }

    public final String b() {
        ai0 ai0Var = c.a;
        ai0 ai0VarP = this.m;
        int iK = ai0.k(ai0VarP, ai0Var);
        if (iK == -1) {
            iK = ai0.k(ai0VarP, c.b);
        }
        if (iK != -1) {
            ai0VarP = ai0.p(ai0VarP, iK + 1, 0, 2);
        } else if (f() != null && ai0VarP.d() == 2) {
            ai0VarP = ai0.p;
        }
        return ai0VarP.s();
    }

    public final wg5 c() {
        ai0 ai0Var = c.d;
        ai0 ai0Var2 = this.m;
        if (im3.n(ai0Var2, ai0Var)) {
            return null;
        }
        ai0 ai0Var3 = c.a;
        if (im3.n(ai0Var2, ai0Var3)) {
            return null;
        }
        ai0 ai0Var4 = c.b;
        if (im3.n(ai0Var2, ai0Var4)) {
            return null;
        }
        ai0 ai0Var5 = c.e;
        ai0Var2.getClass();
        ai0Var5.getClass();
        int iD = ai0Var2.d();
        byte[] bArr = ai0Var5.m;
        if (ai0Var2.m(iD - bArr.length, ai0Var5, bArr.length) && (ai0Var2.d() == 2 || ai0Var2.m(ai0Var2.d() - 3, ai0Var3, 1) || ai0Var2.m(ai0Var2.d() - 3, ai0Var4, 1))) {
            return null;
        }
        int iK = ai0.k(ai0Var2, ai0Var3);
        if (iK == -1) {
            iK = ai0.k(ai0Var2, ai0Var4);
        }
        if (iK == 2 && f() != null) {
            if (ai0Var2.d() == 3) {
                return null;
            }
            return new wg5(ai0.p(ai0Var2, 0, 3, 1));
        }
        if (iK == 1) {
            ai0Var4.getClass();
            if (ai0Var2.m(0, ai0Var4, ai0Var4.d())) {
                return null;
            }
        }
        if (iK != -1 || f() == null) {
            if (iK == -1) {
                return new wg5(ai0Var);
            }
            return iK == 0 ? new wg5(ai0.p(ai0Var2, 0, 1, 1)) : new wg5(ai0.p(ai0Var2, 0, iK, 1));
        }
        if (ai0Var2.d() == 2) {
            return null;
        }
        return new wg5(ai0.p(ai0Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wg5 wg5Var = (wg5) obj;
        wg5Var.getClass();
        return this.m.compareTo(wg5Var.m);
    }

    public final wg5 d(wg5 wg5Var) {
        wg5Var.getClass();
        ai0 ai0Var = wg5Var.m;
        int iC = c.c(this);
        ai0 ai0Var2 = this.m;
        wg5 wg5Var2 = iC == -1 ? null : new wg5(ai0Var2.o(0, iC));
        int iC2 = c.c(wg5Var);
        if (!im3.n(wg5Var2, iC2 == -1 ? null : new wg5(ai0Var.o(0, iC2)))) {
            an4.l("Paths of different roots cannot be relative to each other: ", this, " and ", wg5Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = wg5Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && im3.n(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && ai0Var2.d() == ai0Var.d()) {
            return vv.s(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.e) != -1) {
            an4.l("Impossible relative path to resolve: ", this, " and ", wg5Var);
            return null;
        }
        if (im3.n(ai0Var, c.d)) {
            return this;
        }
        bf0 bf0Var = new bf0();
        ai0 ai0VarB = c.b(wg5Var);
        if (ai0VarB == null && (ai0VarB = c.b(this)) == null) {
            ai0VarB = c.f(n);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            bf0Var.R0(c.e);
            bf0Var.R0(ai0VarB);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            bf0Var.R0((ai0) arrayListA.get(i));
            bf0Var.R0(ai0VarB);
            i++;
        }
        return c.d(bf0Var, false);
    }

    public final wg5 e(String str) {
        str.getClass();
        bf0 bf0Var = new bf0();
        bf0Var.Z0(str);
        return c.a(this, c.d(bf0Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wg5) && im3.n(((wg5) obj).m, this.m);
    }

    public final Character f() {
        ai0 ai0Var = c.a;
        ai0 ai0Var2 = this.m;
        if (ai0.g(ai0Var2, ai0Var) != -1 || ai0Var2.d() < 2 || ai0Var2.i(1) != 58) {
            return null;
        }
        char cI = (char) ai0Var2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final File toFile() {
        return new File(this.m.s());
    }

    public final String toString() {
        return this.m.s();
    }
}
