package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o23 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ w44 n;

    public /* synthetic */ o23(w44 w44Var, byte b) {
        this.m = b;
        this.n = w44Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int i;
        byte b = this.m;
        boolean z = false;
        w44 w44Var = this.n;
        switch (b) {
            case 0:
                o44 o44VarJ = w44Var.j();
                int i2 = o44VarJ.f1627o;
                p44 p44Var = (p44) lv0.w0(o44VarJ.l);
                int i3 = p44Var != null ? p44Var.a : 0;
                if (i2 > 0 && i3 >= i2 - 5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (w44Var.h() == 0 && w44Var.i() == 0 && !w44Var.j.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                i = w44Var.j().f1627o;
                break;
            default:
                i = ((o44) w44Var.f.getValue()).k;
                break;
        }
        return Integer.valueOf(i);
    }
}
