package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class sy2 implements zp6 {
    public final Function0 a;
    public final Function1 b;

    public sy2(Function0 function0, Function1 function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override // o.zp6
    public final Iterator iterator() {
        return new ry2(this);
    }
}
