package o;

/* JADX INFO: loaded from: classes.dex */
public final class bx8 extends vu8 {
    private static final bx8 zzb;
    private int zzd;
    private int zzf;
    private yu8 zze = lv8.q;
    private String zzg = "";

    static {
        bx8 bx8Var = new bx8();
        zzb = bx8Var;
        vu8.f(bx8.class, bx8Var);
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new bx8();
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
