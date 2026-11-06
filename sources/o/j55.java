package o;

/* JADX INFO: loaded from: classes2.dex */
public final class j55 implements nw3 {
    public static final j55 a = new j55();
    public static final i55 b = i55.a;

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        ((Void) obj).getClass();
        throw new nq6("'kotlin.Nothing' cannot be serialized");
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        throw new nq6("'kotlin.Nothing' does not have instances");
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
