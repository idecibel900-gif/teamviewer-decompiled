package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public interface bp3 extends be1 {
    pq0 c0(op3 op3Var);

    boolean e();

    boolean isCancelled();

    void j(CancellationException cancellationException);

    t22 o0(Function1 function1);

    boolean start();

    t22 u(boolean z, boolean z2, ew1 ew1Var);

    Object x0(jc1 jc1Var);

    CancellationException z();
}
