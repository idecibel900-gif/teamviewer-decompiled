package o;

/* JADX INFO: loaded from: classes.dex */
public final class ho5 implements nb1 {
    public final int a;
    public final mm b;
    public final tm c;
    public final mm d;
    public final mm e;
    public final mm f;
    public final mm g;
    public final mm h;
    public final boolean i;
    public final boolean j;

    public ho5(String str, int i, mm mmVar, tm tmVar, mm mmVar2, mm mmVar3, mm mmVar4, mm mmVar5, mm mmVar6, boolean z, boolean z2) {
        this.a = i;
        this.b = mmVar;
        this.c = tmVar;
        this.d = mmVar2;
        this.e = mmVar3;
        this.f = mmVar4;
        this.g = mmVar5;
        this.h = mmVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new go5(ei4Var, p30Var, this);
    }
}
