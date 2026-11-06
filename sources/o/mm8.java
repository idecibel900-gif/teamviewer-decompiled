package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mm8 implements jh7 {
    public final /* synthetic */ Object m;

    public /* synthetic */ mm8(Object obj) {
        this.m = obj;
    }

    @Override // o.jh7
    public Object f() {
        pn5 pn5Var = (pn5) this.m;
        Iterator it = ((Iterable) ((tg6) pn5Var.n).q(new an4((byte) 15))).iterator();
        while (it.hasNext()) {
            ((ep3) pn5Var.f1752o).D((u00) it.next(), 1, false);
        }
        return null;
    }
}
