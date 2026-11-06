package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d44 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ f44 n;

    public /* synthetic */ d44(f44 f44Var, byte b) {
        this.m = b;
        this.n = f44Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f44 f44Var = this.n;
        switch (b) {
            case 0:
                i44 i44Var = (i44) f44Var.A.a();
                int iC = i44Var.c();
                int i = 0;
                while (i < iC) {
                    if (i44Var.d(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                i44 i44Var2 = (i44) f44Var.A.a();
                if (iIntValue < 0 || iIntValue >= i44Var2.c()) {
                    ni3.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + i44Var2.c() + ")");
                }
                im3.R(f44Var.I0(), null, null, new j81(f44Var, iIntValue, null, (byte) 2), 3);
                return Boolean.TRUE;
        }
    }
}
