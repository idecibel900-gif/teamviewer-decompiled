package o;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class sx0 implements si0 {
    public final /* synthetic */ byte m;
    public final Type n;

    public /* synthetic */ sx0(Type type, byte b) {
        this.m = b;
        this.n = type;
    }

    @Override // o.si0
    public final Object a(a75 a75Var) {
        switch (this.m) {
            case 0:
                tx0 tx0Var = new tx0(a75Var);
                a75Var.b0(new rx0(tx0Var, (byte) 0));
                return tx0Var;
            default:
                tx0 tx0Var2 = new tx0(a75Var);
                a75Var.b0(new rx0(tx0Var2, (byte) 1));
                return tx0Var2;
        }
    }

    @Override // o.si0
    public final Type f() {
        byte b = this.m;
        return this.n;
    }
}
