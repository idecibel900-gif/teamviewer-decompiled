package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class tw0 implements de1, Serializable {
    public final de1 m;
    public final be1 n;

    public tw0(be1 be1Var, de1 de1Var) {
        de1Var.getClass();
        this.m = de1Var;
        this.n = be1Var;
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        de1Var.getClass();
        return de1Var == ba2.m ? this : (de1) de1Var.b0(this, new iz0((byte) 24));
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(this.m.b0(obj, hw2Var), this.n);
    }

    public final boolean equals(Object obj) {
        boolean zN;
        if (this == obj) {
            return true;
        }
        if (obj instanceof tw0) {
            tw0 tw0Var = (tw0) obj;
            int i = 2;
            tw0 tw0Var2 = tw0Var;
            int i2 = 2;
            while (true) {
                de1 de1Var = tw0Var2.m;
                tw0Var2 = de1Var instanceof tw0 ? (tw0) de1Var : null;
                if (tw0Var2 == null) {
                    break;
                }
                i2++;
            }
            tw0 tw0Var3 = this;
            while (true) {
                de1 de1Var2 = tw0Var3.m;
                tw0Var3 = de1Var2 instanceof tw0 ? (tw0) de1Var2 : null;
                if (tw0Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    be1 be1Var = this.n;
                    if (!im3.n(tw0Var.l0(be1Var.getKey()), be1Var)) {
                        zN = false;
                        break;
                    }
                    de1 de1Var3 = this.m;
                    if (!(de1Var3 instanceof tw0)) {
                        de1Var3.getClass();
                        be1 be1Var2 = (be1) de1Var3;
                        zN = im3.n(tw0Var.l0(be1Var2.getKey()), be1Var2);
                        break;
                    }
                    this = (tw0) de1Var3;
                }
                if (zN) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + this.m.hashCode();
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        ce1Var.getClass();
        be1 be1Var = this.n;
        be1 be1VarL0 = be1Var.l0(ce1Var);
        de1 de1Var = this.m;
        if (be1VarL0 != null) {
            return de1Var;
        }
        de1 de1VarK0 = de1Var.k0(ce1Var);
        if (de1VarK0 == de1Var) {
            return this;
        }
        return de1VarK0 == ba2.m ? be1Var : new tw0(be1Var, de1VarK0);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        ce1Var.getClass();
        while (true) {
            be1 be1VarL0 = this.n.l0(ce1Var);
            if (be1VarL0 != null) {
                return be1VarL0;
            }
            de1 de1Var = this.m;
            if (!(de1Var instanceof tw0)) {
                return de1Var.l0(ce1Var);
            }
            this = (tw0) de1Var;
        }
    }

    public final String toString() {
        return "[" + ((String) b0("", new g9((byte) 10))) + ']';
    }
}
