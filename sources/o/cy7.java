package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum cy7 extends cz7 {
    public cy7() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        int[] iArrC = kw7Var.c(null, false);
        if (iArrC == null) {
            kw7Var.e('&');
        } else {
            kw7Var.f(new String(iArrC, 0, iArrC.length));
        }
        kw7Var.m(cz7.f572o);
    }
}
