package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class an5 implements fq6, mi0 {
    public final String a;
    public final qy2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final u14 i;
    public final u14 j;
    public final u14 k;

    public an5(String str, qy2 qy2Var, int i) {
        this.a = str;
        this.b = qy2Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = fa2.m;
        Function0 function0 = new Function0(this) { // from class: o.zm5
            public final /* synthetic */ an5 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                an5 an5Var = this.n;
                switch (b2) {
                    case 0:
                        qy2 qy2Var2 = an5Var.b;
                        return qy2Var2 != null ? qy2Var2.c() : vn4.h0;
                    case 1:
                        return im3.s(an5Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(ds1.O(an5Var, (fq6[]) an5Var.j.getValue()));
                }
            }
        };
        l54 l54Var = l54.m;
        this.i = ds1.X(l54Var, function0);
        final byte b2 = 1;
        this.j = ds1.X(l54Var, new Function0(this) { // from class: o.zm5
            public final /* synthetic */ an5 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                an5 an5Var = this.n;
                switch (b3) {
                    case 0:
                        qy2 qy2Var2 = an5Var.b;
                        return qy2Var2 != null ? qy2Var2.c() : vn4.h0;
                    case 1:
                        return im3.s(an5Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(ds1.O(an5Var, (fq6[]) an5Var.j.getValue()));
                }
            }
        });
        final byte b3 = 2;
        this.k = ds1.X(l54Var, new Function0(this) { // from class: o.zm5
            public final /* synthetic */ an5 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                an5 an5Var = this.n;
                switch (b4) {
                    case 0:
                        qy2 qy2Var2 = an5Var.b;
                        return qy2Var2 != null ? qy2Var2.c() : vn4.h0;
                    case 1:
                        return im3.s(an5Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(ds1.O(an5Var, (fq6[]) an5Var.j.getValue()));
                }
            }
        });
    }

    @Override // o.fq6
    public final String a() {
        return this.a;
    }

    @Override // o.mi0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // o.fq6
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof an5) {
            fq6 fq6Var = (fq6) obj;
            if (this.a.equals(fq6Var.a()) && Arrays.equals((fq6[]) this.j.getValue(), (fq6[]) ((an5) obj).j.getValue())) {
                int iE = fq6Var.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (im3.n(h(i2).a(), fq6Var.h(i2).a()) && im3.n(h(i2).k(), fq6Var.h(i2).k())) {
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
        List list = this.f[i];
        return list == null ? ea2.m : list;
    }

    @Override // o.fq6
    public final List getAnnotations() {
        return ea2.m;
    }

    @Override // o.fq6
    public fq6 h(int i) {
        return ((nw3[]) this.i.getValue())[i].d();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // o.fq6
    public final boolean i(int i) {
        return this.g[i];
    }

    public final void j(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    @Override // o.fq6
    public it1 k() {
        return lc7.d;
    }

    public String toString() {
        return ds1.q0(this);
    }
}
