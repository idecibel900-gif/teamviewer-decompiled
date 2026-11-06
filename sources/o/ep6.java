package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ep6 extends es4 implements dp6 {
    public final /* synthetic */ Function1 A;

    public ep6(Function1 function1) {
        this.A = function1;
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        this.A.invoke(op6Var);
    }
}
