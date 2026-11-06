package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eb4 extends gb4 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List listZ;
        List list = (List) d98.j(j, obj);
        if (list.isEmpty()) {
            if (list instanceof h54) {
                listZ = new g54(i);
            } else {
                listZ = ((list instanceof js5) && (list instanceof ql3)) ? ((ql3) list).z(i) : new ArrayList(i);
            }
            d98.p(j, obj, listZ);
            return listZ;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            d98.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof s88) {
            s88 s88Var = (s88) list;
            g54 g54Var = new g54(s88Var.m.size() + i);
            g54Var.addAll(s88Var);
            d98.p(j, obj, g54Var);
            return g54Var;
        }
        if ((list instanceof js5) && (list instanceof ql3)) {
            ql3 ql3Var = (ql3) list;
            if (!((e2) ql3Var).m) {
                ql3 ql3VarZ = ql3Var.z(list.size() + i);
                d98.p(j, obj, ql3VarZ);
                return ql3VarZ;
            }
        }
        return list;
    }
}
