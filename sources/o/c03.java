package o;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class c03 implements nb1 {
    public final int a;
    public final Path.FillType b;
    public final lm c;
    public final lm d;
    public final lm e;
    public final lm f;
    public final boolean g;

    public c03(String str, int i, Path.FillType fillType, lm lmVar, lm lmVar2, lm lmVar3, lm lmVar4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = lmVar;
        this.d = lmVar2;
        this.e = lmVar3;
        this.f = lmVar4;
        this.g = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new d03(ei4Var, qh4Var, p30Var, this);
    }
}
