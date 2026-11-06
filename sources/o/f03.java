package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f03 implements nb1 {
    public final int a;
    public final lm b;
    public final lm c;
    public final lm d;
    public final lm e;
    public final mm f;
    public final int g;
    public final int h;
    public final float i;
    public final ArrayList j;
    public final mm k;
    public final boolean l;

    public f03(String str, int i, lm lmVar, lm lmVar2, lm lmVar3, lm lmVar4, mm mmVar, int i2, int i3, float f, ArrayList arrayList, mm mmVar2, boolean z) {
        this.a = i;
        this.b = lmVar;
        this.c = lmVar2;
        this.d = lmVar3;
        this.e = lmVar4;
        this.f = mmVar;
        this.g = i2;
        this.h = i3;
        this.i = f;
        this.j = arrayList;
        this.k = mmVar2;
        this.l = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new g03(ei4Var, p30Var, this);
    }
}
