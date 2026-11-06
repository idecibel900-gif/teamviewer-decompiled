package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kt0 extends p0 {
    public in5 W;
    public eh3 X;

    @Override // o.p0, o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        super.D0(bn5Var, cn5Var, j);
        if (cn5Var != cn5.n) {
            if (cn5Var == cn5.f544o) {
                if (this.W != null) {
                    List list = bn5Var.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        in5 in5Var = (in5) list.get(i);
                        if (in5Var.c() && in5Var != this.W) {
                            l1(false);
                            break;
                        }
                    }
                }
                if (im3.n(this.M, "recognized")) {
                    this.M = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.W == null) {
            if (un7.e(bn5Var, true)) {
                in5 in5Var2 = (in5) bn5Var.a.get(0);
                in5Var2.a();
                this.W = in5Var2;
                if (this.H) {
                    this.M = "waiting";
                    e1(in5Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = bn5Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!qs1.E((in5) list2.get(i2))) {
                long jA1 = a1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    in5 in5Var3 = (in5) list2.get(i3);
                    if (in5Var3.c() || qs1.R(in5Var3, j, jA1)) {
                        l1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((in5) list2.get(0)).a();
        if (this.H) {
            this.M = "recognized";
            in5 in5Var4 = this.W;
            in5Var4.getClass();
            c1(in5Var4.c, false);
            j1();
        }
        this.W = null;
    }

    @Override // o.ln5
    public final void E() {
        j63 j63Var;
        mw4 mw4Var = this.C;
        if (mw4Var != null && (j63Var = this.P) != null) {
            mw4Var.b(new k63(j63Var));
        }
        this.P = null;
        l1(false);
    }

    @Override // o.mh3
    public final void e0() {
        l1(true);
    }

    @Override // o.mh3
    public final void j0(ae aeVar, cn5 cn5Var) {
        ArrayList arrayList = (ArrayList) aeVar.c;
        f1();
        if (this.H && this.L == null) {
            az2 az2Var = new az2(this);
            U0(az2Var);
            this.L = az2Var;
        }
        if (cn5Var != cn5.n) {
            if (cn5Var == cn5.f544o) {
                if (this.X != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        eh3 eh3Var = (eh3) arrayList.get(i);
                        if (eh3Var.i && eh3Var != this.X) {
                            l1(true);
                            break;
                        }
                    }
                }
                if (im3.n(this.M, "recognized")) {
                    this.M = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.X == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (zu1.n((eh3) arrayList.get(i2))) {
                    eh3 eh3Var2 = (eh3) arrayList.get(0);
                    eh3Var2.i = true;
                    this.X = eh3Var2;
                    if (this.H) {
                        this.M = "waiting";
                        d1(eh3Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            eh3 eh3Var3 = (eh3) arrayList.get(i3);
            if (eh3Var3.i || !eh3Var3.h || eh3Var3.d) {
                float f = ((ee8) xk0.q(this, b11.t)).f();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    eh3 eh3Var4 = (eh3) arrayList.get(i4);
                    long j = eh3Var4.c;
                    eh3 eh3Var5 = this.X;
                    eh3Var5.getClass();
                    boolean z = Math.abs(t65.c(t65.d(j, eh3Var5.c))) > f;
                    if (eh3Var4.i || z) {
                        l1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((eh3) arrayList.get(0)).i = true;
        if (this.H) {
            this.M = "recognized";
            eh3 eh3Var6 = this.X;
            eh3Var6.getClass();
            c1(eh3Var6.c, true);
            j1();
        }
        this.X = null;
    }

    public final void l1(boolean z) {
        if (z) {
            this.X = null;
        } else {
            this.W = null;
        }
        b1(z);
        this.M = "idle";
    }
}
