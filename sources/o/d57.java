package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d57 {
    public static final ep3 a = new ep3((byte) 24);
    public static final ep3 b = new ep3((byte) 24);

    public static final xx4 a() {
        ep3 ep3Var = b;
        xx4 xx4Var = (xx4) ep3Var.get();
        if (xx4Var != null) {
            return xx4Var;
        }
        xx4 xx4Var2 = new xx4(new tx2[0]);
        ep3Var.E(xx4Var2);
        return xx4Var2;
    }

    public static final eo1 b(Function0 function0) {
        return new eo1(function0, null);
    }
}
