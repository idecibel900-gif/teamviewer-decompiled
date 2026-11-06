package io.sentry.android.core.performance;

import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.MessageQueue;
import android.os.SystemClock;
import io.sentry.a8;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.i;
import io.sentry.android.core.v0;
import io.sentry.android.core.y;
import io.sentry.e8;
import io.sentry.f8;
import io.sentry.k6;
import io.sentry.p7;
import io.sentry.protocol.h0;
import io.sentry.q4;
import io.sentry.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements MessageQueue.IdleHandler {
    public final /* synthetic */ f a;

    public /* synthetic */ d(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        k6 k6Var;
        long jA;
        f fVar = this.a;
        fVar.f122o = SystemClock.uptimeMillis();
        fVar.B.set(false);
        if (fVar.z.get() == 0 && (fVar.D == null || !v0.i())) {
            fVar.n = Boolean.FALSE;
            if (fVar.m == e.UNKNOWN) {
                fVar.m = e.COLD;
            }
            y yVar = fVar.u;
            if (yVar != null && yVar.u.get()) {
                fVar.u.close();
                fVar.u = null;
            }
            i iVar = fVar.v;
            if (iVar != null && iVar.u) {
                iVar.a(true);
                fVar.v = null;
            }
            p7 p7Var = fVar.D;
            if (p7Var != null && fVar.C.compareAndSet(false, true)) {
                g gVar = fVar.r;
                if (gVar.e()) {
                    fVar.i(gVar.a() + gVar.f123o);
                } else {
                    ApplicationStartInfo applicationStartInfo = fVar.I;
                    if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
                        fVar.i(f.K);
                    } else {
                        try {
                            Long l = (Long) applicationStartInfo.getStartupTimestamps().get(2);
                            if (l != null) {
                                fVar.i(l.longValue() / 1000000);
                            } else {
                                fVar.i(f.K);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) p7Var.n;
                if (activityLifecycleIntegration.f86o != null && activityLifecycleIntegration.p != null && activityLifecycleIntegration.q) {
                    f fVarC = f.c();
                    fVarC.w = null;
                    g gVar2 = fVarC.p;
                    if (!gVar2.d() || !gVar2.e()) {
                        gVar2 = fVarC.q;
                    }
                    if (gVar2.d() && gVar2.e()) {
                        k6 k6VarB = gVar2.b();
                        if (gVar2.e()) {
                            if (gVar2.d()) {
                                jA = gVar2.a() + gVar2.n;
                            } else {
                                jA = 0;
                            }
                            k6Var = new k6(jA * 1000000);
                        } else {
                            k6Var = null;
                        }
                        if (k6VarB != null && k6Var != null) {
                            fVarC.H = k6Var;
                            io.sentry.util.a aVar = (io.sentry.util.a) fVarC.J.n;
                            aVar.e();
                            aVar.close();
                            if (fVarC.y) {
                                f fVarC2 = f.c();
                                f8 f8Var = new f8();
                                f8Var.c = q4.OFF;
                                f8Var.b = k6VarB;
                                f8Var.d = "auto.app.start";
                                f8Var.e = false;
                                x1 x1VarP = activityLifecycleIntegration.f86o.p(new e8("App Start", h0.COMPONENT, "app.start", null), f8Var);
                                String strA = fVarC2.a();
                                if (strA != null) {
                                    x1VarP.m(strA, "app.vitals.start.reason");
                                }
                                fVarC2.E = x1VarP.v().m;
                                fVarC2.F = x1VarP.c().a();
                                io.sentry.e eVarJ = x1VarP.j(null);
                                fVarC2.G = eVarJ != null ? eVarJ.a : null;
                                x1VarP.x(a8.OK, k6Var);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
