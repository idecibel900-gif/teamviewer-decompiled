package o;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends io.sentry.l6 {
    public static r3 e;
    public static r3 f;
    public static r3 g;
    public static final rb6 h = rb6.n;
    public static final rb6 i = rb6.m;
    public final /* synthetic */ byte c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(byte b) {
        super((byte) 3);
        this.c = b;
    }

    public int D(int i2, rb6 rb6Var) {
        vs7 vs7Var = (vs7) this.d;
        if (vs7Var == null) {
            im3.e0("layoutResult");
            throw null;
        }
        int iG = vs7Var.g(i2);
        vs7 vs7Var2 = (vs7) this.d;
        if (vs7Var2 == null) {
            im3.e0("layoutResult");
            throw null;
        }
        rb6 rb6VarH = vs7Var2.h(iG);
        vs7 vs7Var3 = (vs7) this.d;
        if (rb6Var != rb6VarH) {
            if (vs7Var3 != null) {
                return vs7Var3.g(i2);
            }
            im3.e0("layoutResult");
            throw null;
        }
        if (vs7Var3 != null) {
            return vs7Var3.b.c(i2, false) - 1;
        }
        im3.e0("layoutResult");
        throw null;
    }

    public void E(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    im3.e0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    im3.e0("impl");
                    throw null;
                }
        }
    }

    public boolean F(int i2) {
        if (i2 <= 0 || !G(i2 - 1)) {
            return false;
        }
        return i2 == l().length() || !G(i2);
    }

    public boolean G(int i2) {
        if (i2 < 0 || i2 >= l().length()) {
            return false;
        }
        return Character.isLetterOrDigit(l().codePointAt(i2));
    }

    @Override // io.sentry.l6
    public final int[] g(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        im3.e0("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            im3.e0("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return k(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        im3.e0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (l().length() <= 0 || i2 >= l().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!G(i2) && (!G(i2) || (i2 != 0 && G(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        im3.e0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    im3.e0("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !F(iFollowing2)) {
                    return null;
                }
                return k(i2, iFollowing2);
            default:
                if (l().length() <= 0 || i2 >= l().length()) {
                    return null;
                }
                vs7 vs7Var = (vs7) this.d;
                rb6 rb6Var = h;
                if (i2 < 0) {
                    if (vs7Var == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    iD = vs7Var.b.d(0);
                } else {
                    if (vs7Var == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    int iD2 = vs7Var.b.d(i2);
                    iD = D(iD2, rb6Var) == i2 ? iD2 : iD2 + 1;
                }
                vs7 vs7Var2 = (vs7) this.d;
                if (vs7Var2 == null) {
                    im3.e0("layoutResult");
                    throw null;
                }
                if (iD >= vs7Var2.b.f) {
                    return null;
                }
                return k(D(iD, rb6Var), D(iD, i) + 1);
        }
    }

    @Override // io.sentry.l6
    public final int[] u(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        im3.e0("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            im3.e0("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return k(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        im3.e0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = l().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !G(i2 - 1) && !F(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        im3.e0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    im3.e0("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !G(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !G(iPreceding2 - 1)) {
                    return k(iPreceding2, i2);
                }
                return null;
            default:
                if (l().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = l().length();
                vs7 vs7Var = (vs7) this.d;
                rb6 rb6Var = i;
                if (i2 > length3) {
                    if (vs7Var == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    iD = vs7Var.b.d(l().length());
                } else {
                    if (vs7Var == null) {
                        im3.e0("layoutResult");
                        throw null;
                    }
                    int iD2 = vs7Var.b.d(i2);
                    iD = D(iD2, rb6Var) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return k(D(iD, h), D(iD, rb6Var) + 1);
        }
    }
}
