package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pp8 extends gp8 {
    public final co7 b;
    public final do7 c;
    public final cr d;

    public pp8(int i, co7 co7Var, do7 do7Var, cr crVar) {
        super(i);
        this.c = do7Var;
        this.b = co7Var;
        this.d = crVar;
        if (i == 2 && co7Var.b) {
            hk0.g("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // o.gp8
    public final bi2[] a(ap8 ap8Var) {
        return this.b.a;
    }

    @Override // o.gp8
    public final boolean b(ap8 ap8Var) {
        return this.b.b;
    }

    @Override // o.gp8
    public final int c(ap8 ap8Var) {
        return this.b.c;
    }

    @Override // o.gp8
    public final void d(Status status) {
        this.d.getClass();
        this.c.b(status.f34o != null ? new nb6(status) : new br(status));
    }

    @Override // o.gp8
    public final void e(Exception exc) {
        this.c.b(exc);
    }

    @Override // o.gp8
    public final void f(lh7 lh7Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) lh7Var.f1364o;
        do7 do7Var = this.c;
        map.put(do7Var, boolValueOf);
        do7Var.a.c(new lh7(lh7Var, do7Var));
    }

    @Override // o.gp8
    public final void g(ap8 ap8Var) throws DeadObjectException {
        do7 do7Var = this.c;
        try {
            co7 co7Var = this.b;
            ((y96) ((co7) co7Var.d).d).accept(ap8Var.d, do7Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(gp8.h(e2));
        } catch (RuntimeException e3) {
            do7Var.b(e3);
        }
    }
}
