package o;

/* JADX INFO: loaded from: classes.dex */
public final class f10 {
    public final int a;
    public boolean b;
    public int c;
    public int d;
    public final Object e;
    public Object f;

    public f10(zn4 zn4Var, in1 in1Var) {
        this.e = zn4Var;
        Object objE = zn4Var.E();
        ze5 ze5Var = objE instanceof ze5 ? (ze5) objE : null;
        float f = ze5Var != null ? ze5Var.e : Float.NaN;
        this.a = in1Var.q0(Float.isNaN(f) ? 0.0f : f);
        this.d = Integer.MAX_VALUE;
    }

    public f10(k70 k70Var, wc6[] wc6VarArr, boolean z, int i, int i2, int i3) {
        this.e = k70Var;
        this.f = wc6VarArr;
        this.b = z;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }
}
