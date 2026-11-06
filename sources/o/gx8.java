package o;

/* JADX INFO: loaded from: classes.dex */
public final class gx8 extends vu8 {
    private static final gx8 zzb;
    private int zzd;
    private kw8 zze;
    private long zzf;

    static {
        gx8 gx8Var = new gx8();
        zzb = gx8Var;
        vu8.f(gx8.class, gx8Var);
    }

    public static fx8 o() {
        return (fx8) zzb.k();
    }

    public static /* synthetic */ void p(gx8 gx8Var, kw8 kw8Var) {
        gx8Var.zze = kw8Var;
        gx8Var.zzd |= 1;
    }

    public static /* synthetic */ void q(gx8 gx8Var, long j) {
        gx8Var.zzd |= 2;
        gx8Var.zzf = j;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new gx8();
        }
        if (i2 == 4) {
            return new fx8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
