package androidx.compose.material3;

import o.e41;
import o.fx3;
import o.kh;
import o.le6;
import o.mw4;
import o.pw6;
import o.rv0;
import o.sf6;
import o.to7;
import o.um1;
import o.w32;
import o.xg3;
import o.z68;

/* JADX INFO: loaded from: classes.dex */
public final class c implements xg3 {
    public final boolean a;
    public final float b;
    public final long c;
    public final pw6 d;
    public final boolean e;

    public c(boolean z, float f, long j, pw6 pw6Var, boolean z2) {
        if (pw6Var == null) {
            w32 w32Var = w32.b(f, Float.NaN) ? null : new w32(f);
            pw6Var = w32Var != null ? sf6.a(w32Var.m) : null;
            if (pw6Var == null) {
                pw6Var = kh.V;
            }
        }
        this.a = z;
        this.b = f;
        this.c = j;
        this.d = pw6Var;
        this.e = z2;
    }

    @Override // o.xg3
    public final um1 a(mw4 mw4Var) {
        return new DelegatingThemeAwareRippleNode(mw4Var, this.a, this.b, new le6(this), this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a || !w32.b(this.b, cVar.b)) {
            return false;
        }
        long j = cVar.c;
        int i = rv0.i;
        return z68.a(this.c, j) && this.d.equals(cVar.d) && this.e == cVar.e;
    }

    @Override // o.xg3
    public final int hashCode() {
        int iE = e41.e(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = rv0.i;
        return Boolean.hashCode(true) + to7.f(to7.f(to7.f((this.d.hashCode() + fx3.c(iE, 31, this.c)) * 31, 31, true), 31, this.e), 31, true);
    }
}
