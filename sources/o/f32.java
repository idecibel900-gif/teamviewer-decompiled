package o;

/* JADX INFO: loaded from: classes2.dex */
public final class f32 {
    public final String a;
    public final int b;

    public f32(String str, int i) {
        String strB = no8.b(str);
        if (strB == null) {
            hk0.g("unexpected hostname: ".concat(str));
            throw null;
        }
        this.a = strB;
        if (i == -1) {
            i = 443;
        } else if (1 > i || i >= 65536) {
            hk0.g(fx3.e(i, "unexpected port: "));
            throw null;
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f32)) {
            return false;
        }
        f32 f32Var = (f32) obj;
        return f32Var.a.equals(this.a) && f32Var.b == this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        int i = this.b;
        String str = this.a;
        if (i == 443) {
            return str;
        }
        return str + ':' + i;
    }
}
