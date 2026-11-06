package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class kd8 implements p04 {
    public final hr7 b;
    public final int c;
    public final e18 d;
    public final Function0 e;

    public kd8(hr7 hr7Var, int i, e18 e18Var, Function0 function0) {
        this.b = hr7Var;
        this.c = i;
        this.d = e18Var;
        this.e = function0;
    }

    @Override // o.p04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(r61.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(jl5VarC.n, r61.h(j));
        return fo4Var.u(jl5VarC.m, iMin, fa2.m, new i56(this, jl5VarC, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kd8) {
            kd8 kd8Var = (kd8) obj;
            if (this.b == kd8Var.b && this.c == kd8Var.c && this.d.equals(kd8Var.d) && im3.n(this.e, kd8Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + fx3.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ")";
    }
}
