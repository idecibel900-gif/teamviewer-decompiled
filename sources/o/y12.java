package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y12 implements AutoCloseable {
    public static final e96 D = new e96("[a-z0-9_-]{1,120}");
    public boolean A;
    public boolean B;
    public final x12 C;
    public final wg5 m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wg5 f2570o;
    public final wg5 p;
    public final wg5 q;
    public final LinkedHashMap r;
    public final fc1 s;
    public final Object t;
    public long u;
    public int v;
    public u36 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public y12(long j, sj2 sj2Var, wg5 wg5Var) {
        this.m = wg5Var;
        this.n = j;
        if (j <= 0) {
            hk0.g("maxSize <= 0");
            throw null;
        }
        this.f2570o = wg5Var.e("journal");
        this.p = wg5Var.e("journal.tmp");
        this.q = wg5Var.e("journal.bkp");
        this.r = new LinkedHashMap(0, 0.75f, true);
        se7 se7VarA = g57.a();
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        ee1 ee1Var = fe1.n;
        this.s = hm3.c(xk0.G(se7VarA, gk1Var.N0(1)));
        this.t = new Object();
        this.C = new x12(sj2Var);
    }

    public static void k0(String str) {
        if (D.c(str)) {
            return;
        }
        gk0.h(fx3.g("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final u36 F() {
        return new u36(new wh2(this.C.f2469o.e(this.f2570o), new a81(this, (byte) 11)));
    }

    public final void G() {
        Iterator it = this.r.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            v12 v12Var = (v12) it.next();
            int i = 0;
            if (v12Var.g == null) {
                while (i < 2) {
                    j += v12Var.b[i];
                    i++;
                }
            } else {
                v12Var.g = null;
                while (i < 2) {
                    wg5 wg5Var = (wg5) v12Var.c.get(i);
                    x12 x12Var = this.C;
                    x12Var.z(wg5Var);
                    x12Var.z((wg5) v12Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.u = j;
    }

    public final void J() throws Throwable {
        q67 q67VarK0 = this.C.f2469o.k0(this.f2570o);
        q67VarK0.getClass();
        w36 w36Var = new w36(q67VarK0);
        try {
            String strC0 = w36Var.c0(Long.MAX_VALUE);
            String strC1 = w36Var.c0(Long.MAX_VALUE);
            String strC2 = w36Var.c0(Long.MAX_VALUE);
            String strC3 = w36Var.c0(Long.MAX_VALUE);
            String strC4 = w36Var.c0(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strC0) || !"1".equals(strC1) || !im3.n(String.valueOf(3), strC2) || !im3.n(String.valueOf(2), strC3) || strC4.length() > 0) {
                throw new IOException("unexpected journal header: [" + strC0 + ", " + strC1 + ", " + strC2 + ", " + strC3 + ", " + strC4 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    Y(w36Var.c0(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.v = i - this.r.size();
                    if (w36Var.e()) {
                        this.w = F();
                    } else {
                        l0();
                    }
                    try {
                        w36Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                w36Var.close();
            } catch (Throwable th3) {
                ct1.q(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void Y(String str) throws IOException {
        String strSubstring;
        int iY = ub7.Y(str, ' ', 0, 6);
        if (iY == -1) {
            gk0.l("unexpected journal line: ".concat(str));
            return;
        }
        int i = iY + 1;
        int iY2 = ub7.Y(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.r;
        if (iY2 == -1) {
            strSubstring = str.substring(i);
            if (iY == 6 && bc7.N(false, str, "REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iY2);
        }
        Object v12Var = linkedHashMap.get(strSubstring);
        if (v12Var == null) {
            v12Var = new v12(this, strSubstring);
            linkedHashMap.put(strSubstring, v12Var);
        }
        v12 v12Var2 = (v12) v12Var;
        if (iY2 == -1 || iY != 5 || !bc7.N(false, str, "CLEAN")) {
            if (iY2 == -1 && iY == 5 && bc7.N(false, str, "DIRTY")) {
                v12Var2.g = new io.sentry.z7(this, v12Var2);
                return;
            } else {
                if (iY2 == -1 && iY == 4 && bc7.N(false, str, "READ")) {
                    return;
                }
                gk0.l("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listM0 = ub7.m0(str.substring(iY2 + 1), new char[]{' '});
        v12Var2.e = true;
        v12Var2.g = null;
        if (listM0.size() != 2) {
            yq4.v(listM0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listM0.size();
            for (int i2 = 0; i2 < size; i2++) {
                v12Var2.b[i2] = Long.parseLong((String) listM0.get(i2));
            }
        } catch (NumberFormatException unused) {
            yq4.v(listM0, "unexpected journal line: ");
        }
    }

    public final void b0(v12 v12Var) {
        u36 u36Var;
        int i = v12Var.h;
        String str = v12Var.a;
        if (i > 0 && (u36Var = this.w) != null) {
            u36Var.V("DIRTY");
            u36Var.writeByte(32);
            u36Var.V(str);
            u36Var.writeByte(10);
            u36Var.flush();
        }
        if (v12Var.h > 0 || v12Var.g != null) {
            v12Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.C.z((wg5) v12Var.c.get(i2));
            long j = this.u;
            long[] jArr = v12Var.b;
            this.u = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.v++;
        u36 u36Var2 = this.w;
        if (u36Var2 != null) {
            u36Var2.V("REMOVE");
            u36Var2.writeByte(32);
            u36Var2.V(str);
            u36Var2.writeByte(10);
            u36Var2.flush();
        }
        this.r.remove(str);
        if (this.v >= 2000) {
            z();
        }
    }

    public final void c0() {
        while (this.u > this.n) {
            for (v12 v12Var : this.r.values()) {
                if (!v12Var.f) {
                    b0(v12Var);
                }
            }
            return;
        }
        this.A = false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.t) {
            try {
                if (this.y && !this.z) {
                    for (v12 v12Var : (v12[]) this.r.values().toArray(new v12[0])) {
                        io.sentry.z7 z7Var = v12Var.g;
                        if (z7Var != null) {
                            v12 v12Var2 = (v12) z7Var.b;
                            if (im3.n(v12Var2.g, z7Var)) {
                                v12Var2.f = true;
                            }
                        }
                    }
                    c0();
                    hm3.f(this.s, null);
                    u36 u36Var = this.w;
                    u36Var.getClass();
                    u36Var.close();
                    this.w = null;
                    this.z = true;
                    return;
                }
                this.z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0116 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x006e, B:31:0x007e, B:33:0x0085, B:28:0x0063, B:37:0x00a5, B:39:0x00ac, B:42:0x00b1, B:44:0x00c2, B:47:0x00c7, B:52:0x0102, B:54:0x010d, B:58:0x0116, B:48:0x00df, B:50:0x00f4, B:51:0x00ff, B:36:0x0095, B:61:0x011b, B:62:0x0122), top: B:65:0x0003 }] */
    public final void e(io.sentry.z7 z7Var, boolean z) {
        synchronized (this.t) {
            v12 v12Var = (v12) z7Var.b;
            if (!im3.n(v12Var.g, z7Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || v12Var.f) {
                for (int i = 0; i < 2; i++) {
                    this.C.z((wg5) v12Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) z7Var.c)[i2] && !this.C.F((wg5) v12Var.d.get(i2))) {
                        z7Var.b(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    wg5 wg5Var = (wg5) v12Var.d.get(i3);
                    wg5 wg5Var2 = (wg5) v12Var.c.get(i3);
                    boolean zF = this.C.F(wg5Var);
                    x12 x12Var = this.C;
                    if (zF) {
                        wg5Var2.getClass();
                        x12Var.f2469o.j(wg5Var, wg5Var2);
                    } else {
                        ds1.D(x12Var, (wg5) v12Var.c.get(i3));
                    }
                    long j = v12Var.b[i3];
                    Long l = (Long) this.C.J(wg5Var2).e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    v12Var.b[i3] = jLongValue;
                    this.u = (this.u - j) + jLongValue;
                }
            }
            v12Var.g = null;
            if (v12Var.f) {
                b0(v12Var);
                return;
            }
            this.v++;
            u36 u36Var = this.w;
            u36Var.getClass();
            if (z || v12Var.e) {
                v12Var.e = true;
                u36Var.V("CLEAN");
                u36Var.writeByte(32);
                u36Var.V(v12Var.a);
                for (long j2 : v12Var.b) {
                    u36Var.writeByte(32);
                    u36Var.j(j2);
                }
                u36Var.writeByte(10);
            } else {
                this.r.remove(v12Var.a);
                u36Var.V("REMOVE");
                u36Var.writeByte(32);
                u36Var.V(v12Var.a);
                u36Var.writeByte(10);
            }
            u36Var.flush();
            if (this.u > this.n) {
                z();
            } else if (this.v >= 2000) {
                z();
            }
        }
    }

    public final io.sentry.z7 j(String str) {
        synchronized (this.t) {
            if (this.z) {
                throw new IllegalStateException("cache is closed");
            }
            k0(str);
            u();
            v12 v12Var = (v12) this.r.get(str);
            if ((v12Var != null ? v12Var.g : null) != null) {
                return null;
            }
            if (v12Var != null && v12Var.h != 0) {
                return null;
            }
            if (!this.A && !this.B) {
                u36 u36Var = this.w;
                u36Var.getClass();
                u36Var.V("DIRTY");
                u36Var.writeByte(32);
                u36Var.V(str);
                u36Var.writeByte(10);
                u36Var.flush();
                if (this.x) {
                    return null;
                }
                if (v12Var == null) {
                    v12Var = new v12(this, str);
                    this.r.put(str, v12Var);
                }
                io.sentry.z7 z7Var = new io.sentry.z7(this, v12Var);
                v12Var.g = z7Var;
                return z7Var;
            }
            z();
            return null;
        }
    }

    public final void l0() {
        synchronized (this.t) {
            try {
                u36 u36Var = this.w;
                if (u36Var != null) {
                    u36Var.close();
                }
                v07 v07VarC0 = this.C.c0(this.p, false);
                v07VarC0.getClass();
                u36 u36Var2 = new u36(v07VarC0);
                try {
                    u36Var2.V("libcore.io.DiskLruCache");
                    u36Var2.writeByte(10);
                    u36Var2.V("1");
                    u36Var2.writeByte(10);
                    u36Var2.j(3L);
                    u36Var2.writeByte(10);
                    u36Var2.j(2L);
                    u36Var2.writeByte(10);
                    u36Var2.writeByte(10);
                    for (v12 v12Var : this.r.values()) {
                        if (v12Var.g != null) {
                            u36Var2.V("DIRTY");
                            u36Var2.writeByte(32);
                            u36Var2.V(v12Var.a);
                            u36Var2.writeByte(10);
                        } else {
                            u36Var2.V("CLEAN");
                            u36Var2.writeByte(32);
                            u36Var2.V(v12Var.a);
                            for (long j : v12Var.b) {
                                u36Var2.writeByte(32);
                                u36Var2.j(j);
                            }
                            u36Var2.writeByte(10);
                        }
                    }
                    try {
                        u36Var2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        u36Var2.close();
                    } catch (Throwable th3) {
                        ct1.q(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                boolean zF = this.C.F(this.f2570o);
                x12 x12Var = this.C;
                if (zF) {
                    x12Var.f2469o.j(this.f2570o, this.q);
                    this.C.f2469o.j(this.p, this.f2570o);
                    this.C.u(this.q);
                } else {
                    x12Var.f2469o.j(this.p, this.f2570o);
                }
                this.w = F();
                this.v = 0;
                this.x = false;
                this.B = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final w12 q(String str) {
        w12 w12VarA;
        synchronized (this.t) {
            if (this.z) {
                throw new IllegalStateException("cache is closed");
            }
            k0(str);
            u();
            v12 v12Var = (v12) this.r.get(str);
            if (v12Var != null && (w12VarA = v12Var.a()) != null) {
                boolean z = true;
                this.v++;
                u36 u36Var = this.w;
                u36Var.getClass();
                u36Var.V("READ");
                u36Var.writeByte(32);
                u36Var.V(str);
                u36Var.writeByte(10);
                u36Var.flush();
                if (this.v < 2000) {
                    z = false;
                }
                if (z) {
                    z();
                }
                return w12VarA;
            }
            return null;
        }
    }

    public final void u() {
        synchronized (this.t) {
            try {
                if (this.y) {
                    return;
                }
                this.C.u(this.p);
                if (this.C.F(this.q)) {
                    boolean zF = this.C.F(this.f2570o);
                    x12 x12Var = this.C;
                    wg5 wg5Var = this.q;
                    if (zF) {
                        x12Var.u(wg5Var);
                    } else {
                        x12Var.f2469o.j(wg5Var, this.f2570o);
                    }
                }
                if (this.C.F(this.f2570o)) {
                    try {
                        J();
                        G();
                        this.y = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            ds1.G(this.C, this.m);
                            this.z = false;
                            l0();
                            this.y = true;
                        } catch (Throwable th) {
                            this.z = false;
                            throw th;
                        }
                    }
                }
                l0();
                this.y = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z() {
        im3.R(this.s, null, null, new ac(this, null, (byte) 6), 3);
    }
}
