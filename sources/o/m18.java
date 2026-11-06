package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m18 implements i97 {
    public final q18 m;
    public Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f1428o;
    public final /* synthetic */ n18 p;

    public m18(n18 n18Var, q18 q18Var, Function1 function1, Function1 function2) {
        this.p = n18Var;
        this.m = q18Var;
        this.n = function1;
        this.f1428o = function2;
    }

    public final void a(o18 o18Var, Object obj, qo qoVar) {
        Object objInvoke = this.f1428o.invoke(o18Var.d());
        boolean zG = this.p.c.g();
        q18 q18Var = this.m;
        if (zG) {
            q18Var.g(this.f1428o.invoke(o18Var.b()), objInvoke, (rl2) this.n.invoke(o18Var));
        } else {
            q18Var.h(objInvoke, (rl2) this.n.invoke(o18Var), obj, qoVar);
        }
    }

    @Override // o.i97
    public final Object getValue() {
        a(this.p.c.f(), null, null);
        return this.m.v.getValue();
    }
}
