package o;

/* JADX INFO: loaded from: classes2.dex */
public final class d48 extends zw2 implements z61 {
    public static final yi5 S;
    public final xd4 P;
    public final eq1 Q;
    public wr0 R;

    static {
        x86 x86Var = w86.a;
        x86Var.g(new gu5(x86Var.b(d48.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        S = new yi5((byte) 15);
    }

    public d48(xd4 xd4Var, eq1 eq1Var, wr0 wr0Var, d48 d48Var, up upVar, int i, s67 s67Var) {
        super(i, upVar, eq1Var, d48Var, a87.e, s67Var);
        this.P = xd4Var;
        this.Q = eq1Var;
        e3 e3Var = new e3((byte) 21, this, wr0Var, false);
        xd4Var.getClass();
        new ud4(xd4Var, e3Var);
        this.R = wr0Var;
    }

    @Override // o.ii1
    /* JADX INFO: renamed from: C0 */
    public final hi1 a() {
        xw2 xw2VarA = super.a();
        xw2VarA.getClass();
        return (d48) xw2VarA;
    }

    @Override // o.zw2
    public final zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        fi1Var.getClass();
        if (i == 0) {
            throw null;
        }
        upVar.getClass();
        if (i != 1) {
        }
        return new d48(this.P, this.Q, this.R, this, upVar, 1, s67Var);
    }

    @Override // o.zw2, o.xw2, o.ie7
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final d48 d(m58 m58Var) {
        m58Var.getClass();
        xw2 xw2VarD = super.d(m58Var);
        xw2VarD.getClass();
        d48 d48Var = (d48) xw2VarD;
        oz3 oz3Var = d48Var.s;
        oz3Var.getClass();
        wr0 wr0VarD = this.R.a().d(m58.d(oz3Var));
        if (wr0VarD == null) {
            return null;
        }
        d48Var.R = wr0VarD;
        return d48Var;
    }

    @Override // o.zi0
    public final zi0 Y(fi1 fi1Var, as4 as4Var, cp1 cp1Var) throws l58 {
        cp1Var.getClass();
        yw2 yw2VarI0 = I0(m58.b);
        yw2VarI0.n = fi1Var;
        yw2VarI0.f2650o = as4Var;
        yw2VarI0.p = cp1Var;
        yw2VarI0.r = 2;
        yw2VarI0.y = false;
        zw2 zw2VarF0 = yw2VarI0.J.F0(yw2VarI0);
        zw2VarF0.getClass();
        return (d48) zw2VarF0;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final xi0 a() {
        xw2 xw2VarA = super.a();
        xw2VarA.getClass();
        return (d48) xw2VarA;
    }

    @Override // o.zw2, o.xi0
    public final oz3 getReturnType() {
        oz3 oz3Var = this.s;
        oz3Var.getClass();
        return oz3Var;
    }

    @Override // o.ii1, o.fi1
    public final zs0 i() {
        return this.Q;
    }

    @Override // o.z61
    public final boolean t() {
        return this.R.P;
    }

    @Override // o.z61
    public final ns4 u() {
        ns4 ns4VarU = this.R.u();
        ns4VarU.getClass();
        return ns4VarU;
    }

    @Override // o.ii1, o.fi1
    public final fi1 i() {
        return this.Q;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final zi0 a() {
        xw2 xw2VarA = super.a();
        xw2VarA.getClass();
        return (d48) xw2VarA;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final fi1 a() {
        xw2 xw2VarA = super.a();
        xw2VarA.getClass();
        return (d48) xw2VarA;
    }

    @Override // o.zw2, o.ii1, o.gi1, o.fi1
    public final xw2 a() {
        xw2 xw2VarA = super.a();
        xw2VarA.getClass();
        return (d48) xw2VarA;
    }
}
