package o;

/* JADX INFO: loaded from: classes.dex */
public final class bf3 {
    public static final bf3 g = new bf3(false, 0, true, 1, 1, kd4.f1251o);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final kd4 f;

    public bf3(boolean z, int i, boolean z2, int i2, int i3, kd4 kd4Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = kd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf3)) {
            return false;
        }
        bf3 bf3Var = (bf3) obj;
        return this.a == bf3Var.a && this.b == bf3Var.b && this.c == bf3Var.c && this.d == bf3Var.d && this.e == bf3Var.e && im3.n(this.f, bf3Var.f);
    }

    public final int hashCode() {
        return this.f.m.hashCode() + fx3.a(this.e, fx3.a(this.d, to7.f(fx3.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = i == 3 ? "Sentences" : "Invalid";
        }
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + str + ", autoCorrect=" + this.c + ", keyboardType=" + zx3.a(this.d) + ", imeAction=" + af3.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
