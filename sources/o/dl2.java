package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dl2 implements up {
    public final up m;
    public final xp5 n;

    public dl2(up upVar, xp5 xp5Var) {
        this.m = upVar;
        this.n = xp5Var;
    }

    @Override // o.up
    public final boolean isEmpty() {
        up upVar = this.m;
        if ((upVar instanceof Collection) && ((Collection) upVar).isEmpty()) {
            return false;
        }
        Iterator it = upVar.iterator();
        while (it.hasNext()) {
            ht2 ht2VarD = ((hp) it.next()).d();
            if (ht2VarD != null && ((Boolean) this.n.invoke(ht2VarD)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.m) {
            ht2 ht2VarD = ((hp) obj).d();
            if (ht2VarD != null && ((Boolean) this.n.invoke(ht2VarD)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // o.up
    public final boolean o0(ht2 ht2Var) {
        ht2Var.getClass();
        if (((Boolean) this.n.invoke(ht2Var)).booleanValue()) {
            return this.m.o0(ht2Var);
        }
        return false;
    }

    @Override // o.up
    public final hp u(ht2 ht2Var) {
        ht2Var.getClass();
        if (((Boolean) this.n.invoke(ht2Var)).booleanValue()) {
            return this.m.u(ht2Var);
        }
        return null;
    }
}
