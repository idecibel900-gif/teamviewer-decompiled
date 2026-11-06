package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xb1 extends g2 implements v46 {
    public final /* synthetic */ byte n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sy4 f2501o;
    public final Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(xi0 xi0Var, oz3 oz3Var, sy4 sy4Var) {
        super(oz3Var);
        oz3Var.getClass();
        this.p = xi0Var;
        this.f2501o = sy4Var;
    }

    public final sy4 B0() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.f2501o;
    }

    public final String toString() {
        byte b = this.n;
        Object obj = this.p;
        switch (b) {
            case 0:
                return getType() + ": Ctx { " + ((ns4) obj) + " }";
            default:
                return "Cxt { " + ((xi0) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(ns4 ns4Var, oz3 oz3Var, sy4 sy4Var) {
        super(oz3Var);
        oz3Var.getClass();
        this.p = ns4Var;
        this.f2501o = sy4Var;
    }
}
