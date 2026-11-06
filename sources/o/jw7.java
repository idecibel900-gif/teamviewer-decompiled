package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jw7 implements AutoCloseable {
    public static final char[] n = {'*', '|', '_', '-'};
    public final tn0 m;

    public jw7(String str) {
        this.m = new tn0(str);
    }

    public static String G(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder sbB = lb7.b();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbB.append(c2);
                    c = 0;
                }
            } else {
                sbB.append(c2);
            }
            c = c2;
        }
        return lb7.k(sbB);
    }

    public static boolean z(char c) {
        return c == '-' || lb7.g(c) || c == '_' || lb7.e(c) || c >= 128;
    }

    public final boolean F(char c) {
        tn0 tn0Var = this.m;
        if (!tn0Var.o0(c)) {
            return false;
        }
        tn0Var.u();
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final void e() {
        tn0 tn0Var = this.m;
        if (tn0Var.c0()) {
            return;
        }
        tn0Var.e();
    }

    public final String j(char c, char c2) {
        StringBuilder sbB = lb7.b();
        tn0 tn0Var = this.m;
        if (tn0Var.q - tn0Var.p < 1024) {
            tn0Var.r = 0;
        }
        tn0Var.j();
        tn0Var.t = tn0Var.p;
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (!tn0Var.c0()) {
            char cU = tn0Var.u();
            if (c3 == '\\') {
                if (cU == 'Q') {
                    z3 = true;
                } else if (cU == 'E') {
                    z3 = false;
                }
                sbB.append(cU);
            } else {
                if (cU == '\'' && cU != c && !z) {
                    z2 = !z2;
                } else if (cU == '\"' && cU != c && !z2) {
                    z = !z;
                }
                if (z2 || z || z3) {
                    sbB.append(cU);
                } else if (cU == c) {
                    i++;
                    if (i > 1) {
                        sbB.append(cU);
                    }
                } else if (cU != c2 || (i = i - 1) > 0) {
                    sbB.append(cU);
                }
            }
            if (i <= 0) {
                break;
            }
            c3 = cU;
        }
        String strK = lb7.k(sbB);
        if (i <= 0) {
            return strK;
        }
        tn0Var.N0();
        throw new fb8("Did not find balanced marker at '" + strK + "'");
    }

    public final String q() {
        char cB0;
        tn0 tn0Var = this.m;
        if (tn0Var.c0()) {
            hk0.g("CSS identifier expected, but end of input found");
            return null;
        }
        tn0Var.j();
        int i = tn0Var.p;
        int i2 = tn0Var.q;
        char[] cArr = tn0Var.f2125o;
        int i3 = i;
        while (i3 < i2 && z(cArr[i3])) {
            i3++;
        }
        tn0Var.p = i3;
        String strQ = i3 > i ? tn0.q(tn0Var.f2125o, tn0Var.m, i, i3 - i) : "";
        char cB1 = tn0Var.b0();
        if (cB1 != '\\' && cB1 != 0) {
            return strQ;
        }
        StringBuilder sbB = lb7.b();
        if (!strQ.isEmpty()) {
            sbB.append(strQ);
        }
        while (!tn0Var.c0()) {
            char cB2 = tn0Var.b0();
            if (!z(cB2)) {
                if (cB2 != 0) {
                    if (cB2 != '\\') {
                        break;
                    }
                    e();
                    if (!tn0Var.c0() && ((cB0 = tn0Var.b0()) == '\n' || cB0 == '\r' || cB0 == '\f')) {
                        tn0Var.O0();
                        break;
                    }
                    if (tn0Var.c0()) {
                        sbB.append((char) 65533);
                    } else {
                        char cU = tn0Var.u();
                        if (lb7.h(cU)) {
                            tn0Var.O0();
                            tn0Var.j();
                            int i4 = tn0Var.p;
                            int i5 = tn0Var.q;
                            char[] cArr2 = tn0Var.f2125o;
                            int i6 = i4;
                            while (i6 < i5 && i6 - i4 < 6 && lb7.h(cArr2[i6])) {
                                i6++;
                            }
                            tn0Var.p = i6;
                            String strQ2 = i6 > i4 ? tn0.q(tn0Var.f2125o, tn0Var.m, i4, i6 - i4) : "";
                            try {
                                int i7 = Integer.parseInt(strQ2, 16);
                                if (i7 == 0 || !Character.isValidCodePoint(i7) || Character.isSurrogate((char) i7)) {
                                    sbB.append((char) 65533);
                                } else {
                                    sbB.appendCodePoint(i7);
                                }
                                if (!tn0Var.c0()) {
                                    char cB3 = tn0Var.b0();
                                    if (cB3 == '\r') {
                                        e();
                                        if (!tn0Var.c0() && tn0Var.b0() == '\n') {
                                            e();
                                        }
                                    } else if (cB3 == ' ' || cB3 == '\t' || cB3 == '\n' || cB3 == '\r' || cB3 == '\f') {
                                        e();
                                    }
                                }
                            } catch (NumberFormatException e) {
                                throw new IllegalArgumentException("Invalid escape sequence: ".concat(strQ2), e);
                            }
                        } else {
                            sbB.append(cU);
                        }
                    }
                } else {
                    e();
                    sbB.append((char) 65533);
                }
            } else {
                sbB.append(tn0Var.u());
            }
        }
        return lb7.k(sbB);
    }

    public final String toString() {
        return this.m.toString();
    }

    public final boolean u() {
        boolean z = false;
        while (lb7.i(this.m.b0())) {
            e();
            z = true;
        }
        return z;
    }
}
