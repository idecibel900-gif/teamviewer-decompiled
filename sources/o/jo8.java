package o;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class jo8 extends sj2 {
    public static final wg5 r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wg5 f1187o;
    public final sj2 p;
    public final LinkedHashMap q;

    static {
        String str = wg5.n;
        r = vv.s("/");
    }

    public jo8(wg5 wg5Var, sj2 sj2Var, LinkedHashMap linkedHashMap) {
        sj2Var.getClass();
        this.f1187o = wg5Var;
        this.p = sj2Var;
        this.q = linkedHashMap;
    }

    @Override // o.sj2
    public final List G(wg5 wg5Var) throws IOException {
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        io8 io8Var = (io8) this.q.get(c.a(wg5Var2, wg5Var, true));
        if (io8Var != null) {
            return lv0.P0(io8Var.q);
        }
        yq4.v(wg5Var, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // o.sj2
    public final sn1 Y(wg5 wg5Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        wg5Var.getClass();
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        io8 io8VarB = (io8) this.q.get(c.a(wg5Var2, wg5Var, true));
        if (io8VarB == null) {
            return null;
        }
        long j = io8VarB.h;
        if (j != -1) {
            gs3 gs3VarB0 = this.p.b0(this.f1187o);
            try {
                w36 w36Var = new w36(gs3VarB0.e(j));
                try {
                    io8VarB = y57.B(w36Var, io8VarB);
                    io8VarB.getClass();
                    try {
                        w36Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        w36Var.close();
                    } catch (Throwable th5) {
                        ct1.q(th4, th5);
                    }
                    th2 = th4;
                    io8VarB = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    gs3VarB0.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (gs3VarB0 != null) {
                    try {
                        gs3VarB0.close();
                    } catch (Throwable th8) {
                        ct1.q(th7, th8);
                    }
                }
                th = th7;
                io8VarB = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = io8VarB.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(io8VarB.f);
        Long l2 = io8VarB.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = io8VarB.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = io8VarB.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = io8VarB.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = io8VarB.j;
                if (i != -1) {
                    int i2 = io8VarB.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = io8VarB.l;
        if (l4 == null) {
            Integer num3 = io8VarB.f1086o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new sn1(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new sn1(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // o.sj2
    public final gs3 b0(wg5 wg5Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // o.sj2
    public final v07 c0(wg5 wg5Var, boolean z) throws IOException {
        wg5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.sj2
    public final v07 e(wg5 wg5Var) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.sj2
    public final void j(wg5 wg5Var, wg5 wg5Var2) throws IOException {
        wg5Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.sj2
    public final q67 k0(wg5 wg5Var) throws Throwable {
        Throwable th;
        w36 w36Var;
        wg5Var.getClass();
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        io8 io8Var = (io8) this.q.get(c.a(wg5Var2, wg5Var, true));
        if (io8Var == null) {
            hk0.k(wg5Var, "no such file: ");
            return null;
        }
        long j = io8Var.f;
        gs3 gs3VarB0 = this.p.b0(this.f1187o);
        try {
            w36Var = new w36(gs3VarB0.e(io8Var.h));
            try {
                gs3VarB0.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (gs3VarB0 != null) {
                try {
                    gs3VarB0.close();
                } catch (Throwable th4) {
                    ct1.q(th3, th4);
                }
            }
            th = th3;
            w36Var = null;
        }
        if (th != null) {
            throw th;
        }
        w36Var.getClass();
        y57.B(w36Var, null);
        if (io8Var.g == 0) {
            return new i94(w36Var, j, false);
        }
        return new i94(new uh3(new w36(new i94(w36Var, io8Var.e, false)), new Inflater(true)), j, true);
    }

    @Override // o.sj2
    public final void q(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.sj2
    public final void u(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
