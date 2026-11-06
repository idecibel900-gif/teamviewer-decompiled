package o;

/* JADX INFO: loaded from: classes.dex */
public final class vw8 extends vu8 {
    private static final vw8 zzb;
    private int zzd;
    private int zze;

    static {
        vw8 vw8Var = new vw8();
        zzb = vw8Var;
        vu8.f(vw8.class, vw8Var);
    }

    public static uw8 o() {
        return (uw8) zzb.k();
    }

    public static /* synthetic */ void p(vw8 vw8Var, int i) {
        vw8Var.zze = i - 1;
        vw8Var.zzd |= 1;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", du8.g});
        }
        if (i2 == 3) {
            return new vw8();
        }
        if (i2 == 4) {
            return new uw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
