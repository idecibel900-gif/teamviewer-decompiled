package o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class rs0 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public rs0(String str) {
        this.a = str;
    }

    public static void a(rs0 rs0Var, String str, fq6 fq6Var) {
        fq6Var.getClass();
        if (!rs0Var.c.add(str)) {
            StringBuilder sbP = ua5.p("Element with name '", str, "' is already registered in ");
            sbP.append(rs0Var.a);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        rs0Var.b.add(str);
        rs0Var.d.add(fq6Var);
        rs0Var.e.add(ea2.m);
        rs0Var.f.add(false);
    }
}
