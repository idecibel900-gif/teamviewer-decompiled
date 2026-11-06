package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cd5 implements dd5 {
    public final ArrayList a;

    public cd5(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // o.dd5
    public final boolean a(ht2 ht2Var) {
        ht2Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (im3.n(((bd5) ((ad5) it.next())).q, ht2Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.dd5
    public final void b(ht2 ht2Var, ArrayList arrayList) {
        ht2Var.getClass();
        for (Object obj : this.a) {
            if (im3.n(((bd5) ((ad5) obj)).q, ht2Var)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // o.dd5
    public final Collection f(ht2 ht2Var, Function1 function1) {
        ht2Var.getClass();
        return bq6.l0(new fl2(new h18(new fx(this.a, (byte) 1), e24.w), true, new j01(ht2Var, (byte) 1)));
    }
}
