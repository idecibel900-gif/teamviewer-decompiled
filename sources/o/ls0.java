package o;

import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ls0 extends vp3 {
    public static final lw d = new lw(1);
    public final hm3 a;
    public final ks0[] b;
    public final jr3 c;

    public ls0(hm3 hm3Var, TreeMap treeMap) {
        this.a = hm3Var;
        this.b = (ks0[]) treeMap.values().toArray(new ks0[treeMap.size()]);
        this.c = jr3.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws qq3, EOFException {
        try {
            Object objX = this.a.x();
            try {
                nr3Var.u0();
                while (nr3Var.hasNext()) {
                    int iO0 = nr3Var.o0(this.c);
                    if (iO0 == -1) {
                        nr3Var.H0();
                        nr3Var.v();
                    } else {
                        ks0 ks0Var = this.b[iO0];
                        ks0Var.b.set(objX, ks0Var.c.a(nr3Var));
                    }
                }
                nr3Var.Z();
                return objX;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            gk0.r(e);
            return null;
        } catch (InvocationTargetException e2) {
            ma8.i(e2);
            throw null;
        }
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        try {
            pr3Var.q();
            for (ks0 ks0Var : this.b) {
                pr3Var.G(ks0Var.a);
                ks0Var.c.c(pr3Var, ks0Var.b.get(obj));
            }
            pr3Var.z();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}
