package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ti implements ComponentCallbacks2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ti(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    private final void a(Configuration configuration) {
    }

    private final void b() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.m) {
            case 0:
                return;
            default:
                ll2 ll2Var = (ll2) this.n;
                synchronized (ll2Var) {
                    if (((i46) ((WeakReference) ll2Var.n).get()) == null) {
                        ll2Var.o();
                        break;
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.m) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        m46 m46VarD;
        long jD;
        switch (this.m) {
            case 0:
                if (i >= 40) {
                    ((ui) this.n).d();
                    return;
                }
                return;
            default:
                ll2 ll2Var = (ll2) this.n;
                synchronized (ll2Var) {
                    try {
                        i46 i46Var = (i46) ((WeakReference) ll2Var.n).get();
                        if (i46Var != null) {
                            f46 f46Var = i46Var.a;
                            if (i >= 40) {
                                m46 m46VarD2 = i46Var.d();
                                if (m46VarD2 != null) {
                                    synchronized (m46VarD2.c) {
                                        ((io.sentry.android.replay.gestures.c) m46VarD2.a.d).i(-1L);
                                        nd ndVar = m46VarD2.b;
                                        ndVar.n = 0;
                                        ((LinkedHashMap) ndVar.f1562o).clear();
                                    }
                                }
                            } else if (i >= 20) {
                                ((yk) ll2Var.f1375o).a(f46Var.a);
                            } else if (i >= 10 && (m46VarD = i46Var.d()) != null) {
                                synchronized (m46VarD.c) {
                                    jD = ((io.sentry.android.replay.gestures.c) m46VarD.a.d).d();
                                }
                                long j = jD / 2;
                                synchronized (m46VarD.c) {
                                    ((io.sentry.android.replay.gestures.c) m46VarD.a.d).i(j);
                                }
                            }
                        } else {
                            ll2Var.o();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
