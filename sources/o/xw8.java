package o;

/* JADX INFO: loaded from: classes.dex */
public final class xw8 extends vu8 {
    private static final xw8 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        xw8 xw8Var = new xw8();
        zzb = xw8Var;
        vu8.f(xw8.class, xw8Var);
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", du8.h, "zzf"});
        }
        if (i2 == 3) {
            return new xw8();
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
