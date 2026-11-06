package o;

/* JADX INFO: loaded from: classes.dex */
public final class jx8 extends vu8 {
    private static final jx8 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        jx8 jx8Var = new jx8();
        zzb = jx8Var;
        vu8.f(jx8.class, jx8Var);
    }

    public static ix8 o() {
        return (ix8) zzb.k();
    }

    public static /* synthetic */ void p(jx8 jx8Var, boolean z) {
        jx8Var.zzd |= 8;
        jx8Var.zzh = z;
    }

    public static /* synthetic */ void q(jx8 jx8Var, int i) {
        jx8Var.zzd |= 16;
        jx8Var.zzi = i;
    }

    public static /* synthetic */ void r(jx8 jx8Var, long j) {
        jx8Var.zzd |= 4;
        jx8Var.zzg = j;
    }

    public static /* synthetic */ void s(jx8 jx8Var, int i) {
        jx8Var.zzd |= 32;
        jx8Var.zzj = i;
    }

    public static /* synthetic */ void t(jx8 jx8Var) {
        jx8Var.zzd |= 2;
        jx8Var.zzf = true;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new jx8();
        }
        if (i2 == 4) {
            return new ix8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
