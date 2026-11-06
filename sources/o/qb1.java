package o;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: loaded from: classes.dex */
public final class qb1 extends w0 {
    public final AsyncImagePainter G;

    public qb1(AsyncImagePainter asyncImagePainter, he heVar, sb1 sb1Var, String str, v61 v61Var) {
        super(heVar, sb1Var, 1.0f, true, str, v61Var);
        this.G = asyncImagePainter;
    }

    @Override // o.es4
    public final void M0() {
        me1 me1VarI0 = I0();
        AsyncImagePainter asyncImagePainter = this.G;
        asyncImagePainter.x = me1VarI0;
        asyncImagePainter.c();
    }

    @Override // o.es4
    public final void N0() {
        this.G.b();
    }

    @Override // o.es4
    public final void O0() {
        this.G.m(null);
    }

    @Override // o.w0
    /* JADX INFO: renamed from: V0 */
    public final ud5 getPainter() {
        return this.G;
    }
}
