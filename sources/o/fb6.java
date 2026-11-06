package o;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class fb6 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final h93 b;
    public String c;
    public g93 d;
    public final yc4 e = new yc4((byte) 17);
    public final nm f;
    public jo4 g;
    public final boolean h;
    public final ep3 i;
    public final m72 j;
    public db6 k;

    public fb6(String str, h93 h93Var, String str2, k53 k53Var, jo4 jo4Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = h93Var;
        this.c = str2;
        this.g = jo4Var;
        this.h = z;
        if (k53Var != null) {
            this.f = i67.k(k53Var);
        } else {
            this.f = new nm((byte) 5);
        }
        if (z2) {
            this.j = new m72((byte) 1);
            return;
        }
        if (z3) {
            ep3 ep3Var = new ep3((byte) 6);
            this.i = ep3Var;
            jo4 jo4Var2 = bw4.g;
            jo4Var2.getClass();
            if (jo4Var2.b.equals("multipart")) {
                ep3Var.f733o = jo4Var2;
            } else {
                yq4.q(jo4Var2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(boolean z, String str, String str2) {
        m72 m72Var = this.j;
        if (z) {
            m72Var.getClass();
            str.getClass();
            m72Var.a.add(au8.v(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            m72Var.b.add(au8.v(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        m72Var.getClass();
        str.getClass();
        m72Var.a.add(au8.v(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        m72Var.b.add(au8.v(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(boolean z, String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                e96 e96Var = jo4.e;
                this.g = vt1.t(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ua5.m("Malformed content type: ", str2), e);
            }
        }
        nm nmVar = this.f;
        if (!z) {
            nmVar.h(str, str2);
            return;
        }
        nmVar.getClass();
        str.getClass();
        str2.getClass();
        i67.t(str);
        i67.h(nmVar, str, str2);
    }

    public final void c(k53 k53Var, db6 db6Var) {
        ep3 ep3Var = this.i;
        ep3Var.getClass();
        db6Var.getClass();
        if (k53Var.a("Content-Type") != null) {
            hk0.g("Unexpected header: Content-Type");
        } else if (k53Var.a("Content-Length") != null) {
            hk0.g("Unexpected header: Content-Length");
        } else {
            ((ArrayList) ep3Var.p).add(new aw4(k53Var, db6Var));
        }
    }

    public final void d(boolean z, String str, String str2) {
        g93 g93Var;
        String str3 = this.c;
        if (str3 != null) {
            h93 h93Var = this.b;
            h93Var.getClass();
            try {
                g93Var = new g93();
                g93Var.c(h93Var, str3);
            } catch (IllegalArgumentException unused) {
                g93Var = null;
            }
            this.d = g93Var;
            if (g93Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(h93Var);
                an4.o(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        g93 g93Var2 = this.d;
        if (z) {
            g93Var2.getClass();
            str.getClass();
            ArrayList arrayList = g93Var2.g;
            if (arrayList == null) {
                arrayList = new ArrayList();
                g93Var2.g = arrayList;
            }
            arrayList.add(au8.u(0, 0, 83, str, " \"'<>#&="));
            ArrayList arrayList2 = g93Var2.g;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? au8.u(0, 0, 83, str2, " \"'<>#&=") : null);
            return;
        }
        g93Var2.getClass();
        str.getClass();
        ArrayList arrayList3 = g93Var2.g;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            g93Var2.g = arrayList3;
        }
        arrayList3.add(au8.u(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = g93Var2.g;
        arrayList4.getClass();
        arrayList4.add(str2 != null ? au8.u(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
