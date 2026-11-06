package o;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class o75 {
    public final Runnable a;
    public boolean b;
    public final kh7 c = new kh7(new vm3((Object) this, (byte) 20));

    public o75(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(LifecycleOwner lifecycleOwner, j75 j75Var) {
        j75Var.getClass();
        final x84 x84VarZ = lifecycleOwner.getR();
        if (x84VarZ.i == m84.m) {
            return;
        }
        i75 i75Var = new i75(j75Var, new k75(lifecycleOwner, j75Var));
        j75Var.a.add(i75Var);
        i75Var.g(false);
        j93.z(c().c, i75Var);
        final sk1 sk1Var = new sk1(i75Var, this, x84VarZ);
        x84VarZ.a(sk1Var);
        j75Var.c.add(new AutoCloseable() { // from class: o.l75
            @Override // java.lang.AutoCloseable
            public final void close() {
                x84VarZ.f(sk1Var);
            }
        });
    }

    public final void b(j75 j75Var) {
        j75Var.getClass();
        i75 i75Var = new i75(j75Var, new k75(null, j75Var));
        j75Var.a.add(i75Var);
        j93.z(c().c, i75Var);
    }

    public final m75 c() {
        return (m75) this.c.getValue();
    }

    public final void d() {
        c().a();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.B(new g75(onBackInvokedDispatcher, 0), 1);
        c().c.B(new g75(onBackInvokedDispatcher, 1000000), 0);
    }
}
