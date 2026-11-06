package o;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r66 {
    public SparseArray a;
    public int b;
    public Set c;

    public final void a() {
        SparseArray sparseArray = this.a;
        for (int i = 0; i < sparseArray.size(); i++) {
            q66 q66Var = (q66) sparseArray.valueAt(i);
            Iterator it = q66Var.a.iterator();
            while (it.hasNext()) {
                vt1.n(((c76) it.next()).m);
            }
            q66Var.a.clear();
        }
    }

    public final q66 b(int i) {
        SparseArray sparseArray = this.a;
        q66 q66Var = (q66) sparseArray.get(i);
        if (q66Var != null) {
            return q66Var;
        }
        q66 q66Var2 = new q66();
        sparseArray.put(i, q66Var2);
        return q66Var2;
    }
}
