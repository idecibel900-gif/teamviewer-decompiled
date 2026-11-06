package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class je7 implements zo4 {
    public final zo4 b;
    public final m58 c;
    public HashMap d;
    public final kh7 e;

    public je7(zo4 zo4Var, m58 m58Var) {
        zo4Var.getClass();
        m58Var.getClass();
        this.b = zo4Var;
        new kh7(new v87(m58Var, (byte) 1));
        this.c = new m58(pm8.M(m58Var.a));
        this.e = new kh7(new v87(this, (byte) 2));
    }

    @Override // o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return h(this.b.a(sy4Var, t35Var));
    }

    @Override // o.zo4
    public final Set b() {
        return this.b.b();
    }

    @Override // o.zo4
    public final Set c() {
        return this.b.c();
    }

    @Override // o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return h(this.b.d(sy4Var, t35Var));
    }

    @Override // o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return (Collection) this.e.getValue();
    }

    @Override // o.zo4
    public final Set f() {
        return this.b.f();
    }

    @Override // o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        ys0 ys0VarG = this.b.g(sy4Var, t35Var);
        if (ys0VarG != null) {
            return (ys0) i(ys0VarG);
        }
        return null;
    }

    public final Collection h(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((fi1) it.next()));
        }
        return linkedHashSet;
    }

    public final fi1 i(fi1 fi1Var) {
        m58 m58Var = this.c;
        if (m58Var.a.e()) {
            return fi1Var;
        }
        HashMap map = this.d;
        if (map == null) {
            map = new HashMap();
            this.d = map;
        }
        Object objD = map.get(fi1Var);
        if (objD == null) {
            if (!(fi1Var instanceof ie7)) {
                hk0.f(fi1Var, "Unknown descriptor in scope: ");
                return null;
            }
            objD = ((ie7) fi1Var).d(m58Var);
            if (objD == null) {
                hk0.p(fi1Var, " substitution fails", "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                return null;
            }
            map.put(fi1Var, objD);
        }
        return (fi1) objD;
    }
}
