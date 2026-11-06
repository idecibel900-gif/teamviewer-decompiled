package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s0 implements nw3 {
    @Override // o.nw3
    public Object b(aj1 aj1Var) {
        return i(aj1Var);
    }

    public Object e() {
        return new ArrayList();
    }

    public int f(Object obj) {
        fs5 fs5Var = (fs5) obj;
        fs5Var.getClass();
        return fs5Var.d();
    }

    public Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    public int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    public final Object i(aj1 aj1Var) {
        Object objE = e();
        int iF = f(objE);
        k01 k01VarU = aj1Var.u(d());
        while (true) {
            int iL = k01VarU.l(d());
            if (iL == -1) {
                k01VarU.i(d());
                return l(objE);
            }
            j(k01VarU, iL + iF, objE);
        }
    }

    public abstract void j(k01 k01Var, int i, Object obj);

    public Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        n80 n80Var = new n80();
        n80Var.a = zArr;
        n80Var.b = zArr.length;
        n80Var.b(10);
        return n80Var;
    }

    public Object l(Object obj) {
        fs5 fs5Var = (fs5) obj;
        fs5Var.getClass();
        return fs5Var.a();
    }
}
