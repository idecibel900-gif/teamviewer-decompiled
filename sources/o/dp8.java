package o;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class dp8 implements t75 {
    public final vz2 m;
    public final char n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gr f643o;
    public final long p;
    public final long q;

    /* JADX WARN: Multi-variable type inference failed */
    public dp8(vz2 vz2Var, int i, gr grVar, long j, long j2) {
        this.m = vz2Var;
        this.n = i;
        this.f643o = grVar;
        this.p = j;
        this.q = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static a51 a(ap8 ap8Var, com.google.android.gms.common.internal.a aVar, int i) {
        xv8 xv8Var = aVar.v;
        a51 a51Var = xv8Var == null ? null : xv8Var.p;
        if (a51Var != null && a51Var.n) {
            int[] iArr = a51Var.p;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = a51Var.r;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (ap8Var.n < a51Var.q) {
                        return a51Var;
                    }
                } else if (ap8Var.n < a51Var.q) {
                    return a51Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (ap8Var.n < a51Var.q) {
                        return a51Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // o.t75
    public final void m(bo7 bo7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        vz2 vz2Var = this.m;
        if (vz2Var.d()) {
            ef6 ef6Var = (ef6) df6.r().n;
            if (ef6Var == null || ef6Var.n) {
                ap8 ap8Var = (ap8) vz2Var.j.get(this.f643o);
                if (ap8Var != null) {
                    com.google.android.gms.common.internal.a aVar = ap8Var.d;
                    if (aVar instanceof com.google.android.gms.common.internal.a) {
                        long j3 = this.p;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = aVar.p;
                        if (ef6Var != null) {
                            z &= ef6Var.f709o;
                            i = ef6Var.p;
                            i3 = ef6Var.q;
                            i2 = ef6Var.m;
                            if (aVar.v != null && !aVar.m()) {
                                a51 a51VarA = a(ap8Var, aVar, this.n);
                                if (a51VarA == null) {
                                    return;
                                }
                                boolean z2 = a51VarA.f299o && j3 > 0;
                                i3 = a51VarA.q;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int iElapsedRealtime = -1;
                        if (bo7Var.k()) {
                            i5 = 0;
                        } else if (((hy8) bo7Var).d) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception excH = bo7Var.h();
                            if (excH instanceof br) {
                                Status status = ((br) excH).m;
                                i4 = status.m;
                                w41 w41Var = status.p;
                                if (w41Var != null) {
                                    i5 = i4;
                                    i6 = w41Var.n;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.q;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        ep8 ep8Var = new ep8(new dr4(this.n, i5, i6, j, j2, null, null, s, iElapsedRealtime), i2, i7, i3);
                        xp8 xp8Var = vz2Var.m;
                        xp8Var.sendMessage(xp8Var.obtainMessage(18, ep8Var));
                    }
                }
            }
        }
    }
}
