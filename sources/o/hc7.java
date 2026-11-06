package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hc7 extends kc7 {
    public final ArrayList d;
    public int e;

    public hc7(td2 td2Var) {
        super(td2Var);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = 2;
        arrayList.add(td2Var);
        this.e = td2Var.a() + this.e;
    }

    @Override // o.td2
    public final int a() {
        return this.e;
    }

    @Override // o.kc7, o.td2
    public final void e() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((td2) it.next()).e();
        }
        super.e();
    }

    @Override // o.kc7
    public final boolean g(o82 o82Var, x35 x35Var) {
        if (x35Var == o82Var) {
            return false;
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (x35Var == null || !((td2) arrayList.get(size)).d(o82Var, x35Var)) {
                return false;
            }
            x35Var = x35Var.H();
        }
        return true;
    }

    public final String toString() {
        return lb7.j(" > ", this.d);
    }
}
