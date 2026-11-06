package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s98 implements Runnable {
    public final /* synthetic */ fp1 m;
    public final /* synthetic */ u00 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1997o;
    public final /* synthetic */ Runnable p;

    public /* synthetic */ s98(fp1 fp1Var, u00 u00Var, int i, Runnable runnable) {
        this.m = fp1Var;
        this.n = u00Var;
        this.f1997o = i;
        this.p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final u00 u00Var = this.n;
        final int i = this.f1997o;
        Runnable runnable = this.p;
        final fp1 fp1Var = this.m;
        tg6 tg6Var = (tg6) fp1Var.f;
        try {
            tg6 tg6Var2 = (tg6) fp1Var.c;
            Objects.requireNonNull(tg6Var2);
            tg6Var.F(new t98(tg6Var2, (byte) 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) fp1Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                tg6Var.F(new jh7() { // from class: o.u98
                    @Override // o.jh7
                    public final Object f() {
                        ((ep3) fp1Var.d).D(u00Var, i + 1, false);
                        return null;
                    }
                });
            } else {
                fp1Var.c(u00Var, i);
            }
        } catch (ih7 unused) {
            ((ep3) fp1Var.d).D(u00Var, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
