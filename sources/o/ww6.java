package o;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class ww6 implements nb1 {
    public final boolean a;
    public final Path.FillType b;
    public final lm c;
    public final lm d;
    public final boolean e;

    public ww6(String str, boolean z, Path.FillType fillType, lm lmVar, lm lmVar2, boolean z2) {
        this.a = z;
        this.b = fillType;
        this.c = lmVar;
        this.d = lmVar2;
        this.e = z2;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new al2(ei4Var, p30Var, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
