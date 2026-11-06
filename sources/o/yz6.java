package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yz6 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public vd5 c = new vd5("V", null);

    public yz6(a65 a65Var, String str, String str2) {
        this.a = str2;
    }

    public final void a(String str, uo3... uo3VarArr) {
        s48 s48Var;
        str.getClass();
        if (uo3VarArr.length == 0) {
            s48Var = null;
        } else {
            ex exVar = new ex(new y(uo3VarArr, (byte) 10), (byte) 1);
            int iQ = xm4.Q(mv0.Z(exVar, 10));
            if (iQ < 16) {
                iQ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
            Iterator it = exVar.iterator();
            while (true) {
                p62 p62Var = (p62) it;
                if (!p62Var.n.hasNext()) {
                    break;
                }
                sg3 sg3Var = (sg3) p62Var.next();
                linkedHashMap.put(Integer.valueOf(sg3Var.a), (uo3) sg3Var.b);
            }
            s48Var = new s48(linkedHashMap);
        }
        this.b.add(new vd5(str, s48Var));
    }

    public final void b(String str, uo3... uo3VarArr) {
        str.getClass();
        ex exVar = new ex(new y(uo3VarArr, (byte) 10), (byte) 1);
        int iQ = xm4.Q(mv0.Z(exVar, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
        Iterator it = exVar.iterator();
        while (true) {
            p62 p62Var = (p62) it;
            if (!p62Var.n.hasNext()) {
                this.c = new vd5(str, new s48(linkedHashMap));
                return;
            } else {
                sg3 sg3Var = (sg3) p62Var.next();
                linkedHashMap.put(Integer.valueOf(sg3Var.a), (uo3) sg3Var.b);
            }
        }
    }

    public final void c(ts3 ts3Var) {
        ts3Var.getClass();
        this.c = new vd5(ts3Var.f2139o, null);
    }
}
