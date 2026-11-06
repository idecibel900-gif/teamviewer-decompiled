package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g48 implements Iterable, su3 {
    public static final lh7 n = new lh7((byte) 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g48 f858o = new g48(ea2.m);
    public final uw m;

    public g48(List list) {
        this.m = x92.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xp xpVar = (xp) it.next();
            xpVar.getClass();
            String strC = w86.a.b(xp.class).c();
            strC.getClass();
            int iR = n.r(strC);
            int iA = this.m.a();
            if (iA != 0) {
                if (iA == 1) {
                    uw uwVar = this.m;
                    uwVar.getClass();
                    c95 c95Var = (c95) uwVar;
                    int i = c95Var.n;
                    if (i == iR) {
                        this.m = new c95(iR, xpVar);
                    } else {
                        xw xwVar = new xw();
                        xwVar.m = new Object[20];
                        xwVar.n = 0;
                        this.m = xwVar;
                        xwVar.b(i, c95Var.m);
                    }
                }
                this.m.b(iR, xpVar);
            } else {
                this.m = new c95(iR, xpVar);
            }
        }
    }

    public final boolean isEmpty() {
        return this.m.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
    }
}
