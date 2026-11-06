package o;

/* JADX INFO: loaded from: classes2.dex */
public final class g45 extends i45 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public g45(String str) {
        StringBuilder sbB = lb7.b();
        lb7.a(str, sbB, false);
        this.b = us1.F(lb7.k(sbB));
    }

    @Override // o.td2
    public final int a() {
        switch (this.a) {
            case 0:
                return 6;
            default:
                return 8;
        }
    }

    @Override // o.i45
    public final boolean g(x35 x35Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return us1.F(x35Var.y()).contains((String) obj);
            default:
                return ((d96) obj).b(x35Var.y()).mo34d();
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return fx3.g(":contains(", (String) obj, ")");
            default:
                return String.format(":matches(%s)", (d96) obj);
        }
    }

    public g45(d96 d96Var) {
        this.b = d96Var;
    }
}
