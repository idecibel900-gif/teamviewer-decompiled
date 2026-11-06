package o;

/* JADX INFO: loaded from: classes.dex */
public final class zx8 extends rx8 {
    public final /* synthetic */ by8 t;

    public zx8(by8 by8Var) {
        this.t = by8Var;
    }

    @Override // o.rx8
    public final String b() {
        sx8 sx8Var = (sx8) this.t.m.get();
        return sx8Var == null ? "Completer object has been garbage collected, future will fail soon" : fx3.g("tag=[", String.valueOf(sx8Var.a), "]");
    }
}
