package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hs5 extends kv0 {
    public final gs5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs5(nw3 nw3Var) {
        super(nw3Var);
        nw3Var.getClass();
        this.b = new gs5(nw3Var.d());
    }

    @Override // o.kv0, o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        int iH = h(obj);
        gs5 gs5Var = this.b;
        bb7 bb7VarA = bb7Var.a(gs5Var);
        o(bb7VarA, obj, iH);
        bb7VarA.s(gs5Var);
    }

    @Override // o.s0, o.nw3
    public final Object b(aj1 aj1Var) {
        return i(aj1Var);
    }

    @Override // o.nw3
    public final fq6 d() {
        return this.b;
    }

    @Override // o.s0
    public final Object e() {
        return (fs5) k(n());
    }

    @Override // o.s0
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    public Object n() {
        return new boolean[0];
    }

    public void o(bb7 bb7Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        bb7Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            bb7Var.f(this.b, i2);
            bb7Var.b(z);
        }
    }
}
