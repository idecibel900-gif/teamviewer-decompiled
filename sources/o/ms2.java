package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ms2 implements Comparable {
    public static final ms2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ms2 f1503o;
    public static final ms2 p;
    public static final ms2 q;
    public static final ms2 r;
    public static final List s;
    public final int m;

    static {
        ms2 ms2Var = new ms2(100);
        ms2 ms2Var2 = new ms2(200);
        ms2 ms2Var3 = new ms2(300);
        ms2 ms2Var4 = new ms2(400);
        ms2 ms2Var5 = new ms2(500);
        ms2 ms2Var6 = new ms2(600);
        n = ms2Var6;
        ms2 ms2Var7 = new ms2(700);
        ms2 ms2Var8 = new ms2(800);
        ms2 ms2Var9 = new ms2(900);
        f1503o = ms2Var4;
        p = ms2Var5;
        q = ms2Var6;
        r = ms2Var7;
        s = qf0.L(ms2Var, ms2Var2, ms2Var3, ms2Var4, ms2Var5, ms2Var6, ms2Var7, ms2Var8, ms2Var9);
    }

    public ms2(int i) {
        this.m = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        li3.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return im3.t(this.m, ((ms2) obj).m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ms2) {
            return this.m == ((ms2) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return this.m;
    }

    public final String toString() {
        return fx3.f(this.m, "FontWeight(weight=", ")");
    }
}
