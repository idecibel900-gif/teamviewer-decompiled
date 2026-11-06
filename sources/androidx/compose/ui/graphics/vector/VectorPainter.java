package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import o.bg5;
import o.f88;
import o.h57;
import o.iu;
import o.j04;
import o.k13;
import o.ks7;
import o.tv0;
import o.u52;
import o.ua5;
import o.ud5;
import o.xb8;
import o.xc0;
import o.xz2;
import o.y07;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lo/ud5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VectorPainter extends ud5 {
    public final bg5 r = h57.p(new y07(0));
    public final bg5 s = h57.p(Boolean.FALSE);
    public final xb8 t;
    public final bg5 u;
    public float v;
    public tv0 w;

    public VectorPainter(k13 k13Var) {
        xb8 xb8Var = new xb8(k13Var);
        xb8Var.f = new ks7(this, (byte) 5);
        this.t = xb8Var;
        this.u = new bg5(f88.a, xz2.P);
        this.v = 1.0f;
    }

    @Override // o.ud5
    public final boolean d(float f) {
        this.v = f;
        return true;
    }

    @Override // o.ud5
    public final boolean e(tv0 tv0Var) {
        this.w = tv0Var;
        return true;
    }

    @Override // o.ud5
    public final long i() {
        return ((y07) this.r.getValue()).a;
    }

    @Override // o.ud5
    public final void j(u52 u52Var) {
        tv0 tv0Var = this.w;
        xb8 xb8Var = this.t;
        if (tv0Var == null) {
            tv0Var = (tv0) xb8Var.g.getValue();
        }
        if (((Boolean) this.s.getValue()).booleanValue() && u52Var.getLayoutDirection() == j04.n) {
            long jT0 = u52Var.t0();
            iu iuVarH0 = u52Var.h0();
            long jD = iuVarH0.D();
            iuVarH0.x().g();
            try {
                ((xc0) iuVarH0.f1103o).U(-1.0f, 1.0f, jT0);
                xb8Var.e(u52Var, this.v, tv0Var);
                ua5.x(iuVarH0, jD);
            } catch (Throwable th) {
                ua5.x(iuVarH0, jD);
                throw th;
            }
        } else {
            xb8Var.e(u52Var, this.v, tv0Var);
        }
        this.u.getValue();
    }
}
