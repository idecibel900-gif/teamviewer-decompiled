package o;

/* JADX INFO: loaded from: classes.dex */
public final class qx6 implements nb1 {
    public final int a;
    public final mm b;
    public final mm c;
    public final mm d;
    public final boolean e;

    public qx6(String str, int i, mm mmVar, mm mmVar2, mm mmVar3, boolean z) {
        this.a = i;
        this.b = mmVar;
        this.c = mmVar2;
        this.d = mmVar3;
        this.e = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new f38(p30Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
