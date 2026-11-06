package o;

/* JADX INFO: loaded from: classes.dex */
public final class xt8 extends vu8 {
    private static final xt8 zzb;
    private int zzd;
    private bu8 zze;
    private bu8 zzf;
    private int zzg;

    static {
        xt8 xt8Var = new xt8();
        zzb = xt8Var;
        vu8.f(xt8.class, xt8Var);
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", du8.b});
        }
        if (i2 == 3) {
            return new xt8();
        }
        if (i2 == 4) {
            return new wt8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
