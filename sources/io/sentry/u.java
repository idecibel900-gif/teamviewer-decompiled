package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;
import o.ep3;
import o.kl7;
import o.qf2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends TimerTask {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ u(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                Iterator it = ((x) this.n).d.iterator();
                while (it.hasNext()) {
                    ((j1) it.next()).c();
                }
                return;
            case 1:
                qf2 qf2Var = ((kl7) this.n).f1279o;
                qf2Var.postValue(qf2Var.a.a());
                return;
            default:
                ep3 ep3Var = (ep3) this.n;
                synchronized (ep3Var.p) {
                    if (((u) ep3Var.f733o) != null) {
                        ((u) ep3Var.n).run();
                    }
                    break;
                }
                return;
        }
    }
}
