package o;

/* JADX INFO: loaded from: classes.dex */
public final class or0 implements nb1 {
    public final tm a;
    public final lm b;
    public final boolean c;
    public final boolean d;

    public or0(String str, tm tmVar, lm lmVar, boolean z, boolean z2) {
        this.a = tmVar;
        this.b = lmVar;
        this.c = z;
        this.d = z2;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new u82(ei4Var, p30Var, this);
    }
}
