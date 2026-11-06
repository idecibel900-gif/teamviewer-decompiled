package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ab6 {
    public final h93 a;
    public final String b;
    public final k53 c;
    public final db6 d;
    public final u47 e;
    public fi0 f;

    public ab6(yc4 yc4Var) {
        h93 h93Var = (h93) yc4Var.m;
        if (h93Var == null) {
            hk0.l("url == null");
            throw null;
        }
        this.a = h93Var;
        this.b = (String) yc4Var.n;
        nm nmVar = (nm) yc4Var.f2598o;
        nmVar.getClass();
        this.c = i67.i(nmVar);
        this.d = (db6) yc4Var.p;
        this.e = (u47) yc4Var.q;
    }

    public final yc4 a() {
        yc4 yc4Var = new yc4();
        yc4Var.m = this.a;
        yc4Var.n = this.b;
        yc4Var.p = this.d;
        yc4Var.q = this.e;
        yc4Var.f2598o = i67.k(this.c);
        return yc4Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        k53 k53Var = this.c;
        if (k53Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = k53Var.iterator();
            int i = 0;
            while (true) {
                j1 j1Var = (j1) it;
                if (!j1Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = j1Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    qf0.U();
                    throw null;
                }
                vd5 vd5Var = (vd5) next;
                String str = (String) vd5Var.m;
                String str2 = (String) vd5Var.n;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (po8.j(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        oa2 oa2Var = oa2.b;
        u47 u47Var = this.e;
        if (!im3.n(u47Var, oa2Var)) {
            sb.append(", tags=");
            sb.append(u47Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
