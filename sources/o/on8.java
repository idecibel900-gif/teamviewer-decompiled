package o;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class on8 {
    public static final String a = we4.i("WorkerWrapper");

    public static final Object a(ic4 ic4Var, nc4 nc4Var, og7 og7Var) {
        Object obj;
        try {
            if (!ic4Var.isDone()) {
                gl0 gl0Var = new gl0(1, vt1.A(og7Var));
                gl0Var.t();
                byte b = 20;
                ic4Var.addListener(new it8(ic4Var, gl0Var, b), l12.m);
                gl0Var.v(new y2(nc4Var, ic4Var, b));
                return gl0Var.q();
            }
            boolean z = false;
            while (true) {
                try {
                    obj = ic4Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
