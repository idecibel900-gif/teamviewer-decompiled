package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class o24 extends v24 {
    public final k86 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i24 f1623o;
    public final ud4 p;
    public final h50 q;

    public o24(yc4 yc4Var, k86 k86Var, i24 i24Var) {
        super(yc4Var, null);
        this.n = k86Var;
        this.f1623o = i24Var;
        xd4 xd4Var = ((io3) yc4Var.m).a;
        this.p = new ud4(xd4Var, new a3(yc4Var, this, (byte) 26));
        this.q = xd4Var.c(new y2(this, yc4Var, (byte) 14));
    }

    @Override // o.s24, o.ap4, o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return ea2.m;
    }

    @Override // o.s24, o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        if (!no1Var.a(no1.l | no1.e)) {
            return ea2.m;
        }
        Iterable iterable = (Iterable) this.d.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            fi1 fi1Var = (fi1) obj;
            if (fi1Var instanceof ns4) {
                sy4 name = ((ns4) fi1Var).getName();
                name.getClass();
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return v(sy4Var, null);
    }

    @Override // o.s24
    public final Set h(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        if (!no1Var.a(no1.e)) {
            return la2.m;
        }
        Set set = (Set) this.p.a();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(sy4.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // o.s24
    public final fi1 q() {
        return this.f1623o;
    }

    public final ns4 v(sy4 sy4Var, a86 a86Var) {
        sy4 sy4Var2 = a87.a;
        sy4Var.getClass();
        String strB = sy4Var.b();
        strB.getClass();
        if (strB.length() <= 0 || sy4Var.n) {
            return null;
        }
        Set set = (Set) this.p.a();
        if (a86Var == null && set != null && !set.contains(sy4Var.b())) {
            return null;
        }
        return (ns4) this.q.invoke(new k24(sy4Var, a86Var));
    }
}
