package o;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 extends yn2 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ bo2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(bo2 bo2Var, byte b) {
        super(bo2Var);
        this.e = b;
        this.f = bo2Var;
    }

    @Override // o.yn2
    public final float a() {
        float f;
        float f2;
        byte b = this.e;
        bo2 bo2Var = this.f;
        switch (b) {
            case 0:
                f = bo2Var.h;
                f2 = bo2Var.i;
                break;
            case 1:
                f = bo2Var.h;
                f2 = bo2Var.j;
                break;
            default:
                return bo2Var.h;
        }
        return f + f2;
    }
}
