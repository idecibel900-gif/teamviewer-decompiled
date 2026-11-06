package o;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class aj6 {
    public static final String a = we4.i("Schedulers");

    public static void a(an8 an8Var, yi5 yi5Var, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                an8Var.c(((xm8) it.next()).a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(d11 d11Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        an8 an8VarW = workDatabase.w();
        new ArrayList();
        workDatabase.b();
        try {
            ze6 ze6Var = an8VarW.a;
            ze6 ze6Var2 = an8VarW.a;
            List list2 = (List) au8.M(ze6Var, true, false, new yb8((byte) 11));
            a(an8VarW, (yi5) d11Var.p, list2);
            List list3 = (List) au8.M(ze6Var2, true, false, new yb8((byte) 14));
            List list4 = (List) au8.M(ze6Var2, true, false, new yb8((byte) 16));
            a(an8VarW, (yi5) d11Var.p, list4);
            list4.addAll(list2);
            workDatabase.p();
            workDatabase.l();
            c(list4, list, true);
            c(list3, list, false);
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }

    public static void c(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        xm8[] xm8VarArr = (xm8[]) list.toArray(new xm8[list.size()]);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            xi6 xi6Var = (xi6) it.next();
            if (xi6Var.c() == z) {
                xi6Var.b(xm8VarArr);
            }
        }
    }
}
