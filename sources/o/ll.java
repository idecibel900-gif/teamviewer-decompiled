package o;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ll implements Choreographer.FrameCallback {
    public final /* synthetic */ gl0 m;
    public final /* synthetic */ Function1 n;

    public ll(gl0 gl0Var, ml mlVar, Function1 function1) {
        this.m = gl0Var;
        this.n = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object sc6Var;
        try {
            sc6Var = this.n.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        this.m.resumeWith(sc6Var);
    }
}
