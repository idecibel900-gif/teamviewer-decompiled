package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class x24 implements f58 {
    public final yc4 m;
    public final fi1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2473o;
    public final LinkedHashMap p;
    public final h50 q;

    public x24(yc4 yc4Var, fi1 fi1Var, to3 to3Var, int i) {
        yc4Var.getClass();
        to3Var.getClass();
        this.m = yc4Var;
        this.n = fi1Var;
        this.f2473o = i;
        ArrayList typeParameters = to3Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.p = linkedHashMap;
        this.q = ((io3) this.m.m).a.c(new t(this, (byte) 22));
    }

    @Override // o.f58
    public final d58 b(o86 o86Var) {
        o86Var.getClass();
        w24 w24Var = (w24) this.q.invoke(o86Var);
        return w24Var != null ? w24Var : ((f58) this.m.n).b(o86Var);
    }
}
