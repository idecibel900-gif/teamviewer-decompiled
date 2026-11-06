package coil3.compose;

import kotlin.Metadata;
import o.dg;
import o.iu;
import o.u52;
import o.ua5;
import o.ud5;
import o.xc0;
import o.xd3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/ImagePainter;", "Lo/ud5;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImagePainter extends ud5 {
    public final xd3 r;

    public ImagePainter(xd3 xd3Var) {
        this.r = xd3Var;
    }

    @Override // o.ud5
    public final long i() {
        xd3 xd3Var = this.r;
        int iB = xd3Var.b();
        float f = iB > 0 ? iB : Float.NaN;
        int iA = xd3Var.a();
        return (((long) Float.floatToRawIntBits(iA > 0 ? iA : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // o.ud5
    public final void j(u52 u52Var) {
        xd3 xd3Var = this.r;
        int iB = xd3Var.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (u52Var.d() >> 32)) / iB : 1.0f;
        int iA = xd3Var.a();
        float fIntBitsToFloat2 = iA > 0 ? Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) / iA : 1.0f;
        iu iuVarH0 = u52Var.h0();
        long jD = iuVarH0.D();
        iuVarH0.x().g();
        try {
            ((xc0) iuVarH0.f1103o).U(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            xd3Var.d(dg.b(u52Var.h0().x()));
        } finally {
            ua5.x(iuVarH0, jD);
        }
    }
}
