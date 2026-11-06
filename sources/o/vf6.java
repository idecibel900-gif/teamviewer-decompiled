package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vf6 implements k30, sa1 {
    public final ei4 a;
    public final o30 b;
    public tw6 c;

    public vf6(ei4 ei4Var, p30 p30Var, uf6 uf6Var) {
        this.a = ei4Var;
        o30 o30VarD = uf6Var.a.d();
        this.b = o30VarD;
        p30Var.d(o30VarD);
        o30VarD.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // o.k30
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
    }
}
