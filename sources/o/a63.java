package o;

/* JADX INFO: loaded from: classes.dex */
public final class a63 extends es4 implements eg5 {
    public w50 A;

    @Override // o.eg5
    public final Object l(in1 in1Var, Object obj) {
        bg6 bg6Var = obj instanceof bg6 ? (bg6) obj : null;
        if (bg6Var == null) {
            bg6Var = new bg6();
        }
        bg6Var.c = new cf1(this.A);
        return bg6Var;
    }
}
