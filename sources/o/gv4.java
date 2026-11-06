package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gv4 extends g2 {
    public final jx4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f926o;
    public final jx4 p;
    public final ar q;

    public gv4() {
        super((byte) 6);
        this.n = xo1.G();
        this.f926o = new ArrayList();
        this.p = new jx4();
        gg4 gg4Var = new gg4(this, (byte) 3);
        v47.b(v47.a);
        synchronized (v47.c) {
            v47.h = lv0.B0(v47.h, gg4Var);
        }
        this.q = new ar(gg4Var, (byte) 24);
    }

    @Override // o.g2
    public final void j0(wp6 wp6Var) {
        this.f926o.add(new ev4(wp6Var));
    }

    @Override // o.g2
    public final void m0() {
        synchronized (this.m) {
            try {
                ArrayList arrayList = this.f926o;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    fv4 fv4Var = (fv4) arrayList.get(i);
                    if (fv4Var instanceof dv4) {
                        xo1.C(this.n, ((dv4) fv4Var).a, ((dv4) fv4Var).b);
                    } else {
                        if (!(fv4Var instanceof ev4)) {
                            throw new w35();
                        }
                        xo1.W(this.n, ((ev4) fv4Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f926o.clear();
    }

    @Override // o.g2
    public final void o0() {
        this.q.n();
        this.f926o.clear();
        this.p.a();
        synchronized (this.m) {
            this.n.a();
        }
    }

    @Override // o.g2
    public final Function1 w0(wp6 wp6Var) {
        jx4 jx4Var = this.p;
        Function1 o43Var = (Function1) jx4Var.g(wp6Var);
        if (o43Var == null) {
            o43Var = new o43(this, wp6Var, (byte) 14);
            int iF = jx4Var.f(wp6Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = jx4Var.c;
            Object obj = objArr[iF];
            jx4Var.b[iF] = wp6Var;
            objArr[iF] = o43Var;
        }
        return o43Var;
    }

    @Override // o.g2
    public final void x0(wm0 wm0Var) {
        this.p.k(wm0Var);
        j0(wm0Var);
        m0();
    }
}
