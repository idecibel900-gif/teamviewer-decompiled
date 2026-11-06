package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vb4 implements fq6 {
    public final fq6 a;

    public vb4(fq6 fq6Var) {
        this.a = fq6Var;
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        Integer numO = bc7.O(str);
        if (numO != null) {
            return numO.intValue();
        }
        hk0.g(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // o.fq6
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb4)) {
            return false;
        }
        vb4 vb4Var = (vb4) obj;
        return im3.n(this.a, vb4Var.a) && im3.n(a(), vb4Var.a());
    }

    @Override // o.fq6
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // o.fq6
    public final List g(int i) {
        if (i >= 0) {
            return ea2.m;
        }
        StringBuilder sbK = fx3.k(i, "Illegal index ", ", ");
        sbK.append(a());
        sbK.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbK.toString().toString());
    }

    @Override // o.fq6
    public final fq6 h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbK = fx3.k(i, "Illegal index ", ", ");
        sbK.append(a());
        sbK.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbK.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // o.fq6
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbK = fx3.k(i, "Illegal index ", ", ");
        sbK.append(a());
        sbK.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbK.toString().toString());
    }

    @Override // o.fq6
    public final it1 k() {
        return lc7.e;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
