package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tp1 {
    public static final Set b = lv1.V(xy3.CLASS);
    public static final Set c = cx.h1(new xy3[]{xy3.FILE_FACADE, xy3.MULTIFILE_CLASS_PART});
    public static final ps3 d;
    public static final ps3 e;
    public io.sentry.android.replay.screenshot.k a;

    static {
        new ps3(new int[]{1, 1, 2}, false);
        d = new ps3(new int[]{1, 1, 11}, false);
        e = new ps3(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final bq1 a(ad5 ad5Var, r86 r86Var) {
        String[] strArr;
        vd5 vd5VarH;
        r86Var.getClass();
        yy3 yy3Var = r86Var.b;
        ps3 ps3Var = yy3Var.b;
        String[] strArr2 = yy3Var.c;
        if (strArr2 == null) {
            strArr2 = yy3Var.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!c.contains(yy3Var.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = yy3Var.e) != null) {
            try {
                try {
                    vd5VarH = kt3.h(strArr2, strArr);
                } catch (rm3 e2) {
                    throw new IllegalStateException("Could not read data from ".concat(r86Var.a()), e2);
                }
            } catch (Throwable th) {
                ((jk0) c().c).getClass();
                if (ps3Var.b(e())) {
                    throw th;
                }
                vd5VarH = null;
            }
            if (vd5VarH != null) {
                qs3 qs3Var = (qs3) vd5VarH.m;
                mv5 mv5Var = (mv5) vd5VarH.n;
                d(r86Var);
                f(r86Var);
                rs3 rs3Var = new rs3(r86Var, mv5Var, qs3Var, b(r86Var));
                return new bq1(ad5Var, mv5Var, qs3Var, ps3Var, rs3Var, c(), "scope for " + rs3Var + " in " + ad5Var, x00.r);
            }
        }
        return null;
    }

    public final qp1 b(r86 r86Var) {
        ((jk0) c().c).getClass();
        int i = r86Var.b.g;
        return ((i & 16) == 0 || (i & 32) != 0) ? qp1.m : qp1.n;
    }

    public final io.sentry.android.replay.screenshot.k c() {
        io.sentry.android.replay.screenshot.k kVar = this.a;
        if (kVar != null) {
            return kVar;
        }
        im3.e0("components");
        throw null;
    }

    public final mg3 d(r86 r86Var) {
        ((jk0) c().c).getClass();
        yy3 yy3Var = r86Var.b;
        ps3 ps3Var = yy3Var.b;
        if (yy3Var.b.b(e())) {
            return null;
        }
        ps3 ps3Var2 = ps3.g;
        ps3 ps3VarE = e();
        ps3 ps3VarE2 = e();
        boolean z = ps3Var.f;
        ps3VarE2.getClass();
        ps3 ps3Var3 = z ? ps3Var2 : ps3.h;
        int i = ps3Var3.b;
        int i2 = ps3VarE2.b;
        return new mg3(ps3Var, ps3Var2, ps3VarE, (i <= i2 && (i < i2 || ps3Var3.c <= ps3VarE2.c)) ? ps3VarE2 : ps3Var3, r86Var.a(), p76.a(r86Var.a));
    }

    public final ps3 e() {
        ((jk0) c().c).getClass();
        return ps3.g;
    }

    public final boolean f(r86 r86Var) {
        ((jk0) c().c).getClass();
        ((jk0) c().c).getClass();
        yy3 yy3Var = r86Var.b;
        return (yy3Var.g & 2) != 0 && yy3Var.b.equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public final xr0 g(r86 r86Var) {
        String[] strArr;
        vd5 vd5VarF;
        yy3 yy3Var = r86Var.b;
        ps3 ps3Var = yy3Var.b;
        String[] strArr2 = yy3Var.c;
        if (strArr2 == null) {
            strArr2 = yy3Var.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!b.contains(yy3Var.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = yy3Var.e) != null) {
            try {
                try {
                    vd5VarF = kt3.f(strArr2, strArr);
                } catch (rm3 e2) {
                    throw new IllegalStateException("Could not read data from ".concat(r86Var.a()), e2);
                }
            } catch (Throwable th) {
                ((jk0) c().c).getClass();
                if (ps3Var.b(e())) {
                    throw th;
                }
                vd5VarF = null;
            }
            if (vd5VarF != null) {
                qs3 qs3Var = (qs3) vd5VarF.m;
                tu5 tu5Var = (tu5) vd5VarF.n;
                d(r86Var);
                f(r86Var);
                return new xr0(qs3Var, tu5Var, ps3Var, new hz3(r86Var, b(r86Var)));
            }
        }
        return null;
    }
}
