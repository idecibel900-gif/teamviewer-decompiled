package o;

/* JADX INFO: loaded from: classes.dex */
public final class hx8 extends vu8 {
    private static final hx8 zzb;
    private int zzd;
    private int zze;

    static {
        hx8 hx8Var = new hx8();
        zzb = hx8Var;
        vu8.f(hx8.class, hx8Var);
    }

    public static hx8 o() {
        return zzb;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", du8.j});
        }
        if (i2 == 3) {
            return new hx8();
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
