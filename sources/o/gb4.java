package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb4 {
    public static final eb4 a = new eb4();
    public static final fb4 b = new fb4();

    public void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) d98.j(j, obj);
        if (list instanceof h54) {
            objUnmodifiableList = ((h54) list).j();
        } else {
            if (eb4.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof js5) && (list instanceof ql3)) {
                e2 e2Var = (e2) ((ql3) list);
                if (e2Var.m) {
                    e2Var.m = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        d98.p(j, obj, objUnmodifiableList);
    }

    public void b(ny2 ny2Var, Object obj, long j) {
        List list = (List) d98.j(j, obj);
        List listD = eb4.d(list.size(), j, ny2Var);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        d98.p(j, ny2Var, list);
    }

    public List c(long j, Object obj) {
        return eb4.d(10, j, obj);
    }
}
