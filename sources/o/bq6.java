package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bq6 extends cq6 {
    public static zp6 f0(zp6 zp6Var, int i) {
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return zp6Var;
        }
        return zp6Var instanceof u62 ? ((u62) zp6Var).a(i) : new q62(zp6Var, i);
    }

    public static final km2 g0(zp6 zp6Var) {
        fk6 fk6Var = new fk6((byte) 10);
        if (!(zp6Var instanceof h18)) {
            return new km2(zp6Var, new fk6((byte) 11), fk6Var);
        }
        h18 h18Var = (h18) zp6Var;
        return new km2(h18Var.a, h18Var.b, fk6Var);
    }

    public static zp6 h0(Object obj, Function1 function1) {
        return obj == null ? ka2.a : new sy2(new y26(obj, (byte) 11), function1);
    }

    public static zp6 i0(Function0 function0) {
        return new v51(new sy2(function0, new or(function0, (byte) 7)));
    }

    public static String j0(zp6 zp6Var, String str) {
        zp6Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : zp6Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            o77.e(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static fl2 k0(zp6 zp6Var, Function1 function1) {
        return new fl2(new h18(zp6Var, function1), false, new fk6((byte) 12));
    }

    public static List l0(zp6 zp6Var) {
        Iterator it = zp6Var.iterator();
        if (!it.hasNext()) {
            return ea2.m;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return qf0.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList m0(zp6 zp6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zp6Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
