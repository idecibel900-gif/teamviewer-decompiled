package o;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ a1 n;

    public /* synthetic */ x0(a1 a1Var, byte b) {
        this.m = b;
        this.n = a1Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        Object value;
        v97 v97Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        a1 a1Var = this.n;
        switch (b) {
            case 0:
                vd5 vd5Var = (vd5) obj;
                float fFloatValue = ((Number) vd5Var.m).floatValue() / ((Number) vd5Var.n).floatValue();
                l97 l97Var = a1Var.e;
                do {
                    value = l97Var.getValue();
                    v97Var = (v97) value;
                } while (!l97Var.j(value, v97Var.c(v97Var.a * fFloatValue)));
                break;
            case 1:
                a1Var.l();
                break;
            case 2:
                a1Var.m();
                break;
            default:
                a1Var.n();
                break;
        }
        return f88Var;
    }
}
