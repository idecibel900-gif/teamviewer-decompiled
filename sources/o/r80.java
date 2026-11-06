package o;

/* JADX INFO: loaded from: classes.dex */
public final class r80 extends u51 {
    public final /* synthetic */ byte b = 1;

    public r80(double d) {
        super(Double.valueOf(d));
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        switch (this.b) {
            case 0:
                ps4Var.getClass();
                wy3 wy3VarH = ps4Var.h();
                wy3VarH.getClass();
                return wy3VarH.s(ps5.BOOLEAN);
            case 1:
                ps4Var.getClass();
                wy3 wy3VarH2 = ps4Var.h();
                wy3VarH2.getClass();
                return wy3VarH2.s(ps5.DOUBLE);
            default:
                ps4Var.getClass();
                wy3 wy3VarH3 = ps4Var.h();
                wy3VarH3.getClass();
                return wy3VarH3.s(ps5.FLOAT);
        }
    }

    @Override // o.u51
    public String toString() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r80(Object obj) {
        super(obj);
    }

    public r80(float f) {
        super(Float.valueOf(f));
    }
}
