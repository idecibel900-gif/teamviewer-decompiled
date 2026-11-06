package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xf0 implements bs0 {
    public final xd4 a;
    public final ps4 b;

    public xf0(xd4 xd4Var, qs4 qs4Var) {
        qs4Var.getClass();
        this.a = xd4Var;
        this.b = qs4Var;
    }

    @Override // o.bs0
    public final Collection a(ht2 ht2Var) {
        ht2Var.getClass();
        return la2.m;
    }

    @Override // o.bs0
    public final boolean b(ht2 ht2Var, sy4 sy4Var) {
        ht2Var.getClass();
        sy4Var.getClass();
        String strB = sy4Var.b();
        strB.getClass();
        return (bc7.N(false, strB, "Function") || bc7.N(false, strB, "KFunction") || bc7.N(false, strB, "SuspendFunction") || bc7.N(false, strB, "KSuspendFunction")) && jx2.c.a(strB, ht2Var) != null;
    }

    @Override // o.bs0
    public final ns4 c(js0 js0Var) {
        ht2 ht2Var;
        ix2 ix2VarA;
        js0Var.getClass();
        ht2 ht2Var2 = js0Var.b;
        if (!js0Var.c && ht2Var2.e().d()) {
            String strB = ht2Var2.b();
            if (ub7.Q(strB, "Function", false) && (ix2VarA = jx2.c.a(strB, (ht2Var = js0Var.a))) != null) {
                hx2 hx2Var = ix2VarA.a;
                int i = ix2VarA.b;
                List list = (List) i67.s(this.b.y(ht2Var).q, b54.t[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof eg0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (lv0.o0(arrayList2) == null) {
                    return new tw2(this.a, (eg0) lv0.m0(arrayList), hx2Var, i);
                }
                io.sentry.h2.f();
            }
        }
        return null;
    }
}
