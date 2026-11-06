package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class f63 implements p04 {
    public final hr7 b;
    public final int c;
    public final e18 d;
    public final Function0 e;

    public f63(hr7 hr7Var, int i, e18 e18Var, Function0 function0) {
        this.b = hr7Var;
        this.c = i;
        this.d = e18Var;
        this.e = function0;
    }

    @Override // o.p04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        long j2;
        if (zn4Var.o(r61.h(j)) < r61.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = r61.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        jl5 jl5VarC = zn4Var.C(j);
        int iMin = Math.min(jl5VarC.m, r61.i(j2));
        return fo4Var.u(iMin, jl5VarC.n, fa2.m, new co1(this, fo4Var, jl5VarC, iMin, (byte) 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f63) {
            f63 f63Var = (f63) obj;
            if (this.b == f63Var.b && this.c == f63Var.c && this.d.equals(f63Var.d) && im3.n(this.e, f63Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + fx3.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ")";
    }
}
