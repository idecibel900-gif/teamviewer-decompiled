package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rc6 extends qc6 implements rw2 {
    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    public rc6(int i, hc1 hc1Var) {
        super(hc1Var);
        this.m = i;
    }

    @Override // o.rw2
    public final int getArity() {
        return this.m;
    }

    @Override // o.i30
    public final String toString() {
        return getCompletion() == null ? w86.a.i(this) : super.toString();
    }
}
