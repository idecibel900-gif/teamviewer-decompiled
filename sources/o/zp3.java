package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zp3 implements nw3 {
    public static final zp3 a = new zp3();
    public static final yp3 b = yp3.b;

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        xp3 xp3Var = (xp3) obj;
        xp3Var.getClass();
        us1.o(bb7Var);
        oq3 oq3Var = oq3.a;
        hq6 hq6Var = oq3.b;
        hq6Var.getClass();
        iw iwVar = new iw(hq6Var, (byte) 1);
        List list = xp3Var.m;
        int size = list.size();
        bb7 bb7VarA = bb7Var.a(iwVar);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            bb7VarA.n(iwVar, i, oq3Var, it.next());
        }
        bb7VarA.s(iwVar);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        us1.n(aj1Var);
        return new xp3((List) new ow(oq3.a, (byte) 0).i(aj1Var));
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
