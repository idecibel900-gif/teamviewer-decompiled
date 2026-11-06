package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iw7 {
    public final fe1 a;
    public final gu0 b;
    public final short c;
    public final iw2 d;
    public final Function1 e;
    public final l97 f;
    public final t36 g;
    public final l97 h;
    public final t36 i;
    public final l97 j;
    public final t36 k;
    public final l97 l;
    public final t36 m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ji2 f1112o;

    /* JADX WARN: Multi-variable type inference failed */
    public iw7(fe1 fe1Var, gu0 gu0Var, int i, iw2 iw2Var, Function1 function1) {
        this.a = fe1Var;
        this.b = gu0Var;
        this.c = i;
        this.d = iw2Var;
        this.e = function1;
        l97 l97VarK = im3.k(ea2.m);
        this.f = l97VarK;
        this.g = yo1.u(l97VarK);
        l97 l97VarK2 = im3.k(Boolean.FALSE);
        this.h = l97VarK2;
        this.i = yo1.u(l97VarK2);
        l97 l97VarK3 = im3.k(Boolean.TRUE);
        this.j = l97VarK3;
        this.k = yo1.u(l97VarK3);
        l97 l97VarK4 = im3.k(null);
        this.l = l97VarK4;
        this.m = yo1.u(l97VarK4);
    }

    public static void b(iw7 iw7Var) {
        iw7Var.n = null;
        iw7Var.l.k(null);
        l97 l97Var = iw7Var.j;
        Boolean bool = Boolean.TRUE;
        l97Var.getClass();
        l97Var.l(null, bool);
        l97 l97Var2 = iw7Var.f;
        l97Var2.getClass();
        l97Var2.l(null, ea2.m);
    }

    public final void a(Function1 function1) {
        if (((Boolean) this.h.getValue()).booleanValue() || !((Boolean) this.j.getValue()).booleanValue()) {
            return;
        }
        c(function1);
    }

    public final void c(Function1 function1) {
        Boolean bool = Boolean.TRUE;
        l97 l97Var = this.h;
        l97Var.getClass();
        l97Var.l(null, bool);
        im3.R(this.b, this.a, null, new mf7(this, function1, null, (byte) 5), 2);
    }

    public final void d(Function1 function1) {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.f;
            value = l97Var.getValue();
        } while (!l97Var.j(value, function1.invoke(value)));
    }
}
