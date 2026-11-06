package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d22 implements ic1 {
    public final List m;

    public d22(gw5 gw5Var) {
        gw5Var.getClass();
        List list = gw5Var.f929o;
        if ((gw5Var.n & 1) == 1) {
            int i = gw5Var.p;
            list.getClass();
            ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    qf0.U();
                    throw null;
                }
                aw5 aw5VarH = (aw5) obj;
                if (i2 >= i) {
                    aw5VarH.getClass();
                    zv5 zv5VarQ = aw5.q(aw5VarH);
                    zv5VarQ.p |= 2;
                    zv5VarQ.r = true;
                    aw5VarH = zv5VarQ.h();
                    if (!aw5VarH.a()) {
                        throw new z78();
                    }
                }
                arrayList.add(aw5VarH);
                i2 = i3;
            }
            list = arrayList;
        }
        list.getClass();
        this.m = list;
    }

    public aw5 a(int i) {
        return (aw5) this.m.get(i);
    }

    @Override // o.ic1
    public /* bridge */ /* synthetic */ Object j(bo7 bo7Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.m);
        return h57.j(arrayList);
    }

    public d22(ArrayList arrayList) {
        this.m = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ d22(List list) {
        this.m = list;
    }
}
