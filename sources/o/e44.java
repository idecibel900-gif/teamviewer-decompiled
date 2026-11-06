package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e44 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ f44 n;

    public /* synthetic */ e44(f44 f44Var, byte b) {
        this.m = b;
        this.n = f44Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f44 f44Var = this.n;
        switch (b) {
            case 0:
                w44 w44Var = f44Var.B.b;
                return Float.valueOf((w44Var.h() * 500) + w44Var.i());
            case 1:
                w44 w44Var2 = f44Var.B.b;
                int iH = w44Var2.h();
                int i = w44Var2.i();
                return Float.valueOf(w44Var2.c() ? (iH * 500) + i + 100.0f : (iH * 500) + i);
            default:
                w44 w44Var3 = f44Var.B.b;
                int i2 = (int) (w44Var3.j().p == gb5.m ? w44Var3.j().i() & 4294967295L : w44Var3.j().i() >> 32);
                w44 w44Var4 = f44Var.B.b;
                return Float.valueOf(i2 - ((-w44Var4.j().m) + w44Var4.j().q));
        }
    }
}
