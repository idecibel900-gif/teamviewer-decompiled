package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ii4 {
    public final qh4 a;
    public final Throwable b;

    public ii4(qh4 qh4Var) {
        this.a = qh4Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii4)) {
            return false;
        }
        ii4 ii4Var = (ii4) obj;
        qh4 qh4Var = this.a;
        if (qh4Var != null && qh4Var == ii4Var.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || ii4Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public ii4(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
