package androidx.compose.ui.graphics.shadow;

import kotlin.Metadata;
import o.cj3;
import o.j04;
import o.jx4;
import o.ka0;
import o.kh;
import o.kw6;
import o.pw6;
import o.rv0;
import o.tv0;
import o.u52;
import o.ud5;
import o.uk;
import o.vi3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Lo/ud5;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InnerShadowPainter extends ud5 {
    public final pw6 r;
    public final cj3 s;
    public float t = 1.0f;

    public InnerShadowPainter(pw6 pw6Var, kw6 kw6Var, cj3 cj3Var) {
        this.r = pw6Var;
        this.s = cj3Var;
    }

    @Override // o.ud5
    public final boolean d(float f) {
        this.t = f;
        return true;
    }

    @Override // o.ud5
    public final boolean e(tv0 tv0Var) {
        return true;
    }

    @Override // o.ud5
    public final void f(j04 j04Var) {
    }

    @Override // o.ud5
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // o.ud5
    public final void j(u52 u52Var) {
        cj3 cj3Var = this.s;
        pw6 pw6Var = this.r;
        long jD = u52Var.d();
        j04 layoutDirection = u52Var.getLayoutDirection();
        synchronized (cj3Var) {
            uk ukVar = (uk) cj3Var.f531o;
            if (ukVar == null) {
                uk ukVar2 = new uk(kh.V, 0L, j04.m, 1.0f, null);
                cj3Var.f531o = ukVar2;
                ukVar = ukVar2;
            }
            ukVar.a = pw6Var;
            ukVar.b = jD;
            ukVar.c = layoutDirection;
            ukVar.d = u52Var.getDensity();
            jx4 jx4Var = (jx4) cj3Var.n;
            if (jx4Var == null) {
                jx4Var = new jx4();
                cj3Var.n = jx4Var;
            }
            if (((vi3) jx4Var.g(ukVar)) == null) {
                pw6Var.a(jD, layoutDirection, u52Var);
                vi3 vi3Var = new vi3();
                int i = rv0.i;
                ka0.k();
                jx4 jx4Var2 = (jx4) cj3Var.n;
                if (jx4Var2 == null) {
                    jx4Var2 = new jx4();
                    cj3Var.n = jx4Var2;
                }
                jx4Var2.m(new uk(ukVar.a, ukVar.b, ukVar.c, ukVar.d, null), vi3Var);
            }
        }
        u52Var.d();
        throw null;
    }
}
