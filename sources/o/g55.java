package o;

/* JADX INFO: loaded from: classes2.dex */
public final class g55 extends ym1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f862o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g55(g07 g07Var, byte b) {
        super(g07Var);
        this.f862o = b;
    }

    @Override // o.xm1, o.oz3
    public final boolean p0() {
        switch (this.f862o) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // o.xm1
    public final xm1 z0(g07 g07Var) {
        switch (this.f862o) {
            case 0:
                return new g55(g07Var, (byte) 0);
            default:
                return new g55(g07Var, (byte) 1);
        }
    }
}
