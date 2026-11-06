package o;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 implements be1, ce1 {
    public static final ju n = new ju((byte) 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kl0 f1277o = new kl0(1);
    public final /* synthetic */ byte m;

    public /* synthetic */ kl0(byte b) {
        this.m = b;
    }

    @Override // o.de1
    public final /* bridge */ de1 H0(de1 de1Var) {
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

    @Override // o.be1
    public final ce1 getKey() {
        switch (this.m) {
            case 0:
                return n;
            default:
                return this;
        }
    }

    @Override // o.de1
    public final /* bridge */ de1 k0(ce1 ce1Var) {
        switch (this.m) {
            case 0:
                break;
        }
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final /* bridge */ be1 l0(ce1 ce1Var) {
        switch (this.m) {
            case 0:
                break;
        }
        return xk0.v(this, ce1Var);
    }
}
