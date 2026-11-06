package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class h18 implements zp6 {
    public final zp6 a;
    public final Function1 b;

    public h18(zp6 zp6Var, Function1 function1) {
        function1.getClass();
        this.a = zp6Var;
        this.b = function1;
    }

    @Override // o.zp6
    public final Iterator iterator() {
        return new g18(this);
    }
}
