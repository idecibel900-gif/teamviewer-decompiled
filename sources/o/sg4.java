package o;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sg4 extends il5 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2019o;

    public /* synthetic */ sg4(Object obj, byte b) {
        this.n = b;
        this.f2019o = obj;
    }

    @Override // o.in1
    public final float Z() {
        byte b = this.n;
        Object obj = this.f2019o;
        switch (b) {
            case 0:
                return ((rg4) obj).Z();
            default:
                return ((AndroidComposeView) obj).getDensity().Z();
        }
    }

    @Override // o.il5
    public float a(e63 e63Var) {
        Function1 function1;
        int iW0;
        pc5 snapshotObserver;
        int iW1;
        switch (this.n) {
            case 0:
                hw2 hw2Var = e63Var.a;
                if (hw2Var != null) {
                    return ((Number) hw2Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                rg4 rg4Var = (rg4) this.f2019o;
                if (rg4Var.A) {
                    return Float.NaN;
                }
                k76 k76Var = new k76();
                k76Var.m = rg4Var;
                while (true) {
                    r8 r8Var = ((rg4) k76Var.m).C;
                    float f = (r8Var == null || (iW1 = cx.W0(e63Var, (e63[]) r8Var.c)) < 0) ? Float.NaN : ((float[]) r8Var.d)[iW1];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = k76Var.m;
                    if (!zIsNaN) {
                        ((rg4) obj).n0(rg4Var.D0(), e63Var);
                        return e63Var.a(f, ((rg4) k76Var.m).x0(), rg4Var.x0());
                    }
                    rg4 rg4Var2 = (rg4) obj;
                    hw2 hw2Var2 = rg4Var2.t;
                    if (hw2Var2 != null && (function1 = rg4Var2.u) != null && ((Boolean) function1.invoke(e63Var)).booleanValue()) {
                        rg4 rg4Var3 = (rg4) k76Var.m;
                        jx4 jx4Var = rg4Var3.w;
                        if (jx4Var == null) {
                            long[] jArr = ti6.a;
                            jx4Var = new jx4();
                            rg4Var3.w = jx4Var;
                        }
                        Object objG = jx4Var.g(e63Var);
                        if (objG == null) {
                            objG = new ll5(rg4Var3.F0(), rg4Var3, e63Var);
                            jx4Var.m(e63Var, objG);
                        }
                        ll5 ll5Var = (ll5) objG;
                        ll5Var.m = rg4Var3.F0();
                        Owner owner = rg4Var.D0().A;
                        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
                            snapshotObserver.a.f(ll5Var, rg4.F, new n5((Object) hw2Var2, (Object) k76Var, (Object) e63Var, (byte) 21));
                        }
                        ((rg4) k76Var.m).n0(rg4Var.D0(), e63Var);
                        r8 r8Var2 = ((rg4) k76Var.m).C;
                        float f2 = (r8Var2 == null || (iW0 = cx.W0(e63Var, (e63[]) r8Var2.c)) < 0) ? Float.NaN : ((float[]) r8Var2.d)[iW0];
                        if (!Float.isNaN(f2)) {
                            return e63Var.a(f2, ((rg4) k76Var.m).x0(), rg4Var.x0());
                        }
                    }
                    rg4 rg4VarI0 = ((rg4) k76Var.m).I0();
                    if (rg4VarI0 == null) {
                        ((rg4) k76Var.m).n0(rg4Var.D0(), e63Var);
                        return Float.NaN;
                    }
                    k76Var.m = rg4VarI0;
                }
                break;
            default:
                return super.a(e63Var);
        }
    }

    @Override // o.il5
    public final i04 b() {
        byte b = this.n;
        Object obj = this.f2019o;
        switch (b) {
            case 0:
                rg4 rg4Var = (rg4) obj;
                i04 i04VarX0 = rg4Var.A ? null : rg4Var.x0();
                if (i04VarX0 == null) {
                    rg4Var.D0().getLayoutDelegate().b();
                }
                return i04VarX0;
            default:
                return ((AndroidComposeView) obj).getRoot().getOuterCoordinator$ui();
        }
    }

    @Override // o.il5
    public final j04 c() {
        byte b = this.n;
        Object obj = this.f2019o;
        switch (b) {
            case 0:
                return ((rg4) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // o.il5
    public final int e() {
        byte b = this.n;
        Object obj = this.f2019o;
        switch (b) {
            case 0:
                return ((rg4) obj).Y();
            default:
                return ((AndroidComposeView) obj).getRoot().I();
        }
    }

    @Override // o.in1
    public final float getDensity() {
        byte b = this.n;
        Object obj = this.f2019o;
        switch (b) {
            case 0:
                return ((rg4) obj).getDensity();
            default:
                return ((AndroidComposeView) obj).getDensity().getDensity();
        }
    }
}
