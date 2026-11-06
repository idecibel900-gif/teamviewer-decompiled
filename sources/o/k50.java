package o;

/* JADX INFO: loaded from: classes.dex */
public final class k50 extends h30 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k50(l61 l61Var, byte b) {
        super(l61Var);
        this.b = b;
    }

    @Override // o.y51
    public final boolean b(xm8 xm8Var) {
        switch (this.b) {
            case 0:
                return xm8Var.j.c;
            case 1:
                return xm8Var.j.e;
            case 2:
                return xm8Var.j.a == g35.n;
            case 3:
                return xm8Var.j.a == g35.f853o;
            default:
                return xm8Var.j.f;
        }
    }

    @Override // o.h30
    public final int c() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // o.h30
    public final boolean d(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                d35 d35Var = (d35) obj;
                d35Var.getClass();
                return (!d35Var.e && d35Var.a && d35Var.b) ? false : true;
            case 3:
                d35 d35Var2 = (d35) obj;
                d35Var2.getClass();
                return !d35Var2.a || d35Var2.c || d35Var2.e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
