package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class ut3 implements Function0 {
    public final zi0 m;
    public final int n;

    public ut3(zi0 zi0Var, int i) {
        this.m = zi0Var;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object obj = this.m.J().get(this.n);
        obj.getClass();
        return (if5) obj;
    }
}
