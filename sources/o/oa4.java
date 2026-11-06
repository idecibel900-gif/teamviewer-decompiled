package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oa4 extends u47 {
    public final wt3 b;
    public final Object c;
    public final u47 d;

    public oa4(wt3 wt3Var, Object obj, u47 u47Var) {
        obj.getClass();
        u47Var.getClass();
        this.b = wt3Var;
        this.c = obj;
        this.d = u47Var;
    }

    @Override // o.u47
    public final Object k(wt3 wt3Var) {
        return wt3Var.equals(this.b) ? et1.z(wt3Var).cast(this.c) : this.d.k(wt3Var);
    }

    @Override // o.u47
    public final u47 t(wt3 wt3Var, Object obj) {
        wt3 wt3Var2 = this.b;
        boolean zEquals = wt3Var.equals(wt3Var2);
        u47 u47Var = this.d;
        if (!zEquals) {
            u47 u47VarT = u47Var.t(wt3Var, null);
            if (u47VarT != u47Var) {
                this = new oa4(wt3Var2, this.c, u47VarT);
            }
            u47Var = this;
        }
        return obj != null ? new oa4(wt3Var, obj, u47Var) : u47Var;
    }

    public final String toString() {
        List listR0;
        List listL0 = bq6.l0(bq6.h0(this, new ek3((byte) 14)));
        if (listL0.size() <= 1) {
            listR0 = lv0.P0(listL0);
        } else {
            listR0 = lv0.R0(listL0);
            Collections.reverse(listR0);
        }
        return lv0.t0(listR0, null, "{", "}", new ek3((byte) 15), 25);
    }
}
