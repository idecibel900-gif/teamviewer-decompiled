package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h47 implements ym2 {
    public final iu a;
    public final jo b;
    public final s12 c = ok6.b;

    public h47(iu iuVar, jo joVar) {
        this.a = iuVar;
        this.b = joVar;
    }

    @Override // o.ym2
    public Object a(dk6 dk6Var, float f, hc1 hc1Var) {
        return c(dk6Var, f, iq8.O, (jc1) hc1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(dk6 dk6Var, float f, Function1 function1, jc1 jc1Var) {
        c47 c47Var;
        Function1 function2;
        if (jc1Var instanceof c47) {
            c47Var = (c47) jc1Var;
            int i = c47Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47Var.p = i - Integer.MIN_VALUE;
            } else {
                c47Var = new c47(this, jc1Var);
            }
        } else {
            c47Var = new c47(this, jc1Var);
        }
        Object objJ0 = c47Var.n;
        int i2 = c47Var.p;
        if (i2 == 0) {
            ct1.a0(objJ0);
            e47 e47Var = new e47(this, f, function1, dk6Var, null);
            c47Var.m = function1;
            c47Var.p = 1;
            objJ0 = im3.j0(this.c, e47Var, c47Var);
            ne1 ne1Var = ne1.m;
            if (objJ0 == ne1Var) {
                return ne1Var;
            }
            function2 = function1;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function2 = c47Var.m;
            ct1.a0(objJ0);
        }
        go goVar = (go) objJ0;
        function2.invoke(new Float(0.0f));
        return goVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(dk6 dk6Var, float f, vs6 vs6Var, jc1 jc1Var) {
        f47 f47Var;
        if (jc1Var instanceof f47) {
            f47Var = (f47) jc1Var;
            int i = f47Var.f768o;
            if ((i & Integer.MIN_VALUE) != 0) {
                f47Var.f768o = i - Integer.MIN_VALUE;
            } else {
                f47Var = new f47(this, jc1Var);
            }
        } else {
            f47Var = new f47(this, jc1Var);
        }
        Object objB = f47Var.m;
        int i2 = f47Var.f768o;
        if (i2 == 0) {
            ct1.a0(objB);
            f47Var.f768o = 1;
            objB = b(dk6Var, f, vs6Var, f47Var);
            Object obj = ne1.m;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objB);
        }
        go goVar = (go) objB;
        return new Float(goVar.a.floatValue() != 0.0f ? ((Number) goVar.b.a()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(dk6 dk6Var, float f, float f2, d47 d47Var, jc1 jc1Var) {
        g47 g47Var;
        if (jc1Var instanceof g47) {
            g47Var = (g47) jc1Var;
            int i = g47Var.f857o;
            if ((i & Integer.MIN_VALUE) != 0) {
                g47Var.f857o = i - Integer.MIN_VALUE;
            } else {
                g47Var = new g47(this, jc1Var);
            }
        } else {
            g47Var = new g47(this, jc1Var);
        }
        g47 g47Var2 = g47Var;
        Object objM = g47Var2.m;
        int i2 = g47Var2.f857o;
        if (i2 == 0) {
            ct1.a0(objM);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return pm8.b(f, f2, 28);
            }
            g47Var2.f857o = 1;
            objM = (Math.abs(xk0.k(uf0.n, 0.0f, f2)) >= Math.abs(f) ? new ju((byte) 10) : new l07((Object) this.b, (byte) 12)).m(dk6Var, new Float(f), new Float(f2), d47Var, g47Var2);
            ne1 ne1Var = ne1.m;
            if (objM == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objM);
        }
        return ((go) objM).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h47) {
            h47 h47Var = (h47) obj;
            return im3.n(h47Var.b, this.b) && h47Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((uf0.n.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
