package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dz2 extends qs1 {
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ez2 e;

    public dz2(ArrayList arrayList, ez2 ez2Var) {
        this.d = arrayList;
        this.e = ez2Var;
    }

    @Override // o.qs1
    public final void I(zi0 zi0Var, zi0 zi0Var2) {
        throw new IllegalStateException(("Conflict in scope of " + this.e.b + ": " + zi0Var + " vs " + zi0Var2).toString());
    }

    @Override // o.qs1
    public final void z(zi0 zi0Var) {
        zi0Var.getClass();
        hc5.r(zi0Var, null);
        this.d.add(zi0Var);
    }
}
