package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class f46 {
    public final Context a;
    public final he3 b;
    public final kh7 c;
    public final kh7 d;
    public final kh7 e;
    public final uy0 f;

    public f46(Context context, he3 he3Var, kh7 kh7Var, kh7 kh7Var2, kh7 kh7Var3, uy0 uy0Var) {
        this.a = context;
        this.b = he3Var;
        this.c = kh7Var;
        this.d = kh7Var2;
        this.e = kh7Var3;
        this.f = uy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f46) {
            f46 f46Var = (f46) obj;
            return im3.n(this.a, f46Var.a) && this.b.equals(f46Var.b) && this.c == f46Var.c && this.d == f46Var.d && this.e == f46Var.e && this.f == f46Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((gk0.n.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + gk0.n + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
