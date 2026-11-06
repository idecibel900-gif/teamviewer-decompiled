package o;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class gp8 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public gp8(int i) {
        this.a = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public bi2[] a(ap8 ap8Var) {
        if (ap8Var.h.get(null) == null) {
            return null;
        }
        io.sentry.h2.f();
        return null;
    }

    public boolean b(ap8 ap8Var) {
        if (ap8Var.h.get(null) == null) {
            return false;
        }
        io.sentry.h2.f();
        return false;
    }

    public int c(ap8 ap8Var) {
        if (ap8Var.h.get(null) == null) {
            return -1;
        }
        io.sentry.h2.f();
        return 0;
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public /* bridge */ /* synthetic */ void f(lh7 lh7Var, boolean z) {
    }

    public abstract void g(ap8 ap8Var);
}
