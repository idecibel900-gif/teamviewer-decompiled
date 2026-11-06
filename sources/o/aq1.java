package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aq1 extends ap4 {
    public static final /* synthetic */ fw3[] f;
    public final fp1 b;
    public final zp1 c;
    public final vd4 d;
    public final ud4 e;

    static {
        x86 x86Var = w86.a;
        f = new fw3[]{x86Var.g(new gu5(x86Var.b(aq1.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), x86Var.g(new gu5(x86Var.b(aq1.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public aq1(fp1 fp1Var, List list, List list2, List list3, Function0 function0) {
        fp1Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.b = fp1Var;
        io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1Var.a;
        ((jk0) kVar.c).getClass();
        this.c = new zp1(this, list, list2, list3);
        xd4 xd4Var = (xd4) kVar.a;
        vp1 vp1Var = new vp1(function0, (byte) 0);
        xd4Var.getClass();
        this.d = new vd4(xd4Var, vp1Var);
        a3 a3Var = new a3(this, (byte) 9);
        xd4Var.getClass();
        this.e = new ud4(xd4Var, a3Var);
    }

    @Override // o.ap4, o.zo4
    public Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        zp1 zp1Var = this.c;
        zp1Var.getClass();
        return !((Set) i67.s(zp1Var.g, zp1.j[0])).contains(sy4Var) ? ea2.m : (Collection) zp1Var.d.invoke(sy4Var);
    }

    @Override // o.ap4, o.zo4
    public final Set b() {
        return (Set) i67.s(this.c.g, zp1.j[0]);
    }

    @Override // o.ap4, o.zo4
    public final Set c() {
        fw3 fw3Var = f[1];
        ud4 ud4Var = this.e;
        ud4Var.getClass();
        fw3Var.getClass();
        return (Set) ud4Var.a();
    }

    @Override // o.ap4, o.zo4
    public Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        zp1 zp1Var = this.c;
        zp1Var.getClass();
        return !((Set) i67.s(zp1Var.h, zp1.j[1])).contains(sy4Var) ? ea2.m : (Collection) zp1Var.e.invoke(sy4Var);
    }

    @Override // o.ap4, o.zo4
    public final Set f() {
        return (Set) i67.s(this.c.h, zp1.j[1]);
    }

    @Override // o.ap4, o.zo4
    public ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        if (q(sy4Var)) {
            io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) this.b.a;
            js0 js0VarL = l(sy4Var);
            es0 es0Var = (es0) kVar.t;
            Set set = es0.c;
            return es0Var.a(js0VarL, null);
        }
        zp1 zp1Var = this.c;
        if (!zp1Var.c.keySet().contains(sy4Var)) {
            return null;
        }
        zp1Var.getClass();
        return (eq1) zp1Var.f.invoke(sy4Var);
    }

    public void h(ArrayList arrayList, Function1 function1) {
    }

    public final List i(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (no1Var.a(no1.f)) {
            h(arrayList, function1);
        }
        zp1 zp1Var = this.c;
        zp1Var.getClass();
        vd4 vd4Var = zp1Var.g;
        vd4 vd4Var2 = zp1Var.h;
        gj2 gj2Var = gj2.q;
        boolean zA = no1Var.a(no1.j);
        ea2 ea2Var = ea2.m;
        if (zA) {
            Set<sy4> set = (Set) i67.s(vd4Var2, zp1.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (sy4 sy4Var : set) {
                if (((Boolean) function1.invoke(sy4Var)).booleanValue()) {
                    sy4Var.getClass();
                    arrayList2.addAll(!((Set) i67.s(vd4Var2, zp1.j[1])).contains(sy4Var) ? ea2Var : (Collection) zp1Var.e.invoke(sy4Var));
                }
            }
            pv0.b0(arrayList2, gj2Var);
            arrayList.addAll(arrayList2);
        }
        if (no1Var.a(no1.i)) {
            Set<sy4> set2 = (Set) i67.s(vd4Var, zp1.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (sy4 sy4Var2 : set2) {
                if (((Boolean) function1.invoke(sy4Var2)).booleanValue()) {
                    sy4Var2.getClass();
                    arrayList3.addAll(!((Set) i67.s(vd4Var, zp1.j[0])).contains(sy4Var2) ? ea2Var : (Collection) zp1Var.d.invoke(sy4Var2));
                }
            }
            pv0.b0(arrayList3, gj2Var);
            arrayList.addAll(arrayList3);
        }
        if (no1Var.a(no1.l)) {
            for (sy4 sy4Var3 : m()) {
                if (((Boolean) function1.invoke(sy4Var3)).booleanValue()) {
                    io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) this.b.a;
                    js0 js0VarL = l(sy4Var3);
                    es0 es0Var = (es0) kVar.t;
                    Set set3 = es0.c;
                    ns4 ns4VarA = es0Var.a(js0VarL, null);
                    if (ns4VarA != null) {
                        arrayList.add(ns4VarA);
                    }
                }
            }
        }
        if (no1Var.a(no1.g)) {
            for (sy4 sy4Var4 : zp1Var.c.keySet()) {
                if (((Boolean) function1.invoke(sy4Var4)).booleanValue()) {
                    zp1Var.getClass();
                    sy4Var4.getClass();
                    eq1 eq1Var = (eq1) zp1Var.f.invoke(sy4Var4);
                    if (eq1Var != null) {
                        arrayList.add(eq1Var);
                    }
                }
            }
        }
        return ka0.s(arrayList);
    }

    public void j(ArrayList arrayList, sy4 sy4Var) {
    }

    public void k(ArrayList arrayList, sy4 sy4Var) {
    }

    public abstract js0 l(sy4 sy4Var);

    public final Set m() {
        return (Set) i67.s(this.d, f[0]);
    }

    public Set n() {
        return la2.m;
    }

    public Set o() {
        return la2.m;
    }

    public Set p() {
        return la2.m;
    }

    public boolean q(sy4 sy4Var) {
        sy4Var.getClass();
        return m().contains(sy4Var);
    }

    public boolean r(dq1 dq1Var) {
        return true;
    }
}
