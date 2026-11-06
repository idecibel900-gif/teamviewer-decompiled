package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class x57 {
    public final yy0 a;
    public final String b;
    public final String c;
    public final z57 d;
    public final Intent e;
    public final Intent f;

    public x57(yy0 yy0Var, String str, String str2, z57 z57Var, Intent intent, Intent intent2) {
        this.a = yy0Var;
        this.b = str;
        this.c = str2;
        this.d = z57Var;
        this.e = intent;
        this.f = intent2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x57) {
            x57 x57Var = (x57) obj;
            if (this.a == x57Var.a && this.b.equals(x57Var.b) && this.c.equals(x57Var.c) && this.d == x57Var.d && this.e.equals(x57Var.e) && this.f.equals(x57Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + to7.e(to7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "SolutionInfoItem(appIconComposable=" + this.a + ", solutionTitle=" + this.b + ", solutionDescription=" + this.c + ", buttonType=" + this.d + ", mainIntent=" + this.e + ", fallbackIntent=" + this.f + ")";
    }
}
