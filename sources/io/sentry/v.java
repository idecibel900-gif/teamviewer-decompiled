package io.sentry;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import o.bu7;
import o.nx3;

/* JADX INFO: loaded from: classes.dex */
public final class v extends TimerTask {
    public final /* synthetic */ byte m = 0;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f271o;

    public v(nx3 nx3Var, PointF pointF) {
        pointF.getClass();
        this.n = nx3Var;
        this.f271o = pointF;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                ((ArrayList) this.n).clear();
                z3 z3Var = new z3(((x) this.f271o).g.getDateProvider().a().d());
                Iterator it = ((x) this.f271o).d.iterator();
                while (it.hasNext()) {
                    ((j1) it.next()).a(z3Var);
                }
                for (w wVar : ((x) this.f271o).c.values()) {
                    long j = z3Var.g;
                    synchronized (wVar.a) {
                        wVar.a.add(z3Var);
                        break;
                    }
                    x1 x1Var = wVar.b;
                    if (x1Var != null && j > wVar.c + 30000000000L) {
                        ((ArrayList) this.n).add(x1Var);
                    }
                }
                Iterator it2 = ((ArrayList) this.n).iterator();
                while (it2.hasNext()) {
                    ((x) this.f271o).f((x1) it2.next());
                }
                return;
            default:
                PointF pointF = (PointF) this.f271o;
                final float f = pointF.x;
                if (f <= 1.0f && f >= -1.0f) {
                    float f2 = pointF.y;
                    if (f2 <= 1.0f && f2 >= -1.0f) {
                        cancel();
                        return;
                    }
                }
                final float f3 = pointF.y;
                bu7.MAIN.a(new Runnable() { // from class: o.hu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1 c1Var = ((qv4) ((nx3) this.m.n).n).s;
                        if (c1Var != null) {
                            c1Var.l(f, f3);
                        }
                    }
                });
                float f4 = pointF.x;
                pointF.x = f4 - (f4 * 0.1875f);
                float f5 = pointF.y;
                pointF.y = f5 - (0.1875f * f5);
                return;
        }
    }

    public v(x xVar, ArrayList arrayList) {
        this.f271o = xVar;
        this.n = arrayList;
    }
}
