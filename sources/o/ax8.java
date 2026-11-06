package o;

/* JADX INFO: loaded from: classes.dex */
public final class ax8 extends vu8 {
    private static final ax8 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private sw8 zzg;
    private tw8 zzh;

    static {
        ax8 ax8Var = new ax8();
        zzb = ax8Var;
        vu8.f(ax8.class, ax8Var);
    }

    public static /* synthetic */ void o(ax8 ax8Var, gx8 gx8Var) {
        ax8Var.zzf = gx8Var;
        ax8Var.zze = 8;
    }

    public static /* synthetic */ void p(ax8 ax8Var, hx8 hx8Var) {
        ax8Var.zzf = hx8Var;
        ax8Var.zze = 4;
    }

    public static zw8 q() {
        return (zw8) zzb.k();
    }

    public static /* synthetic */ void r(ax8 ax8Var, gw8 gw8Var) {
        ax8Var.zzf = gw8Var;
        ax8Var.zze = 2;
    }

    public static /* synthetic */ void s(ax8 ax8Var, iw8 iw8Var) {
        ax8Var.zzf = iw8Var;
        ax8Var.zze = 3;
    }

    public static /* synthetic */ void t(ax8 ax8Var, lw8 lw8Var) {
        lw8Var.getClass();
        ax8Var.zzf = lw8Var;
        ax8Var.zze = 7;
    }

    public static /* synthetic */ void u(ax8 ax8Var, qw8 qw8Var) {
        ax8Var.zzf = qw8Var;
        ax8Var.zze = 5;
    }

    public static /* synthetic */ void v(ax8 ax8Var, sw8 sw8Var) {
        sw8Var.getClass();
        ax8Var.zzg = sw8Var;
        ax8Var.zzd |= 1;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", gw8.class, iw8.class, hx8.class, qw8.class, "zzh", lw8.class, gx8.class});
        }
        if (i2 == 3) {
            return new ax8();
        }
        if (i2 == 4) {
            return new zw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
