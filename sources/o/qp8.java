package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class qp8 extends gp8 {
    public final do7 b;

    public qp8(do7 do7Var) {
        super(4);
        this.b = do7Var;
    }

    @Override // o.gp8
    public final void d(Status status) {
        this.b.b(new br(status));
    }

    @Override // o.gp8
    public final void e(Exception exc) {
        this.b.b(exc);
    }

    @Override // o.gp8
    public final void g(ap8 ap8Var) throws DeadObjectException {
        try {
            i(ap8Var);
        } catch (DeadObjectException e) {
            d(gp8.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(gp8.h(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    public final void i(ap8 ap8Var) {
        if (ap8Var.h.remove(null) == null) {
            this.b.c(Boolean.FALSE);
        } else {
            io.sentry.h2.f();
        }
    }
}
