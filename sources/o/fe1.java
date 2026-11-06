package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fe1 extends e1 implements be1 {
    public static final ee1 n = new ee1(d82.y, new h31(12));

    public fe1() {
        super(d82.y);
    }

    public void K0(de1 de1Var, Runnable runnable) {
        de1Var.getClass();
        runnable.getClass();
        qe1.p.K0(de1Var, runnable);
    }

    public void L0(de1 de1Var, Runnable runnable) {
        ga0.u(this, de1Var, runnable);
    }

    public boolean M0(de1 de1Var) {
        return !(this instanceof r78);
    }

    public fe1 N0(int i) {
        xs1.x(i);
        return new j94(this, i);
    }

    @Override // o.e1, o.de1
    public final de1 k0(ce1 ce1Var) {
        ce1Var.getClass();
        if (ce1Var instanceof ee1) {
            ee1 ee1Var = (ee1) ce1Var;
            ce1 ce1Var2 = this.m;
            if ((ce1Var2 != ee1Var && ee1Var.n != ce1Var2) || ((be1) ee1Var.m.invoke(this)) == null) {
                return this;
            }
        } else if (d82.y != ce1Var) {
            return this;
        }
        return ba2.m;
    }

    @Override // o.e1, o.de1
    public final be1 l0(ce1 ce1Var) {
        be1 be1Var;
        ce1Var.getClass();
        if (ce1Var instanceof ee1) {
            ee1 ee1Var = (ee1) ce1Var;
            ce1 ce1Var2 = this.m;
            if ((ce1Var2 == ee1Var || ee1Var.n == ce1Var2) && (be1Var = (be1) ee1Var.m.invoke(this)) != null) {
                return be1Var;
            }
        } else if (d82.y == ce1Var) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + di1.r(this);
    }
}
