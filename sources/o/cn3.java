package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cn3 extends jp3 {
    public final Function1 q;

    public cn3(Function1 function1) {
        this.q = function1;
    }

    @Override // o.jp3
    public final boolean m() {
        return false;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        this.q.invoke(th);
    }
}
