package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class im7 extends es4 implements r04 {
    public bg5 A;
    public int B;
    public boolean C;
    public e87 D;
    public km E;
    public km F;
    public w32 G;
    public w32 H;

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        float f;
        yn1 yn1Var = vn4.l0;
        boolean zIsEmpty = ((List) this.A.getValue()).isEmpty();
        fa2 fa2Var = fa2.m;
        if (zIsEmpty) {
            return fo4Var.u(0, 0, fa2Var, new vs6((byte) 18));
        }
        boolean z = this.C;
        bg5 bg5Var = this.A;
        float f2 = z ? ((wm7) ((List) bg5Var.getValue()).get(this.B)).c : ((wm7) ((List) bg5Var.getValue()).get(this.B)).b;
        w32 w32Var = this.H;
        hc1 hc1Var = null;
        if (w32Var != null) {
            km kmVar = this.F;
            if (kmVar == null) {
                kmVar = new km(w32Var, yn1Var, null, 12);
                this.F = kmVar;
            }
            if (w32.b(f2, ((w32) kmVar.e.getValue()).m)) {
                f = f2;
            } else {
                f = f2;
                im3.R(I0(), null, null, new hm7(kmVar, f2, this, hc1Var, (byte) 0), 3);
            }
        } else {
            f = f2;
            this.H = new w32(f);
        }
        float f3 = ((wm7) ((List) this.A.getValue()).get(this.B)).a;
        w32 w32Var2 = this.G;
        if (w32Var2 != null) {
            km kmVar2 = this.E;
            if (kmVar2 == null) {
                kmVar2 = new km(w32Var2, yn1Var, null, 12);
                this.E = kmVar2;
            }
            if (!w32.b(f3, ((w32) kmVar2.e.getValue()).m)) {
                im3.R(I0(), null, null, new hm7(kmVar2, f3, this, hc1Var, (byte) 1), 3);
            }
        } else {
            this.G = new w32(f3);
        }
        j04 layoutDirection = fo4Var.getLayoutDirection();
        km kmVar3 = this.E;
        if (layoutDirection != j04.m) {
            if (kmVar3 != null) {
                f3 = ((w32) kmVar3.d()).m;
            }
            f3 = -f3;
        } else if (kmVar3 != null) {
            f3 = ((w32) kmVar3.d()).m;
        }
        km kmVar4 = this.F;
        if (kmVar4 != null) {
            f = ((w32) kmVar4.d()).m;
        }
        jl5 jl5VarC = zn4Var.C(r61.b(j, fo4Var.q0(f), fo4Var.q0(f), 0, 0, 12));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2Var, new z90(jl5VarC, f3, (byte) 2));
    }
}
