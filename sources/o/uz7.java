package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class uz7 extends oe8 {
    public final nw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f2259o;
    public final ArrayList p;
    public boolean q;
    public final xp5 r;

    public uz7(boolean z) {
        nw4 nw4Var = new nw4();
        nw4Var.setValue(Boolean.TRUE);
        this.n = nw4Var;
        nw4 nw4Var2 = new nw4();
        nw4Var2.setValue(Boolean.valueOf(z));
        this.f2259o = nw4Var2;
        this.p = new ArrayList();
        this.r = new xp5((byte) 28);
    }

    public final void V0(ld3 ld3Var) {
        if (this.q) {
            hk0.l("It is not supported to add an item to the toolbar after the view was initialized");
        } else {
            this.p.add(ld3Var);
        }
    }

    public final ld3 W0(int i) {
        Object next;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ld3) next).getId() == i) {
                return (ld3) next;
            }
        }
        next = null;
        return (ld3) next;
    }

    public final boolean X0() {
        return im3.n(this.f2259o.getValue(), Boolean.TRUE);
    }
}
