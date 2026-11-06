package o;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ot2 extends tt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ut2 b;

    public /* synthetic */ ot2(ut2 ut2Var, byte b) {
        this.a = b;
        this.b = ut2Var;
    }

    @Override // o.tt2
    public final void a() {
        switch (this.a) {
            case 0:
                ut2 ut2Var = this.b;
                ut2Var.i0.M0();
                j51.E(ut2Var);
                Bundle bundle = ut2Var.n;
                ut2Var.i0.N0(bundle != null ? bundle.getBundle("registryState") : null);
                break;
            default:
                ut2 ut2Var2 = this.b;
                io.sentry.android.core.util.a aVar = ut2Var2.e0;
                Context context = ut2Var2.G.t;
                aVar.n = context;
                Iterator it = ((CopyOnWriteArraySet) aVar.m).iterator();
                while (it.hasNext()) {
                    ((w75) it.next()).a(context);
                }
                break;
        }
    }
}
