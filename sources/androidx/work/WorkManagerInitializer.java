package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import o.aw;
import o.d11;
import o.e22;
import o.ei3;
import o.fe1;
import o.g22;
import o.nm8;
import o.pm8;
import o.te2;
import o.tk1;
import o.vv;
import o.we4;
import o.xc0;
import o.yi5;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements ei3 {
    public static final String a = we4.i("WrkMgrInitializer");

    @Override // o.ei3
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.ei3
    public final Object b(Context context) {
        Executor e22Var;
        we4.f().c(a, "Initializing WorkManager with default configuration.");
        new vv((byte) 7);
        d11 d11Var = new d11();
        tk1 tk1Var = g22.a;
        fe1 fe1VarN0 = tk1Var.N0(Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
        te2 te2Var = fe1VarN0 instanceof te2 ? (te2) fe1VarN0 : null;
        if (te2Var == null || (e22Var = te2Var.O0()) == null) {
            e22Var = new e22(fe1VarN0);
        }
        d11Var.m = e22Var;
        d11Var.n = tk1Var;
        Executor executorO0 = tk1Var.O0();
        if (executorO0 == null) {
            executorO0 = new e22(tk1Var);
        }
        d11Var.f578o = executorO0;
        d11Var.p = new yi5((byte) 12);
        d11Var.q = new xc0((byte) 29);
        d11Var.r = new aw((byte) 7);
        context.getClass();
        synchronized (nm8.m) {
            try {
                nm8 nm8Var = nm8.k;
                if (nm8Var != null && nm8.l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (nm8Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    nm8 nm8VarR = nm8.l;
                    if (nm8VarR == null) {
                        nm8VarR = pm8.r(applicationContext, d11Var);
                        nm8.l = nm8VarR;
                    }
                    nm8.k = nm8VarR;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nm8.a(context);
    }
}
