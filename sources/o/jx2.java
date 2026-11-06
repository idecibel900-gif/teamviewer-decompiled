package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jx2 {
    public static final jx2 c = new jx2(qf0.L(dx2.c, gx2.c, ex2.c, fx2.c));
    public final List a;
    public final LinkedHashMap b;

    public jx2(List list) {
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ht2 ht2Var = ((hx2) obj).a;
            Object arrayList = linkedHashMap.get(ht2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(ht2Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    public final ix2 a(String str, ht2 ht2Var) {
        Integer numValueOf;
        ht2Var.getClass();
        List<hx2> list = (List) this.b.get(ht2Var);
        if (list != null) {
            for (hx2 hx2Var : list) {
                int i = 0;
                if (bc7.N(false, str, hx2Var.b)) {
                    String strSubstring = str.substring(hx2Var.b.length());
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i2 = 0;
                    while (true) {
                        if (i >= length) {
                            numValueOf = Integer.valueOf(i2);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i2 = (i2 * 10) + iCharAt;
                        i++;
                    }
                    if (numValueOf != null) {
                        return new ix2(hx2Var, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
