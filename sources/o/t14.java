package o;

/* JADX INFO: loaded from: classes.dex */
public final class t14 extends es4 implements eg5 {
    public float A;
    public boolean B;

    @Override // o.eg5
    public final Object l(in1 in1Var, Object obj) {
        bg6 bg6Var = obj instanceof bg6 ? (bg6) obj : null;
        if (bg6Var == null) {
            bg6Var = new bg6();
        }
        bg6Var.a = this.A;
        bg6Var.b = this.B;
        return bg6Var;
    }
}
