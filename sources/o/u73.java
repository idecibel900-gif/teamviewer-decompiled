package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u73 implements q67 {
    public final h93 m;
    public final gt2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2179o;
    public final /* synthetic */ z73 p;

    public u73(z73 z73Var, h93 h93Var) {
        h93Var.getClass();
        this.p = z73Var;
        this.m = h93Var;
        this.n = new gt2(((w36) z73Var.c.p).m.i());
    }

    public final void e(k53 k53Var) {
        c75 c75Var;
        xz2 xz2Var;
        k53Var.getClass();
        z73 z73Var = this.p;
        byte b = z73Var.d;
        if (b == 6) {
            return;
        }
        if (b != 5) {
            yq4.h(z73Var.d, "state: ");
            return;
        }
        gt2 gt2Var = this.n;
        ov7 ov7Var = gt2Var.e;
        gt2Var.e = ov7.d;
        ov7Var.a();
        ov7Var.b();
        z73Var.d = (byte) 6;
        if (k53Var.size() <= 0 || (c75Var = z73Var.a) == null || (xz2Var = c75Var.j) == null) {
            return;
        }
        y83.b(xz2Var, this.m, k53Var);
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.n;
    }

    @Override // o.q67
    public long i0(bf0 bf0Var, long j) throws IOException {
        z73 z73Var = this.p;
        bf0Var.getClass();
        try {
            return ((w36) z73Var.c.p).i0(bf0Var, j);
        } catch (IOException e) {
            z73Var.b.f();
            e(z73.f);
            throw e;
        }
    }
}
