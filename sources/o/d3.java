package o;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d3 implements k48 {
    public int a;
    public final rd4 b;

    public d3(xd4 xd4Var) {
        xd4Var.getClass();
        this.b = new rd4(xd4Var, new a3(this, (byte) 1), new t(this, (byte) 5));
    }

    public abstract Collection e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k48) && obj.hashCode() == hashCode()) {
            k48 k48Var = (k48) obj;
            if (k48Var.getParameters().size() == getParameters().size()) {
                ys0 ys0VarA = a();
                ys0 ys0VarA2 = k48Var.a();
                if (ys0VarA2 == null || hd2.f(ys0VarA) || zo1.o(ys0VarA) || hd2.f(ys0VarA2) || zo1.o(ys0VarA2)) {
                    return false;
                }
                return j(ys0VarA2);
            }
        }
        return false;
    }

    public oz3 f() {
        return hd2.c(gd2.s, new String[0]);
    }

    public jk0 g() {
        return jk0.O;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        ys0 ys0VarA = a();
        int iIdentityHashCode = (hd2.f(ys0VarA) || zo1.o(ys0VarA)) ? System.identityHashCode(this) : zo1.g(ys0VarA).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // o.k48
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List b() {
        return ((c3) this.b.a()).b;
    }

    public abstract boolean j(ys0 ys0Var);

    public List k(List list) {
        return list;
    }
}
