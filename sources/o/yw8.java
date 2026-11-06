package o;

/* JADX INFO: loaded from: classes.dex */
public final class yw8 extends vu8 {
    private static final yw8 zzb;
    private int zzd;
    private yu8 zze = lv8.q;
    private String zzf = "";
    private boolean zzg;

    static {
        yw8 yw8Var = new yw8();
        zzb = yw8Var;
        vu8.f(yw8.class, yw8Var);
    }

    public static yw8 o() {
        return zzb;
    }

    public static /* synthetic */ void p(yw8 yw8Var, boolean z) {
        yw8Var.zzd |= 2;
        yw8Var.zzg = z;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", xw8.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new yw8();
        }
        if (i2 == 4) {
            return new ww8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
