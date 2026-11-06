package o;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c00 extends s18 {
    public int K;
    public ArrayList I = new ArrayList();
    public boolean J = true;
    public boolean L = false;
    public int M = 0;

    public c00() {
        K(1);
        H(new hh2(2));
        H(new sm0());
        H(new hh2(1));
    }

    @Override // o.s18
    public final void B(el5 el5Var) {
        super.B(el5Var);
        this.M |= 4;
        if (this.I != null) {
            for (int i = 0; i < this.I.size(); i++) {
                ((s18) this.I.get(i)).B(el5Var);
            }
        }
    }

    @Override // o.s18
    public final void C() {
        this.M |= 2;
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).C();
        }
    }

    @Override // o.s18
    public final void D(long j) {
        this.n = j;
    }

    @Override // o.s18
    public final String F(String str) {
        String strF = super.F(str);
        for (int i = 0; i < this.I.size(); i++) {
            strF = strF + "\n" + ((s18) this.I.get(i)).F(str.concat("  "));
        }
        return strF;
    }

    public final void H(s18 s18Var) {
        this.I.add(s18Var);
        s18Var.u = this;
        long j = this.f1972o;
        if (j >= 0) {
            s18Var.y(j);
        }
        if ((this.M & 1) != 0) {
            s18Var.A(this.p);
        }
        if ((this.M & 2) != 0) {
            s18Var.C();
        }
        if ((this.M & 4) != 0) {
            s18Var.B(this.E);
        }
        if ((this.M & 8) != 0) {
            s18Var.z(null);
        }
    }

    @Override // o.s18
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void y(long j) {
        ArrayList arrayList;
        this.f1972o = j;
        if (j < 0 || (arrayList = this.I) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).y(j);
        }
    }

    @Override // o.s18
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void A(TimeInterpolator timeInterpolator) {
        this.M |= 1;
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((s18) this.I.get(i)).A(timeInterpolator);
            }
        }
        this.p = timeInterpolator;
    }

    public final void K(int i) {
        if (i == 0) {
            this.J = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(fx3.e(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.J = false;
        }
    }

    @Override // o.s18
    public final void c(d28 d28Var) {
        View view = d28Var.b;
        if (s(view)) {
            for (s18 s18Var : this.I) {
                if (s18Var.s(view)) {
                    s18Var.c(d28Var);
                    d28Var.c.add(s18Var);
                }
            }
        }
    }

    @Override // o.s18
    public final void cancel() {
        super.cancel();
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).cancel();
        }
    }

    @Override // o.s18
    public final void e(d28 d28Var) {
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).e(d28Var);
        }
    }

    @Override // o.s18
    public final void g(d28 d28Var) {
        View view = d28Var.b;
        if (s(view)) {
            for (s18 s18Var : this.I) {
                if (s18Var.s(view)) {
                    s18Var.g(d28Var);
                    d28Var.c.add(s18Var);
                }
            }
        }
    }

    @Override // o.s18
    /* JADX INFO: renamed from: j */
    public final s18 clone() {
        c00 c00Var = (c00) super.clone();
        c00Var.I = new ArrayList();
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            s18 s18VarClone = ((s18) this.I.get(i)).clone();
            c00Var.I.add(s18VarClone);
            s18VarClone.u = c00Var;
        }
        return c00Var;
    }

    @Override // o.s18
    public final void l(ViewGroup viewGroup, pn5 pn5Var, pn5 pn5Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.n;
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            s18 s18Var = (s18) this.I.get(i);
            if (j > 0 && (this.J || i == 0)) {
                long j2 = s18Var.n;
                if (j2 > 0) {
                    s18Var.D(j2 + j);
                } else {
                    s18Var.D(j);
                }
            }
            s18Var.l(viewGroup, pn5Var, pn5Var2, arrayList, arrayList2);
        }
    }

    @Override // o.s18
    public final void u(ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).u(viewGroup);
        }
    }

    @Override // o.s18
    public final void w(View view) {
        super.w(view);
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).w(view);
        }
    }

    @Override // o.s18
    public final void x() {
        ArrayList arrayList;
        if (this.I.isEmpty()) {
            E();
            m();
            return;
        }
        gh2 gh2Var = new gh2();
        gh2Var.b = this;
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((s18) it.next()).a(gh2Var);
        }
        this.K = this.I.size();
        if (this.J) {
            Iterator it2 = this.I.iterator();
            while (it2.hasNext()) {
                ((s18) it2.next()).x();
            }
            return;
        }
        byte b = 1;
        int i = 1;
        while (true) {
            int size = this.I.size();
            arrayList = this.I;
            if (i >= size) {
                break;
            }
            ((s18) arrayList.get(i - 1)).a(new gh2((s18) this.I.get(i), b));
            i++;
        }
        s18 s18Var = (s18) arrayList.get(0);
        if (s18Var != null) {
            s18Var.x();
        }
    }

    @Override // o.s18
    public final void z(f57 f57Var) {
        this.M |= 8;
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((s18) this.I.get(i)).z(f57Var);
        }
    }
}
