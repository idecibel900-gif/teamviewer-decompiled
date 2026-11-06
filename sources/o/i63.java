package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i63 extends es4 implements l28, ln5, v01 {
    public b42 A;
    public yj B;
    public boolean C;

    public i63(yj yjVar, b42 b42Var) {
        this.A = b42Var;
        this.B = yjVar;
    }

    @Override // o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        if (cn5Var == cn5.n) {
            List list = bn5Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (X0(((in5) list.get(i)).i)) {
                    int i2 = bn5Var.f;
                    if (i2 == 4) {
                        this.C = true;
                        W0();
                        return;
                    } else {
                        if (i2 == 5) {
                            Y0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // o.ln5
    public final void E() {
        Y0();
    }

    @Override // o.es4
    public final void N0() {
        Y0();
    }

    public final void U0() {
        yj yjVar;
        k76 k76Var = new k76();
        g57.q(this, new ji2(k76Var));
        i63 i63Var = (i63) k76Var.m;
        if (i63Var == null || (yjVar = i63Var.B) == null) {
            yjVar = this.B;
        }
        V0(yjVar);
    }

    public void V0(gn5 gn5Var) {
        hn5 hn5Var = (hn5) xk0.q(this, b11.w);
        if (hn5Var != null) {
            ((sg) hn5Var).a = gn5Var;
        }
    }

    public final void W0() {
        g76 g76Var = new g76();
        g76Var.m = true;
        g57.s(this, new f42(g76Var, (byte) 3));
        if (g76Var.m) {
            U0();
        }
    }

    public boolean X0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    public final void Y0() {
        if (this.C) {
            this.C = false;
            if (this.z) {
                k76 k76Var = new k76();
                g57.q(this, new jg(k76Var, (byte) 2));
                i63 i63Var = (i63) k76Var.m;
                if (i63Var != null) {
                    i63Var.U0();
                } else {
                    V0(null);
                }
            }
        }
    }

    @Override // o.ln5
    public final long m() {
        if (this.A == null) {
            return q08.a;
        }
        in1 in1Var = vn4.p0(this).L;
        int i = q08.b;
        return n37.r(in1Var.q0(10.0f), in1Var.q0(40.0f), in1Var.q0(10.0f), in1Var.q0(40.0f));
    }
}
