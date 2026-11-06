package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class sw8 extends vu8 {
    private static final sw8 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        sw8 sw8Var = new sw8();
        zzb = sw8Var;
        vu8.f(sw8.class, sw8Var);
    }

    public static /* synthetic */ void A(sw8 sw8Var, int i) {
        sw8Var.zzd |= 256;
        sw8Var.zzm = i;
    }

    public static /* synthetic */ void B(sw8 sw8Var, int i) {
        sw8Var.zzd |= 8;
        sw8Var.zzh = i;
    }

    public static /* synthetic */ void C(sw8 sw8Var, long j) {
        sw8Var.zzd |= 16;
        sw8Var.zzi = j;
    }

    public static /* synthetic */ void D(sw8 sw8Var, long j) {
        sw8Var.zzd |= 32;
        sw8Var.zzj = j;
    }

    public static /* synthetic */ void o(sw8 sw8Var) {
        sw8Var.zzd |= 512;
        sw8Var.zzn = 926300087L;
    }

    public static /* synthetic */ void p(sw8 sw8Var, String str) {
        str.getClass();
        sw8Var.zzd |= 4;
        sw8Var.zzg = str;
    }

    public static /* synthetic */ void q(sw8 sw8Var) {
        String str = Build.BRAND;
        str.getClass();
        sw8Var.zzd |= 1024;
        sw8Var.zzo = str;
    }

    public static /* synthetic */ void r(sw8 sw8Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        sw8Var.zzd |= 8192;
        sw8Var.zzr = str;
    }

    public static /* synthetic */ void s(sw8 sw8Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        sw8Var.zzd |= 4096;
        sw8Var.zzq = str;
    }

    public static /* synthetic */ void t(sw8 sw8Var) {
        String str = Build.MODEL;
        str.getClass();
        sw8Var.zzd |= 2048;
        sw8Var.zzp = str;
    }

    public static /* synthetic */ void u(sw8 sw8Var, int i) {
        sw8Var.zzd |= 16384;
        sw8Var.zzs = i;
    }

    public static /* synthetic */ void v(sw8 sw8Var, boolean z) {
        sw8Var.zzd |= 64;
        sw8Var.zzk = z;
    }

    public static /* synthetic */ void w(sw8 sw8Var) {
        sw8Var.zzd |= 1;
        sw8Var.zze = "9.1.0";
    }

    public static /* synthetic */ void x(sw8 sw8Var, String str) {
        sw8Var.zzd |= 2;
        sw8Var.zzf = str;
    }

    public static rw8 y() {
        return (rw8) zzb.k();
    }

    public static /* synthetic */ void z(sw8 sw8Var, int i) {
        sw8Var.zzd |= 128;
        sw8Var.zzl = i;
    }

    @Override // o.vu8
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new pv8(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new sw8();
        }
        if (i2 == 4) {
            return new rw8(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
