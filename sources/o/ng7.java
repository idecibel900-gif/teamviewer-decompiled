package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ng7 {
    public static final gw4 a;

    static {
        hd2 hd2Var = hd2.a;
        ha2 ha2Var = new ha2(hd2.b, t87.f, (byte) 0);
        sy4 sy4VarF = t87.g.f();
        pd4 pd4Var = xd4.e;
        gw4 gw4Var = new gw4(ha2Var, sy4VarF, pd4Var);
        gw4Var.t = as4.q;
        cp1 cp1Var = dp1.e;
        if (cp1Var == null) {
            gw4.A0(9);
            throw null;
        }
        gw4Var.u = cp1Var;
        List listK = qf0.K(e58.G0(gw4Var, ub8.p, sy4.e("T"), 0, pd4Var));
        if (gw4Var.w != null) {
            hk0.n(gw4Var.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listK);
        gw4Var.w = arrayList;
        gw4Var.v = new ss0(gw4Var, arrayList, gw4Var.x, gw4Var.y);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            gw4.A0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((wr0) ((xw2) it.next())).s = gw4Var.W();
        }
        a = gw4Var;
    }
}
