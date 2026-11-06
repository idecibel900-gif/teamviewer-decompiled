package o;

/* JADX INFO: loaded from: classes.dex */
public final class kw8 extends vu8 {
    private static final kw8 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        kw8 kw8Var = new kw8();
        zzb = kw8Var;
        vu8.f(kw8.class, kw8Var);
    }

    public static /* synthetic */ void o(kw8 kw8Var, int i) {
        kw8Var.zzd |= 1;
        kw8Var.zze = i;
    }

    public static jw8 p() {
        return (jw8) zzb.k();
    }

    public static /* synthetic */ void q(kw8 kw8Var, String str) {
        kw8Var.zzd |= 8;
        kw8Var.zzh = str;
    }

    public static /* synthetic */ void r(kw8 kw8Var, String str) {
        str.getClass();
        kw8Var.zzd |= 2;
        kw8Var.zzf = str;
    }

    public static /* synthetic */ void s(kw8 kw8Var, int i) {
        kw8Var.zzd |= 32;
        kw8Var.zzj = i;
    }

    public static /* synthetic */ void t(kw8 kw8Var, int i) {
        kw8Var.zzd |= 16;
        kw8Var.zzi = i;
    }

    public static void u(kw8 kw8Var, int i) {
        kw8Var.zzg = to7.b(i);
        kw8Var.zzd |= 4;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", du8.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new kw8();
        }
        if (i2 == 4) {
            return new jw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
