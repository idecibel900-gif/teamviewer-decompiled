package o;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy0 implements s84 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f664o;

    public /* synthetic */ dy0(ep3 ep3Var, hq4 hq4Var) {
        this.m = (byte) 1;
        this.n = ep3Var;
        this.f664o = hq4Var;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        byte b = this.m;
        fj5 fj5Var = fj5.a;
        Object obj = this.f664o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                o75 o75Var = (o75) obj2;
                my0 my0Var = (my0) obj;
                if (l84Var == l84.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = my0Var.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    o75Var.e(onBackInvokedDispatcher);
                    return;
                }
                return;
            case 1:
                ep3 ep3Var = (ep3) obj2;
                Runnable runnable = (Runnable) ep3Var.n;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ep3Var.f733o;
                hq4 hq4Var = (hq4) obj;
                l84.Companion.getClass();
                if (l84Var == l84.ON_RESUME) {
                    copyOnWriteArrayList.add(hq4Var);
                    runnable.run();
                    return;
                } else if (l84Var == l84.ON_DESTROY) {
                    ep3Var.C(hq4Var);
                    return;
                } else {
                    if (l84Var == j84.a(m84.q)) {
                        copyOnWriteArrayList.remove(hq4Var);
                        runnable.run();
                        return;
                    }
                    return;
                }
            case 2:
                ex4 ex4Var = (ex4) obj;
                if (l84Var != ((l84) obj2) || im3.n(ex4Var.getStatus(), fj5Var)) {
                    return;
                }
                ex4Var.c();
                return;
            case 3:
                List<ex4> list = (List) obj;
                if (l84Var == ((l84) obj2)) {
                    for (ex4 ex4Var2 : list) {
                        if (!im3.n(ex4Var2.getStatus(), fj5Var)) {
                            ex4Var2.c();
                        }
                    }
                    return;
                }
                return;
            default:
                c67 c67Var = (c67) obj2;
                a06 a06Var = (a06) obj;
                if (l84Var == l84.ON_CREATE) {
                    e67 e67Var = c67Var.p0;
                    hc1 hc1Var = null;
                    if (e67Var == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    String str = a06Var.g;
                    str.getClass();
                    gu0 gu0VarN = e8.n(e67Var);
                    tk1 tk1Var = g22.a;
                    im3.R(gu0VarN, gk1.f901o, null, new vt4(e67Var, str, hc1Var, (byte) 23), 2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ dy0(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f664o = obj2;
    }
}
