package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class y95 extends hm2 {
    public static final y95 e;
    public static final y95 f;
    public static final y95 g;
    public static final y95 h;
    public final /* synthetic */ byte d;

    static {
        int i = 1;
        e = new y95(i, 2, (byte) 0);
        int i2 = 1;
        f = new y95(i2, i2, (byte) 1);
        g = new y95(i, 2, (byte) 2);
        int i3 = 1;
        h = new y95(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y95(int i, int i2, byte b) {
        super(i, i2, (byte) 2);
        this.d = b;
    }

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        switch (this.d) {
            case 0:
                Object objA = ((Function0) rr0Var.h(0)).a();
                px2 px2Var = (px2) rr0Var.h(1);
                int iG = rr0Var.g(0);
                px2Var.getClass();
                k17Var.T(k17Var.c(px2Var), objA);
                jvVar.j(iG, objA);
                jvVar.d(objA);
                break;
            case 1:
                px2 px2Var2 = (px2) rr0Var.h(0);
                int iG2 = rr0Var.g(0);
                jvVar.i();
                px2Var2.getClass();
                jvVar.c(iG2, k17Var.C(k17Var.c(px2Var2)));
                break;
            case 2:
                Object objH = rr0Var.h(0);
                px2 px2Var3 = (px2) rr0Var.h(1);
                int iG3 = rr0Var.g(0);
                if (objH instanceof yx2) {
                    yx2 yx2Var = (yx2) objH;
                    ((xx4) au2Var.f).b(yx2Var);
                    ((kx4) au2Var.e).a(yx2Var);
                }
                Object objJ = k17Var.J(k17Var.c(px2Var3), iG3, objH);
                if (objJ instanceof yx2) {
                    au2Var.f((yx2) objJ);
                } else if (objJ instanceof j56) {
                    ((j56) objJ).c();
                }
                break;
            default:
                Object objH2 = rr0Var.h(0);
                int iG4 = rr0Var.g(0);
                if (objH2 instanceof yx2) {
                    yx2 yx2Var2 = (yx2) objH2;
                    ((xx4) au2Var.f).b(yx2Var2);
                    ((kx4) au2Var.e).a(yx2Var2);
                }
                Object objJ2 = k17Var.J(k17Var.t, iG4, objH2);
                if (objJ2 instanceof yx2) {
                    au2Var.f((yx2) objJ2);
                } else if (objJ2 instanceof j56) {
                    ((j56) objJ2).c();
                }
                break;
        }
    }

    @Override // o.hm2
    public px2 d(rr0 rr0Var) {
        switch (this.d) {
            case 0:
                return (px2) rr0Var.h(1);
            case 1:
                return (px2) rr0Var.h(0);
            default:
                return super.d(rr0Var);
        }
    }
}
