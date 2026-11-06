package io.sentry;

import java.util.ArrayList;
import java.util.List;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {
    public final ArrayList a;

    public p2(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public k2 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (k2) ua5.j(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        k2 k2VarA = a();
        d();
        if (!(a() instanceof n2)) {
            if (!(a() instanceof l2)) {
                return false;
            }
            l2 l2Var = (l2) a();
            if (k2VarA == null || l2Var == null) {
                return false;
            }
            l2Var.a.add(k2VarA.getValue());
            return false;
        }
        n2 n2Var = (n2) a();
        d();
        m2 m2Var = (m2) a();
        if (n2Var == null || k2VarA == null || m2Var == null) {
            return false;
        }
        m2Var.a.put(n2Var.a, k2VarA.getValue());
        return false;
    }

    public boolean c(j2 j2Var) {
        Object objB = j2Var.b();
        if (a() == null && objB != null) {
            this.a.add(new o2(objB));
            return true;
        }
        if (a() instanceof n2) {
            n2 n2Var = (n2) a();
            d();
            ((m2) a()).a.put(n2Var.a, objB);
            return false;
        }
        if (!(a() instanceof l2)) {
            return false;
        }
        ((l2) a()).a.add(objB);
        return false;
    }

    public void d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public p2() {
        this.a = new ArrayList();
    }
}
