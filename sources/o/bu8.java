package o;

/* JADX INFO: loaded from: classes.dex */
public final class bu8 extends vu8 {
    private static final bu8 zzb;
    private int zzd;
    private String zze = "";

    static {
        bu8 bu8Var = new bu8();
        zzb = bu8Var;
        vu8.f(bu8.class, bu8Var);
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new bu8();
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
