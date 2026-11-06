package o;

/* JADX INFO: loaded from: classes.dex */
public final class j56 {
    public s01 a;
    public int b;
    public px2 c;
    public hw2 d;
    public int e;
    public vw4 f;
    public jx4 g;

    public j56(s01 s01Var) {
        this.a = s01Var;
    }

    public final boolean a() {
        if (this.a != null) {
            px2 px2Var = this.c;
            if (px2Var != null ? px2Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final um3 b(Object obj) {
        um3 um3VarS;
        s01 s01Var = this.a;
        return (s01Var == null || (um3VarS = s01Var.s(this, obj)) == null) ? um3.m : um3VarS;
    }

    public final void c() {
        s01 s01Var = this.a;
        if (s01Var != null) {
            s01Var.A = true;
            s01Var.F.H();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
