package o;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class qw8 extends vu8 {
    private static final qw8 zzb;
    private int zzd;
    private int zzf;
    private kw8 zzi;
    private boolean zzj;
    private boolean zzk;
    private ex8 zzl;
    private String zze = "";
    private xu8 zzg = wu8.q;
    private yu8 zzh = lv8.q;

    static {
        qw8 qw8Var = new qw8();
        zzb = qw8Var;
        vu8.f(qw8.class, qw8Var);
    }

    public static pw8 o() {
        return (pw8) zzb.k();
    }

    public static void p(qw8 qw8Var, mw8 mw8Var) {
        RandomAccess randomAccess = qw8Var.zzg;
        boolean z = ((ju8) randomAccess).m;
        RandomAccess randomAccess2 = randomAccess;
        if (!z) {
            wu8 wu8Var = (wu8) randomAccess;
            int i = wu8Var.f2446o;
            wu8 wu8VarC = wu8Var.q(i + i);
            qw8Var.zzg = wu8VarC;
            randomAccess2 = wu8VarC;
        }
        ((wu8) randomAccess2).d(mw8Var.m);
    }

    public static /* synthetic */ void q(qw8 qw8Var, kw8 kw8Var) {
        qw8Var.zzi = kw8Var;
        qw8Var.zzd |= 4;
    }

    public static /* synthetic */ void r(qw8 qw8Var) {
        qw8Var.zzd |= 1;
        qw8Var.zze = "ProxyBillingBroadcastReceiver";
    }

    public static /* synthetic */ void s(qw8 qw8Var, ex8 ex8Var) {
        qw8Var.zzl = ex8Var;
        qw8Var.zzd |= 32;
    }

    public static /* synthetic */ void t(qw8 qw8Var, int i) {
        qw8Var.zzf = i - 1;
        qw8Var.zzd |= 2;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", du8.f, "zzg", du8.e, "zzh", bx8.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new qw8();
        }
        if (i2 == 4) {
            return new pw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
