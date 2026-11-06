package o;

/* JADX INFO: loaded from: classes.dex */
public final class p63 extends es4 implements ln5 {
    public mw4 A;
    public j63 B;

    @Override // o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        if (cn5Var == cn5.n) {
            int i = bn5Var.f;
            hc1 hc1Var = null;
            if (i == 4) {
                im3.R(I0(), null, null, new o63(this, hc1Var, (byte) 0), 3);
            } else if (i == 5) {
                im3.R(I0(), null, null, new o63(this, hc1Var, (byte) 1), 3);
            }
        }
    }

    @Override // o.ln5
    public final void E() {
        W0();
    }

    @Override // o.es4
    public final void N0() {
        W0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U0(jc1 jc1Var) throws Throwable {
        m63 m63Var;
        j63 j63Var;
        if (jc1Var instanceof m63) {
            m63Var = (m63) jc1Var;
            int i = m63Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                m63Var.p = i - Integer.MIN_VALUE;
            } else {
                m63Var = new m63(this, jc1Var);
            }
        } else {
            m63Var = new m63(this, jc1Var);
        }
        Object obj = m63Var.n;
        int i2 = m63Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            if (this.B == null) {
                j63 j63Var2 = new j63();
                mw4 mw4Var = this.A;
                m63Var.m = j63Var2;
                m63Var.p = 1;
                Object objA = mw4Var.a(j63Var2, m63Var);
                ne1 ne1Var = ne1.m;
                if (objA == ne1Var) {
                    return ne1Var;
                }
                j63Var = j63Var2;
            }
            return f88.a;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j63Var = m63Var.m;
        ct1.a0(obj);
        this.B = j63Var;
        return f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(jc1 jc1Var) throws Throwable {
        n63 n63Var;
        if (jc1Var instanceof n63) {
            n63Var = (n63) jc1Var;
            int i = n63Var.f1544o;
            if ((i & Integer.MIN_VALUE) != 0) {
                n63Var.f1544o = i - Integer.MIN_VALUE;
            } else {
                n63Var = new n63(this, jc1Var);
            }
        } else {
            n63Var = new n63(this, jc1Var);
        }
        Object obj = n63Var.m;
        int i2 = n63Var.f1544o;
        if (i2 == 0) {
            ct1.a0(obj);
            j63 j63Var = this.B;
            if (j63Var != null) {
                k63 k63Var = new k63(j63Var);
                mw4 mw4Var = this.A;
                n63Var.f1544o = 1;
                Object objA = mw4Var.a(k63Var, n63Var);
                ne1 ne1Var = ne1.m;
                if (objA == ne1Var) {
                    return ne1Var;
                }
            }
            return f88.a;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        this.B = null;
        return f88.a;
    }

    public final void W0() {
        j63 j63Var = this.B;
        if (j63Var != null) {
            this.A.b(new k63(j63Var));
            this.B = null;
        }
    }
}
