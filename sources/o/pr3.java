package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pr3 implements Closeable, Flushable {
    public static final String[] u = new String[128];
    public int[] n;
    public boolean q;
    public final bf0 s;
    public String t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f1766o = new String[32];
    public int[] p = new int[32];
    public int r = -1;
    public int m = 1;

    static {
        for (int i = 0; i <= 31; i++) {
            u[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = u;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public pr3(bf0 bf0Var) {
        int[] iArr = new int[32];
        this.n = iArr;
        this.s = bf0Var;
        iArr[0] = 6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void c0(bf0 bf0Var, String str) {
        String str2;
        bf0Var.U0(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = u[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        bf0Var.Y0(i, i2, str);
                    }
                    bf0Var.Z0(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    bf0Var.Y0(i, i2, str);
                }
                bf0Var.Z0(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            bf0Var.Y0(i, length, str);
        }
        bf0Var.U0(34);
    }

    public final String F() {
        return bt1.D(this.m, this.n, this.f1766o, this.p);
    }

    public final pr3 G(String str) {
        if (str == null) {
            yq4.l("name == null");
            return null;
        }
        if (this.m == 0) {
            hk0.l("JsonWriter is closed.");
            return null;
        }
        int iB0 = b0();
        if ((iB0 != 3 && iB0 != 5) || this.t != null || this.q) {
            hk0.l("Nesting problem.");
            return null;
        }
        this.t = str;
        this.f1766o[this.m - 1] = str;
        return this;
    }

    public final pr3 J() {
        if (this.q) {
            hk0.l("null cannot be used as a map key in JSON at path ".concat(F()));
            return null;
        }
        if (this.t != null) {
            this.t = null;
            return this;
        }
        e();
        this.s.Z0("null");
        int[] iArr = this.p;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void Y(char c, int i, int i2) {
        int i3;
        int i4 = this.m;
        int i5 = this.r;
        if (i4 == i5 && ((i3 = this.n[i4 - 1]) == i || i3 == i2)) {
            this.r = ~i5;
            return;
        }
        e();
        int i6 = this.m;
        int[] iArr = this.n;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new gq3("Nesting too deep at " + F() + ": circular reference?");
            }
            this.n = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1766o;
            this.f1766o = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.p;
            this.p = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.n;
        int i7 = this.m;
        this.m = i7 + 1;
        iArr3[i7] = i;
        this.p[i7] = 0;
        this.s.U0(c);
    }

    public final int b0() {
        int i = this.m;
        if (i != 0) {
            return this.n[i - 1];
        }
        hk0.l("JsonWriter is closed.");
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.m;
        if (i > 1 || (i == 1 && this.n[i - 1] != 7)) {
            gk0.l("Incomplete document");
        } else {
            this.m = 0;
        }
    }

    public final void e() {
        int iB0 = b0();
        int i = 2;
        if (iB0 != 1) {
            bf0 bf0Var = this.s;
            if (iB0 == 2) {
                bf0Var.U0(44);
            } else if (iB0 == 4) {
                bf0Var.Z0(":");
                i = 5;
            } else if (iB0 == 9) {
                hk0.l("Sink from valueSink() was not closed");
                return;
            } else {
                if (iB0 != 6) {
                    if (iB0 == 7) {
                        hk0.l("JSON must have only one top-level value.");
                        return;
                    } else {
                        hk0.l("Nesting problem.");
                        return;
                    }
                }
                i = 7;
            }
        }
        this.n[this.m - 1] = i;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.m != 0) {
            return;
        }
        hk0.l("JsonWriter is closed.");
    }

    public final pr3 j() {
        if (this.q) {
            hk0.l("Array cannot be used as a map key in JSON at path ".concat(F()));
            return null;
        }
        o0();
        Y('[', 1, 2);
        return this;
    }

    public final pr3 k0(long j) {
        if (this.q) {
            this.q = false;
            G(Long.toString(j));
            return this;
        }
        o0();
        e();
        this.s.Z0(Long.toString(j));
        int[] iArr = this.p;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final pr3 l0(String str) {
        if (str == null) {
            J();
            return this;
        }
        if (this.q) {
            this.q = false;
            G(str);
            return this;
        }
        o0();
        e();
        c0(this.s, str);
        int[] iArr = this.p;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void o0() {
        if (this.t != null) {
            int iB0 = b0();
            bf0 bf0Var = this.s;
            if (iB0 == 5) {
                bf0Var.U0(44);
            } else if (iB0 != 3) {
                hk0.l("Nesting problem.");
                return;
            }
            this.n[this.m - 1] = 4;
            c0(bf0Var, this.t);
            this.t = null;
        }
    }

    public final pr3 q() {
        if (this.q) {
            hk0.l("Object cannot be used as a map key in JSON at path ".concat(F()));
            return null;
        }
        o0();
        Y('{', 3, 5);
        return this;
    }

    public final void u(char c, int i, int i2) {
        int iB0 = b0();
        if (iB0 != i2 && iB0 != i) {
            hk0.l("Nesting problem.");
            return;
        }
        if (this.t != null) {
            hk0.n(this.t, "Dangling name: ");
            return;
        }
        int i3 = this.m;
        int i4 = ~this.r;
        if (i3 == i4) {
            this.r = i4;
            return;
        }
        int i5 = i3 - 1;
        this.m = i5;
        this.f1766o[i5] = null;
        int[] iArr = this.p;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.s.U0(c);
    }

    public final pr3 z() {
        this.q = false;
        u('}', 3, 5);
        return this;
    }
}
