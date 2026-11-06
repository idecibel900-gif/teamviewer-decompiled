package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jy2 extends fy2 implements rq4 {
    public cj2 n = cj2.c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1212o;

    public final void g(ky2 ky2Var) {
        m17 m17Var;
        if (!this.f1212o) {
            this.n = this.n.clone();
            this.f1212o = true;
        }
        cj2 cj2Var = this.n;
        cj2 cj2Var2 = ky2Var.m;
        cj2Var.getClass();
        int i = 0;
        while (true) {
            int size = cj2Var2.a.n.size();
            m17Var = cj2Var2.a;
            if (i >= size) {
                break;
            }
            cj2Var.g((Map.Entry) m17Var.n.get(i));
            i++;
        }
        Iterator it = m17Var.c().iterator();
        while (it.hasNext()) {
            cj2Var.g((Map.Entry) it.next());
        }
    }
}
