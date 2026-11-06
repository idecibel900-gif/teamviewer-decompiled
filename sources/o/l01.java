package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class l01 implements dd5 {
    public final List a;
    public final String b;

    public l01(List list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        lv0.T0(list).size();
    }

    @Override // o.dd5
    public final boolean a(ht2 ht2Var) {
        ht2Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!et1.E((dd5) it.next(), ht2Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.dd5
    public final void b(ht2 ht2Var, ArrayList arrayList) {
        ht2Var.getClass();
        for (dd5 dd5Var : this.a) {
            dd5Var.getClass();
            ht2Var.getClass();
            dd5Var.b(ht2Var, arrayList);
        }
    }

    @Override // o.dd5
    public final Collection f(ht2 ht2Var, Function1 function1) {
        ht2Var.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((dd5) it.next()).f(ht2Var, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
