package o;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class us5 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(ss5.m, 0);
        map.put(ss5.n, 1);
        map.put(ss5.f2049o, 2);
        for (ss5 ss5Var : map.keySet()) {
            a.append(((Integer) b.get(ss5Var)).intValue(), ss5Var);
        }
    }

    public static int a(ss5 ss5Var) {
        Integer num = (Integer) b.get(ss5Var);
        if (num != null) {
            return num.intValue();
        }
        yq4.t(ss5Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static ss5 b(int i) {
        ss5 ss5Var = (ss5) a.get(i);
        if (ss5Var != null) {
            return ss5Var;
        }
        hk0.g(fx3.e(i, "Unknown Priority for value "));
        return null;
    }
}
