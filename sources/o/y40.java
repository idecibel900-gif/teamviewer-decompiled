package o;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class y40 {
    public static final h72 a = new h72(new zq((byte) 15), (byte) 1);
    public static Boolean b;

    public static final void a(final xo xoVar, final ot7 ot7Var, final mr2 mr2Var, final List list, final boolean z, ux2 ux2Var) {
        Executor executor = (Executor) ux2Var.j(a);
        if (executor == null || !b(xoVar.n.length())) {
            ux2Var.W(317137883);
            ux2Var.p(false);
            return;
        }
        ux2Var.W(315439796);
        final j04 j04Var = (j04) ux2Var.j(b11.n);
        final in1 in1Var = (in1) ux2Var.j(b11.h);
        try {
            executor.execute(new Runnable() { // from class: o.w40
                @Override // java.lang.Runnable
                public final void run() {
                    ox4 ox4VarC;
                    ot7 ot7Var2 = ot7Var;
                    j04 j04Var2 = j04Var;
                    xo xoVar2 = xoVar;
                    in1 in1Var2 = in1Var;
                    mr2 mr2Var2 = mr2Var;
                    boolean z2 = z;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        n47 n47VarH = v47.h();
                        ox4 ox4Var = n47VarH instanceof ox4 ? (ox4) n47VarH : null;
                        if (ox4Var == null || (ox4VarC = ox4Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            n47 n47VarJ = ox4VarC.j();
                            try {
                                ot7 ot7VarC = y57.C(ot7Var2, j04Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = ea2.m;
                                }
                                yc4 yc4Var = new yc4(list2, xoVar2, in1Var2, mr2Var2, ot7VarC, z2);
                                yc4Var.i();
                                yc4Var.c();
                                n47.q(n47VarJ);
                                ox4VarC.w().j();
                                ox4VarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                n47.q(n47VarJ);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ox4VarC.c();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        ux2Var.p(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
