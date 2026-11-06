package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class km2 implements zp6 {
    public final zp6 a;
    public final Function1 b;
    public final Function1 c;

    public km2(zp6 zp6Var, Function1 function1, Function1 function2) {
        function1.getClass();
        this.a = zp6Var;
        this.b = function1;
        this.c = function2;
    }

    @Override // o.zp6
    public final Iterator iterator() {
        return new jm2(this);
    }
}
