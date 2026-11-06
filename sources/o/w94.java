package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class w94 {
    public vy1 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public w94() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        vy1 vy1Var = this.a;
        this.c = z ? vy1Var.i() : vy1Var.m();
    }

    public final void b(View view, int i) {
        int iO = this.a.o();
        if (iO >= 0) {
            boolean z = this.d;
            vy1 vy1Var = this.a;
            if (z) {
                this.c = this.a.o() + vy1Var.d(view);
            } else {
                this.c = vy1Var.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        vy1 vy1Var2 = this.a;
        if (!z2) {
            int iG = vy1Var2.g(view);
            int iM = iG - this.a.m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (this.a.i() - Math.min(0, (this.a.i() - iO) - this.a.d(view))) - (this.a.e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (vy1Var2.i() - iO) - this.a.d(view);
        this.c = this.a.i() - i3;
        if (i3 > 0) {
            int iE = this.c - this.a.e(view);
            int iM2 = this.a.m();
            int iMin = iE - (Math.min(this.a.g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
