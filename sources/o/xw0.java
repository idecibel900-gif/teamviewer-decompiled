package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xw0 extends yw0 {
    public xw0(td2... td2VarArr) {
        List listAsList = Arrays.asList(td2VarArr);
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i > 1) {
            arrayList.add(new ww0(listAsList));
        } else {
            arrayList.addAll(listAsList);
        }
        g();
    }

    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        for (int i = 0; i < this.c; i++) {
            if (((td2) this.b.get(i)).b(o82Var, o82Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.td2
    public final boolean c(o82 o82Var, q54 q54Var) {
        for (int i = 0; i < this.c; i++) {
            if (((td2) this.b.get(i)).c(o82Var, q54Var)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return lb7.j(", ", this.a);
    }
}
