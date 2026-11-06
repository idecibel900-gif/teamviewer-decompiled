package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 implements s84 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2028o;

    public sk1(u84 u84Var) {
        this.m = (byte) 3;
        this.n = u84Var;
        vs0 vs0Var = vs0.c;
        Class<?> cls = u84Var.getClass();
        ts0 ts0Var = (ts0) vs0Var.a.get(cls);
        this.f2028o = ts0Var == null ? vs0Var.a(cls, null) : ts0Var;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f2028o;
        switch (b) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
                switch (rk1.a[l84Var.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(lifecycleOwner);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(lifecycleOwner);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(lifecycleOwner);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(lifecycleOwner);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(lifecycleOwner);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(lifecycleOwner);
                        break;
                    case 7:
                        hk0.g("ON_ANY must not been send by anybody");
                        break;
                    default:
                        gk0.s();
                        break;
                }
                s84 s84Var = (s84) obj2;
                if (s84Var != null) {
                    s84Var.e(lifecycleOwner, l84Var);
                }
                break;
            case 1:
                if (l84Var == l84.ON_START) {
                    ((x84) obj).f(this);
                    ((a65) obj2).U0();
                }
                break;
            case 2:
                i75 i75Var = (i75) obj;
                int i = n75.a[l84Var.ordinal()];
                if (i == 1) {
                    i75Var.g(true);
                    break;
                } else if (i == 2) {
                    i75Var.g(false);
                    break;
                } else if (i == 3) {
                    i75Var.e();
                    ((x84) obj2).f(this);
                    break;
                }
                break;
            default:
                u84 u84Var = (u84) obj;
                HashMap map = ((ts0) obj2).a;
                ts0.a((List) map.get(l84Var), lifecycleOwner, l84Var, u84Var);
                ts0.a((List) map.get(l84.ON_ANY), lifecycleOwner, l84Var, u84Var);
                break;
        }
    }

    public /* synthetic */ sk1(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2028o = obj2;
    }

    public sk1(i75 i75Var, o75 o75Var, x84 x84Var) {
        this.m = (byte) 2;
        this.n = i75Var;
        this.f2028o = x84Var;
    }
}
