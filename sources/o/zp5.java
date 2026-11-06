package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zp5 {
    public final s48 a;
    public final ArrayList b;
    public final String c;
    public final zp5 d;

    public zp5(s48 s48Var, ArrayList arrayList, String str) {
        this.a = s48Var;
        this.b = arrayList;
        this.c = str;
        zp5 zp5Var = null;
        if (str != null) {
            s48 s48VarA = s48Var != null ? s48Var.a() : null;
            ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s48 s48Var2 = (s48) it.next();
                arrayList2.add(s48Var2 != null ? s48Var2.a() : null);
            }
            zp5Var = new zp5(s48VarA, arrayList2, null);
        }
        this.d = zp5Var;
    }
}
