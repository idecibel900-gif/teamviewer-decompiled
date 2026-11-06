package o;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class h75 implements OnBackAnimationCallback {
    public final /* synthetic */ g75 a;

    public h75(g75 g75Var) {
        this.a = g75Var;
    }

    public final void onBackCancelled() {
        g75 g75Var = this.a;
        j93 j93Var = g75Var.a;
        if (j93Var == null) {
            hk0.l("This input is not added to any dispatcher.");
            return;
        }
        if (!g75Var.b) {
            j93Var.G(g75Var, null);
        }
        r05 r05Var = (r05) j93Var.f1141o;
        if (g75Var.equals(r05Var.h) && -1 == r05Var.g) {
            o05 o05VarC = r05Var.f;
            if (o05VarC == null) {
                o05VarC = r05Var.c(-1);
            }
            r05Var.f = null;
            r05Var.g = 0;
            r05Var.h = null;
            if (o05VarC != null) {
                o05VarC.a();
            }
            r05Var.a.l(null, s05.e);
        }
        g75Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        m05 m05VarW = lv1.W(backEvent);
        g75 g75Var = this.a;
        j93 j93Var = g75Var.a;
        if (j93Var == null) {
            hk0.l("This input is not added to any dispatcher.");
            return;
        }
        if (g75Var.b) {
            r05 r05Var = (r05) j93Var.f1141o;
            if (g75Var.equals(r05Var.h) && -1 == r05Var.g) {
                o05 o05VarC = r05Var.f;
                if (o05VarC == null) {
                    o05VarC = r05Var.c(-1);
                }
                if (o05VarC != null) {
                    o05VarC.c(m05VarW);
                }
                r05Var.a.l(null, new t05(m05VarW));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        m05 m05VarW = lv1.W(backEvent);
        g75 g75Var = this.a;
        j93 j93Var = g75Var.a;
        if (j93Var == null) {
            hk0.l("This input is not added to any dispatcher.");
        } else {
            if (g75Var.b) {
                return;
            }
            j93Var.G(g75Var, m05VarW);
            g75Var.b = true;
        }
    }
}
