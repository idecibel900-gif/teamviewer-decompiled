package o;

/* JADX INFO: loaded from: classes.dex */
public final class h82 {
    public final cv0 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public h82(xo xoVar, long j) {
        String str = xoVar.n;
        cv0 cv0Var = new cv0();
        cv0Var.d = str;
        cv0Var.b = -1;
        cv0Var.c = -1;
        this.a = cv0Var;
        this.b = gt7.f(j);
        this.c = gt7.e(j);
        this.d = -1;
        this.e = -1;
        int iF = gt7.f(j);
        int iE = gt7.e(j);
        if (iF < 0 || iF > str.length()) {
            hk0.r(ua5.l("start (", iF, str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            hk0.r(ua5.l("end (", iE, str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        hk0.g(ua5.l("Do not set reversed range: ", iF, iE, " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jA = h57.a(i, i2);
        this.a.v(i, i2, "");
        long jM = it1.M(h57.a(this.b, this.c), jA);
        h(gt7.f(jM));
        g(gt7.e(jM));
        int i3 = this.d;
        if (i3 != -1) {
            long jM2 = it1.M(h57.a(i3, this.e), jA);
            if (gt7.c(jM2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = gt7.f(jM2);
                this.e = gt7.e(jM2);
            }
        }
    }

    public final char b(int i) {
        cv0 cv0Var = this.a;
        rr0 rr0Var = (rr0) cv0Var.e;
        if (rr0Var != null && i >= cv0Var.b) {
            int iF = rr0Var.b - rr0Var.f();
            int i2 = cv0Var.b;
            if (i >= iF + i2) {
                return ((String) cv0Var.d).charAt(i - ((iF - cv0Var.c) + i2));
            }
            int i3 = i - i2;
            int i4 = rr0Var.c;
            char[] cArr = (char[]) rr0Var.e;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + rr0Var.d];
        }
        return ((String) cv0Var.d).charAt(i);
    }

    public final gt7 c() {
        int i = this.d;
        if (i != -1) {
            return new gt7(h57.a(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        cv0 cv0Var = this.a;
        if (i < 0 || i > cv0Var.k()) {
            hk0.r(ua5.l("start (", i, cv0Var.k(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > cv0Var.k()) {
            hk0.r(ua5.l("end (", i2, cv0Var.k(), ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            hk0.g(ua5.l("Do not set reversed range: ", i, i2, " > "));
            return;
        }
        cv0Var.v(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        cv0 cv0Var = this.a;
        if (i < 0 || i > cv0Var.k()) {
            hk0.r(ua5.l("start (", i, cv0Var.k(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > cv0Var.k()) {
            hk0.r(ua5.l("end (", i2, cv0Var.k(), ") offset is outside of text region "));
        } else if (i >= i2) {
            hk0.g(ua5.l("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        cv0 cv0Var = this.a;
        if (i < 0 || i > cv0Var.k()) {
            hk0.r(ua5.l("start (", i, cv0Var.k(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > cv0Var.k()) {
            hk0.r(ua5.l("end (", i2, cv0Var.k(), ") offset is outside of text region "));
        } else if (i > i2) {
            hk0.g(ua5.l("Do not set reversed range: ", i, i2, " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            li3.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            li3.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
