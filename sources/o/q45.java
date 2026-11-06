package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class q45 extends e1 implements bp3 {
    public static final q45 n = new q45(z06.z);

    @Override // o.bp3
    public final pq0 c0(op3 op3Var) {
        return r45.m;
    }

    @Override // o.bp3
    public final boolean e() {
        return true;
    }

    @Override // o.bp3
    public final boolean isCancelled() {
        return false;
    }

    @Override // o.bp3, o.wm0
    public final void j(CancellationException cancellationException) {
    }

    @Override // o.bp3
    public final t22 o0(Function1 function1) {
        return r45.m;
    }

    @Override // o.bp3
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // o.bp3
    public final t22 u(boolean z, boolean z2, ew1 ew1Var) {
        return r45.m;
    }

    @Override // o.bp3
    public final Object x0(jc1 jc1Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // o.bp3
    public final CancellationException z() {
        throw new IllegalStateException("This job is always active");
    }
}
