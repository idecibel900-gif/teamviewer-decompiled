package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n18 {
    public final yn1 a;
    public final bg5 b = h57.p(null);
    public final /* synthetic */ u18 c;

    public n18(u18 u18Var, yn1 yn1Var, String str) {
        this.c = u18Var;
        this.a = yn1Var;
    }

    public final m18 a(Function1 function1, Object obj, qo qoVar, Function1 function2) {
        bg5 bg5Var = this.b;
        m18 m18Var = (m18) bg5Var.getValue();
        u18 u18Var = this.c;
        if (m18Var == null) {
            Object objInvoke = function2.invoke(u18Var.a.p0());
            Object objInvoke2 = function2.invoke(u18Var.a.p0());
            yn1 yn1Var = this.a;
            qo qoVar2 = (qo) yn1Var.b().invoke(objInvoke2);
            qoVar2.d();
            q18 q18Var = new q18(u18Var, objInvoke, qoVar2, yn1Var);
            m18Var = new m18(this, q18Var, function1, function2);
            bg5Var.setValue(m18Var);
            u18Var.j.add(q18Var);
        }
        m18Var.f1428o = function2;
        m18Var.n = function1;
        m18Var.a(u18Var.f(), obj, qoVar);
        return m18Var;
    }
}
