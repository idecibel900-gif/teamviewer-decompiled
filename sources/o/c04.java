package o;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c04 {
    public final List a;
    public final qh4 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final rm i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f473o;
    public final float p;
    public final lm q;
    public final cj3 r;
    public final mm s;
    public final List t;
    public final int u;
    public final boolean v;
    public final df6 w;
    public final yc4 x;
    public final int y;

    public c04(List list, qh4 qh4Var, String str, long j, int i, long j2, String str2, List list2, rm rmVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, lm lmVar, cj3 cj3Var, List list3, int i5, mm mmVar, boolean z, df6 df6Var, yc4 yc4Var, int i6) {
        this.a = list;
        this.b = qh4Var;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = rmVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.f473o = f3;
        this.p = f4;
        this.q = lmVar;
        this.r = cj3Var;
        this.t = list3;
        this.u = i5;
        this.s = mmVar;
        this.v = z;
        this.w = df6Var;
        this.x = yc4Var;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        qh4 qh4Var = this.b;
        c04 c04Var = (c04) qh4Var.i.b(j);
        if (c04Var != null) {
            sb.append("\t\tParents: ");
            sb.append(c04Var.c);
            for (c04 c04Var2 = (c04) qh4Var.i.b(c04Var.f); c04Var2 != null; c04Var2 = (c04) qh4Var.i.b(c04Var2.f)) {
                sb.append("->");
                sb.append(c04Var2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
