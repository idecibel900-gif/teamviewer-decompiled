package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class bq1 extends aq1 {
    public final ad5 g;
    public final String h;
    public final ht2 i;

    public bq1(ad5 ad5Var, mv5 mv5Var, ty4 ty4Var, h60 h60Var, rs3 rs3Var, io.sentry.android.replay.screenshot.k kVar, String str, Function0 function0) {
        mv5Var.getClass();
        ty4Var.getClass();
        h60Var.getClass();
        kVar.getClass();
        gw5 gw5Var = mv5Var.s;
        gw5Var.getClass();
        d22 d22Var = new d22(gw5Var);
        ed8 ed8Var = ed8.b;
        nw5 nw5Var = mv5Var.t;
        nw5Var.getClass();
        fp1 fp1Var = new fp1(kVar, ty4Var, ad5Var, d22Var, l47.m(nw5Var), h60Var, rs3Var, (q48) null, ea2.m);
        List list = mv5Var.p;
        list.getClass();
        List list2 = mv5Var.q;
        list2.getClass();
        List list3 = mv5Var.r;
        list3.getClass();
        super(fp1Var, list, list2, list3, function0);
        this.g = ad5Var;
        this.h = str;
        this.i = ((bd5) ad5Var).q;
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        List listI = i(no1Var, function1);
        Iterable iterable = (Iterable) ((io.sentry.android.replay.screenshot.k) this.b.a).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qv0.c0(arrayList, ((bs0) it.next()).a(this.i));
        }
        return lv0.A0(listI, arrayList);
    }

    @Override // o.aq1, o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        ((xz2) ((io.sentry.android.replay.screenshot.k) this.b.a).i).getClass();
        t35Var.getClass();
        ad5 ad5Var = this.g;
        ad5Var.getClass();
        sy4Var.getClass();
        ((bd5) ad5Var).q.b();
        sy4Var.b().getClass();
        return super.g(sy4Var, t35Var);
    }

    @Override // o.aq1
    public final js0 l(sy4 sy4Var) {
        sy4Var.getClass();
        return new js0(this.i, sy4Var);
    }

    @Override // o.aq1
    public final boolean q(sy4 sy4Var) {
        sy4Var.getClass();
        if (m().contains(sy4Var)) {
            return true;
        }
        Iterable iterable = (Iterable) ((io.sentry.android.replay.screenshot.k) this.b.a).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((bs0) it.next()).b(this.i, sy4Var)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.h;
    }
}
