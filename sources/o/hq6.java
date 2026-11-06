package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hq6 implements fq6, mi0 {
    public final String a;
    public final it1 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final fq6[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final fq6[] j;
    public final kh7 k;

    public hq6(String str, it1 it1Var, int i, List list, rs0 rs0Var) {
        this.a = str;
        this.b = it1Var;
        this.c = i;
        ArrayList arrayList = rs0Var.b;
        byte b = 12;
        HashSet hashSet = new HashSet(xm4.Q(mv0.Z(arrayList, 12)));
        lv0.M0(arrayList, hashSet);
        this.d = hashSet;
        int i2 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = im3.s(rs0Var.d);
        this.g = (List[]) rs0Var.e.toArray(new List[0]);
        ArrayList arrayList2 = rs0Var.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        ex exVar = new ex(new y(strArr, (byte) 10), (byte) 1);
        ArrayList arrayList3 = new ArrayList(mv0.Z(exVar, 10));
        Iterator it2 = exVar.iterator();
        while (true) {
            p62 p62Var = (p62) it2;
            if (!p62Var.n.hasNext()) {
                this.i = xm4.U(arrayList3);
                this.j = im3.s(list);
                this.k = new kh7(new y26(this, b));
                return;
            }
            sg3 sg3Var = (sg3) p62Var.next();
            arrayList3.add(new vd5(sg3Var.b, Integer.valueOf(sg3Var.a)));
        }
    }

    @Override // o.fq6
    public final String a() {
        return this.a;
    }

    @Override // o.mi0
    public final Set b() {
        return this.d;
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // o.fq6
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hq6) {
            fq6 fq6Var = (fq6) obj;
            if (this.a.equals(fq6Var.a()) && Arrays.equals(this.j, ((hq6) obj).j)) {
                int iE = fq6Var.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        fq6[] fq6VarArr = this.f;
                        if (im3.n(fq6VarArr[i2].a(), fq6Var.h(i2).a()) && im3.n(fq6VarArr[i2].k(), fq6Var.h(i2).k())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.fq6
    public final String f(int i) {
        return this.e[i];
    }

    @Override // o.fq6
    public final List g(int i) {
        return this.g[i];
    }

    @Override // o.fq6
    public final List getAnnotations() {
        return ea2.m;
    }

    @Override // o.fq6
    public final fq6 h(int i) {
        return this.f[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // o.fq6
    public final boolean i(int i) {
        return this.h[i];
    }

    @Override // o.fq6
    public final it1 k() {
        return this.b;
    }

    public final String toString() {
        return ds1.q0(this);
    }
}
