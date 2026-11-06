package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hd1 extends es4 implements dp6 {
    public boolean A;
    public final boolean B;
    public Function1 C;

    public hd1(boolean z, boolean z2, Function1 function1) {
        this.A = z;
        this.B = z2;
        this.C = function1;
    }

    @Override // o.dp6
    public final boolean F() {
        return this.B;
    }

    @Override // o.dp6
    public final boolean F0() {
        return this.A;
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        this.C.invoke(op6Var);
    }
}
