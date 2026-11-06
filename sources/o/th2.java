package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class th2 extends p66 {
    public final /* synthetic */ vh2 a;

    public th2(vh2 vh2Var) {
        this.a = vh2Var;
    }

    @Override // o.p66
    public final void b(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        vh2 vh2Var = this.a;
        int i = vh2Var.a;
        int iComputeVerticalScrollRange = vh2Var.s.computeVerticalScrollRange();
        int i2 = vh2Var.r;
        vh2Var.t = iComputeVerticalScrollRange - i2 > 0 && i2 >= i;
        int iComputeHorizontalScrollRange = vh2Var.s.computeHorizontalScrollRange();
        int i3 = vh2Var.q;
        boolean z = iComputeHorizontalScrollRange - i3 > 0 && i3 >= i;
        vh2Var.u = z;
        boolean z2 = vh2Var.t;
        if (!z2 && !z) {
            if (vh2Var.v != 0) {
                vh2Var.j(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i2;
            vh2Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            vh2Var.k = Math.min(i2, (i2 * i2) / iComputeVerticalScrollRange);
        }
        if (vh2Var.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i3;
            vh2Var.f2313o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            vh2Var.n = Math.min(i3, (i3 * i3) / iComputeHorizontalScrollRange);
        }
        byte b = vh2Var.v;
        if (b == 0 || b == 1) {
            vh2Var.j(1);
        }
    }
}
