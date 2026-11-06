package o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class c46 extends ao7 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c46(q82 q82Var, String str) {
        super(str, true);
        this.f = q82Var;
    }

    @Override // o.ao7
    public final long a() {
        switch (this.e) {
            case 0:
                q82 q82Var = (q82) this.f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - q82Var.a) + 1;
                Iterator it = ((ConcurrentLinkedQueue) q82Var.d).iterator();
                it.getClass();
                b46 b46Var = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                b46 b46Var2 = null;
                b46 b46Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    b46 b46Var4 = (b46) it.next();
                    b46Var4.getClass();
                    synchronized (b46Var4) {
                        if (q82Var.a(b46Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = b46Var4.q;
                            if (j3 < j) {
                                j = j3;
                                b46Var2 = b46Var4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                b46Var3 = b46Var4;
                            }
                        }
                    }
                }
                if (b46Var2 != null) {
                    b46Var = b46Var2;
                } else if (i > 5) {
                    j = j2;
                    b46Var = b46Var3;
                } else {
                    j = -1;
                }
                if (b46Var == null) {
                    if (b46Var3 != null) {
                        return (j2 + q82Var.a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return q82Var.a;
                    }
                    return -1L;
                }
                synchronized (b46Var) {
                    if (b46Var.p.isEmpty() && b46Var.q == j) {
                        b46Var.j = true;
                        ((ConcurrentLinkedQueue) q82Var.d).remove(b46Var);
                        ro8.c(b46Var.e);
                        if (!((ConcurrentLinkedQueue) q82Var.d).isEmpty()) {
                            return 0L;
                        }
                        go7 go7Var = (go7) q82Var.b;
                        synchronized (go7Var.a) {
                            if (go7Var.a()) {
                                go7Var.a.c(go7Var);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((Function0) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c46(String str, Function0 function0) {
        super(str, true);
        this.f = function0;
    }
}
