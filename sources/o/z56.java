package o;

/* JADX INFO: loaded from: classes.dex */
public final class z56 implements nb1 {
    public final /* synthetic */ byte a = 1;
    public final mm b;
    public final boolean c;
    public final tm d;
    public final Object e;

    public z56(String str, mm mmVar, mm mmVar2, rm rmVar, boolean z) {
        this.b = mmVar;
        this.d = mmVar2;
        this.e = rmVar;
        this.c = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        switch (this.a) {
            case 0:
                return new y56(ei4Var, p30Var, this);
            default:
                return new ua6(ei4Var, p30Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.d + ", size=" + ((tm) this.e) + '}';
            default:
                return super.toString();
        }
    }

    public z56(String str, tm tmVar, lm lmVar, mm mmVar, boolean z) {
        this.d = tmVar;
        this.e = lmVar;
        this.b = mmVar;
        this.c = z;
    }
}
