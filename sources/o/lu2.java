package o;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lu2 implements s84 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1403o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public lu2(fc1 fc1Var, ml mlVar, p56 p56Var, k76 k76Var) {
        this.n = fc1Var;
        this.f1403o = mlVar;
        this.p = p56Var;
        this.q = k76Var;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        Bundle bundle;
        boolean z;
        switch (this.m) {
            case 0:
                su2 su2Var = (su2) this.q;
                Map map = su2Var.m;
                String str = (String) this.n;
                if (l84Var == l84.ON_START && (bundle = (Bundle) map.get(str)) != null) {
                    ((xu2) this.f1403o).b(str, bundle);
                    map.remove(str);
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
                    }
                }
                if (l84Var == l84.ON_DESTROY) {
                    ((x84) this.p).f(this);
                    su2Var.n.remove(str);
                    return;
                }
                return;
            default:
                fl0 fl0VarY = null;
                switch (jl8.a[l84Var.ordinal()]) {
                    case 1:
                        im3.R((fc1) this.n, null, pe1.p, new bj((k76) this.q, (p56) this.p, lifecycleOwner, this, null, (byte) 23), 1);
                        return;
                    case 2:
                        ml mlVar = (ml) this.f1403o;
                        if (mlVar != null) {
                            io.sentry.z7 z7Var = (io.sentry.z7) mlVar.f1480o;
                            synchronized (z7Var.b) {
                                try {
                                    synchronized (z7Var.b) {
                                        z = z7Var.a;
                                    }
                                    if (!z) {
                                        ArrayList arrayList = (ArrayList) z7Var.c;
                                        z7Var.c = (ArrayList) z7Var.d;
                                        z7Var.d = arrayList;
                                        z7Var.a = true;
                                        int size = arrayList.size();
                                        for (int i = 0; i < size; i++) {
                                            ((hc1) arrayList.get(i)).resumeWith(f88.a);
                                        }
                                        arrayList.clear();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        p56 p56Var = (p56) this.p;
                        synchronized (p56Var.c) {
                            if (p56Var.t) {
                                p56Var.t = false;
                                fl0VarY = p56Var.y();
                            }
                            break;
                        }
                        if (fl0VarY != null) {
                            ((gl0) fl0VarY).resumeWith(f88.a);
                            return;
                        }
                        return;
                    case 3:
                        p56 p56Var2 = (p56) this.p;
                        synchronized (p56Var2.c) {
                            p56Var2.t = true;
                        }
                        return;
                    case 4:
                        ((p56) this.p).x();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        return;
                    default:
                        gk0.s();
                        return;
                }
        }
    }

    public lu2(su2 su2Var, String str, xu2 xu2Var, x84 x84Var) {
        this.q = su2Var;
        this.n = str;
        this.f1403o = xu2Var;
        this.p = x84Var;
    }
}
