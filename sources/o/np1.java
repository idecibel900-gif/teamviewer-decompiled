package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class np1 extends aq1 {
    public final uz3 g;
    public final vd4 h;
    public final vd4 i;
    public final /* synthetic */ pp1 j;

    public np1(pp1 pp1Var, uz3 uz3Var) {
        this.j = pp1Var;
        fp1 fp1Var = pp1Var.x;
        tu5 tu5Var = pp1Var.q;
        List list = tu5Var.C;
        list.getClass();
        List list2 = tu5Var.D;
        list2.getClass();
        List list3 = tu5Var.E;
        list3.getClass();
        List list4 = tu5Var.w;
        list4.getClass();
        ty4 ty4Var = (ty4) pp1Var.x.b;
        ArrayList arrayList = new ArrayList(mv0.Z(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(et1.C(ty4Var, ((Number) it.next()).intValue()));
        }
        super(fp1Var, list, list2, list3, new kp1(arrayList, (byte) 0));
        io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1Var.a;
        this.g = uz3Var;
        xd4 xd4Var = (xd4) kVar.a;
        lp1 lp1Var = new lp1(this, (byte) 0);
        xd4Var.getClass();
        this.h = new vd4(xd4Var, lp1Var);
        xd4 xd4Var2 = (xd4) kVar.a;
        lp1 lp1Var2 = new lp1(this, (byte) 1);
        xd4Var2.getClass();
        this.i = new vd4(xd4Var2, lp1Var2);
    }

    @Override // o.aq1, o.ap4, o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        s(sy4Var, t35Var);
        return super.a(sy4Var, t35Var);
    }

    @Override // o.aq1, o.ap4, o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        s(sy4Var, t35Var);
        return super.d(sy4Var, t35Var);
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return (Collection) this.h.a();
    }

    @Override // o.aq1, o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        ns4 ns4Var;
        sy4Var.getClass();
        t35Var.getClass();
        s(sy4Var, t35Var);
        j93 j93Var = this.j.B;
        return (j93Var == null || (ns4Var = (ns4) ((h50) j93Var.f1141o).invoke(sy4Var)) == null) ? super.g(sy4Var, t35Var) : ns4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.ea2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // o.aq1
    public final void h(ArrayList arrayList, Function1 function1) {
        ?? arrayList2;
        j93 j93Var = this.j.B;
        if (j93Var != null) {
            Set<sy4> setKeySet = ((LinkedHashMap) j93Var.n).keySet();
            arrayList2 = new ArrayList();
            for (sy4 sy4Var : setKeySet) {
                sy4Var.getClass();
                ns4 ns4Var = (ns4) ((h50) j93Var.f1141o).invoke(sy4Var);
                if (ns4Var != null) {
                    arrayList2.add(ns4Var);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = ea2.m;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // o.aq1
    public final void j(ArrayList arrayList, sy4 sy4Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((oz3) it.next()).I().a(sy4Var, t35.f2077o));
        }
        fp1 fp1Var = this.b;
        arrayList.addAll(((cc) ((io.sentry.android.replay.screenshot.k) fp1Var.a).n).c(sy4Var, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((q35) ((p35) ((io.sentry.android.replay.screenshot.k) fp1Var.a).q)).d.h(sy4Var, arrayList2, arrayList3, this.j, new mp1(arrayList, (byte) 0));
    }

    @Override // o.aq1
    public final void k(ArrayList arrayList, sy4 sy4Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((oz3) it.next()).I().d(sy4Var, t35.f2077o));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((q35) ((p35) ((io.sentry.android.replay.screenshot.k) this.b.a).q)).d.h(sy4Var, arrayList2, arrayList3, this.j, new mp1(arrayList, (byte) 0));
    }

    @Override // o.aq1
    public final js0 l(sy4 sy4Var) {
        sy4Var.getClass();
        return this.j.t.d(sy4Var);
    }

    @Override // o.aq1
    public final Set n() {
        List listB = this.j.z.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Set setC = ((oz3) it.next()).I().c();
            if (setC == null) {
                return null;
            }
            qv0.c0(linkedHashSet, setC);
        }
        return linkedHashSet;
    }

    @Override // o.aq1
    public final Set o() {
        pp1 pp1Var = this.j;
        List listB = pp1Var.z.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            qv0.c0(linkedHashSet, ((oz3) it.next()).I().b());
        }
        linkedHashSet.addAll(((cc) ((io.sentry.android.replay.screenshot.k) this.b.a).n).a(pp1Var));
        return linkedHashSet;
    }

    @Override // o.aq1
    public final Set p() {
        List listB = this.j.z.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            qv0.c0(linkedHashSet, ((oz3) it.next()).I().f());
        }
        return linkedHashSet;
    }

    @Override // o.aq1
    public final boolean r(dq1 dq1Var) {
        return ((rl5) ((io.sentry.android.replay.screenshot.k) this.b.a).f168o).t0(this.j, dq1Var);
    }

    public final void s(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        ((xz2) ((io.sentry.android.replay.screenshot.k) this.b.a).i).getClass();
        this.j.getClass();
    }
}
