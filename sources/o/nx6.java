package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nx6 implements nb1 {
    public final mm a;
    public final ArrayList b;
    public final lm c;
    public final lm d;
    public final mm e;
    public final int f;
    public final int g;
    public final float h;
    public final boolean i;

    public nx6(String str, mm mmVar, ArrayList arrayList, lm lmVar, lm lmVar2, mm mmVar2, int i, int i2, float f, boolean z) {
        this.a = mmVar;
        this.b = arrayList;
        this.c = lmVar;
        this.d = lmVar2;
        this.e = mmVar2;
        this.f = i;
        this.g = i2;
        this.h = f;
        this.i = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new dc7(ei4Var, p30Var, this);
    }
}
