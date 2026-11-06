package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ri3 extends ap4 {
    public final zo4 b;

    public ri3(zo4 zo4Var) {
        zo4Var.getClass();
        this.b = zo4Var;
    }

    @Override // o.ap4, o.zo4
    public final Set b() {
        return this.b.b();
    }

    @Override // o.ap4, o.zo4
    public final Set c() {
        return this.b.c();
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        int i = no1.l & no1Var.b;
        no1 no1Var2 = i == 0 ? null : new no1(i, no1Var.a);
        if (no1Var2 == null) {
            return ea2.m;
        }
        Collection collectionE = this.b.e(no1Var2, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (obj instanceof zs0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o.ap4, o.zo4
    public final Set f() {
        return this.b.f();
    }

    @Override // o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        ys0 ys0VarG = this.b.g(sy4Var, t35Var);
        if (ys0VarG != null) {
            ns4 ns4Var = ys0VarG instanceof ns4 ? (ns4) ys0VarG : null;
            if (ns4Var != null) {
                return ns4Var;
            }
            if (ys0VarG instanceof eq1) {
                return (eq1) ys0VarG;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
