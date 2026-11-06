package o;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pa1 implements Comparator {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1720o;

    public pa1(gj2 gj2Var, Map map) {
        this.n = gj2Var;
        this.f1720o = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        Integer num;
        Integer num2;
        byte b = this.m;
        Object obj3 = this.n;
        Object obj4 = this.f1720o;
        switch (b) {
            case 0:
                Map map = (Map) obj4;
                int iIntValue = Integer.MAX_VALUE;
                int iValueOf = Integer.MAX_VALUE;
                int iCompare = ((gj2) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                h71 h71Var = (h71) obj;
                b91 b91Var = h71Var.t;
                b91 b91Var2 = b91.m;
                if (b91Var == b91Var2) {
                    numValueOf = Integer.valueOf((map == null || (num2 = (Integer) map.get(h71Var.s)) == null) ? Integer.MAX_VALUE : num2.intValue());
                } else {
                    numValueOf = Integer.MAX_VALUE;
                }
                h71 h71Var2 = (h71) obj2;
                if (h71Var2.t == b91Var2) {
                    if (map != null && (num = (Integer) map.get(h71Var2.s)) != null) {
                        iIntValue = num.intValue();
                    }
                    iValueOf = Integer.valueOf(iIntValue);
                }
                return numValueOf.compareTo(iValueOf);
            default:
                ds5 ds5Var = (ds5) obj4;
                x07 x07Var = (x07) obj3;
                return Float.compare(ds5Var.a((x07) obj2, x07Var), ds5Var.a((x07) obj, x07Var));
        }
    }

    public pa1(ds5 ds5Var, x07 x07Var) {
        this.f1720o = ds5Var;
        this.n = x07Var;
    }
}
