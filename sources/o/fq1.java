package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fq1 extends i1 {
    public final fp1 w;
    public final fw5 x;
    public final gp1 y;

    /* JADX WARN: Illegal instructions before constructor call */
    public fq1(fp1 fp1Var, fw5 fw5Var, int i) {
        ub8 ub8Var;
        xd4 xd4Var = (xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a;
        fi1 fi1Var = (fi1) fp1Var.c;
        tp tpVar = yl7.p;
        sy4 sy4VarC = et1.C((ty4) fp1Var.b, fw5Var.q);
        ew5 ew5Var = fw5Var.s;
        ew5Var.getClass();
        int iOrdinal = ew5Var.ordinal();
        if (iOrdinal == 0) {
            ub8Var = ub8.p;
        } else if (iOrdinal == 1) {
            ub8Var = ub8.q;
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                throw null;
            }
            ub8Var = ub8.f2197o;
        }
        ub8 ub8Var2 = ub8Var;
        boolean z = fw5Var.r;
        if (xd4Var == null) {
            i1.z(0);
            throw null;
        }
        if (fi1Var == null) {
            i1.z(1);
            throw null;
        }
        super(i, tpVar, fi1Var, xd4Var, sy4VarC, ub8Var2, z);
        this.w = fp1Var;
        this.x = fw5Var;
        this.y = new gp1(xd4Var, new a3(this, (byte) 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // o.g3
    public final List E0() {
        fp1 fp1Var = this.w;
        d22 d22Var = (d22) fp1Var.d;
        fw5 fw5Var = this.x;
        fw5Var.getClass();
        List list = fw5Var.t;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = fw5Var.u;
            list2.getClass();
            arrayList = new ArrayList(mv0.Z(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                arrayList.add(d22Var.a(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return qf0.K(bp1.e(this).m());
        }
        q48 q48Var = (q48) fp1Var.h;
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(q48Var.g((aw5) it.next()));
        }
        return arrayList2;
    }

    @Override // o.g2, o.so
    public final up getAnnotations() {
        return this.y;
    }
}
