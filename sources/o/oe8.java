package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class oe8 {
    public final pe8 m = new pe8();

    public final void R0(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        pe8 pe8Var = this.m;
        if (pe8Var.d) {
            pe8.a(autoCloseable);
            return;
        }
        synchronized (pe8Var.a) {
            autoCloseable2 = (AutoCloseable) pe8Var.b.put(str, autoCloseable);
        }
        pe8.a(autoCloseable2);
    }

    public final void S0() {
        pe8 pe8Var = this.m;
        if (!pe8Var.d) {
            pe8Var.d = true;
            synchronized (pe8Var.a) {
                try {
                    Iterator it = pe8Var.b.values().iterator();
                    while (it.hasNext()) {
                        pe8.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = pe8Var.c.iterator();
                    while (it2.hasNext()) {
                        pe8.a((AutoCloseable) it2.next());
                    }
                    pe8Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        U0();
    }

    public final AutoCloseable T0(String str) {
        AutoCloseable autoCloseable;
        pe8 pe8Var = this.m;
        synchronized (pe8Var.a) {
            autoCloseable = (AutoCloseable) pe8Var.b.get(str);
        }
        return autoCloseable;
    }

    public void U0() {
    }
}
