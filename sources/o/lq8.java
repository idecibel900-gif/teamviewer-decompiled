package o;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class lq8 implements d85, x75, s75 {
    public final Object m = new Object();
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hy8 f1395o;
    public int p;
    public int q;
    public int r;
    public Exception s;
    public boolean t;

    public lq8(int i, hy8 hy8Var) {
        this.n = i;
        this.f1395o = hy8Var;
    }

    public final void a() {
        int i = this.p;
        int i2 = this.q;
        int i3 = i + i2 + this.r;
        int i4 = this.n;
        if (i3 == i4) {
            Exception exc = this.s;
            hy8 hy8Var = this.f1395o;
            if (exc == null) {
                if (this.t) {
                    hy8Var.o();
                    return;
                } else {
                    hy8Var.m(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            hy8Var.n(new ExecutionException(sb.toString(), this.s));
        }
    }

    @Override // o.s75
    public final void onCanceled() {
        synchronized (this.m) {
            this.r++;
            this.t = true;
            a();
        }
    }

    @Override // o.x75
    public final void onFailure(Exception exc) {
        synchronized (this.m) {
            this.q++;
            this.s = exc;
            a();
        }
    }

    @Override // o.d85
    public final void onSuccess(Object obj) {
        synchronized (this.m) {
            this.p++;
            a();
        }
    }
}
