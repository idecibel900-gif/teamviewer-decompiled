package o;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class z73 implements ne2 {
    public static final k53 f;
    public final c75 a;
    public final me2 b;
    public final iu c;
    public byte d;
    public final je0 e;

    static {
        k53 k53Var = k53.n;
        f = us1.K("OkHttp-Response-Body", "Truncated");
    }

    public z73(c75 c75Var, me2 me2Var, iu iuVar) {
        iuVar.getClass();
        this.a = c75Var;
        this.b = me2Var;
        this.c = iuVar;
        this.e = new je0((w36) iuVar.p);
    }

    @Override // o.ne2
    public final void a() {
        ((u36) this.c.n).flush();
    }

    @Override // o.ne2
    public final boolean b() {
        return this.d == 6;
    }

    @Override // o.ne2
    public final v07 c(ab6 ab6Var, long j) {
        ab6Var.getClass();
        if ("chunked".equalsIgnoreCase(ab6Var.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = (byte) 2;
                return new v73(this);
            }
            an4.p(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            hk0.l("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = (byte) 2;
            return new wh2(this);
        }
        an4.p(this.d, "state: ");
        return null;
    }

    @Override // o.ne2
    public final void cancel() {
        this.b.cancel();
    }

    @Override // o.ne2
    public final jc6 d(boolean z) {
        je0 je0Var = this.e;
        byte b = this.d;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            an4.p(this.d, "state: ");
            return null;
        }
        try {
            String strC0 = ((w36) je0Var.f1154o).c0(je0Var.n);
            je0Var.n -= (long) strC0.length();
            ae aeVarO = h67.o(strC0);
            int i = aeVarO.b;
            jc6 jc6Var = new jc6();
            jc6Var.b = (yw5) aeVarO.c;
            jc6Var.c = i;
            jc6Var.d = (String) aeVarO.d;
            jc6Var.f = i67.k(je0Var.h());
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.d = (byte) 3;
                return jc6Var;
            }
            if (102 > i || i >= 200) {
                this.d = (byte) 4;
                return jc6Var;
            }
            this.d = (byte) 3;
            return jc6Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.f()), e);
        }
    }

    @Override // o.ne2
    public final void e() {
        ((u36) this.c.n).flush();
    }

    @Override // o.ne2
    public final n57 f() {
        return this.c;
    }

    @Override // o.ne2
    public final me2 g() {
        return this.b;
    }

    @Override // o.ne2
    public final q67 h(lc6 lc6Var) {
        ab6 ab6Var = lc6Var.m;
        if (!y83.a(lc6Var)) {
            return k(ab6Var.a, 0L);
        }
        String strA = lc6Var.r.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            h93 h93Var = ab6Var.a;
            if (this.d == 4) {
                this.d = (byte) 5;
                return new w73(this, h93Var);
            }
            an4.p(this.d, "state: ");
            return null;
        }
        long jE = ro8.e(lc6Var);
        if (jE != -1) {
            return k(ab6Var.a, jE);
        }
        h93 h93Var2 = ab6Var.a;
        if (this.d != 4) {
            an4.p(this.d, "state: ");
            return null;
        }
        this.d = (byte) 5;
        this.b.f();
        h93Var2.getClass();
        return new y73(this, h93Var2);
    }

    @Override // o.ne2
    public final long i(lc6 lc6Var) {
        if (!y83.a(lc6Var)) {
            return 0L;
        }
        String strA = lc6Var.r.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return ro8.e(lc6Var);
    }

    @Override // o.ne2
    public final void j(ab6 ab6Var) {
        ab6Var.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(ab6Var.b);
        sb.append(' ');
        h93 h93Var = ab6Var.a;
        if (im3.n(h93Var.a, "https") || type != Proxy.Type.HTTP) {
            String strB = h93Var.b();
            String strD = h93Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(h93Var);
        }
        sb.append(" HTTP/1.1");
        l(ab6Var.c, sb.toString());
    }

    public final x73 k(h93 h93Var, long j) {
        if (this.d == 4) {
            this.d = (byte) 5;
            return new x73(this, h93Var, j);
        }
        an4.p(this.d, "state: ");
        return null;
    }

    public final void l(k53 k53Var, String str) {
        if (this.d != 0) {
            an4.p(this.d, "state: ");
            return;
        }
        iu iuVar = this.c;
        u36 u36Var = (u36) iuVar.n;
        u36Var.V(str);
        u36Var.V("\r\n");
        int size = k53Var.size();
        int i = 0;
        while (true) {
            u36 u36Var2 = (u36) iuVar.n;
            if (i >= size) {
                u36Var2.V("\r\n");
                this.d = (byte) 1;
                return;
            } else {
                u36Var2.V(i67.j(k53Var, i));
                u36Var2.V(": ");
                u36Var2.V(i67.l(k53Var, i));
                u36Var2.V("\r\n");
                i++;
            }
        }
    }
}
