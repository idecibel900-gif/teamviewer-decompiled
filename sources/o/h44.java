package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h44 {
    public final ae a = new ae();

    public h44(Function1 function1) {
        function1.invoke(this);
    }

    public static void a(h44 h44Var, String str, yy0 yy0Var, int i) {
        byte b = 1;
        if ((i & 1) != 0) {
            str = null;
        }
        h44Var.a.a(1, new ep3(str != null ? new fj3((Object) str, (byte) 3) : null, new ek3((byte) 5), new yy0(-857469575, true, new pj(yy0Var, (byte) 2)), b));
    }

    public final void b(int i, Function1 function1, Function1 function2, yy0 yy0Var) {
        this.a.a(i, new ep3(function1, function2, yy0Var, (byte) 1));
    }
}
