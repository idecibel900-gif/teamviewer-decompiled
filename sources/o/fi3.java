package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fi3 implements se8 {
    public final qe8[] a;

    public fi3(qe8... qe8VarArr) {
        this.a = qe8VarArr;
    }

    @Override // o.se8
    public final oe8 b(Class cls, hw4 hw4Var) {
        qe8 qe8Var;
        wt3 wt3VarB = w86.a.b(cls);
        qe8[] qe8VarArr = this.a;
        qe8[] qe8VarArr2 = (qe8[]) Arrays.copyOf(qe8VarArr, qe8VarArr.length);
        int length = qe8VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                qe8Var = null;
                break;
            }
            qe8Var = qe8VarArr2[i];
            if (im3.n(qe8Var.a, wt3VarB)) {
                break;
            }
            i++;
        }
        oe8 oe8Var = qe8Var != null ? (oe8) qe8Var.b.invoke(hw4Var) : null;
        if (oe8Var != null) {
            return oe8Var;
        }
        gk0.h(ua5.m("No initializer set for given class ", wt3VarB.c()));
        return null;
    }
}
