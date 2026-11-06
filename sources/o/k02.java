package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k02 {
    public static final String a = we4.i("DiagnosticsWrkr");

    public static final String a(rm8 rm8Var, cn8 cn8Var, th7 th7Var, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xm8 xm8Var = (xm8) it.next();
            km8 km8VarJ = u47.j(xm8Var);
            String str = xm8Var.a;
            th7Var.getClass();
            String str2 = km8VarJ.a;
            int i = km8VarJ.b;
            str2.getClass();
            rh7 rh7Var = (rh7) au8.M(th7Var.a, true, false, new sh7(str2, i, (byte) 0));
            Integer numValueOf = rh7Var != null ? Integer.valueOf(rh7Var.c) : null;
            rm8Var.getClass();
            str.getClass();
            String strT0 = lv0.t0((List) au8.M(rm8Var.a, true, false, new fy(str, (byte) 25)), ",", null, null, null, 62);
            cn8Var.getClass();
            String strT1 = lv0.t0((List) au8.M(cn8Var.a, true, false, new zm8(str, (byte) 8)), ",", null, null, null, 62);
            String str3 = xm8Var.c;
            String strName = xm8Var.b.name();
            StringBuilder sbO = e41.o("\n", str, "\t ", str3, "\t ");
            sbO.append(numValueOf);
            sbO.append("\t ");
            sbO.append(strName);
            sbO.append("\t ");
            sb.append(e41.m(sbO, strT0, "\t ", strT1, "\t"));
        }
        return sb.toString();
    }
}
