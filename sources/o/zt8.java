package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zt8 extends vu8 {
    private static final zt8 zzb;
    private yu8 zzd = lv8.q;

    static {
        zt8 zt8Var = new zt8();
        zzb = zt8Var;
        vu8.f(zt8.class, zt8Var);
    }

    public static yt8 o() {
        return (yt8) zzb.k();
    }

    public static void p(zt8 zt8Var, ArrayList arrayList) {
        yu8 yu8VarQ = zt8Var.zzd;
        if (!((ju8) yu8VarQ).m) {
            int size = yu8VarQ.size();
            yu8VarQ = yu8VarQ.q(size + size);
            zt8Var.zzd = yu8VarQ;
        }
        int size2 = arrayList.size();
        if (yu8VarQ instanceof ArrayList) {
            ((ArrayList) yu8VarQ).ensureCapacity(yu8VarQ.size() + size2);
        } else if (yu8VarQ instanceof lv8) {
            lv8 lv8Var = (lv8) yu8VarQ;
            int i = lv8Var.f1411o + size2;
            int length = lv8Var.n.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    lv8Var.n = Arrays.copyOf(lv8Var.n, length);
                } else {
                    lv8Var.n = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = yu8VarQ.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strF = fx3.f(yu8VarQ.size() - size3, "Element at index ", " is null.");
                int size5 = yu8VarQ.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        yq4.l(strF);
                        return;
                    }
                    yu8VarQ.remove(size5);
                }
            } else {
                yu8VarQ.add(obj);
            }
        }
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", xt8.class});
        }
        if (i2 == 3) {
            return new zt8();
        }
        if (i2 == 4) {
            return new yt8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
