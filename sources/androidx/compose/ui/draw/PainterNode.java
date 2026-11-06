package androidx.compose.ui.draw;

import kotlin.Metadata;
import o.d14;
import o.eo4;
import o.es4;
import o.fa2;
import o.fo4;
import o.he;
import o.io1;
import o.jl5;
import o.nl0;
import o.r04;
import o.r61;
import o.rg4;
import o.sb1;
import o.t52;
import o.t61;
import o.tv0;
import o.ud5;
import o.v0;
import o.xc0;
import o.y07;
import o.zn4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lo/r04;", "Lo/es4;", "Lo/t52;", "Lo/ud5;", "painter", "Lo/ud5;", "U0", "()Lo/ud5;", "Z0", "(Lo/ud5;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PainterNode extends es4 implements r04, t52 {
    public he A;
    public sb1 B;
    public float C;
    public tv0 D;
    private ud5 painter;

    public PainterNode(ud5 ud5Var, he heVar, sb1 sb1Var, float f, tv0 tv0Var) {
        this.painter = ud5Var;
        this.A = heVar;
        this.B = sb1Var;
        this.C = f;
        this.D = tv0Var;
    }

    public static boolean W0(long j) {
        return !y07.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean X0(long j) {
        return !y07.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        if (!V0()) {
            return zn4Var.k(i);
        }
        long jY0 = Y0(t61.b(0, 0, 0, i, 7));
        return Math.max(r61.k(jY0), zn4Var.k(i));
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final ud5 getPainter() {
        return this.painter;
    }

    public final boolean V0() {
        return this.painter.i() != 9205357640488583168L;
    }

    public final long Y0(long j) {
        boolean z = false;
        boolean z2 = r61.e(j) && r61.d(j);
        if (r61.g(j) && r61.f(j)) {
            z = true;
        }
        if ((!V0() && z2) || z) {
            return r61.b(j, r61.i(j), 0, r61.h(j), 0, 10);
        }
        long jI = this.painter.i();
        int iRound = X0(jI) ? Math.round(Float.intBitsToFloat((int) (jI >> 32))) : r61.k(j);
        int iRound2 = W0(jI) ? Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) : r61.j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(t61.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(t61.g(iRound, j))) << 32);
        if (V0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!X0(this.painter.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!W0(this.painter.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.i() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : io1.h0(jFloatToRawIntBits2, this.B.g(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return r61.b(j, t61.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, t61.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    public final void Z0(ud5 ud5Var) {
        this.painter = ud5Var;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(Y0(j));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 9));
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        if (!V0()) {
            return zn4Var.o(i);
        }
        long jY0 = Y0(t61.b(0, 0, 0, i, 7));
        return Math.max(r61.k(jY0), zn4Var.o(i));
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        if (!V0()) {
            return zn4Var.a(i);
        }
        long jY0 = Y0(t61.b(0, i, 0, 0, 13));
        return Math.max(r61.j(jY0), zn4Var.a(i));
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        nl0 nl0Var = d14Var.m;
        long jI = this.painter.i();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(X0(jI) ? Float.intBitsToFloat((int) (jI >> 32)) : Float.intBitsToFloat((int) (nl0Var.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(W0(jI) ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (nl0Var.d() & 4294967295L)))) & 4294967295L);
        long jH0 = (Float.intBitsToFloat((int) (nl0Var.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (nl0Var.d() & 4294967295L)) == 0.0f) ? 0L : io1.h0(jFloatToRawIntBits, this.B.g(jFloatToRawIntBits, nl0Var.d()));
        long jA = this.A.a((((long) Math.round(Float.intBitsToFloat((int) (jH0 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jH0 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (nl0Var.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (nl0Var.d() & 4294967295L)))) & 4294967295L), d14Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((xc0) nl0Var.n.f1103o).V(f, f2);
        try {
            this.painter.g(d14Var, jH0, this.C, this.D);
            ((xc0) nl0Var.n.f1103o).V(-f, -f2);
            d14Var.a();
        } catch (Throwable th) {
            ((xc0) nl0Var.n.f1103o).V(-f, -f2);
            throw th;
        }
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        if (!V0()) {
            return zn4Var.V(i);
        }
        long jY0 = Y0(t61.b(0, i, 0, 0, 13));
        return Math.max(r61.j(jY0), zn4Var.V(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.A + ", alpha=" + this.C + ", colorFilter=" + this.D + ")";
    }
}
