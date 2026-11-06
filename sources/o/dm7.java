package o;

/* JADX INFO: loaded from: classes.dex */
public final class dm7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public dm7(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 8) == 0;
        boolean z4 = (i & 16) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm7)) {
            return false;
        }
        dm7 dm7Var = (dm7) obj;
        return this.a == dm7Var.a && this.b == dm7Var.b && this.c == dm7Var.c && this.d == dm7Var.d && this.e == dm7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + to7.f(to7.f(to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, false), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TVWebViewSettingsItem(javaScriptEnabled=");
        sb.append(this.a);
        sb.append(", builtInZoomControls=");
        sb.append(this.b);
        sb.append(", displayZoomControls=false, allowFileAccess=");
        fx3.s(sb, this.c, ", scrollToBottom=", this.d, ", allowDarkMode=");
        return ua5.n(")", sb, this.e);
    }
}
