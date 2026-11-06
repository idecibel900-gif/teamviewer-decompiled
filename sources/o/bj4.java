package o;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class bj4 extends pc1 {
    public final md3 j;
    public long k;

    public bj4(ma3 ma3Var, md3 md3Var) {
        Object value;
        r97 r97Var;
        super(ma3Var);
        this.j = md3Var;
        l97 l97Var = this.b;
        do {
            value = l97Var.getValue();
            r97Var = (r97) value;
            r97Var.getClass();
        } while (!l97Var.j(value, r97.a(r97Var, null, null, false, 3)));
    }

    @Override // o.c1
    public final void j(int i, int i2, int i3, int i4, int i5) {
        int i6;
        j97 j97Var;
        i12 i12Var;
        Object value;
        r97 r97Var;
        l97 l97Var = this.b;
        int iUptimeMillis = 0;
        if (((r97) l97Var.getValue()).c) {
            do {
                value = l97Var.getValue();
                r97Var = (r97) value;
                r97Var.getClass();
            } while (!l97Var.j(value, r97.a(r97Var, null, null, false, 3).c(0.0f, 0.0f)));
        }
        if (i4 == 2 && i5 == 1) {
            this.k = SystemClock.uptimeMillis();
            i6 = 5;
        } else {
            iUptimeMillis = (int) (SystemClock.uptimeMillis() - this.k);
            i6 = 4;
        }
        int i7 = i6;
        int i8 = iUptimeMillis;
        v97 v97VarB = b();
        if (v97VarB == null || (j97Var = this.d) == null || (i12Var = (i12) j97Var.getValue()) == null) {
            return;
        }
        float fMax = Math.max(0.0f, i2 + v97VarB.d) / v97VarB.b;
        float f = i12Var.a - 2;
        if (fMax > f) {
            fMax = f;
        }
        float fMax2 = Math.max(0.0f, i3 + v97VarB.e) / v97VarB.c;
        float f2 = i12Var.b - 2;
        if (fMax2 > f2) {
            fMax2 = f2;
        }
        this.j.a(i, (int) fMax, (int) fMax2, i4, i7, i8);
    }
}
