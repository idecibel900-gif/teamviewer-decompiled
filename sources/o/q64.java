package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q64 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hw2 n;

    public /* synthetic */ q64(hw2 hw2Var, byte b) {
        this.m = b;
        this.n = hw2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hw2 hw2Var = this.n;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                hw2Var.invoke(ib1.a, bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                hw2Var.invoke(hb1.a, bool2);
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                hw2Var.invoke(kb1.a, bool3);
                break;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                hw2Var.invoke(jb1.a, bool4);
                break;
            default:
                io ioVar = (io) obj;
                hw2Var.invoke(ioVar.e.getValue(), vn4.j0.c.invoke(ioVar.f));
                break;
        }
        return f88Var;
    }
}
