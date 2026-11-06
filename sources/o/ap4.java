package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ap4 implements zo4 {
    @Override // o.zo4
    public Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return ea2.m;
    }

    @Override // o.zo4
    public Set b() {
        Collection collectionE = e(no1.p, ek.I);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof c07) {
                sy4 name = ((c07) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // o.zo4
    public Set c() {
        return null;
    }

    @Override // o.zo4
    public Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return ea2.m;
    }

    @Override // o.zo4
    public Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return ea2.m;
    }

    @Override // o.zo4
    public Set f() {
        Collection collectionE = e(no1.q, ek.I);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof c07) {
                sy4 name = ((c07) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // o.zo4
    public ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return null;
    }
}
