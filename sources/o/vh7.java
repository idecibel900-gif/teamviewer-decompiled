package o;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vh7 extends uj3 {
    public Function1 D;
    public wk8 E;

    @Override // o.pj3, o.es4
    public final void M0() {
        View viewY = e8.y(this);
        WeakHashMap weakHashMap = wk8.w;
        wk8 wk8VarH = b77.h(viewY);
        wk8VarH.a(viewY);
        qj8 qj8Var = (qj8) this.D.invoke(wk8VarH);
        if (!im3.n(qj8Var, this.C)) {
            this.C = qj8Var;
            V0();
        }
        this.E = wk8VarH;
        super.M0();
    }

    @Override // o.pj3, o.es4
    public final void N0() {
        View viewY = e8.y(this);
        wk8 wk8Var = this.E;
        if (wk8Var != null) {
            int i = wk8Var.u - 1;
            wk8Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = be8.a;
                sd8.c(viewY, null);
                xj8.a(viewY, null);
                viewY.removeOnAttachStateChangeListener(wk8Var.v);
            }
        }
        super.N0();
    }
}
