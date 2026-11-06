package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sr4 extends u0 {
    public final bg5 v;
    public boolean w;

    public sr4(Context context) {
        super(context, null);
        this.v = h57.p(uf0.r);
    }

    @Override // o.u0
    public final void a(int i, ux2 ux2Var) {
        ux2Var.Y(576708319);
        byte b = 2;
        int i2 = (ux2Var.h(this) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((hw2) this.v.getValue()).invoke(ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gg4(b, i, this);
        }
    }

    @Override // o.u0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.w;
    }
}
