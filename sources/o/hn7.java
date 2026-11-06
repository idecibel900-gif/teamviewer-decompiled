package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hn7 implements Cloneable {
    public final String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f993o;
    public int p = 0;
    public int q = 0;

    public hn7(String str, String str2, String str3) {
        this.n = str;
        this.f993o = str2;
        this.m = str3;
        h();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hn7 clone() {
        try {
            return (hn7) super.clone();
        } catch (CloneNotSupportedException e) {
            gk0.r(e);
            return null;
        }
    }

    public final boolean b(int i) {
        return (this.q & i) != 0;
    }

    public final boolean c(int i) {
        return (this.p & i) != 0;
    }

    public final boolean d() {
        return (this.p & 2) != 0;
    }

    public final boolean e() {
        int i = this.p;
        return ((i & 16) == 0 && (i & 2) == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn7)) {
            return false;
        }
        hn7 hn7Var = (hn7) obj;
        return Objects.equals(this.n, hn7Var.n) && Objects.equals(this.m, hn7Var.m) && Objects.equals(this.f993o, hn7Var.f993o) && this.p == hn7Var.p;
    }

    public final void g(int i) {
        if ((i & 384) != 0) {
            String str = this.n;
            boolean z = !str.isEmpty() && lb7.e(str.charAt(0));
            for (int i2 = 0; z && i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                z = (cCharAt == '<' || cCharAt == '>' || cCharAt == '/' || cCharAt == 0 || cCharAt == 65533 || lb7.i(cCharAt)) ? false : true;
            }
            db8.e0("Data and RcData tag names must start with an ASCII letter and contain no whitespace, '<', '>', '/', null, or replacement characters", z);
        }
        this.p = i | this.p | 1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h() {
        String str = this.m;
        str.getClass();
        int i = 0;
        byte b = -1;
        switch (str.hashCode()) {
            case -2078206768:
                if (str.equals("http://www.w3.org/1999/xhtml")) {
                    b = 0;
                }
                break;
            case -296110905:
                if (str.equals("http://www.w3.org/2000/svg")) {
                    b = 1;
                }
                break;
            case 1725132794:
                if (str.equals("http://www.w3.org/1998/Math/MathML")) {
                    b = 2;
                }
                break;
        }
        String str2 = this.f993o;
        switch (b) {
            case 0:
                i = lb7.d(str2, im3.v) ? 32 : 0;
                if (lb7.d(str2, im3.w)) {
                    i |= 64;
                }
                if (lb7.d(str2, im3.u)) {
                    i |= 16;
                }
                if (lb7.d(str2, im3.f1077o)) {
                    i |= 1;
                }
                if (lb7.d(str2, im3.r)) {
                    i |= 2;
                }
                if (lb7.d(str2, im3.s)) {
                    i |= 4;
                }
                if (lb7.d(str2, im3.t)) {
                    i |= 8;
                }
                if (lb7.d(str2, im3.x)) {
                    i |= 128;
                }
                break;
            case 1:
                if (lb7.d(str2, im3.q)) {
                    i = 129;
                }
                break;
            case 2:
                if (lb7.d(str2, im3.p)) {
                    i = 129;
                }
                break;
        }
        this.q = i;
    }

    public final int hashCode() {
        return Objects.hash(this.n, this.m);
    }

    public final cz7 i() {
        if (c(128)) {
            return cz7.f572o;
        }
        if (c(256)) {
            return cz7.q;
        }
        return null;
    }

    public final String toString() {
        return this.n;
    }
}
