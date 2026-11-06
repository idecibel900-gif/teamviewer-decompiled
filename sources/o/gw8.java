package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class gw8 extends vu8 {
    private static final gw8 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private kw8 zzh;
    private int zzi;

    static {
        gw8 gw8Var = new gw8();
        zzb = gw8Var;
        vu8.f(gw8.class, gw8Var);
    }

    public static /* synthetic */ void o(gw8 gw8Var, yw8 yw8Var) {
        gw8Var.zzf = yw8Var;
        gw8Var.zze = 7;
    }

    public static /* synthetic */ void p(gw8 gw8Var, jx8 jx8Var) {
        gw8Var.zzf = jx8Var;
        gw8Var.zze = 6;
    }

    public static /* synthetic */ void q(gw8 gw8Var, int i) {
        gw8Var.zzg = i - 1;
        gw8Var.zzd |= 1;
    }

    public static fw8 r() {
        return (fw8) zzb.k();
    }

    public static gw8 s(byte[] bArr) throws ev8 {
        vu8 vu8Var = zzb;
        int length = bArr.length;
        su8 su8Var = su8.b;
        int i = ku8.a;
        su8 su8Var2 = su8.b;
        if (length != 0) {
            vu8 vu8Var2 = (vu8) vu8Var.j(4);
            try {
                qv8 qv8VarA = kv8.b.a(vu8Var2.getClass());
                lp2 lp2Var = new lp2();
                su8Var2.getClass();
                qv8VarA.h(vu8Var2, bArr, 0, length, lp2Var);
                qv8VarA.a(vu8Var2);
                vu8Var = vu8Var2;
            } catch (ev8 e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof ev8) {
                    throw ((ev8) e2.getCause());
                }
                throw new ev8(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (sv8 e3) {
                an4.s(e3.getMessage());
                return null;
            }
        }
        if (vu8Var == null || vu8.i(vu8Var, true)) {
            return (gw8) vu8Var;
        }
        an4.s(new sv8().getMessage());
        return null;
    }

    public static void u(gw8 gw8Var, mw8 mw8Var) {
        gw8Var.zzi = mw8Var.m;
        gw8Var.zzd |= 4;
    }

    public static /* synthetic */ void v(gw8 gw8Var, kw8 kw8Var) {
        gw8Var.zzh = kw8Var;
        gw8Var.zzd |= 2;
    }

    public static /* synthetic */ void w(gw8 gw8Var, vw8 vw8Var) {
        gw8Var.zzf = vw8Var;
        gw8Var.zze = 4;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", du8.c, "zzh", vw8.class, "zzi", du8.e, jx8.class, yw8.class});
        }
        if (i2 == 3) {
            return new gw8();
        }
        if (i2 == 4) {
            return new fw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final yw8 t() {
        return this.zze == 7 ? (yw8) this.zzf : yw8.o();
    }
}
