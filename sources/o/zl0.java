package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zl0 extends k58 {
    public final /* synthetic */ byte b;
    public final k58 c;

    public /* synthetic */ zl0(k58 k58Var, byte b) {
        this.b = b;
        this.c = k58Var;
    }

    @Override // o.k58
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // o.k58
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // o.k58
    public final up c(up upVar) {
        byte b = this.b;
        k58 k58Var = this.c;
        upVar.getClass();
        switch (b) {
            case 0:
                break;
        }
        return k58Var.c(upVar);
    }

    @Override // o.k58
    public final h58 d(oz3 oz3Var) {
        byte b = this.b;
        k58 k58Var = this.c;
        switch (b) {
            case 0:
                h58 h58VarD = k58Var.d(oz3Var);
                if (h58VarD == null) {
                    return null;
                }
                ys0 ys0VarA = oz3Var.o0().a();
                return pm8.p(h58VarD, ys0VarA instanceof d58 ? (d58) ys0VarA : null);
            default:
                return k58Var.d(oz3Var);
        }
    }

    @Override // o.k58
    public final boolean e() {
        byte b = this.b;
        k58 k58Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return k58Var.e();
    }

    @Override // o.k58
    public final oz3 f(oz3 oz3Var, ub8 ub8Var) {
        byte b = this.b;
        k58 k58Var = this.c;
        oz3Var.getClass();
        ub8Var.getClass();
        switch (b) {
            case 0:
                break;
        }
        return k58Var.f(oz3Var, ub8Var);
    }
}
