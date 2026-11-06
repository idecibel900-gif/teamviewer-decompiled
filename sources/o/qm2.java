package o;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class qm2 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public qm2(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.j() && flexboxLayoutManager.F) {
            this.c = this.e ? flexboxLayoutManager.N.i() : flexboxLayoutManager.z - flexboxLayoutManager.N.m();
            return;
        }
        boolean z = this.e;
        vy1 vy1Var = flexboxLayoutManager.N;
        this.c = z ? vy1Var.i() : vy1Var.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        boolean zJ = flexboxLayoutManager.j();
        boolean z = flexboxLayoutManager.C;
        if (zJ) {
            if (z == 0) {
                this.e = flexboxLayoutManager.B == 1;
                return;
            } else {
                this.e = z == 2;
                return;
            }
        }
        if (z == 0) {
            this.e = flexboxLayoutManager.B == 3;
        } else {
            this.e = z == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
