package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import o.gk0;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {
    public static final String[] u = new String[128];
    public final Writer m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f273o;
    public String p;
    public String q;
    public boolean r;
    public String s;
    public final boolean t;

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
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArrCopyOf = new int[8];
        this.n = iArrCopyOf;
        this.f273o = 0;
        if (iArrCopyOf.length == 0) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
            this.n = iArrCopyOf;
        }
        int i = this.f273o;
        this.f273o = i + 1;
        iArrCopyOf[i] = 6;
        this.q = ":";
        this.t = true;
        this.m = writer;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void F(String str) throws IOException {
        String str2;
        Writer writer = this.m;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = u[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public final void G() {
        if (this.s != null) {
            int iZ = z();
            if (iZ == 5) {
                this.m.write(44);
            } else if (iZ != 3) {
                hk0.l("Nesting problem.");
                return;
            }
            q();
            this.n[this.f273o - 1] = 4;
            F(this.s);
            this.s = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
        int i = this.f273o;
        if (i > 1 || (i == 1 && this.n[i - 1] != 7)) {
            gk0.l("Incomplete document");
        } else {
            this.f273o = 0;
        }
    }

    public final void e() {
        int iZ = z();
        if (iZ == 1) {
            this.n[this.f273o - 1] = 2;
            q();
            return;
        }
        Writer writer = this.m;
        if (iZ == 2) {
            writer.append(',');
            q();
            return;
        }
        if (iZ == 4) {
            writer.append((CharSequence) this.q);
            this.n[this.f273o - 1] = 5;
            return;
        }
        if (iZ != 6) {
            if (iZ != 7) {
                hk0.l("Nesting problem.");
                return;
            } else if (!this.r) {
                hk0.l("JSON must have only one top-level value.");
                return;
            }
        }
        this.n[this.f273o - 1] = 7;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f273o != 0) {
            this.m.flush();
        } else {
            hk0.l("JsonWriter is closed.");
        }
    }

    public final void j(char c, int i, int i2) {
        int iZ = z();
        if (iZ != i2 && iZ != i) {
            hk0.l("Nesting problem.");
            return;
        }
        if (this.s != null) {
            hk0.n(this.s, "Dangling name: ");
            return;
        }
        this.f273o--;
        if (iZ == i2) {
            q();
        }
        this.m.write(c);
    }

    public final void q() throws IOException {
        if (this.p == null) {
            return;
        }
        Writer writer = this.m;
        writer.write(10);
        int i = this.f273o;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.p);
        }
    }

    public final void u() {
        if (this.s != null) {
            if (!this.t) {
                this.s = null;
                return;
            }
            G();
        }
        e();
        this.m.write("null");
    }

    public final int z() {
        int i = this.f273o;
        if (i != 0) {
            return this.n[i - 1];
        }
        hk0.l("JsonWriter is closed.");
        return 0;
    }
}
