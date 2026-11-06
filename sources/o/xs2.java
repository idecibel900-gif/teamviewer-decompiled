package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xs2 extends db6 {
    public static final jo4 d;
    public final List b;
    public final List c;

    static {
        e96 e96Var = jo4.e;
        d = vt1.t("application/x-www-form-urlencoded");
    }

    public xs2(ArrayList arrayList, ArrayList arrayList2) {
        this.b = ro8.j(arrayList);
        this.c = ro8.j(arrayList2);
    }

    @Override // o.db6
    public final long a() {
        return e(null, true);
    }

    @Override // o.db6
    public final void d(nf0 nf0Var) throws EOFException {
        e(nf0Var, false);
    }

    public final long e(nf0 nf0Var, boolean z) throws EOFException {
        bf0 bf0VarH;
        if (z) {
            bf0VarH = new bf0();
        } else {
            nf0Var.getClass();
            bf0VarH = nf0Var.h();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bf0VarH.U0(38);
            }
            bf0VarH.Z0((String) list.get(i));
            bf0VarH.U0(61);
            bf0VarH.Z0((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = bf0VarH.n;
        bf0VarH.e();
        return j;
    }
}
