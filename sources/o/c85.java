package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c85 extends es4 implements go4 {
    public Function1 A;
    public long B;

    @Override // o.es4
    public final boolean J0() {
        return true;
    }

    @Override // o.go4
    public final void b(long j) {
        if (dl3.b(this.B, j)) {
            return;
        }
        this.A.invoke(new dl3(j));
        this.B = j;
    }
}
