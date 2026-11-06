package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fc7 extends kc7 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc7(td2 td2Var, byte b) {
        super(td2Var);
        this.d = b;
    }

    @Override // o.td2
    public final int a() {
        switch (this.d) {
            case 0:
                return this.a.a() * 8;
            case 1:
                return this.a.a() + 2;
            default:
                return this.a.a() + 2;
        }
    }

    @Override // o.kc7
    public final boolean g(o82 o82Var, x35 x35Var) {
        switch (this.d) {
            case 0:
                if (o82Var != x35Var) {
                    for (o82 o82VarH = x35Var.H(); o82VarH != null; o82VarH = o82VarH.m) {
                        if (h(o82Var, o82VarH)) {
                            return true;
                        }
                        if (o82VarH != o82Var) {
                        }
                    }
                }
                return false;
            case 1:
                return this.a.d(o82Var, x35Var);
            default:
                return !h(o82Var, x35Var);
        }
    }

    public final String toString() {
        byte b = this.d;
        td2 td2Var = this.a;
        switch (b) {
            case 0:
                return String.format("%s ", td2Var);
            case 1:
                return String.format(":is(%s)", td2Var);
            default:
                return String.format(":not(%s)", td2Var);
        }
    }
}
