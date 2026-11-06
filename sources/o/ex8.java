package o;

/* JADX INFO: loaded from: classes.dex */
public final class ex8 extends vu8 {
    private static final ex8 zzb;
    private int zzd;
    private int zze;

    static {
        ex8 ex8Var = new ex8();
        zzb = ex8Var;
        vu8.f(ex8.class, ex8Var);
    }

    public static dx8 o() {
        return (dx8) zzb.k();
    }

    public static /* synthetic */ void p(ex8 ex8Var, int i) {
        ex8Var.zze = i - 1;
        ex8Var.zzd |= 1;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", du8.i});
        }
        if (i2 == 3) {
            return new ex8();
        }
        if (i2 == 4) {
            return new dx8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
