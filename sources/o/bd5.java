package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bd5 extends ii1 implements ad5 {
    public final ht2 q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd5(ps4 ps4Var, ht2 ht2Var) {
        super(ps4Var, yl7.p, ht2Var.g(), s67.h);
        ps4Var.getClass();
        ht2Var.getClass();
        this.q = ht2Var;
        this.r = "package " + ht2Var + " of " + ps4Var;
    }

    @Override // o.ii1, o.fi1
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final ps4 i() {
        fi1 fi1VarI = super.i();
        fi1VarI.getClass();
        return (ps4) fi1VarI;
    }

    @Override // o.ii1, o.hi1
    public s67 c() {
        return s67.h;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.F(this, obj);
    }

    @Override // o.gi1
    public String toString() {
        return this.r;
    }
}
