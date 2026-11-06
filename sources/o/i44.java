package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i44 {
    public final w44 a;
    public final h44 b;
    public final w14 c;
    public final ae d;

    public i44(w44 w44Var, h44 h44Var, w14 w14Var, ae aeVar) {
        this.a = w44Var;
        this.b = h44Var;
        this.c = w14Var;
        this.d = aeVar;
    }

    public final void a(int i, Object obj, ux2 ux2Var, int i2) {
        int i3;
        Object obj2;
        ux2 ux2Var2;
        ux2Var.Y(-462424778);
        int i4 = (ux2Var.d(i) ? 4 : 2) | i2 | (ux2Var.h(obj) ? 32 : 16) | (ux2Var.f(this) ? 256 : 128);
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            ux2Var2 = ux2Var;
            xs1.j(obj2, i3, this.a.s, au8.O(-824725566, new y71(this, i), ux2Var), ux2Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p34(this, i3, obj2, i2);
        }
    }

    public final Object b(int i) {
        h44 h44Var = this.b;
        h44Var.getClass();
        am3 am3VarF = h44Var.a.f(i);
        return ((Function1) am3VarF.c.f733o).invoke(Integer.valueOf(i - am3VarF.a));
    }

    public final int c() {
        h44 h44Var = this.b;
        h44Var.getClass();
        return h44Var.a.b;
    }

    public final Object d(int i) {
        Object objInvoke;
        ae aeVar = this.d;
        Object[] objArr = (Object[]) aeVar.d;
        int i2 = i - aeVar.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        h44 h44Var = this.b;
        h44Var.getClass();
        am3 am3VarF = h44Var.a.f(i);
        int i3 = i - am3VarF.a;
        Function1 function1 = (Function1) am3VarF.c.n;
        return (function1 == null || (objInvoke = function1.invoke(Integer.valueOf(i3))) == null) ? new ok1(i) : objInvoke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i44)) {
            return false;
        }
        return im3.n(this.b, ((i44) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
