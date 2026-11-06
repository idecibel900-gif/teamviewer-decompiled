package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class we1 {
    public static final ve1 Companion = new ve1();
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ we1(int i, String str, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            lq1.H(i, 7, ue1.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we1)) {
            return false;
        }
        we1 we1Var = (we1) obj;
        return im3.n(this.a, we1Var.a) && this.b == we1Var.b && this.c == we1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + to7.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashReportingConfiguration(url=");
        sb.append(this.a);
        sb.append(", attachViewHierarchy=");
        sb.append(this.b);
        sb.append(", attachScreenShot=");
        return ua5.n(")", sb, this.c);
    }
}
