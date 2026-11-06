package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class km {
    public final yn1 a;
    public final Object b;
    public final ko c;
    public final bg5 d;
    public final bg5 e;
    public final jy4 f;
    public final e87 g;
    public final qo h;
    public final qo i;
    public final qo j;
    public final qo k;

    public km(Object obj, yn1 yn1Var, Object obj2) {
        this.a = yn1Var;
        this.b = obj2;
        ko koVar = new ko(yn1Var, obj, null, 60);
        this.c = koVar;
        this.d = h57.p(Boolean.FALSE);
        this.e = h57.p(obj);
        this.f = new jy4();
        this.g = new e87(obj2);
        qo qoVar = koVar.f1284o;
        boolean z = qoVar instanceof mo;
        qo qoVar2 = z ? ck3.g : qoVar instanceof no ? ck3.h : qoVar instanceof oo ? ck3.i : ck3.j;
        this.h = qoVar2;
        qo qoVar3 = z ? ck3.c : qoVar instanceof no ? ck3.d : qoVar instanceof oo ? ck3.e : ck3.f;
        this.i = qoVar3;
        this.j = qoVar2;
        this.k = qoVar3;
    }

    public static Object a(km kmVar, Object obj, jo joVar, Float f, Function1 function1, hc1 hc1Var, int i) {
        if ((i & 2) != 0) {
            joVar = kmVar.g;
        }
        jo joVar2 = joVar;
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = kmVar.a.a().invoke(kmVar.c.f1284o);
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Object objD = kmVar.d();
        yn1 yn1Var = kmVar.a;
        return jy4.a(kmVar.f, new im(kmVar, objInvoke, new wn7(joVar2, yn1Var, objD, obj, (qo) yn1Var.b().invoke(objInvoke)), kmVar.c.p, function1, null), hc1Var);
    }

    public final Object b(Object obj) {
        qo qoVar = this.h;
        qo qoVar2 = this.j;
        boolean zN = im3.n(qoVar2, qoVar);
        qo qoVar3 = this.k;
        if (!zN || !im3.n(qoVar3, this.i)) {
            yn1 yn1Var = this.a;
            qo qoVar4 = (qo) yn1Var.b().invoke(obj);
            int iB = qoVar4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (qoVar4.a(i) < qoVar2.a(i) || qoVar4.a(i) > qoVar3.a(i)) {
                    qoVar4.e(i, ct1.u(qoVar4.a(i), qoVar2.a(i), qoVar3.a(i)));
                    z = true;
                }
            }
            if (z) {
                return yn1Var.a().invoke(qoVar4);
            }
        }
        return obj;
    }

    public final void c() {
        ko koVar = this.c;
        koVar.f1284o.d();
        koVar.p = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.n.getValue();
    }

    public final Object e(Object obj, hc1 hc1Var) {
        Object objA = jy4.a(this.f, new jm(this, obj, null), hc1Var);
        return objA == ne1.m ? objA : f88.a;
    }

    public final Object f(og7 og7Var) {
        Object objA = jy4.a(this.f, new kr7(this, null, (byte) 4), og7Var);
        return objA == ne1.m ? objA : f88.a;
    }

    public /* synthetic */ km(Object obj, yn1 yn1Var, Object obj2, int i) {
        this(obj, yn1Var, (i & 4) != 0 ? null : obj2);
    }
}
