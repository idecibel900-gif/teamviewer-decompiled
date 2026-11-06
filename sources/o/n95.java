package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n95 extends hm2 {
    public static final n95 d = new n95(0, 2, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        int i = ((al3) rr0Var.h(0)).a;
        List list = (List) rr0Var.h(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            jvVar.c(i3, obj);
            jvVar.j(i3, obj);
        }
    }
}
