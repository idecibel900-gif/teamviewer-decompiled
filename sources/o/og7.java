package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class og7 extends jc1 implements rw2 {
    private final int arity;

    public og7(int i, hc1 hc1Var) {
        super(hc1Var);
        this.arity = i;
    }

    @Override // o.rw2
    public int getArity() {
        return this.arity;
    }

    @Override // o.i30
    public String toString() {
        return getCompletion() == null ? w86.a.i(this) : super.toString();
    }
}
