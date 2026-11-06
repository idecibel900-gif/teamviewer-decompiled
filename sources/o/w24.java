package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w24 extends i1 {
    public final yc4 w;
    public final o86 x;

    public w24(yc4 yc4Var, o86 o86Var, int i, fi1 fi1Var) {
        super(i, new z14(yc4Var, o86Var, false), fi1Var, ((io3) yc4Var.m).a, sy4.e(o86Var.a.getName()), ub8.f2197o, false);
        this.w = yc4Var;
        this.x = o86Var;
    }

    @Override // o.g3
    public final List D0(List list) {
        w24 w24Var;
        rk5 rk5Var;
        oz3 oz3Var;
        oz3 oz3VarJ;
        yc4 yc4Var = this.w;
        rk5 rk5Var2 = ((io3) yc4Var.m).k;
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oz3 oz3Var2 = (oz3) it.next();
            e24 e24Var = e24.M;
            oz3Var2.getClass();
            if (p58.c(oz3Var2, e24Var, null)) {
                w24Var = this;
                rk5Var = rk5Var2;
                oz3Var = oz3Var2;
            } else {
                w24Var = this;
                rk5Var = rk5Var2;
                oz3Var = oz3Var2;
                oz3VarJ = rk5Var.j(new zz6((so) w24Var, false, yc4Var, lp.TYPE_PARAMETER_BOUNDS, false), oz3Var, ea2.m, null, false);
                if (oz3VarJ == null) {
                }
                arrayList.add(oz3VarJ);
                this = w24Var;
                rk5Var2 = rk5Var;
            }
            oz3VarJ = oz3Var;
            arrayList.add(oz3VarJ);
            this = w24Var;
            rk5Var2 = rk5Var;
        }
        return arrayList;
    }

    @Override // o.g3
    public final List E0() {
        Type[] bounds = this.x.a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new c86(type));
        }
        c86 c86Var = (c86) lv0.H0(arrayList);
        Collection collection = arrayList;
        if (im3.n(c86Var != null ? c86Var.a : null, Object.class)) {
            collection = ea2.m;
        }
        boolean zIsEmpty = collection.isEmpty();
        yc4 yc4Var = this.w;
        if (zIsEmpty) {
            return qf0.K(bt1.v(((io3) yc4Var.m).h.p.e(), ((io3) yc4Var.m).h.p.o()));
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((iu) yc4Var.q).V((c86) it.next(), lq1.I(n58.n, false, this, 3)));
        }
        return arrayList2;
    }
}
