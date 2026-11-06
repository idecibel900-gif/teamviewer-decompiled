package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p05 {
    public final zu1 a;
    public final List b;
    public final List c;
    public final int d;
    public sa4 e;

    public p05(zu1 zu1Var, List list, List list2, int i) {
        this.a = zu1Var;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        sa4 sa4VarR = this.e;
        if (sa4VarR == null) {
            sa4 sa4VarT = qf0.t();
            sa4VarT.addAll(this.b);
            zu1 zu1Var = this.a;
            if (zu1Var != null) {
                sa4VarT.add(zu1Var);
            }
            sa4VarT.addAll(this.c);
            sa4VarR = qf0.r(sa4VarT);
            this.e = sa4VarR;
        }
        sa4VarR.getClass();
        return sa4VarR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p05.class != obj.getClass()) {
            return false;
        }
        p05 p05Var = (p05) obj;
        return this.d == p05Var.d && a().equals(p05Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p05() {
        ea2 ea2Var = ea2.m;
        this(null, ea2Var, ea2Var, -1);
    }
}
