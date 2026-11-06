package o;

/* JADX INFO: loaded from: classes2.dex */
public final class nb8 extends xo4 {
    public final byte c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public nb8(int i) {
        StringBuilder sbK = fx3.k(i, "must have at least ", " value parameter");
        sbK.append(i > 1 ? "s" : "");
        super(sbK.toString(), (byte) 1);
        this.c = i;
    }

    @Override // o.zp0
    public final boolean b(eo3 eo3Var) {
        return eo3Var.J().size() >= this.c;
    }
}
