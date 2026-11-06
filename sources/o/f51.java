package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f51 implements pg6, ky4 {
    public final pg6 m;
    public final ky4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public de1 f770o;
    public Throwable p;

    public f51(pg6 pg6Var) {
        my4 my4Var = new my4();
        pg6Var.getClass();
        this.m = pg6Var;
        this.n = my4Var;
    }

    @Override // o.pg6
    public final ug6 J0(String str) {
        str.getClass();
        return this.m.J0(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.m.close();
    }

    @Override // o.ky4
    public final Object e(hc1 hc1Var) {
        return this.n.e(hc1Var);
    }

    @Override // o.ky4
    public final void j(Object obj) {
        this.n.j(null);
    }

    public final void q(StringBuilder sb) {
        if (this.f770o == null && this.p == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        de1 de1Var = this.f770o;
        if (de1Var != null) {
            sb.append("\t\tCoroutine: " + de1Var);
            sb.append('\n');
        }
        Throwable th = this.p;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = lv0.j0(1, ub7.f0(ct1.Y(th))).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.m.toString();
    }
}
