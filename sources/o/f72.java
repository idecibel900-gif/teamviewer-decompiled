package o;

/* JADX INFO: loaded from: classes2.dex */
public final class f72 implements nw3 {
    public static final f72 a = new f72();
    public static final ls5 b = new ls5("o.c72", is5.l);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        long j = ((c72) obj).m;
        aw awVar = c72.n;
        StringBuilder sb = new StringBuilder();
        if (c72.e(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jH = c72.e(j) ? c72.h(j) : j;
        long jG = c72.g(jH, g72.HOURS);
        boolean z = false;
        int iG = c72.d(jH) ? 0 : (int) (c72.g(jH, g72.MINUTES) % 60);
        int iG2 = c72.d(jH) ? 0 : (int) (c72.g(jH, g72.SECONDS) % 60);
        int iC = c72.c(jH);
        if (c72.d(j)) {
            jG = 9999999999999L;
        }
        boolean z2 = jG != 0;
        boolean z3 = (iG2 == 0 && iC == 0) ? false : true;
        if (iG != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jG);
            sb.append('H');
        }
        if (z) {
            sb.append(iG);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            c72.b(sb, iG2, iC, 9, "S", true);
        }
        bb7Var.q(sb.toString());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        aw awVar = c72.n;
        String strJ = aj1Var.j();
        strJ.getClass();
        try {
            long jX = lq1.x(strJ);
            if (jX == c72.q) {
                throw new IllegalStateException("invariant failed");
            }
            return new c72(jX);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(fx3.g("Invalid ISO duration string format: '", strJ, "'."), e);
        }
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
