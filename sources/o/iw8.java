package o;

/* JADX INFO: loaded from: classes.dex */
public final class iw8 extends vu8 {
    private static final iw8 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        iw8 iw8Var = new iw8();
        zzb = iw8Var;
        vu8.f(iw8.class, iw8Var);
    }

    public static /* synthetic */ void o(iw8 iw8Var, int i) {
        iw8Var.zzg = i - 1;
        iw8Var.zzd |= 1;
    }

    public static hw8 p() {
        return (hw8) zzb.k();
    }

    public static void r(iw8 iw8Var, mw8 mw8Var) {
        iw8Var.zzh = mw8Var.m;
        iw8Var.zzd |= 2;
    }

    public static /* synthetic */ void s(iw8 iw8Var, vw8 vw8Var) {
        iw8Var.zzf = vw8Var;
        iw8Var.zze = 2;
    }

    public static /* synthetic */ void t(iw8 iw8Var, yw8 yw8Var) {
        iw8Var.zzf = yw8Var;
        iw8Var.zze = 4;
    }

    public static /* synthetic */ void u(iw8 iw8Var, jx8 jx8Var) {
        iw8Var.zzf = jx8Var;
        iw8Var.zze = 3;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", du8.c, vw8.class, jx8.class, yw8.class, "zzh", du8.e});
        }
        if (i2 == 3) {
            return new iw8();
        }
        if (i2 == 4) {
            return new hw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final yw8 q() {
        return this.zze == 4 ? (yw8) this.zzf : yw8.o();
    }
}
