package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iy4 {
    public final AtomicReference a = new AtomicReference(null);
    public final my4 b = new my4();

    public static Object a(iy4 iy4Var, Function1 function1, jc1 jc1Var) {
        iy4Var.getClass();
        return hm3.j(new gy4(ay4.m, iy4Var, function1, null), jc1Var);
    }

    public final void b(ey4 ey4Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            ey4 ey4Var2 = (ey4) atomicReference.get();
            if (ey4Var2 != null && ey4Var.a.compareTo(ey4Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(ey4Var2, ey4Var)) {
                    if (ey4Var2 != null) {
                        ey4Var2.b.j(new cy4("Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == ey4Var2);
        }
    }
}
