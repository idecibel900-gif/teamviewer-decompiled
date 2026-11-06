package o;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class or2 implements mr2 {
    public final si a;
    public final lh7 b;
    public final g95 c;

    public or2(yl7 yl7Var, si siVar) {
        lh7 lh7Var = pr2.a;
        rr2 rr2Var = sr2.a;
        q43 q43Var = f22.a;
        rr2Var.getClass();
        hm3.c(xk0.G(rr2Var, q43Var).H0(ba2.m).H0(new se7(null)));
        g95 g95Var = new g95((byte) 4);
        this.a = siVar;
        this.b = lh7Var;
        this.c = g95Var;
        new a81(this, (byte) 19);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[Catch: Exception -> 0x009f, TRY_ENTER, TryCatch #1 {Exception -> 0x009f, blocks: (B:25:0x003d, B:27:0x004b, B:30:0x0050, B:32:0x0054, B:38:0x006e, B:55:0x0097, B:56:0x009e, B:33:0x005b, B:35:0x005f, B:37:0x006a), top: B:64:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final c68 a(b68 b68Var) {
        Typeface typefaceC;
        c68 c68Var;
        Object objRemove;
        lh7 lh7Var = this.b;
        synchronized (((ol5) lh7Var.n)) {
            try {
                c68 c68Var2 = (c68) ((ni4) lh7Var.f1364o).a(b68Var);
                if (c68Var2 != null) {
                    if (c68Var2.n) {
                        return c68Var2;
                    }
                    ni4 ni4Var = (ni4) lh7Var.f1364o;
                    synchronized (ni4Var.c) {
                        objRemove = ni4Var.b.a.remove(b68Var);
                        if (objRemove != null) {
                            ni4Var.d--;
                        }
                    }
                }
                try {
                    nr2 nr2Var = b68Var.a;
                    ym5 ym5Var = (ym5) this.c.m;
                    int i = b68Var.c;
                    ms2 ms2Var = b68Var.b;
                    if (nr2Var == null || (nr2Var instanceof ak1)) {
                        typefaceC = ym5Var.c(ms2Var, i);
                    } else {
                        if (!(nr2Var instanceof wy2)) {
                            if (nr2Var instanceof rc4) {
                                typefaceC = (Typeface) ((rc4) nr2Var).f.n;
                            } else {
                                c68Var = null;
                            }
                            if (c68Var != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((ol5) lh7Var.n)) {
                                if (((ni4) lh7Var.f1364o).a(b68Var) == null && c68Var.n) {
                                    ((ni4) lh7Var.f1364o).b(b68Var, c68Var);
                                }
                            }
                            return c68Var;
                        }
                        typefaceC = ym5Var.b((wy2) nr2Var, ms2Var, i);
                    }
                    c68Var = new c68(typefaceC);
                    if (c68Var != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((ol5) lh7Var.n)) {
                        if (((ni4) lh7Var.f1364o).a(b68Var) == null) {
                            ((ni4) lh7Var.f1364o).b(b68Var, c68Var);
                        }
                        return c68Var;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c68 b(nr2 nr2Var, ms2 ms2Var, int i, int i2) {
        int i3 = this.a.m;
        return a(new b68(nr2Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? ms2Var : new ms2(ct1.v(ms2Var.m + i3, 1, 1000)), i, i2, null));
    }
}
