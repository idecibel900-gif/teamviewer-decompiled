package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lo8 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ w36 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k76 f1389o;
    public final /* synthetic */ k76 p;
    public final /* synthetic */ k76 q;

    public /* synthetic */ lo8(w36 w36Var, k76 k76Var, k76 k76Var2, k76 k76Var3) {
        this.n = w36Var;
        this.f1389o = k76Var;
        this.p = k76Var2;
        this.q = k76Var3;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.m;
        f88 f88Var = f88.a;
        k76 k76Var = this.q;
        k76 k76Var2 = this.p;
        k76 k76Var3 = this.f1389o;
        w36 w36Var = this.n;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 1) {
                    return f88Var;
                }
                if (k76Var3.m != null) {
                    gk0.l("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else {
                    if (jLongValue == 24) {
                        k76Var3.m = Long.valueOf(w36Var.G());
                        k76Var2.m = Long.valueOf(w36Var.G());
                        k76Var.m = Long.valueOf(w36Var.G());
                        return f88Var;
                    }
                    gk0.l("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 != 21589) {
                    return f88Var;
                }
                if (jLongValue2 >= 1) {
                    byte bQ = w36Var.q();
                    boolean z = (bQ & 1) == 1;
                    boolean z2 = (bQ & 2) == 2;
                    boolean z3 = (bQ & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue2 >= j) {
                        if (z) {
                            k76Var3.m = Integer.valueOf(w36Var.F());
                        }
                        if (z2) {
                            k76Var2.m = Integer.valueOf(w36Var.F());
                        }
                        if (!z3) {
                            return f88Var;
                        }
                        k76Var.m = Integer.valueOf(w36Var.F());
                        return f88Var;
                    }
                    gk0.l("bad zip: extended timestamp extra too short");
                } else {
                    gk0.l("bad zip: extended timestamp extra too short");
                }
                return null;
        }
    }

    public /* synthetic */ lo8(k76 k76Var, w36 w36Var, k76 k76Var2, k76 k76Var3) {
        this.f1389o = k76Var;
        this.n = w36Var;
        this.p = k76Var2;
        this.q = k76Var3;
    }
}
