package o;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z77 {
    public static final LinkedHashSet a;
    public static final js0 b;

    static {
        List<ht2> listL = qf0.L(tr3.a, tr3.h, tr3.i, tr3.c, tr3.d, tr3.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ht2 ht2Var : listL) {
            ht2Var.getClass();
            ht2 ht2VarE = ht2Var.e();
            sy4 sy4VarF = ht2Var.f();
            sy4VarF.getClass();
            linkedHashSet.add(new js0(ht2VarE, sy4VarF));
        }
        a = linkedHashSet;
        ht2 ht2Var2 = tr3.g;
        ht2Var2.getClass();
        ht2 ht2VarE2 = ht2Var2.e();
        sy4 sy4VarF2 = ht2Var2.f();
        sy4VarF2.getClass();
        b = new js0(ht2VarE2, sy4VarF2);
    }
}
