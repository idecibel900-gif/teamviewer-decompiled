package o;

/* JADX INFO: loaded from: classes.dex */
public final class s3 extends io.sentry.l6 {
    public static s3 e;
    public static final rb6 f = rb6.n;
    public static final rb6 g = rb6.m;
    public vs7 c;
    public fp6 d;

    public final int D(int i, rb6 rb6Var) {
        vs7 vs7Var = this.c;
        if (vs7Var == null) {
            im3.e0("layoutResult");
            throw null;
        }
        int iG = vs7Var.g(i);
        vs7 vs7Var2 = this.c;
        if (vs7Var2 == null) {
            im3.e0("layoutResult");
            throw null;
        }
        rb6 rb6VarH = vs7Var2.h(iG);
        vs7 vs7Var3 = this.c;
        if (rb6Var != rb6VarH) {
            if (vs7Var3 != null) {
                return vs7Var3.g(i);
            }
            im3.e0("layoutResult");
            throw null;
        }
        if (vs7Var3 != null) {
            return vs7Var3.b.c(i, false) - 1;
        }
        im3.e0("layoutResult");
        throw null;
    }

    @Override // io.sentry.l6
    public final int[] g(int i) {
        int iE;
        if (l().length() > 0 && i < l().length()) {
            try {
                fp6 fp6Var = this.d;
                if (fp6Var == null) {
                    im3.e0("node");
                    throw null;
                }
                v56 v56VarG = fp6Var.g();
                int iRound = Math.round(v56VarG.d - v56VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                vs7 vs7Var = this.c;
                if (vs7Var == null) {
                    im3.e0("layoutResult");
                    throw null;
                }
                int iD = vs7Var.b.d(i);
                vs7 vs7Var2 = this.c;
                if (vs7Var2 == null) {
                    im3.e0("layoutResult");
                    throw null;
                }
                float f2 = vs7Var2.b.f(iD) + iRound;
                vs7 vs7Var3 = this.c;
                if (vs7Var3 == null) {
                    im3.e0("layoutResult");
                    throw null;
                }
                xu4 xu4Var = vs7Var3.b;
                float f3 = xu4Var.f(xu4Var.f - 1);
                vs7 vs7Var4 = this.c;
                if (f2 < f3) {
                    if (vs7Var4 == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    iE = vs7Var4.b.e(f2);
                } else {
                    if (vs7Var4 == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    iE = vs7Var4.b.f;
                }
                return k(i, D(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // io.sentry.l6
    public final int[] u(int i) {
        int iE;
        if (l().length() > 0 && i > 0) {
            try {
                fp6 fp6Var = this.d;
                if (fp6Var == null) {
                    im3.e0("node");
                    throw null;
                }
                v56 v56VarG = fp6Var.g();
                int iRound = Math.round(v56VarG.d - v56VarG.b);
                int length = l().length();
                if (length <= i) {
                    i = length;
                }
                vs7 vs7Var = this.c;
                if (vs7Var == null) {
                    im3.e0("layoutResult");
                    throw null;
                }
                int iD = vs7Var.b.d(i);
                vs7 vs7Var2 = this.c;
                if (vs7Var2 == null) {
                    im3.e0("layoutResult");
                    throw null;
                }
                float f2 = vs7Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    vs7 vs7Var3 = this.c;
                    if (vs7Var3 == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    iE = vs7Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == l().length() && iE < iD) {
                    iE++;
                }
                return k(D(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
