package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class pd7 extends ap4 {
    public final ps4 b;
    public final ht2 c;

    public pd7(ps4 ps4Var, ht2 ht2Var) {
        ps4Var.getClass();
        ht2Var.getClass();
        this.b = ps4Var;
        this.c = ht2Var;
    }

    @Override // o.ap4, o.zo4
    public final Set c() {
        return la2.m;
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        if (no1Var.a(no1.h)) {
            ht2 ht2Var = this.c;
            if (!ht2Var.d() || !no1Var.a.contains(ko1.a)) {
                ps4 ps4Var = this.b;
                Collection collectionF = ps4Var.f(ht2Var, function1);
                ArrayList arrayList = new ArrayList(collectionF.size());
                Iterator it = collectionF.iterator();
                while (it.hasNext()) {
                    sy4 sy4VarF = ((ht2) it.next()).f();
                    sy4VarF.getClass();
                    if (((Boolean) function1.invoke(sy4VarF)).booleanValue()) {
                        b54 b54Var = null;
                        if (!sy4VarF.n) {
                            b54 b54VarY = ps4Var.y(ht2Var.c(sy4VarF));
                            if (!((Boolean) i67.s(b54VarY.r, b54.t[1])).booleanValue()) {
                                b54Var = b54VarY;
                            }
                        }
                        if (b54Var != null) {
                            arrayList.add(b54Var);
                        }
                    }
                }
                return arrayList;
            }
        }
        return ea2.m;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
