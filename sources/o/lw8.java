package o;

/* JADX INFO: loaded from: classes.dex */
public final class lw8 extends vu8 {
    private static final lw8 zzb;

    static {
        lw8 lw8Var = new lw8();
        zzb = lw8Var;
        vu8.f(lw8.class, lw8Var);
    }

    public static lw8 o() {
        return zzb;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new lw8();
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
