package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w8 implements up3 {
    public final ArrayList a;
    public final ArrayList b;

    public w8(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public static v8 b(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v8 v8Var = (v8) arrayList.get(i);
            if (f57.h(v8Var.a, type) && v8Var.b.equals(set)) {
                return v8Var;
            }
        }
        return null;
    }

    @Override // o.up3
    public final vp3 a(Type type, Set set, pt4 pt4Var) {
        v8 v8VarB = b(this.a, type, set);
        v8 v8VarB2 = b(this.b, type, set);
        vp3 vp3VarB = null;
        if (v8VarB == null && v8VarB2 == null) {
            return null;
        }
        if (v8VarB == null || v8VarB2 == null) {
            try {
                vp3VarB = pt4Var.b(this, type, set);
            } catch (IllegalArgumentException e) {
                StringBuilder sbP = ua5.p("No ", v8VarB == null ? "@ToJson" : "@FromJson", " adapter for ");
                sbP.append(ma8.j(type, set));
                throw new IllegalArgumentException(sbP.toString(), e);
            }
        }
        vp3 vp3Var = vp3VarB;
        if (v8VarB != null) {
            v8VarB.a(pt4Var, this);
        }
        if (v8VarB2 != null) {
            v8VarB2.a(pt4Var, this);
        }
        return new s8(v8VarB, vp3Var, pt4Var, v8VarB2, set, type);
    }
}
