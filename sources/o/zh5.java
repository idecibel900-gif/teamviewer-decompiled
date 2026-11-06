package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zh5 implements t96 {
    public final Set m;
    public final xx4 n = new xx4(new yx2[16]);

    public zh5(Set set) {
        this.m = set;
    }

    @Override // o.t96
    public final void a() {
    }

    @Override // o.t96
    public final void b() {
    }

    @Override // o.t96
    public final void c() {
        xx4 xx4Var = this.n;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            t96 t96Var = ((yx2) objArr[i2]).a;
            this.m.remove(t96Var);
            t96Var.c();
        }
    }
}
