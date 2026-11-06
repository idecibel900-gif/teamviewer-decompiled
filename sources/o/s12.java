package o;

/* JADX INFO: loaded from: classes.dex */
public final class s12 implements ut4 {
    public static final s12 n = new s12(0);
    public final /* synthetic */ byte m;

    public /* synthetic */ s12(byte b) {
        this.m = b;
    }

    @Override // o.ut4
    public final float G() {
        switch (this.m) {
            case 0:
                return 0.0f;
            default:
                return 1.0f;
        }
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        switch (this.m) {
            case 0:
                break;
        }
        return xk0.G(this, de1Var);
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        switch (this.m) {
            case 0:
                break;
        }
        return hw2Var.invoke(obj, this);
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        switch (this.m) {
            case 0:
                break;
        }
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        switch (this.m) {
            case 0:
                break;
        }
        return xk0.v(this, ce1Var);
    }
}
